public class percent {


    static double sum(double x[]){
        double res = 0.0;
        for (int i = 0; i < x.length; i++) {
            res+=x[i];
        }
        return res;
    }


    public static void main(String[] args) {
        double restMoney[] = {8237186.00
                , 742736.00
                , 213804.00
                , 232681.00
                , 164494.00
                , 210525.00
                , 2000000.00
                , 93000.00

        };

        double payments[] = {48153.00 ,
                19540.00 ,
                7846.00 ,
                8560.00 ,
                6743.60 ,
                31482.00 ,
                54671.00 ,
                9300.00

        };

        double percentage[] = {5.00 ,
                16.00 ,
                10.00 ,
                10.00 ,
                14.00 ,
                14.00 ,
                21.00 ,
                17.00 ,

        };

        int target = 2850000;
        double minPayment = 200000.00;
        double minPercent = 200000.00;
        int countIterations = 1;
        int counter = countIterations;


        int step = 10000;
        int stepI = step;
        int stepJ = step;
        int stepK = step;
        int stepL = step;
        int stepM = step;
        int stepN = step;
        int stepO = step;
        int stepP = step;

        int start = 0;
        int startI = start;
        int startJ = 0;
        int startK = start;
        int startL = start;
        int startM = start;
        int startN = 210525;
        int startO = 1600000;
        int startP = 0;




        for (int i = startI; i <= 1; i++) {//restMoney[0]; i+=stepI) {
            System.out.println(i + ", "+ 0 + ", "+ 0 + ", "+ 0 + ", "+ 0 + ", "+ 0 + ", "+ 0 + ", "+ 0 + ", "+ target);
            for (int j = startJ; j <= restMoney[1]; j+=stepJ) {
               // System.out.println(i + ", "+ j + ", "+ 0 + ", "+ 0 + ", "+ 0 + ", "+ 0 + ", "+ 0 + ", "+ 0 + ", "+ target);
                for (int k = startK; k <= restMoney[2]; k+=stepK) {
                //    System.out.println(i + ", "+ j + ", "+ k + ", "+ 0 + ", "+ 0 + ", "+ 0 + ", "+ 0 + ", "+ 0 + ", "+ target);
                    for (int l = startL; l <= restMoney[3]; l+=stepL) {
                //        System.out.println(i + ", "+ j + ", "+ k + ", "+ l + ", "+ 0 + ", "+ 0 + ", "+ 0 + ", "+ 0 + ", "+ target);
                        for (int m = startM; m <= restMoney[4]; m+=stepM) {
                    //        System.out.println(i + ", "+ j + ", "+ k + ", "+ l + ", "+ m + ", "+ 0 + ", "+ 0 + ", "+ 0 + ", "+ target);
                            for (int n = startN; n <= restMoney[5]; n+=stepN) {
                     //           System.out.println(i + ", "+ j + ", "+ k + ", "+ l + ", "+ m + ", "+ n + ", "+ 0 + ", "+ 0 + ", "+ target);
                                for (int o = startO; o <= restMoney[6]; o+=stepO) {
                                 //   System.out.println(i + ", "+ j + ", "+ k + ", "+ l + ", "+ m + ", "+ n + ", "+ o + ", "+ 0 + ", "+ target);
                                    for (int p = startP; p <= restMoney[7]; p+=stepP) {

                                        if ((i + j + k + l + m + n + o + p - target) <= step) {

                                            double acc =
                                              (restMoney[0] - i)/restMoney[0] * payments[0]
                                            + (restMoney[1] - j)/restMoney[1] * payments[1]
                                            + (restMoney[2] - k)/restMoney[2] * payments[2]
                                            + (restMoney[3] - l)/restMoney[3] * payments[3]
                                            + (restMoney[4] - m)/restMoney[4] * payments[4]
                                            + (restMoney[5] - n)/restMoney[5] * payments[5]
                                            + (restMoney[6] - o)/restMoney[6] * payments[6]
                                            + (restMoney[7] - p)/restMoney[7] * payments[7];

                                            double percent =
                                                    (restMoney[0] - i)/100 * percentage[0]/12
                                                            + (restMoney[1] - j)/100 * percentage[1]/12
                                                            + (restMoney[2] - k)/100 * percentage[2]/12
                                                            + (restMoney[3] - l)/100 * percentage[3]/12
                                                            + (restMoney[4] - m)/100 * percentage[4]/12
                                                            + (restMoney[5] - n)/100 * percentage[5]/12
                                                            + (restMoney[6] - o)/100 * percentage[6]/12
                                                            + (restMoney[7] - p)/100 * percentage[7]/12;

                                           // System.out.println("percent " + i + ", " + j + ", " + k + ", " + l + ", " + m + ", " + n + ", " + o + ", " + p + ", " + minPercent + ", " + percent);
                                            if (minPercent > percent) {
                                                minPercent = percent;
//                                                if (counter == 0 ) {
                                                System.out.println("percent " + i + ", " + j + ", " + k + ", " + l + ", " + m + ", " + n + ", " + o + ", " + p + ", " + minPercent + ", " + percent);
                                                System.out.println("paiment for percent " + i + ", " + j + ", " + k + ", " + l + ", " + m + ", " + n + ", " + o + ", " + p + ", " + target + ", " + acc);
//                                                    counter = countIterations;
//                                                } else counter--;
                                            }
                                //            System.out.println(i + ", "+ j + ", "+ k + ", "+ l + ", "+ m + ", " + n + ", "+ o + ", "+ p + ", "+ target  + ", "+ acc);
//                                            System.out.println(acc);
                                            if (minPayment > acc) {
                                                minPayment = acc;

                                                    System.out.println("PAIMENT " + i + ", " + j + ", " + k + ", " + l + ", " + m + ", " + n + ", " + o + ", " + p + ", " + target + ", " + acc);
                                                System.out.println("PERCENT FOR PAYMENT " + i + ", " + j + ", " + k + ", " + l + ", " + m + ", " + n + ", " + o + ", " + p + ", " + minPercent + ", " + percent);
                                            }
                                        }




                                    }
                                }
                            }
                        }
                    }

                }

            }







        }

        System.out.println("result" + minPayment);







    }
}
