
import java.lang.annotation.*;
import java.lang.reflect.*;


@Target(ElementType.TYPE_USE)
interface TypeAnno { }

@Target(ElementType.TYPE_USE)
@interface NotZeroLen { }

@Target(ElementType.TYPE_USE)
@interface Unique { }

@Target(ElementType.TYPE_USE)
@interface MaxLen {
    int value();
}

@Target(ElementType.FIELD)
@interface EmtyOk { }

@Target(ElementType.METHOD)
@interface Recommended { }



class TypeAnnoDemo <@What(description = "Данные обощенного типа") T> {

// Ошибка при компиляции
    public @Unique TypeAnnoDemo() {}

    @TypeAnno String str;

    @EmtyOk String test;

    public int f(@TypeAnno TypeAnnoDemo<T> this, int x) {
        return 10;
    }

    public @TypeAnno Integer f3(String str) {
        return str.length() / 2 ;
    }

    public void f4() throws @TypeAnno NullPointerException { }

    String @MaxLen(10) [ ] @NotZeroLen [ ] w;

    @TypeAnno Integer[] vec;

    public static void myMeth(int i) {
        TypeAnnoDemo<@TypeAnno Integer> ob = new @Unique TypeAnnoDemo<Integer>();

        @Unique TypeAnnoDemo<Integer> ob2 = new @Unique TypeAnnoDemo<Integer>();

        Object x = new Integer(10);
        Integer y;

        y = (@TypeAnno Integer) x;

    }

    public static void main(String args[]) {
        myMeth(10);
    }

    class SomeClass extends @TypeAnno TypeAnnoDemo<Boolean> {}

}
