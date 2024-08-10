import static java.lang.Math.abs;

public class rhombus {
    public static void main(String[] args) {
        System.out.println("Rhombus project");
        System.out.println();
        int size = 8;

        for (int i = -size/2; i <= size/2; i++) {
            for (int j = -size/2; j <= size/2; j++) {
                if ( (abs(i) +abs(j)) <= (size / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
/*
 *
* *
 *


 */
}
