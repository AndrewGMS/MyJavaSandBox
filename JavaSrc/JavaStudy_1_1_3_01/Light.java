public class Light{   //0               
 
 
public static void main(String[] args) {   //1 
     int lightspeed;
     long days;
     long seconds;
     long distance;

     lightspeed = 186000;
     days = 1000;
     seconds = days * 24 * 60 * 60;
     distance = lightspeed * seconds;
     System.out.print("За " + days);
     System.out.print(" дней свет пройдет около ");
     System.out.println(distance + " миль.");
     
}   //1 
}   //0 
