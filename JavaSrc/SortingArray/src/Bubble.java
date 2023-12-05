public class Bubble {

    private static void printIntArray(int[] arr) {

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]);
            if (i < arr.length-1) System.out.print(", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
      int[] unsortedArray = {6, 5, 4, 3, 2, 1, 0, -1, -2, };
      printIntArray(unsortedArray);
      boolean swap;
      do {
          swap = false;
          int buffer;
          for (int i = 0; i < unsortedArray.length-1; i++) {
              if (unsortedArray[i] > unsortedArray[i+1]) {
                 swap = true;
                 buffer = unsortedArray[i];
                 unsortedArray[i] = unsortedArray[i+1];
                  unsortedArray[i+1] = buffer;
              }
          }


      } while (swap);

        printIntArray(unsortedArray);
    }


}
