class Grandpa {
          Grandpa() { System.out.println(" I am a Grandpa"); }
}
class Daddy extends  Grandpa{
          Daddy() { System.out.println(" I am a Daddy"); }
}
class Me extends  Daddy{
          Me() { System.out.println(" It is Me"); }
}

public class Main{   //0               
 
public static void main(String[] args) {   //1 
     Me me = new Me();        
}   //1 
}   //0 
