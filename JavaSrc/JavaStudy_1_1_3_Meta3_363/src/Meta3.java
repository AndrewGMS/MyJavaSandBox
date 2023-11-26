import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
    String str() default "Тестирование";
    int val() default 9000;
}



//JavaStudy_1_1_3_Meta3_363
public class Meta3 {
    public static void main(String args[]) {
        myMeth();
    }
    
    @MyAnno
        public static void myMeth() {
            Meta3 ob = new Meta3();
            try {
                Class<?> c = ob.getClass();

                Method m = c.getMethod("myMeth");

                MyAnno anno = m.getAnnotation(MyAnno.class);

                System.out.println(anno.str() + " " + anno.val());
            } catch (NoSuchMethodException exc) {
                System.out.println("Метод не найден");
            }
        }



}
