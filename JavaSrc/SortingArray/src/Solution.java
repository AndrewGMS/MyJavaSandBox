import java.util.*;

public class Solution {



        public static void main(String[] args) {
            System.out.println(condition(null) ? 1 : 2);
        }

        public static boolean condition(Number o) {
            return true;
        }

        public static boolean condition(Long l) {
            return false;
        }

    }

 /*   public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator<Cat> itr = cats.iterator();
        while (itr.hasNext()) {
            Cat cat = itr.next();
            if (cat.catName.equals("Кузя")) {
                cats.remove(cat);
                break;
            }
        }
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        Cat cat = new Cat();
        cat.catName =  "Джо";
        cats.add(cat);
        cat = new Cat();
        cat.catName =  "Рыжик";
        cats.add(cat);
        cat = new Cat();
        cat.catName =  "Кузя";
        cats.add(cat);
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat cat:cats
        ) {
            System.out.println(cat);
        }
    }

    // step 1 - пункт 1

    public static class Cat {
        String catName;
    }
}

*/
/*
    Set из котов
        1. Внутри класса Solution создать public static класс кот - Cat.
        2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
        3. В методе main удалите одного кота из Set cats.
        4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
        Каждый кот с новой строки.


        Requirements:
        1. Программа должна выводить текст на экран.
        2. Внутри класса Solution должен быть public static класс Cat с конструктором по умолчанию.
        3. Метод createCats() класса Solution должен возвращать множество (Set), содержащее 3 кота.
        4. Метод printCats() класса Solution должен вывести на экран всех котов из множества. Каждый кот с новой строки.
        5. Метод main() должен один раз вызывать метод createCats().
        6. Метод main() должен вызывать метод printCats().
        7. Метод main() должен удалять одного кота из множества котов.


        */