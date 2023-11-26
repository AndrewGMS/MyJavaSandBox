import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
   String str();
   int val();
}

public class Meta{   //0               

@MyAnno(str = "Пример аннотации", val = 100)

public static void myMeth() {   //1
  Meta ob = new Meta();

 try { //2

    Class<?> c = ob.getClass();

    Method m = c.getMethod("myMeth");

    MyAnno anno = m.getAnnotation(MyAnno.class);


    System.out.println(anno.str() + " " + anno.val());

  } //2
   catch (NoSuchMethodException exc) { 
   System.out.println("Метод не найден.");       
  }
} //1 
 




public static void main(String[] args) {   //1 
myMeth();     
}   //1 
}   //0 
