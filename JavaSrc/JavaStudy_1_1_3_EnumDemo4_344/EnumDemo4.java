enum Apple {
  Jonathan, GoldenDel, RedDel, Winesap, Cortland;
}



public class EnumDemo4{   //0               
 
 
public static void main(String[] args) {   //1 
  Apple ap, ap2, ap3;

  System.out.println("Все константы сортов яблок "
                                 + " и их порядковые значения: ");
  
  for(Apple a : Apple.values())
               System.out.println(a + " "  + a.ordinal());

  ap = Apple.RedDel;
  ap2 = Apple.GoldenDel;
  ap3 = Apple.RedDel;

  System.out.println();

  if(ap.compareTo(ap2) < 0) 
    System.out.println( ap + " предшествует " + ap2);  

  if(ap.compareTo(ap2) > 0) 
    System.out.println( ap2 + " предшествует " + ap);  

  if(ap.compareTo(ap3) == 0) 
    System.out.println( ap + " равно " + ap3);  

  System.out.println();

  if(ap.equals(ap3)) 
    System.out.println( ap + " равно " + ap3);  

  if(ap == ap3) 
    System.out.println( ap + " == " + ap3);  

   
}   //1 
}   //0 
