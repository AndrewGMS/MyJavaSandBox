public class MySecondProgramm {
   
   public static void main(String[] args) {
//      int o = 0;
      int p = 0; 
      int q = 0;
      for(int i= 0;i<10;i++)
       for(int j= 0;j<10;j++)
        for(int k= 0;k<10;k++) {
            if(i+j+k == 21) {
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
