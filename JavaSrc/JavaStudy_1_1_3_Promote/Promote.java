public class Promote{   //0               
  
public static void main(String[] args) {   //1 
  byte b = 42;
  char c = 'a';
  short s = 1024;
  int i = 50_000;
  float f = 5.67f;
  double d = .1234;
  double result = (f * b) + (i / c) - (d * s);
  System.out.println((f * b) + " + " + (i / c) 
                  + " - "  + (d * s));
  System.out.println("result = " + result);
     
}   //1 
}   //0 
