public class MyFirstProgramm {
   
   public static void main(String[] args) {
long tt = System.currentTimeMillis();
//      int o = 0;
      int p = 0; 
      int q1 = 0;
      for(int qz= 0;qz<100;qz++)
      for(int i= 0;i<10;i++)
       for(int j= 0;j<10;j++)
        for(int k= 0;k<10;k++)
         for(int l= 0;l<10;l++)
          for(int m= 0;m<10;m++)
           for(int n= 0;n<10;n++) {
            if(i+j+k == l+m+n) {
//                o=i*100000+j*10000+k*1000+l*100+m*10+n;
//                System.out.print(i*100000+j*10000+k*1000+l*100+m*10+n+" ");
//                System.out.print(o);
//                System.out.print(" ");
                p++;
                q1++;
                if (p == 11) {
//                    System.out.println();
                    p = 0;
                }
            }
            } 
             System.out.println();
             System.out.println("All - "+q1);

            System.out.println(System.currentTimeMillis()-tt);
            tt = System.currentTimeMillis();

      q1=0;
      for(int qz= 0;qz<100;qz++)
      for(int i= 0;i<1000000;i++)
/*       for(int j= 0;j<10;j++)
        for(int k= 0;k<10;k++)
         for(int l= 0;l<10;l++)
          for(int m= 0;m<10;m++)
           for(int n= 0;n<10;n++) */{
            int q= 0, r = 0,s = 0,t = 0,u = 0, v = 0;
int ii = i%10;
int i2 = i/10;
            q = ii; 
r = i-i2; 
i2 = i2/10;
            
ii = i2%10;
i2 = i2/10;
            s = ii; 
ii = i2%10;
i2 = i2/10;
            t = ii; 
ii = i2%10;
i2 = i2/10;
            u = ii; 
ii = i2%10;
i2 = i2/10;
            v = ii; 
//         System.out.println(q+" "+r+" "+s+" "+t+" "+u+" "+v);

            if(q+r+s == t+u+v) {
//                o=i*100000+j*10000+k*1000+l*100+m*10+n;
//                System.out.print(q*100000+r*10000+s*1000+t*100+u*10+v+" ");
//                System.out.print(o);
//                System.out.print(" ");
                p++;
                q1++;
                if (p == 11) {
//                    System.out.println();
                    p = 0;
                }
            }
            } 
             System.out.println();
             System.out.println("All - "+q1);
             System.out.println(System.currentTimeMillis()-tt);



//             System.out.print("All - ");
//             System.out.println(q); 
           }
   }
