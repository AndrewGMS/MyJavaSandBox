
class EratosfenesSieve {
    public int EratosfenSay(int d) {
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

    public int EratosfenSay10(int d) {
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


} // class EratosfenesSieve
// ==========


public class MyThirdProgramm_v10 { //0

//public static int EratosfenSay(int d);

    public static void main(String[] args) {            //1
        EratosfenesSieve ES = new EratosfenesSieve();
        int o = 0; // кол-во простых чисел
        int p = 0; // признак простого числа
        long q = 0; // предел обработки
        long tt = System.currentTimeMillis();

        int i10 = 0;
        for (int i = 1; i < 10000000; i++) {                                                        //2
            i10++;
            if (i10 == 10) i10 = 0;
// System.out.println(i+" -- "+i10);
            p = 0;
            if (i > 10) {                                                          // 3
                p = ES.EratosfenSay10(i10);
            } else {
//                   System.out.println("Первая проверка не проводилась -- ");
            }
            if (p == 0) {                                                            //  4
//                  System.out.print("вторая проверка -- ");

                q = Math.round(Math.sqrt(i)) + 1;

                if (i % 2 == 0) {                                                              // 5
                    if (i != 2) p++;
                }                                                      // 5
                else {                                                          // 5
                    for (int j = 3; j < q; j = j + 2) {                                                           // 5a
                        if (i % j == 0) {                                                      // 5b
                            p++;
                            break;
                        }                                                      // 5b
                    }                                                         // 5a
                }                                                          //5


            }                                                            //  4

//                }                                                  // 3 							


            if (p == 0) {                                                    // +4
//                      System.out.println(i+" ");
                o++;
            }                                                   // -4


        }                                                                                //2
        System.out.println("Time - " + (System.currentTimeMillis() - tt));
        System.out.println("V10 Count - " + o);
    }                        //1

}       //0



 

 
