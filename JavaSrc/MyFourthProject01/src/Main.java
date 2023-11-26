public class Main {

    public static void main(String[] args) {            //1
//        EratosfenesSieve ES = new EratosfenesSieve();
        int CountPimeNumbers = 0; // кол-во простых чисел
        int IsPrimeNumber = 0; // признак простого числа

        long LimitNumberForMath = 0; // предел обработки
        long LimitNumberForEach = 100 * 1000 * 1000; // Диапазон от нуля
        long StartTime = System.currentTimeMillis();



        if (LimitNumberForEach > 9) {LimitNumberForMath = 9;} else {LimitNumberForMath = LimitNumberForEach;}
        for (int i = 2; i <= LimitNumberForMath; i++) {
//            System.out.println("i "+i+" LimitNumberForMath "+LimitNumberForMath);

            for (int j = 2; j <= i; j++ ) {                                                           // 5a
//                System.out.println("i "+i+" j "+j);
                if ((i % j == 0) & (i != j))                                                      // 5b
                    IsPrimeNumber++;
//                    break;
                }                                                      // 5b
            if (IsPrimeNumber == 0) {                                                    // +4
//                System.out.println(i+" -+-");
                CountPimeNumbers++;
            }
            else  IsPrimeNumber = 0;
        }
//        System.out.println(" LimitNumberForEach "+LimitNumberForEach);
        int i10 = 9;
        int SignOfDivisibilityByThree = 3;
        for (int i = 10; i < LimitNumberForEach+1; i++) {                                                        //2
            i10++;
            if (SignOfDivisibilityByThree == 3) SignOfDivisibilityByThree = 1; else SignOfDivisibilityByThree++;
            if (i10 == 10) i10 = 0;
// System.out.println(i+" -- "+i10);
            IsPrimeNumber = 0;
//            if (i > 10) {                                                          // 3
                IsPrimeNumber = EratosfenSay10(i10);
                if (SignOfDivisibilityByThree == 3)
                {
                    IsPrimeNumber = 1; // проверка на делимость на три
//                    System.out.println(i+" -- "+ SignOfDivisibilityByThree);
                }
                //            } else {
//                   System.out.println("Первая проверка не проводилась -- ");
//            }
            if (IsPrimeNumber == 0) {                                                            //  4
//                  System.out.print("вторая проверка -- ");
                LimitNumberForMath = Math.round(Math.sqrt(i)) + 1;
                if (i % 2 == 0) {                                                              // 5
                    if (i != 2) IsPrimeNumber++;
                }                                                      // 5
                else {                                                          // 5
                    for (int j = 3; j < LimitNumberForMath; j = j + 2) {                                                           // 5a
                        if (i % j == 0) {                                                      // 5b
                            IsPrimeNumber++;
                            break;
                        }                                                      // 5b
                    }                                                         // 5a
                }                                                          //5
            }                                                            //  4
//                }                                                  // 3
            if (IsPrimeNumber == 0) {                                                    // +4
//                      System.out.println(i+" ");
                CountPimeNumbers++;
            }                                                   // -4
        }                                                                                //2
        System.out.println("Time - " + (System.currentTimeMillis() - StartTime));
        System.out.println("V10 Count - " + CountPimeNumbers);
    }                        //1

    public static int EratosfenSay(int d) {
        int r = d % 10;
        switch (r) {                                                     // 4
            case 0:
            case 2:
            case 4:
            case 5:
            case 6:
            case 8:
                return 1;
//                       break;
            default:
                return 0;
        }                                                     // 4
    }

    public static int EratosfenSay10(int d) {
//                  int r = d % 10;  // допускаем (предполагаем), что значения больше 9 не будет
        switch (d) {                                                     // 4
            case 0:
            case 2:
            case 4:
            case 5:
            case 6:
            case 8:
                return 1;
//                       break;
            default:
                return 0;
        }                                                     // 4
    }
}
