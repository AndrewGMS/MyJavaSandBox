public class FibonacciMatrix {

    static long[][] multMatrix22x12(long matrix22[][], long matrix12[]) {

        long matrixResult[][] = {{0, 0}
                , {0, 0}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    matrixResult[i][j] = matrixResult[i][j] + matrix22[i][k] * matrix12[k];
                    System.out.println(matrixResult[i][j] + " " + matrix22[i][k] + " " + matrix12[k]);
                }
            }
        }
        return matrixResult;
    }

    static long[][] multMatrix22x22(long matrix22First[][], long matrix22Second[][]) {

        long matrixResult[][] = {{0, 0}
                , {0, 0}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
//                System.out.print("Z_"+(i+1)+"_"+(j+1)+" = ");
                for (int k = 0; k < 2; k++) {
                    matrixResult[i][j] += (matrix22First[i][k] * matrix22Second[k][j]);

                    String operatorPlus;
                    switch (k) {
                        case 0:
                            operatorPlus = "";
                            break;
                        default:
                            operatorPlus = " + ";
                    }
                    ;
//                   System.out.print(operatorPlus +  "X_"+(i+1)+"_"+(k+1)+" * "+"Y_"+(k+1)+"_"+(j+1));
                }
//                System.out.println();
            }
        }
        return matrixResult;
    }

    static void printMatrix22(long matrix22[][]) {
        int MatrixLengthX = 2;
        int MatrixLengthY = 2;
        for (int i = 0; i < MatrixLengthX; i++) {
            for (int j = 0; j < MatrixLengthY; j++) {
                System.out.print(" " + matrix22[i][j]);
            }
            System.out.println();
        }
    }

    static void printMatrix22(long matrix22[][], String captionMatrix) {
        System.out.println("matrix22 - " + captionMatrix);
        printMatrix22(matrix22);
    }

    static void printMatrix12(long matrix12[]) {
        int MatrixLengthX = 2;
        int MatrixLengthY = 1;
        for (int i = 0; i < MatrixLengthX; i++) {
            for (int j = 0; j < MatrixLengthY; j++) {
                System.out.print(" " + matrix12[i]);
            }
            System.out.println();
        }
    }

    static void printMatrix12(long matrix12[], String captionMatrix) {
        System.out.println("matrix12 - " + captionMatrix);
        printMatrix12(matrix12);
    }


    public static void main(String[] args) {
        long f2f1[][] = {{1, 1}
                , {1, 0}};
        long f1f0[] = {1, 0};
        long mult[][] = {{0, 0}
                , {0, 0}};
        long tt = System.currentTimeMillis();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mult[i][j] = mult[i][j] + f1f0[i] * f2f1[i][j];
            }
        }

        printMatrix22(mult, "mult");

        printMatrix12(f1f0, "f1f0");

//        printMatrix22(multMatrix22x12(f2f1, f1f0), "multed");
        mult = multMatrix22x22(f2f1, f2f1);
        for (int i = 3; i < 91; i++) {
            mult = multMatrix22x22(mult, f2f1);
        }
        printMatrix22(mult, "multed");
        System.out.println("Time - " + (System.currentTimeMillis() - tt) + "ms");

    }
}

