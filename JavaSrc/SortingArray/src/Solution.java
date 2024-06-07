
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = reader.readLine();
//        }
        int i = 0;
        array[i++] = "gfdgfgdfg";
        array[i++] = "yygfgdfg";
        array[i++] = "jjdgfgdfg";
        array[i++] = "kkdgfgdfg";
        array[i++] = "asadgfgdfg";
        array[i++] = "sdfdgfgdfg";
        array[i++] = "yuidgfgdfg";
        array[i++] = "eeegfgdfg";
        array[i++] = "hhhgfgdfg";
        array[i++] = "kkkgfgdfg";
        array[i++] = "llllgfgdfg";
        array[i++] = "iidgfgdfg";
        array[i++] = "ydgfgdfg";
        array[i++] = "iidgfgdfg";
        array[i++] = "nndgfgdfg";
        array[i++] = "ggdgfgdfg";
        array[i++] = "jjdgfgdfg";
        array[i++] = "ofdgfgdfg";
        array[i++] = "rfdgfgdfg";
        array[i++] = "dfdgfgdfg";


        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код

        Boolean areSwap = true;
        while (areSwap) {
            areSwap = false;
            for (int i = 0; i < 19; i++) {
                if (isGreaterThan(array[i], array[i+1])) {
                    String buffer = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buffer;
                    areSwap = true;
                }
            }

        }



    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}


/*
Задача по алгоритмам Ӏ Java Syntax: 8 уровень, 11 лекция
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке. Каждое слово - с новой строки.


Requirements:
1. Программа должна выводить текст на экран.
2. Программа должна считывать значения с клавиатуры.
3. Класс Solution должен содержать три метода.
4. Метод main() должен вызывать метод sort().
5. Метод sort() должен вызывать метод isGreaterThan().
6. Выведенные слова должны быть отсортированы в алфавитном порядке.
 */





/*
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<>();

     //   map.put("Москва", "Ивановы");
     //   map.put("Киев", "Петровы");
     //   map.put("Лондон","Абрамовичи");

        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }

            map.put(family, city);
        }



        String city = reader.readLine();
   //     String city = "Лондон";
        System.out.println(map.get(city));

    }
}
*/

/*

Модернизация ПО
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:

Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи


Requirements:
1. Программа должна выводить текст на экран.
2. Программа должна считывать значения с клавиатуры.
3. Класс Solution должен содержать один метод.
4. Программа должна вывести фамилию семьи по введенному городу.


 */



/*
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> months = new HashMap<String, Integer>();
        months.put("January", 1);
        months.put("February", 2);
        months.put("March", 3);
        months.put("April", 4);
        months.put("May", 5);
        months.put("Jun", 6);
        months.put("July", 7);
        months.put("August", 8);
        months.put("September", 9);
        months.put("October", 10);
        months.put("November", 11);
        months.put("December", 12);



        String month = reader.readLine();


        if (months.get(month) != null) {
            int monthNumber = months.get(month);
            System.out.println(month + " is the " + monthNumber + " month");
        }
        else {
            System.out.println(month + " isn't a month");
        }


    }
}

*/
/*

Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используй коллекции.


Requirements:
1. Программа должна считывать одно значение с клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна использовать коллекции.
4. Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.


 */






/*
public class Solution {
    public static void main(String[] args) {
        System.out.println("H"+"a");
        System.out.println('H'+'a');
    }

}
*/

/*
public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("МАЙ 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Locale locale = new Locale("ru");
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy", locale);
        try {
            System.out.println("Start " + date);
            Date currentDate = sdf.parse(date);
            System.out.println("Start2");
            Date startDate = sdf.parse(date);
//            startDate.setDate(1);
//            startDate.setMonth(0);
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTime(startDate);
            calendar.set(Calendar.MONTH, 0);
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            startDate = calendar.getTime();
            System.out.println(startDate);
            long time = currentDate.getTime() - startDate.getTime();
            long days = time / 24 / 60 / 60000 + 1;
            return days % 2 == 1;
        } catch (ParseException e) {
            System.out.println("Crash!");
            return false;
        }
    }
}

*/

/*
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = Integer.parseInt(reader.readLine());
//        }

        for (int i = 0; i < array.length; i++) {
            array[i] = 37 + i;
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {

        int process = 1;
        while (process != 0) {
            process = 0;
            for (int i = 1; i < array.length; i++) {
              if (array[i] > array[i-1]) {
                int swap = array[i];
                array[i] = array[i-1];
                array[i-1] = swap;
                process++;
              }
            }
        }
    }
}

*/
/*
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human childFirst = new Human();
        childFirst.name = "Наталия";
        childFirst.age = 17;
        childFirst.sex = false;
        childFirst.children = new ArrayList<>();

        Human childSecond = new Human();
        childSecond .name = "Анастасия";
        childSecond .age = 15;
        childSecond .sex = false;
        childSecond.children = new ArrayList<>();

        Human childTree = new Human();
        childTree .name = "Никита";
        childTree .age = 12;
        childTree .sex = true;
        childTree.children = new ArrayList<>();

        Human mom = new Human();
        mom.name = "Светлана";
        mom.age = 39;
        mom.sex = false;
        mom.children = new ArrayList<>();
        mom.children.add(childFirst);
        mom.children.add(childSecond);
        mom.children.add(childTree);

        Human dad = new Human();
        dad.name = "Андрей";
        dad.age = 47;
        dad.sex = true;
        dad.children = new ArrayList<>();
        dad.children.add(childFirst);
        dad.children.add(childSecond);
        dad.children.add(childTree);

        Human grandPaOne = new Human();
        grandPaOne.name = "Владимир";
        grandPaOne.age = 72;
        grandPaOne.sex = true;
        grandPaOne.children = new ArrayList<>();
        grandPaOne.children.add(dad);

        Human grandMaOne = new Human();
        grandMaOne.name = "Валентина";
        grandMaOne.age = 67;
        grandMaOne.sex = false;
        grandMaOne.children = new ArrayList<>();
        grandMaOne.children.add(dad);

        Human grandPaTwo = new Human();
        grandPaTwo.name = "Валерий";
        grandPaTwo.age = 60;
        grandPaTwo.sex = true;
        grandPaTwo.children = new ArrayList<>();
        grandPaTwo.children.add(mom);


        Human grandMaTwo = new Human();
        grandMaTwo.name = "Елена";
        grandMaTwo.age = 59;
        grandMaTwo.sex = false;
        grandMaTwo.children = new ArrayList<>();
        grandMaTwo.children.add(mom);

        System.out.println(childFirst);
        System.out.println(childSecond);
        System.out.println(childTree);
        System.out.println(mom);
        System.out.println(dad);
        System.out.println(grandPaOne);
        System.out.println(grandMaOne);
        System.out.println(grandPaTwo);
        System.out.println(grandMaTwo);
    }

    public static class Human {
        String name;
        int age;
        boolean sex;
        ArrayList<Human> children;

        @Override
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}



*/
/*
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).


Requirements:
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
 */

/*
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String string = reader.readLine();

        String string = " мама мыла раму.";
        char[] charArray = string.toCharArray();
        charArray[0] = Character.toUpperCase(charArray[0]);
        for (int i = 0; i < charArray.length-1; i++) {
            if (charArray[i] == ' ') {
               charArray[i+1] = Character.toUpperCase(charArray[i+1]);
            }
        }
        string = new String(charArray);
        System.out.println(string);
        //напишите тут ваш код
    }
}

*/
/*
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.


Requirements:
1. Программа должна выводить текст на экран.
2. Программа должна считывать строку с клавиатуры.
3. Программа должна заменять в тексте первые буквы всех слов на заглав
 */

/*
public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int minValue = array.get(0);
        for (int element:array) {
           if (minValue > element) {minValue = element;}
        }
        return minValue;
    }

    public static List<Integer> getIntegerList() throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            integerList.add(i, scanner.nextInt());
        }
        return integerList;
    }
}
*/

/*
Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.


Requirements:
1. Программа должна выводить текст на экран.
2. Программа должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод getIntegerList() должен считать с клавиатуры число N, потом вернуть список размером N элементов, заполненный числами с клавиатуры.
5. Метод getMinimum() должен вернуть минимальное число среди элементов списка.
6. Метод main() должен вызывать метод getIntegerList().
7. Метод main() должен вызывать метод getMinimum().

 */


/*
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


*/

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