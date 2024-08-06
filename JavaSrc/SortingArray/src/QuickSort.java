public class QuickSort {

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

    private static void reLocateElements(int[] arr, int fromIndex, int toIndex, int supportElementIndex) {
        int swap = arr[fromIndex];
        arr[fromIndex] = arr[toIndex];
        arr[toIndex] = arr[supportElementIndex];
        arr[supportElementIndex] = swap;
    }


    private static void swapElements(int[] arr, int beginIndex, int endIndex) {
        int swap = arr[beginIndex];
        arr[beginIndex] = arr[endIndex];
        arr[endIndex] = swap;
    }

    private static void quickSortStage(int[] arr, int beginIndex, int endIndex) {
   //     System.out.println("Indexes "+ beginIndex + " " + endIndex);
 //       printIntArrayIndex(arr, beginIndex, endIndex);
        // printIntArray(arr);
        if ((endIndex - beginIndex) <= 1) {
  //          System.out.println("ShortSize!!!");
            if (endIndex != beginIndex)  {
                if (arr[beginIndex] > arr[endIndex]) {
                    swapElements(arr, beginIndex, endIndex);

                }
            }
        return;
        }

            int supportElementIndex = beginIndex; //(int)(Math.random()*(endIndex-beginIndex))+beginIndex;
//           System.out.println("NormalSize!!! " + arr[supportElementIndex]);
// перенос меньших значений влево
            for (int i = beginIndex; i <= endIndex ; i++) {
              //  System.out.println("For " + i + " " + supportElementIndex + " "+ beginIndex + " "+ endIndex );
                if (arr[i] < arr[supportElementIndex]) {
                    if (i > supportElementIndex) {
                            reLocateElements(arr, i, supportElementIndex + 1, supportElementIndex);
                            supportElementIndex++;
                    }
                }
            }

// перенос больших значений вправо
            for (int i = beginIndex; i <= endIndex ; i++) {
                //  System.out.println("For " + i + " " + supportElementIndex + " "+ beginIndex + " "+ endIndex );
                if (arr[i] >= arr[supportElementIndex]) {
                    if (i < supportElementIndex) {
                    if (supportElementIndex >= beginIndex + 1) {
                        reLocateElements(arr, i, supportElementIndex - 1, supportElementIndex);
                        supportElementIndex--;
                    }
                }
                }
            }
// рекурсивный вызов двух половинок
            if (beginIndex <= supportElementIndex) {
                if (beginIndex != supportElementIndex)
                quickSortStage(arr, beginIndex, supportElementIndex);
                if (supportElementIndex != endIndex)
                quickSortStage(arr, supportElementIndex +  1, endIndex);
            }
    }


    public static void main(String[] args) {
        // int[] unsortedArray = {7, 6, 5, 3, 2, 1, 0, 4, -1, 8, 6, 8, 11 };
        //int[] unsortedArray = {7, 6, 5, 3, 2, 1, 0, 4, -1, 8, 6, 9, 7, 6, 5, 3, 2, 1, 0, 4, -1, 8, 6, 9 };
       // int[] unsortedArray = {7, 6, 5, 3, 2, 1, 0, 4, -1, 8, 6, 9, 7, 6, 5, 3, 2, 1, 0, 4, -1, 8, 6, 9, 6, 5, 3, 2, 1, 0, 4, -1, 8, 6, 9, 7, 6, 5, 3, 2, 1, 0, 4, -1, 8, 6, 9 };
        int[] unsortedArray = new int[50000];
        for (int i = 0; i < unsortedArray.length; i++) {
//            unsortedArray[i] = (int)(Math.random()*(unsortedArray.length));
            unsortedArray[i] = unsortedArray.length - i;
//            unsortedArray[i] = i;

        }

//        int[] unsortedArray = {0, 3, 2, 2, 4};
        System.out.println(Thread.activeCount());
        long tt = System.currentTimeMillis();
        System.out.println("Start: ");
      //  printIntArray(unsortedArray);
        quickSortStage(unsortedArray, 0,  unsortedArray.length-1);
        System.out.println("End: ");
        long tt1 = System.currentTimeMillis()-tt;
        printIntArray(unsortedArray);
        System.out.println("Time - "+tt1+"ms");






    }




}
