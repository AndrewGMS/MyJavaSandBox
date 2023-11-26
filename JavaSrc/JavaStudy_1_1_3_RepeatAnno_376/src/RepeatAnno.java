import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno {
    String str() default "Тестирование";
    int val() default 9000;
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
    MyAnno[] value();
}
public class RepeatAnno {
    @MyAnno(str = "Первая аннотация", val = -1)
    @MyAnno(str = "Вторая аннотация", val = 100)
    @MyAnno(str = "Третья аннотация", val = 99)

    public static void myMeth(String str, int i) {
        RepeatAnno ob = new RepeatAnno();

        try {
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth", String.class, int.class);

            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);

// блок из страницы 377
            System.out.println();

            Annotation[] annos = m.getAnnotationsByType(MyAnno.class);
            for(Annotation a : annos)
                System.out.println(a);


         } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }

        System.out.println();


    }

    public static void main(String[] args) {
        myMeth("Тест", 10);
    }

}
