public class MyThirdProgramm {
   
   public static void main(String[] args) {
//      int o = 0;
      int p = 0; 
      int q = 0;
      for(int i= 3;i<10000000;i++) {
           p = 0;
           for(int j= 2;j<i;j++){
                 // System.out.println(i+" "+j+" "+i % j);
                  if  (i % j == 0)  p++;
                       }
                  if (p == 0) System.out.println(i+" ");

           }
     System.out.println();
     }
}       
 
/*              if(i+j+k == 21) {
                System.out.print(i*100+j*10+k+" ");
                p++;
                q++;
                if (p == 5) {
                    System.out.println();
                    p = 0;
                }
            }
            } 
             System.out.println();
             System.out.println("All - "+q);
          }
   }
*/ 