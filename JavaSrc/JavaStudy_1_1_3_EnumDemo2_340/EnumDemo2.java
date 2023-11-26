enum Apple {
  Jonathan, GoldenDel, RedDel, Winesap, Cortland
}


public class EnumDemo2{   //0               
 
 
public static void main(String[] args) {   //1 
  Apple ap;

  System.out.println(
              "Константы перечислимого типа Apple:");

  Apple allapples[] = Apple.values();
  for (Apple a : allapples) 
    System.out.println(a);
  System.out.println();
  ap = Apple.valueOf("Winesap");
  System.out.println("Переменная ap содержит " + ap); 
     
     
     
}   //1 
}   //0 
