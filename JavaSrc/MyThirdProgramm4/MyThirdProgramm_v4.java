public class MyThirdProgramm_v4 {
   
   public static void main(String[] args) {
      long o = 0;
      long p = 0; 
      long q = 0;
      long tt = System.currentTimeMillis();
      for(long i= 1;i<100000000;i++) {
           p = 0;
           q = i; 
           for(long j= 2;j<q;j++){
                  // System.out.println(i+" "+j+" "+i % j);
                  if  (i % j == 0)  {p++;break;}
                  q = i/j+1;
                       }
                  if (p == 0) {
//                   System.out.println(i+" ");
                      o++;
                     }

           }
     System.out.println("Time - "+(System.currentTimeMillis()-tt));
     System.out.println("V4 Count - "+o);
     }
}       
 
