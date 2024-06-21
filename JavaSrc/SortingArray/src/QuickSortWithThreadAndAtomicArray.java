import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class QuickSortWithThreadAndAtomicArray {

    private static void printIntArrayIndex(AtomicReferenceArray arr, int beginIndex, int endIndex) {

        for (int i = beginIndex; i <= endIndex ; i++) {
            System.out.print(arr.get(i));
            if (i < endIndex) System.out.print(", ");
            if (((i-beginIndex+ 1) % 20 ) == 0) System.out.println();
        }
        System.out.println();
    }

    private static void printIntArray(AtomicReferenceArray arr) {
        printIntArrayIndex(arr, 0, arr.length()-1 );
    }

    public static void main(String[] args) {
        // Создание нового потока
//        int[] unsortedArray = {7, 6, 5, 3, 2, 1, 0, 4, -1, 8, 6, 9, 7, 6, 5, 3, 2, 1, 0, 4, -1, 8, 6, 9, 6, 5, 3, 2, 1, 0, 4, -1, 8, 6, 9, 7, 6, 5, 3, 2, 1, 0, 4, -1, 8, 6, 9 };
//        int[] unsortedArray = new int[200];
        AtomicReferenceArray<Integer> unsortedArray = new AtomicReferenceArray<>(5000);

        for (int i = 0; i < unsortedArray.length(); i++) {
//            unsortedArray[i] = (int)(Math.random()*(unsortedArray.length));
//            unsortedArray[i] = unsortedArray.length - i;
            unsortedArray.set(i, unsortedArray.length() - i);
        }

        QSThreadAA thread = new QSThreadAA(unsortedArray, 0, unsortedArray.length()-1);
        // Запуск потока
        long tt = System.currentTimeMillis();
        thread.start();

        System.out.println("Основной поток запущен.");

        // Ожидание завершения потока (необязательно)
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        while (Thread.activeCount() > 2) {
          //  System.out.println(Thread.activeCount());
//            try {
//                TimeUnit.SECONDS.sleep(0);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        long tt1 = System.currentTimeMillis()-tt;
        printIntArray(unsortedArray);
        System.out.println("Поток завершил свою работу.");
        System.out.println("Time - "+tt1+"ms");
    }
}

class QSThreadAA extends Thread {
    public AtomicReferenceArray tArr;
    public int tBeginIndex = 0;
    public int tEndIndex = 0;

    public QSThreadAA (AtomicReferenceArray arr, int beginIndex, int endIndex) {
        tArr = arr;
        tBeginIndex = beginIndex;
        tEndIndex = endIndex;
    }

    @Override
    public void run() {
        String s = "";
        for (int i = tBeginIndex; i <= tEndIndex; i++) {
            s = s + Integer.toString((Integer) tArr.get(i)) + " ";
        }
        if ((tEndIndex - tBeginIndex) <= 1) {
            //           System.out.println("ShortSize!!!");
            if (tEndIndex != tBeginIndex) {
                if ((Integer) tArr.get(tBeginIndex) > (Integer) tArr.get(tEndIndex)) {
                    swapElements(tArr, tBeginIndex, tEndIndex);
                }
            }
        } else {
// пусть будет случайный элемент
            int supportElementIndex = tBeginIndex; //(int)(Math.random()*(endIndex-beginIndex))+beginIndex;
// перенос меньших значений влево
            for (int i = tBeginIndex; i <= tEndIndex; i++) {
                //  System.out.println("For " + i + " " + supportElementIndex + " "+ beginIndex + " "+ endIndex );
                if ((Integer) tArr.get(i) < (Integer) tArr.get(supportElementIndex)) {
                    if (i > supportElementIndex) {
                        if (supportElementIndex < tEndIndex) {
                            reLocateElements(tArr, i, supportElementIndex + 1, supportElementIndex);
                            supportElementIndex++;
                        }
                    }
                }
            }

//            System.out.println("==============");
// перенос меньших значений вправо
            for (int i = tBeginIndex; i <= tEndIndex; i++) {
                //  System.out.println("For " + i + " " + supportElementIndex + " "+ beginIndex + " "+ endIndex );

                if ((Integer) tArr.get(i) >= (Integer)tArr.get(supportElementIndex)) {
                    if (i < supportElementIndex) {
                        if (supportElementIndex >= tBeginIndex + 1) {
                            reLocateElements(tArr, i, supportElementIndex - 1, supportElementIndex);
                            supportElementIndex--;
                        }
                    }
                }
            }
// рекурсивный вызов двух половинок
            QSThreadAA threadLeft = null;
            QSThreadAA threadRight = null;
            if (tBeginIndex <= supportElementIndex) {
                //  quickSortStage(arr, beginIndex, supportElementIndex - 1);
                if (tBeginIndex != supportElementIndex) {
                    threadLeft = new QSThreadAA(tArr, tBeginIndex, supportElementIndex);
                    // Запуск потока
                    threadLeft.start();
//                    try {
//                        threadLeft.join();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                }
                if (supportElementIndex != tEndIndex) {
                    threadRight = new QSThreadAA(tArr, supportElementIndex + 1, tEndIndex);
                    // Запуск потока
                    threadRight.start();
//                    try {
//                        threadRight.join();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                }
            }
            try {
                if (threadLeft != null) threadLeft.join();
                if (threadRight != null) threadRight.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

            }
    }

    private static void swapElements(AtomicReferenceArray arr, int beginIndex, int endIndex) {
        int swap = (Integer) arr.get(beginIndex);
        arr.set(beginIndex, arr.get(endIndex));
        arr.set(endIndex, swap);

    }

    private static void reLocateElements(AtomicReferenceArray arr, int fromIndex, int toIndex, int supportElementIndex) {
        // int swap = arr[fromIndex];
        int swap = (Integer) arr.get(fromIndex);

        // arr[fromIndex] = arr[toIndex];
        arr.set(fromIndex, arr.get(toIndex));

        // arr[toIndex] = arr[supportElementIndex];
        arr.set(toIndex, arr.get(supportElementIndex));

        // arr[supportElementIndex] = swap;
        arr.set(supportElementIndex, swap);

    }

}

