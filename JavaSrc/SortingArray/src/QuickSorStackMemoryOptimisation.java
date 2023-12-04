public class QuickSorStackMemoryOptimisation {

    int counter = 0;

    private static void printIntArrayIndex(int[] arr, int beginIndex, int endIndex) {

        for (int i = beginIndex; i <= endIndex ; i++) {
            System.out.print(arr[i]);
            if (i < endIndex) System.out.print(", ");
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

    private static int[] quickSortStage(int[] arr, int beginIndex, int endIndex) {

         int[] quickSortParams = {0, 0, 0, 0 };
   //     System.out.println("Indexes "+ beginIndex + " " + endIndex);
        // printIntArrayIndex(arr, beginIndex, endIndex);
//        System.out.println("-------");
        if ((endIndex - beginIndex) <= 1) {
            System.out.println("ShortSize!!!");
            if (endIndex != beginIndex)  {
                if (arr[beginIndex] > arr[endIndex]) {
                    swapElements(arr, beginIndex, endIndex);

                }
            }
        } else {
// выбираем опрорный элемент
// пусть будет первый элемент
//         int supportElementIndex = beginIndex;
//         System.out.println("NormalSize!!!");
//            for (int i = beginIndex; i <= endIndex ; i++) {
//                System.out.println("For " + i + " " + supportElementIndex + " "+ beginIndex + " "+ endIndex );
//                if (arr[i] < arr[supportElementIndex]) {
//                    System.out.println("swap" + i + " " + supportElementIndex );
//                    swapElements(arr, i, supportElementIndex);
//                    supportElementIndex = i;
//                }
//                System.out.println("AfterFor " + i + " " + supportElementIndex + " "+ beginIndex + " "+ endIndex );
//
//            }

// пусть будет последний элемент
//            int supportElementIndex = endIndex;
//            System.out.println("NormalSize!!!");
//            for (int i = endIndex; i >= beginIndex ; i--) {
//                System.out.println("For " + i + " " + supportElementIndex + " "+ beginIndex + " "+ endIndex );
//                if (arr[i] > arr[supportElementIndex]) {
//                    System.out.println("swap" + i + " " + supportElementIndex );
//                    swapElements(arr, i, supportElementIndex);
//                    supportElementIndex = i;
//                }
//                System.out.println("AfterFor " + i + " " + supportElementIndex + " "+ beginIndex + " "+ endIndex );
//            }
// пусть будет случайный элемент
            int supportElementIndex = beginIndex; //(int)(Math.random()*(endIndex-beginIndex))+beginIndex;
//           System.out.println("NormalSize!!! " + arr[supportElementIndex]);
// перенос меньших значений влево
            for (int i = beginIndex; i <= endIndex ; i++) {
              //  System.out.println("For " + i + " " + supportElementIndex + " "+ beginIndex + " "+ endIndex );
                if (arr[i] < arr[supportElementIndex]) {
                    if (i > supportElementIndex) {
                        if (supportElementIndex < endIndex) {
                            reLocateElements(arr, i, supportElementIndex + 1, supportElementIndex);
                            supportElementIndex++;

                        }
                    }
                }

//                System.out.print(i+". ");
//                printIntArrayIndex(arr, beginIndex, endIndex);
              //  System.out.println("AfterFor " + i + " " + supportElementIndex + " "+ beginIndex + " "+ endIndex );
            }

//            System.out.println("==============");
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
//                System.out.print(i+". ");
//                printIntArrayIndex(arr, beginIndex, endIndex);
                //  System.out.println("AfterFor " + i + " " + supportElementIndex + " "+ beginIndex + " "+ endIndex );
            }


//            if (beginIndex < supportElementIndex)
//                quickSortStage(arr, beginIndex, supportElementIndex-1);
//            if (endIndex > supportElementIndex)
//                quickSortStage(arr, supportElementIndex, endIndex);
        }

       return quickSortParams;
    }


    public static void main(String[] args) {
        int[] unsortedArray = {7, 6, 5, 3, 2, 1, 0, 4, -1};
        System.out.print("Start: ");
        printIntArray(unsortedArray);

        int[] quickSortParams = {0, unsortedArray.length - 1, 0, 0 };

        int x = 0;
        do {
            x++;
            quickSortStage(unsortedArray, quickSortParams[0], quickSortParams[1]);
            quickSortStage(unsortedArray, quickSortParams[2], quickSortParams[3]);

            for (int i = 0; i <=3 ; i++) {
             System.out.print("qsa "+quickSortParams[i]+ " ");
            }
            System.out.println();
        } while ( !((quickSortParams[0] == 0) & (quickSortParams[1] == 0) & (quickSortParams[2] == 0) & (quickSortParams[3] == 0)) & (x < 10));
        System.out.print("End: "+x+ " ");
        printIntArray(unsortedArray);




    }




}
