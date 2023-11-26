
public int EratosfenSay(int d) {
                  int r = d % 10;
                   switch(r)
                   {                                                     // 4
                      case 0:  
                      case 2:  
                      case 4:  
                      case 5:  
                      case 6:  
                      case 8:  
                       return 1;
                       break;
                     default : 
                       return 0;
                    }                                                     // 4

          }

public class MyThirdProgramm_v8 { //0

public static int EratosfenSay(int d);

public static void main(String[] args) {            //1
 
     int o = 0; // кол-во простых чисел
      int p = 0; // признак простого числа
      long q = 0; // предел обработки
     long tt = System.currentTimeMillis();
     for(int i= 2;i<10000000;i++) 
          {                                                                  //2    
           p = 0;
           if (i > 10) 
                {                                                          // 3
//                 p = EratosfenSay(i);
                 }
            else
                 {
//                   System.out.println("Первая проверка не проводилась -- ");
                 }
            if  (p == 0) 
                {                                                            //  4
//                  System.out.print("вторая проверка -- ");

                  q = Math.round(Math.sqrt(i))+1; 
                  for(int j= 2;j<q;j++)
                    {
                         if  (i % j == 0)  
                         {                                                      // 5  
                           p++;
                           break;
                         }                                                      // 5
                
                    }



                 }                                                            //  4
 
//                }                                                  // 3 


                  if (p == 0) 
                    {                                                    // +4   
//                      System.out.println(i+" ");
                      o++;
                    }                                                   // -4      






           }                                                                                //2
     System.out.println("Time - "+(System.currentTimeMillis()-tt));
     System.out.println("V7 Count - "+o);
     }                        //1

}       //0



 

 
