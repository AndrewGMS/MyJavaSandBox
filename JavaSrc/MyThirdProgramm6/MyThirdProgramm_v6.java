public class MyThirdProgramm_v6 {
   
   public static void main(String[] args) {
      long o = 0;
      long p = 0; 
      long q = 0;
     long tt = System.currentTimeMillis();
     for(long i= 2;i<10000000;i++) {
           p = 0;
//           q = Math.round(Math.sqrt(i))+1; 
           for(long j= 2;j*j<=i;j++){                                                     //Это хуже чем квадратный корень i
                  // System.out.println(i+" "+j+" "+i % j);
                  if  (i % j == 0)  {p++;break;}
//                  q = i/j+1;
                       }
                  if (p == 0) {
//                      System.out.println(i+" ");
                      o++;
                  }

           }
     System.out.println("Time - "+(System.currentTimeMillis()-tt));
     System.out.println("V5 Count - "+o);
     }
}       
 
 