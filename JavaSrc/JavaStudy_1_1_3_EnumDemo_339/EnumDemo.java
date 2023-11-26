enum Apple {
  Jonathan, GoldenDel, RedDel, Winesap, Cortland
}


public class EnumDemo{   //0               

public static void main(String[] args) {   //1 
  Apple ap;

  ap = Apple.RedDel;

  System.out.println("Значение ap: " + ap);
  System.out.println();

  ap = Apple.GoldenDel;
  if(ap == Apple.GoldenDel) 
      System.out.println(
         "Переменная ap содержит GoldenDel.\n");
  
  switch(ap)  {
    case Jonathan:
      System.out.println("Сорт Jonathan красный."); 
      break;

    case GoldenDel:
      System.out.println("Сорт Golden Delicious желтый."); 
      break;

    case RedDel:
      System.out.println("Сорт Red Delicious красный."); 
      break;

    case Cortland:
      System.out.println("Сорт Cortland красный."); 
      break;
  }
     
     
}   //1 
}   //0 
