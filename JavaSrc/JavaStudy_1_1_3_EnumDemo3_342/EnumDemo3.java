enum Apple {
  Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
  private int price;
  Apple(int p) {price = p;}
 int getPrice() {return price;}
}


public class EnumDemo3{   //0               
 
 
public static void main(String[] args) {   //1 

  Apple ap;

  System.out.println("яблоко сорта Winesap стоит "
                                + Apple.Winesap.getPrice()
                                + " центов.\n");
  System.out.println("÷ены на все сорта €блок:");
  for(Apple a : Apple.values())
     System.out.println(a + " стоит " + a.getPrice()
                                     + " центов.");




     
     
     
     
}   //1 
}   //0 
