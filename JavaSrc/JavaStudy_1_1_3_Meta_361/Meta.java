import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
  String str();
  int val();
}

public class Meta{   //0               

  @MyAnno(str = "Два параметра", val = 19) 

  public static void myMeth(String str, int i)
  {  //1
    
     Meta ob = new Meta();

    try { //2

      Class<?> c = ob.getClass();

      Method m =  c.getMethod("myMeth", String.class,  int.class);


      MyAnno anno = m.getAnnotation(MyAnno.class);

      System.out.println(anno.str() + " " + anno.val());



      } //2
      catch (NoSuchMethodException exc) { //2
         System.out.println("Метод не найден. ");     

     }   //2




  } //1
 
public static void main(String[] args) {   //1 
  myMeth("Тест", 10);     
     
     
     
}   //1 
}   //0 
