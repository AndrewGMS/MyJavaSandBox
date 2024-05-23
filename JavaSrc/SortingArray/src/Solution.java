
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Андреев","Яков");
        map.put("Богданов","Юрий");
        map.put("Владимиров","Эдуард");
        map.put("Григорьев","Харитон");
        map.put("Дмитриев","Федор");
        map.put("Егоров","Тимофей");
        map.put("Зиновьев","Станислав");
        map.put("Андреев","Юрий");
        map.put("Богданов","Эдуард");
        map.put("Владимиров","Андрей");
        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}




/* public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<>();

        //напишите тут ваш код
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> result = new HashSet<>();
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> result = new HashSet<>();
        result.addAll(cats);
        result.addAll(dogs);
        return result;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        pets.removeAll(cats); // вариант 2 тоже работает
//            for (Object cat : cats) { // вариант 1
//                if (pets.contains(cat)) {
//                    pets.remove(cat);
//                }
//        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object pet : pets) {
            System.out.println(pet);
        }
        System.out.println();
    }

    public static class Cat {

    }

    public static class Dog {

    }
}
*/
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