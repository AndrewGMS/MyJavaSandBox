public class QuickSort {

    private static void printIntArray(int[] arr) {

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]);
            if (i < arr.length-1) System.out.print(", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] unsortedArray = {6, 5, 4, 3, 2, 1, 0 };
        printIntArray(unsortedArray);
        if (unsortedArray.length <= 2) {
            if (unsortedArray.length == 2) {
                if (unsortedArray[0] > unsortedArray[1]) {
                    int swap = unsortedArray[0];
                    unsortedArray[0] = unsortedArray[1];
                    unsortedArray[1] = swap;
                 }
            }
        }
        printIntArray(unsortedArray);




    }




}
