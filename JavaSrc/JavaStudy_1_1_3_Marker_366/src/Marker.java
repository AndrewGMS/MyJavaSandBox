import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker{}


public class Marker {

    public static void main(String args[]) {
        myMeth();
    }



@MyMarker
    public static void myMeth() {
        Marker ob = new Marker();

        try {
            Method m = ob.getClass().getMethod("myMeth");

            if(m.isAnnotationPresent(MyMarker.class))
                System.out.println("Маркерная аннотация MyMarker присутствует.");

        } catch (NoSuchMethodException exc) {
            System.out.println("Меторд не найден.");
}


}
}