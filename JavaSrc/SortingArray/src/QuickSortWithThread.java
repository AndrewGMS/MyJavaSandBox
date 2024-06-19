import java.util.concurrent.TimeUnit;
public class QuickSortWithThread {

    private static void printIntArrayIndex(int[] arr, int beginIndex, int endIndex) {

        for (int i = beginIndex; i <= endIndex ; i++) {
            System.out.print(arr[i]);
            if (i < endIndex) System.out.print(", ");
            if (((i-beginIndex+ 1) % 20 ) == 0) System.out.println();
        }
        System.out.println();
    }

    private static void printIntArray(int[] arr) {
        printIntArrayIndex(arr, 0, arr.length-1 );
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i]);
//            if (i < arr.length-1) System.out.print(", ");
//        }
//        System.out.println();
    }

    public static void main(String[] args) {
        // Создание нового потока
//        int[] unsortedArray = {7, 6, 5, 3, 2, 1, 0, 4, -1, 8, 6, 9, 7, 6, 5, 3, 2, 1, 0, 4, -1, 8, 6, 9, 6, 5, 3, 2, 1, 0, 4, -1, 8, 6, 9, 7, 6, 5, 3, 2, 1, 0, 4, -1, 8, 6, 9 };

        int[] unsortedArray = new int[20000];
        for (int i = 0; i < unsortedArray.length; i++) {
//            unsortedArray[i] = (int)(Math.random()*(unsortedArray.length));
//            unsortedArray[i] = unsortedArray.length - i;
            unsortedArray[i] = i;

        }




 //       printIntArray(unsortedArray);
        QSThread thread = new QSThread();
        thread.init(unsortedArray, 0, unsortedArray.length-1);

        // Запуск потока
        long tt = System.currentTimeMillis();
        thread.start();

        // Выполнение кода в основном потоке
        System.out.println("Основной поток запущен.");

        // Ожидание завершения потока (необязательно)
//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        while (Thread.activeCount() > 2) {
            System.out.println(Thread.activeCount());
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        printIntArray(unsortedArray);
        System.out.println("Поток завершил свою работу.");
        System.out.println("Time - "+(System.currentTimeMillis()-tt)+"ms");
    }
}

class QSThread extends Thread {
    // (int[] arr, int beginIndex, int endIndex)
    public int[] tArr;
    public int tBeginIndex = 0;
    public int tEndIndex = 0;

    public void init(int[] arr, int beginIndex, int endIndex) {
        tArr = arr;
        tBeginIndex = beginIndex;
        tEndIndex = endIndex;
    }


    @Override
    public void run() {
        // Код, который будет выполняться в новом потоке
        String s = "";
        for (int i = tBeginIndex; i <= tEndIndex; i++) {
            s = s + Integer.toString(tArr[i]) + " ";
        }
  //      System.out.println("Многопоточный поток запущен." + s + " " + tBeginIndex + " " + tEndIndex);

        //     System.out.println("Indexes "+ beginIndex + " " + endIndex);
        // printIntArrayIndex(arr, beginIndex, endIndex);

        if ((tEndIndex - tBeginIndex) <= 1) {
 //           System.out.println("ShortSize!!!");
            if (tEndIndex != tBeginIndex) {
                if (tArr[tBeginIndex] > tArr[tEndIndex]) {
                    swapElements(tArr, tBeginIndex, tEndIndex);
                }
            }
        } else {
// пусть будет случайный элемент
            int supportElementIndex = tBeginIndex; //(int)(Math.random()*(endIndex-beginIndex))+beginIndex;
//           System.out.println("NormalSize!!! " + arr[supportElementIndex]);
// перенос меньших значений влево
            for (int i = tBeginIndex; i <= tEndIndex; i++) {
                //  System.out.println("For " + i + " " + supportElementIndex + " "+ beginIndex + " "+ endIndex );
                if (tArr[i] < tArr[supportElementIndex]) {
                    if (i > supportElementIndex) {
                        if (supportElementIndex < tEndIndex) {
                            reLocateElements(tArr, i, supportElementIndex + 1, supportElementIndex);
                            supportElementIndex++;

                        }
                    }
                }

//                System.out.print(i+". ");
//                printIntArrayIndex(arr, beginIndex, endIndex);
                //  System.out.println("AfterFor " + i + " " + supportElementIndex + " "+ beginIndex + " "+ endIndex );
            }

//            System.out.println("==============");
// перенос меньших значений вправо
            for (int i = tBeginIndex; i <= tEndIndex; i++) {
                //  System.out.println("For " + i + " " + supportElementIndex + " "+ beginIndex + " "+ endIndex );

                if (tArr[i] >= tArr[supportElementIndex]) {
                    if (i < supportElementIndex) {
                        if (supportElementIndex >= tBeginIndex + 1) {
                            reLocateElements(tArr, i, supportElementIndex - 1, supportElementIndex);
                            supportElementIndex--;
                        }
                    }
                }
//                System.out.print(i+". ");
//                printIntArrayIndex(arr, beginIndex, endIndex);
                //  System.out.println("AfterFor " + i + " " + supportElementIndex + " "+ beginIndex + " "+ endIndex );
            }

// рекурсивный вызов двух половинок

            if (tBeginIndex <= supportElementIndex) {
                //  quickSortStage(arr, beginIndex, supportElementIndex - 1);
                if (tBeginIndex != supportElementIndex) {
                    QSThread threadLeft = new QSThread();
                    threadLeft.init(tArr, tBeginIndex, supportElementIndex);
                    // Запуск потока
                    threadLeft.start();
                }
                if (supportElementIndex != tEndIndex) {
                    QSThread threadRight = new QSThread();
                    threadRight.init(tArr, supportElementIndex + 1, tEndIndex);
                    // Запуск потока
                    threadRight.start();
                }
            }



//            System.out.println("Многопоточный поток завершил свою работу.");
        }
    }

        private static void swapElements(int[] arr, int beginIndex, int endIndex) {
            int swap = arr[beginIndex];
            arr[beginIndex] = arr[endIndex];
            arr[endIndex] = swap;
        }

        private static void reLocateElements(int[] arr, int fromIndex, int toIndex, int supportElementIndex) {
            int swap = arr[fromIndex];
            arr[fromIndex] = arr[toIndex];
            arr[toIndex] = arr[supportElementIndex];
            arr[supportElementIndex] = swap;
        }

}

