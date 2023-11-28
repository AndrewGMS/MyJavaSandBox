public class QuickSort {

    private static void printIntArray(int[] arr) {

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]);
            if (i < arr.length-1) System.out.print(", ");
        }
        System.out.println();
    }

    private static void swapElements(int[] arr, int beginIndex, int endIndex) {
        int swap = arr[beginIndex];
        arr[beginIndex] = arr[endIndex];
        arr[endIndex] = swap;
    }

    private static Boolean quickSortStage(int[] arr, int beginIndex, int endIndex) {
        if ((endIndex - beginIndex) <= 1) {
            if (endIndex != beginIndex)  {
                if (arr[beginIndex] > arr[endIndex]) {
                    swapElements(arr, beginIndex, endIndex);
                    return true;
                }
            }
        } else {
// выбираем опрорный элемент
// пусть будет последний элемент
         int supportElementIndex = arr.length-1;
            for (int i = endIndex-beginIndex; i >= 0 ; i--) {
                if (arr[i] > arr[supportElementIndex]) {
                    swapElements(arr, i, supportElementIndex);
                    supportElementIndex = i;
                    
                }
                quickSortStage(arr, beginIndex, supportElementIndex);
                quickSortStage(arr, supportElementIndex, endIndex);
            }




        }


    }


    public static void main(String[] args) {
        int[] unsortedArray = {6, 5, 4, 3, 2, 1, 0 };
        printIntArray(unsortedArray);
        quickSortStage(unsortedArray, 0,  unsortedArray.length-1);
        printIntArray(unsortedArray);




    }




}
