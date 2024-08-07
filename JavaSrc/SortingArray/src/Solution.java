
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.imageio.stream.FileImageOutputStream;
import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.rmi.RemoteException;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.StackTraceElement;
import  java.util.function.Function;



public class Solution {
  public static void main(String[] args) throws Exception {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

 //   int numberFirst = Integer.parseInt(bufferedReader.readLine());
 //   int numberSecond = Integer.parseInt(bufferedReader.readLine());
       int numberFirst = 100;
       int numberSecond = 90;

    bufferedReader.close();


    int nOD = 1;

    for (int i = 1; i <=numberFirst ; i++) {
      if ((numberFirst % i == 0) & (numberSecond % i == 0)) {
        nOD = i;
      }
    }

    System.out.println(nOD);

    while (numberFirst != numberSecond) {
      System.out.println(" -1 " + numberFirst);
      System.out.println(" -2 " + numberSecond);
      if (numberFirst > numberSecond) {
        numberFirst -= numberSecond;
      }
      if (numberSecond > numberFirst) {
        numberSecond -= numberFirst;
      }
    }

    System.out.println(numberFirst);
  }
}


/*
НОД
Давай найдем наибольший общий делитель (НОД). Для этого:
Введи с клавиатуры 2 целых положительных числа.
Выведи в консоли наибольший общий делитель.

Requirements:
1. Программа должна считывать с клавиатуры 2 строки.
2. Программа должна выводить данные на экран.
3. Программа должна выводить на экран наибольший общий делитель (НОД) чисел, считанных с клавиатуры, и успешно завершаться.

 */


/*
public class Solution {
  static void initList(List<Number> list) {
    list.add(new Double(1000f));
    list.add(new Double("123e-445632"));
    list.add(new Float(-90 / -3));
    list.remove(new Double("123e-445632"));
  }

  static void printListValues(List<Number> list) {

    System.out.println(list.size());

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }

  static void processCastedObjects(List<Number> list){
    for (Number object : list) {
      //Исправь 2 ошибки
      if (object instanceof Float) {
        Float a = (Float) object;
        System.out.println("Is float value defined? " + !(a.isNaN()));
      } else if (object instanceof Double) {
        Double a = (Double) object;
        System.out.println("Is double value infinite? " + a.isInfinite());
      }
    }

  }


  public static void main(String[] args) {
    List<Number> list = new LinkedList<Number>();
    initList(list);
    //3
//    list.add(new Double(1000f));
//    list.add(new Double("123e-445632"));
//    list.add(new Float(-90 / -3));
//    list.remove(new Double("123e-445632"));

    printListValues(list);
    //4 - Исправь 2 ошибки
//    for (int i = 0; i <= list.size(); i--) {
//      System.out.println(list.get(i));
//    }
    processCastedObjects(list);
    //5
//    for (Number object : list) {
//      //Исправь 2 ошибки
//      if (object instanceof Float) {
//        Double a = (Double) object;
//        System.out.println("Is float value defined? " + !(a.isNaN()));
//      } else if (object instanceof Double) {
//        Float a = (Float) object;
//        System.out.println("Is double value infinite? " + a.isInfinite());
//      }
//    }
  }
}

*/
/*
Исправь четыре ошибки
У нас есть программа, которая должна заполнять список и выводить его определенным образом в консоли.
Сейчас она работает некорректно. Чтобы исправить программу:
Подумай что делает метод main().
Создай в классе Solution статические методы initList(List<Number> list), printListValues(List<Number> list), processCastedObjects(List<Number> list).
Найди блок кода, который заполняет значениями список, и перемести его в метод initList.
Найди блок кода, который в цикле for выводит на экран содержимое списка, и перемести его в метод printListValues.
Найди блок кода, в котором для каждого объекта списка проверяется тип и выводятся сообщения на экран, и перемести его в метод processCastedObjects.
Исправь 2 ошибки в методе printListValues так, чтобы на экран корректно выводилось содержимое переданного в качестве параметра списка.
Исправь 2 ошибки в методе processCastedObjects, связанные с приведением типов:
для объекта типа Float нужно вывести "Is float value defined? " + !([Float_object].isNaN()).
для объекта типа Double нужно вывести "Is double value infinite? " + [Double_object].isInfinite().
Метод main() не учавствует в проверке, но для отображения результата можно вызвать все новые методы и передать каждому список list.

Requirements:
+1. В классе Solution должны быть реализованы статические методы initList(List<Number> list), printListValues(List<Number> list), processCastedObjects(List<Number> list).
+2. Метод initList должен заполнять полученный список произвольными значениями.
3. Метод printListValues должен выводить содержимое полученного списка на экран.
4. Метод processCastedObjects должен анализировать элементы списка и для объектов типа Float или Double выводить на экран текст согласно условию задачи.
 */

/*
public class Solution {
  public static void main(String[] args) {
    List<Apartment> apartments = new ArrayList<Apartment>();
    apartments.add(new OneRoomApt());
    apartments.add(new TwoRoomApt());
    apartments.add(new ThreeRoomApt());

    cleanAllApartments(apartments);
  }

  public static void cleanAllApartments(List<Apartment> apartments) {
    //написать тут вашу реализацию пунктов 1-4
    for (Apartment apartment: apartments) {
      if (apartment instanceof OneRoomApt) {
        ((OneRoomApt) apartment).clean1Room();
      } else if (apartment instanceof TwoRoomApt) {
        ((TwoRoomApt) apartment).clean2Rooms();
      } else if (apartment instanceof ThreeRoomApt) {
        ((ThreeRoomApt) apartment).clean3Rooms();
      }
    }
    
  }

  static interface Apartment {
  }

  static class OneRoomApt implements Apartment {
    void clean1Room() {
      System.out.println("1 room is cleaned");
    }
  }

  static class TwoRoomApt implements Apartment {
    void clean2Rooms() {
      System.out.println("2 rooms are cleaned");
    }
  }

  static class ThreeRoomApt implements Apartment {
    void clean3Rooms() {
      System.out.println("3 rooms are cleaned");
    }
  }
}
*/
/*
public class Solution {
  public static void main(String[] args) throws Exception {
    //ввести с консоли несколько ключей (строк), пункт 7
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    Movie movie = null;
    String key = null;
    boolean isContinue = true;
    do  {
      //создаем объект, пункт 2
      key = bufferedReader.readLine();
      movie = MovieFactory.getMovie(key);
      if (movie != null) System.out.println(movie.getClass().getSimpleName());
    } while (movie != null);

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()

    bufferedReader.close();

  }

  static class MovieFactory {

    static Movie getMovie(String key) {
      Movie movie = null;
      //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
      if ("soapOpera".equals(key)) {
        movie = new SoapOpera();
      } else if ("cartoon".equals(key)) {
        movie = new Cartoon();
      } else if ("thriller".equals(key)) {
        movie = new Thriller();
      }
      //напишите тут ваш код, пункты 5,6
      return movie;
    }
  }

  static abstract class Movie {
  }

  static class SoapOpera extends Movie {
  }

  //Напишите тут ваши классы, пункт 3
  static class Cartoon extends Movie {}
  static class Thriller extends Movie {}
}

*/
/*
public class Solution {
  public static void main(String[] args) {
    Object obj = new Circle();
    Movable movable = (Movable) obj;
    Drawable drawable = new Rectangle();

    printMainInfo(drawable);
    printMainInfo(movable);
  }

  public static void printMainInfo(Object object) {
    if (object instanceof Drawable) {
      ((Drawable) object).draw();
    } else if (object instanceof Movable) {
      ((Movable) object).move();
    }

  }

  static interface Movable {

    void move();
  }

  static class Circle implements Movable {

    public void draw() {
      System.out.println("Can be drawn");
    }

    public void move() {
      System.out.println("Can be moved");
    }

  }

  static interface Drawable {
    void draw();
  }

  static class Rectangle implements Drawable {
    public void draw() {
      System.out.println("Can be drawn");
    }

    public void move() {
      System.out.println("Can be moved");
    }
  }
} */
/*
    Реализовать метод printMainInfo
        Напиши реализацию метода printMainInfo, чтобы:
        Если в метод передают объект типа Drawable, у этого объекта вызывался метод draw.
        Если в метод передают объект типа Movable, у этого объекта вызывался метод move.

        Requirements:
        1. Класс Solution должен содержать реализацию метода printMainInfo с одним параметром типа Object.
        2. Метод printMainInfo должен быть статическим.
        3. Метод printMainInfo должен иметь самый широкий уровень доступа — public.
        4. Метод printMainInfo должен вызывать у переданного ему в качестве параметра объекта метод draw, если этот объект реализует интерфейс Drawable.
        5. Метод printMainInfo должен вызывать у переданного ему в качестве параметра объекта метод move, если этот объект реализует интерфейс Movable.

*/

/*
import static java.lang.Thread.*;
public class Solution {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Person person = null;
    String key = null;

    //тут цикл по чтению ключей, пункт 1
   boolean isContinue = true;
   while (isContinue) {
      //создаем объект, пункт 2
      key = reader.readLine();
      switch (key) {
        case "user" :
         person = new Person.User();
        break;
        case "loser":
          person = new Person.Loser();
          break;
        case "coder":
          person = new Person.Coder();
          break;
        case "proger":
          person = new Person.Proger();
          break;
        default:
          isContinue = false;
      }

      doWork(person); //вызываем doWork

    }
  }

  public static void doWork(Person person) {
    // пункт 3
    if (person instanceof Person.User) {
      ((Person.User) person).live();
    } else if (person instanceof Person.Loser) {
      ((Person.Loser) person).doNothing();
    } else if (person instanceof Person.Coder) {
      ((Person.Coder) person).writeCode();
    } else if (person instanceof Person.Proger) {
      ((Person.Proger) person).enjoy();
    }
  }
}


interface Person {
  class User implements Person {
    void live() {
      System.out.println("I usually just live.");
    }
  }

  class Loser implements Person {
    void doNothing() {
      System.out.println("I usually do nothing.");
    }
  }

  class Coder implements Person {
    void writeCode() {
      System.out.println("I usually write code.");
    }
  }

  class Proger implements Person {
    void enjoy() {
      System.out.println("It's a wonderful life!");
    }
  }

}
*/
/*
User, Loser, Coder and Proger
Давай напишем программу, которая определит, чем заняться тому или иному человеку.
Для этого нужно:
Ввести [в цикле] с клавиатуры несколько строк (ключей).
Строки (ключи) могут быть такими: "user", "loser", "coder", "proger".
Ввод окончен, когда строка не совпадает ни с одной из выше указанных.
Для каждой введенной строки нужно:
Создать соответствующий объект [см. Person.java], например, для строки "user" нужно создать объект класса User.
Передать этот объект в метод doWork.
Написать реализацию метода doWork, который:
Вызывает метод live() у переданного объекта, если этот объект (person) имеет тип User.
Вызывает метод doNothing(), если person имеет тип Loser.
Вызывает метод writeCode(), если person имеет тип Coder.
Вызывает метод enjoy(), если person имеет тип Proger.

Requirements:
1. Метод main должен считывать строки с клавиатуры.
2. Метод main должен прекращать считывать строки с клавиатуры, как только введенная строка не совпадает с одной из ожидаемых (user, loser, coder, proger).
3. Для каждой корректной (user, loser, coder, proger) введенной строки должен быть вызван метод doWork с соответствующим объектом класса Person в качестве параметра.
4. В классе Solution должен быть реализован метод doWork с одним параметром типа Person.
5. Метод doWork должен вызывать метод live() у переданного объекта, если этот объект имеет тип User.
6. Метод doWork должен вызывать метод doNothing() у переданного объекта, если этот объект имеет тип Loser.
7. Метод doWork должен вызывать метод writeCode() у переданного объекта, если этот объект имеет тип Coder.
8. Метод doWork должен вызывать метод enjoy() у переданного объекта, если этот объект имеет тип Proger.
 */
/*
public class Solution {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    Person person = null;
    String key;
    while (!(key = reader.readLine()).equals("exit")) {
      if ("player".equals(key)) {
        person = new Player();
      } else if ("dancer".equals(key)) {
        person = new Dancer();
      }
      haveFun(person);
    }
  }

  public static void haveFun(Person person) {
    //напишите тут ваш код
    if (person != null) {
    if (person.getClass().getSimpleName().equals("Player")) {
      Player player = (Player) person;
      player.play();
    } else {
      Dancer dancer = (Dancer) person;
      dancer.dance();
    }
    }
  }

  interface Person {
  }

  static class Player implements Person {
    void play() {
      System.out.println("playing");
    }
  }

  static class Dancer implements Person {
    void dance() {
      System.out.println("dancing");
    }
  }
}

*/
/*
Player and Dancer
Посмотри, что делает эта программа.
Затем измени haveFun так, чтобы он вызывал метод:
play(), если person имеет тип Player.
dance(), если person имеет тип Dancer.

Requirements:
1. Класс Player должен реализовывать интерфейс Person.
2. Класс Dancer должен реализовывать интерфейс Person.
3. Метод haveFun() должен вызывать метод play() у переданного ему объекта, если объект является игроком (Player).
4. Метод haveFun() должен вызывать метод dance() у переданного ему объекта, если объект является танцором (Dancer).
5. Метод main() должен считывать данные с клавиатуры.
6. Метод main() должен прекращать считывать данные с клавиатуры, если введенная строка равна "exit".

*/


/*
public class Solution {
  public static void main(String[] args) {
    Object obj = new Jerry();

    Mouse mouse = (Mouse) obj;
    GrayMouse grayMouse = (GrayMouse) mouse;
    Jerry jerry = (Jerry) grayMouse;

    printClasses(obj, mouse, grayMouse, jerry);

  }

  public static void printClasses(Object obj, Mouse mouse, GrayMouse grayMouse, Jerry jerry) {
    System.out.println(jerry.getClass().getSimpleName());
    System.out.println(grayMouse.getClass().getSimpleName());
    System.out.println(mouse.getClass().getSimpleName());
    System.out.println(obj.getClass().getSimpleName());
  }

  static class Mouse {
  }

  static class GrayMouse extends Mouse {
  }

  static class Jerry extends GrayMouse {
  }
}

*/
/*
Без ошибок
Давай напишем программу, которая создает мышонка.
Для этого инициализируй объект obj таким классом, чтобы метод main() выполнился без ошибок.


Requirements:
1. Класс GrayMouse должен наследоваться от класса Mouse.
2. Класс Jerry должен наследоваться от класса GrayMouse.
3. В переменной obj должен храниться объект, который будет одновременно являться и Mouse, и GrayMouse, и Jerry.
4. Метод main должен вызывать метод printClasses.

 */


/*
public class Solution {
  public static void main(String[] args) throws Exception {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String catName = bufferedReader.readLine();

    while (!catName.isEmpty()) {
      Cat cat = CatFactory.getCatByKey(catName);
      System.out.println(cat);
      catName = bufferedReader.readLine();
    }
    //напишите тут ваш код
  }

  static class CatFactory {
    static Cat getCatByKey(String key) {
      Cat cat;
      switch (key) {
        case "vaska":
          cat = new MaleCat("Василий");
          break;
        case "murka":
          cat = new FemaleCat("Мурочка");
          break;
        case "kiska":
          cat = new FemaleCat("Кисюлька");
          break;
        default:
          cat = new Cat(key);
          break;
      }
      return cat;
    }
  }

  static class Cat {
    private String name;

    protected Cat(String name) {
      this.name = name;
    }

    public String getName() {
      return this.name;
    }

    public String toString() {
      return "Я уличный кот " + getName();
    }
  }

  static class MaleCat extends Cat {
    MaleCat(String name) {
      super(name);
    }

    public String toString() {
      return "Я - солидный кошак по имени " + getName();
    }
  }

  static class FemaleCat extends Cat {
    FemaleCat(String name) {
      super(name);
    }

    public String toString() {
      return "Я - милая кошечка по имени " + getName();
    }
  }
}
*/
/*
Коты
Давай напишем программу, которая будет давать имена всем котикам, выпускаемым на нашей котофабрике.
Для этого нужно:
Считывать строки (параметры) с консоли, пока пользователь не введет пустую строку (Enter).
Для каждого параметра (имени кота):
создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
вывести на экран cat.toString().

Requirements:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна прекращать считывать данные после ввода пустой строки.
3. Программа должна выводить на экран описание каждого кота (cat.toString).
4. Программа должна создавать объект класса Cat для каждого введенного имени кота (строки, считанной с клавиатуры) c помощью метода getCatByKey.
 */


/*
public class Solution {
  public static void main(String[] args) {
    List<Person> plot = new ArrayList<Person>();
    plot.add(new Person("Репка", "Репку"));
    plot.add(new Person("Дедка", "Дедку"));
    plot.add(new Person("Бабка", "Бабку"));
    plot.add(new Person("Внучка", "Внучку"));
    RepkaStory.tell(plot);
  }


  public class Person implements RepkaItem{
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh) {
      this.name = name;
      this.namePadezh = namePadezh;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }


    public String getNamePadezh() {
      return namePadezh;
    }

    public void setNamePadezh(String namePadezh) {
      this.namePadezh = namePadezh;
    }

    public void pull(Person person) {
      System.out.println(this.name + " за " + person.getNamePadezh());
    }
  }

  public interface RepkaItem {
    public String getNamePadezh();
  }


  public class RepkaStory {
    static void tell(List<Person> items) {
      Person first;
      Person second;
      for (int i = items.size() - 1; i > 0 ; i++) {
        first = items.get(i - 1);
        second = items.get(i);
        second.pull(first);
      }
    }
  }
}
*/
/*
public class Solution {
  public static void main(String[] args) throws Exception {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    String fileName = "Y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data.txt";
    // fileName = bufferedReader.readLine();
    FileInputStream fileInputStream = new FileInputStream(fileName);
    Scanner scanner = new Scanner(fileInputStream);
    ArrayList<Integer> arrayList = new ArrayList<>();
    while (scanner.hasNextInt()) {
      int buf = scanner.nextInt();
      if (buf % 2 == 0) {
        arrayList.add(buf);
      }
    }
    Collections.sort(arrayList);
    for (int i = 0; i < arrayList.size(); i++) {
      System.out.println(arrayList.get(i));
    }
    scanner.close();
    bufferedReader.close();
  }
}
*/

/*
Сортировка четных чисел из файла
В этой задаче тебе нужно:
Ввести имя файла с консоли.
Прочитать из него набор чисел.
Вывести в консоли только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10

Пример вывода:
-2
2
8
10


Requirements:
1. Программа должна считывать данные с консоли.
2. Программа должна создавать FileInputStream для введенной с консоли строки.
3. Программа должна выводить данные на экран.
4. Программа должна вывести на экран все четные числа, считанные из файла, отсортированные по возрастанию.
5. Программа должна закрывать поток чтения из файла — FileInputStream.
 */

/*
public class Solution {
  public static void main(String[] args) throws Exception {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String fileName = bufferedReader.readLine();

    //ArrayList<String> bufferList = new ArrayList();

    StringBuilder stringBuilder = new StringBuilder();

    String buffer = "";
    while (!buffer.equals("exit")) {
      buffer = bufferedReader.readLine();
      stringBuilder.append(buffer).append("\n");
    }

//    System.out.print(stringBuilder);

    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

    bufferedWriter.write(stringBuilder.toString());
    bufferedWriter.close();

//    FileOutputStream fileOutputStream = new FileOutputStream(fileName);
//    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
//    byte [] byteBuffer = stringBuilder.toString().getBytes();
//    bufferedOutputStream.write(byteBuffer,0, byteBuffer.length);
//    bufferedOutputStream.close();
    // напишите тут ваш код
  }
}
*/
/*
исатель в файл с консоли
В этой задаче тебе нужно:
Прочесть с консоли имя файла.
Считывать строки с консоли, пока пользователь не введет строку "exit".
Записать абсолютно все введенные в п.2 строки в файл: каждую строчку — с новой строки.

Requirements:
1. Программа должна считывать c консоли имя файла.
2. Создай и используй объект типа BufferedWriter.
3. Программа не должна ничего считывать из файловой системы.
4. Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
5. Программа должна записать все введенные строки (включая "exit", но не включая имя файла) в файл: каждую строчку — с новой строки.
6. Метод main должен закрывать объект типа BufferedWriter после использования.
7. Метод main не должен выводить данные на экран.
 */

/*

public class Solution {
  public static void main(String[] args) {
    // напишите тут ваш код
  }
}
*/
/*
    Чтение файла
    В этой задаче тебе нужно:
        Считать с консоли путь к файлу.
        Вывести в консоли (на экран) содержимое файла.
        Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.

        Requirements:
        1. Программа должна считывать c консоли путь к файлу.
        2. Программа должна выводить на экран содержимое файла.
        3. Поток чтения из файла (FileInputStream) должен быть закрыт.
        4. BufferedReader также должен быть закрыт.

*/

/*
public class Solution {
  public static void main(String[] args) throws Exception {
    System.out.println(SimpleObject.NAME);
    System.out.println(Button.NAME);
  }

  interface SimpleObject {
    String NAME = "SimpleObject";
  }

  interface Button extends SimpleObject {

    final String NAME = "Submit";

//    public void onPress();

//    protected void onPress();

    void onPress();

  //  private void onPress();

   // protected String onPress(Object o);

 //   String onPress(Object o);

   // private String onPress(Object o);

  }
}
*/
/*
public class Solution {
  public static void main(String[] args) throws Exception {
  }

  public interface Animal {
    public static Color getColor() {return  null}
  }

  public static class Fox implements Animal{
    public String getName() {
      return "Fox";
    }
  }
}
*/


/*
public class Solution {
  public static void main(String[] args) throws Exception {
    System.out.println(Matrix.NEO);
    System.out.println(Matrix.TRINITY);
  }

  static class Matrix {
    public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
    public static DBObject TRINITY = new User().initializeIdAndName(2, "Trinity");
  }

  interface DBObject {
    DBObject initializeIdAndName(long id, String name);
  }

  static class User implements DBObject {
    long id;
    String name;
    @Override
    public User initializeIdAndName(long id, String name) {
      this.id = id;
      this.name = name;
      return this;
    }

    @Override
    public String toString() {
      return String.format("The user's name is %s, id = %d", name, id);
    }
  }

}
*/
/*
Баг в initializeIdAndName
Посмотри на программу и исправь ее, чтобы она компилировалась и работала:
Вынеси реализацию метода initializeIdAndName в класс User.
Сделай так, чтобы initializeIdAndName в классе User возвращал тип User.

Requirements:
1. Интерфейс DBObject должен содержать только объявление метода initializeIdAndName без реализации.
2. Реализуй метод initializeIdAndName в классе User.
3. Метод initializeIdAndName в классе User должен иметь тип возвращаемого значения User.
4. Метод initializeIdAndName должен присваивать значения полям id и name объекта типа User в соответствии с переданными ему параметрами и возвращать этот объект.
 */
/*
public class Solution {
  public static void main(String[] args) throws Exception {
    int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

    Pair<Integer, Integer> result = getMinimumAndIndex(data);

    System.out.println("The minimum is " + result.x);
    System.out.println("The index of the minimum element is " + result.y);
  }

  public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {

    if (array == null || array.length == 0) {
      return new Pair<Integer, Integer>(null, null);
    }
      int min = array[0];
      int pos = 0;
      for (int i = 1; i < array.length-1 ; i++) {
        if (min > array[i]){
          min = array[i];
          pos = i;
        }
      }


    //напишите тут ваш код

    return new Pair<Integer, Integer>(min, pos);
  }

  public static class Pair<X, Y> {
    public X x;
    public Y y;

    public Pair(X x, Y y) {
      this.x = x;
      this.y = y;
    }
  }
}
*/
/*
public class Solution {
  public static void main(String[] args) {
    System.out.println(getObjectType(new Cat()));
    System.out.println(getObjectType(new Tiger()));
    System.out.println(getObjectType(new Lion()));
    System.out.println(getObjectType(new Bull()));
    System.out.println(getObjectType(new Cow()));
    System.out.println(getObjectType(new Animal()));
  }


    //напишите тут ваш код
    public static String getObjectType(Object o) {
      //напишите тут ваш код
      if (o instanceof Tiger)
        return "Тигр";
      if (o instanceof Lion)
        return "Лев";
      if (o instanceof Cat)
        return "Кот";
      if (o instanceof Bull)
        return "Бык";
      if (o instanceof Cow)
        return "Корова";
      if (o instanceof Animal)
        return "Животное";

      return null;
    }


  public static class Cat extends Animal   //<--Классы наследуются!!
  {
  }

  public static class Tiger extends Cat {
  }

  public static class Lion extends Cat {
  }

  public static class Bull extends Animal {
  }

  public static class Cow extends Animal {
  }

  public static class Animal {
  }
}
*/
/*
public class Solution {
  public static void main(String[] args) {
    int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

    Pair result = getMinimumMaximumPair(data);

    System.out.println("The minimum is " + result.x);
    System.out.println("The maximum is " + result.y);
  }

  public static Pair getMinimumMaximumPair(int[] inputArray) {
    if (inputArray == null || inputArray.length == 0) {
      return new Pair(null, null);
    }
     int x = inputArray[0];
     int y = inputArray[0];
    for (int i = 1; i < inputArray.length; i++) {
      if (x > inputArray[i]) x = inputArray[i];
      if (y < inputArray[i]) y = inputArray[i];
    }
    return new Pair(x, y);
  }

  public static class Pair {
    public Integer x;
    public Integer y;

    public Pair(Integer x, Integer y) {
      this.x = x;
      this.y = y;
    }
  }
}
*/
/*
public class Solution {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] array = new int[30];
    for (int i = 0; i < 30; i++) {
  //    array[i] = Integer.parseInt(reader.readLine());
      array[i] = 30-i-1;
    }

    sort(array);

    System.out.println(array[9]);
    System.out.println(array[10]);
  }

  public static void sort(int[] array) {
    boolean isSwap = true;
    while (isSwap) {
      isSwap = false;
      for (int i = 0; i <array.length-1 ; i++) {
        if (array[i] > array[i+1]) {
          int swap = array[i];
          array[i] = array[i+1];
          array[i+1] = swap;
          isSwap = true;
        }

      }

    }



  }
}
*/
/*
public class Solution {
  public static void main(String[] args) throws IOException {
    HashMap<Integer, String> map = new HashMap<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String buf;
    do {
      buf = reader.readLine();
      if (buf.equals("")) continue;
      int id = Integer.parseInt(buf);
      buf = reader.readLine();
      if (buf.equals("")) continue;
      map.put(id, buf);
    } while (buf.equals("") != true);
    for (Map.Entry<Integer, String> pair : map.entrySet()) {
      int id = pair.getKey();
      String name = pair.getValue();
      System.out.println(id + " " + name);
    }
  }
}
*/
/*
public class Solution {
  HashMap<Integer, String> map;
  static Integer index;
  static String name;

  public Solution() {
    this.map = new HashMap<Integer, String>();
    map.put(index, name);
  }

  public static void main(String[] args) throws IOException {
    Solution solution = new Solution();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    for (int i = 0; i < 10; i++) {
 //     int index = Integer.parseInt(reader.readLine());
 //     String name = reader.readLine();
      solution.map.put(i, "aaa"+i);
    }

    for (Map.Entry<Integer, String> pair : solution.map.entrySet()) {
      index = pair.getKey();
      name = pair.getValue();
      System.out.println("Id=" + index + " Name=" + name);
    }
  }
}
*/
/*
public class Solution {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < 20; i++) {
//      int number = Integer.parseInt(reader.readLine());
      list.add(i);
    }

    System.out.println(safeGetElement(list, 5, 1));
    System.out.println(safeGetElement(list, 20, 7));
    System.out.println(safeGetElement(list, -5, 9));
  }

  public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) {
    //напишите тут ваш код
    try {
      return list.get(index);
    } catch (IndexOutOfBoundsException e) {
      return defaultValue;
    }
  }

}
*/
/*
public class Solution {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    ArrayList<String> words = new ArrayList<String>();
//    for (int i = 0; i < 20; i++) {
//      words.add(reader.readLine());
//    }

    words.add("Иванов");
    words.add("Петров");
    words.add("Сидоров");
    words.add("Иванов");
    words.add("Иванов");

    words.add("Сергеев");
    words.add("Абрамов");
    words.add("Петров");
    words.add("Борисов");
    words.add("Владимиров");

    words.add("Григорьев");
    words.add("Дмитриев");
    words.add("Егоров");
    words.add("Сергеев");
    words.add("Зиновьев");

    words.add("Григорьев1");
    words.add("Дмитриев1");
    words.add("Егоров1");
    words.add("Петров");
    words.add("Зиновьев1");

    Map<String, Integer> map = countWords(words);

    for (Map.Entry<String, Integer> pair : map.entrySet()) {
      System.out.println(pair.getKey() + " " + pair.getValue());
    }
  }

  public static Map<String, Integer> countWords(ArrayList<String> list) {
    HashMap<String, Integer> result = new HashMap<String, Integer>();

    for (String str : list) {
    if (result.containsKey(str)) {
      result.replace(str, result.get(str)+1);
    } else result.put(str, 1);
    }
    return result;
  }

}

*/

/*
Одинаковые слова в списке
        Введи с клавиатуры 20 слов в список. Посчитай, сколько раз каждое из них встречается в списке.
        Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр - уникальное слово, а второй - число раз, сколько раз данное слово встречалось в списке.

        Выведи содержимое словаря на экран.
        В тестах регистр (большая/маленькая буква) влияет на результат.


        Requirements:
        1. Метод countWords должен объявлять и инициализировать HashMap с типом элементов <String, Integer>.
        2. Метод countWords должен возвращать созданный словарь.
        3. Метод countWords должен добавлять в словарь ключи, соответствующие уникальным словам, и значения по этим ключам, отображающие, сколько раз встречалось слово.
        4. Программа должна выводить на экран полученный словарь.
        5. Метод main должен вызывать метод countWords.
*/
/*
public class Solution {
  public static void main(String[] args) {
    ArrayList<String>[] arrayOfStringList = createList();
    printList(arrayOfStringList);
  }

  public static ArrayList<String>[] createList() {
    ArrayList<String>[] arrSL = new ArrayList[3];
    for (int i = 0; i < arrSL.length ; i++) {
      arrSL[i] = new ArrayList<>();

    }
    arrSL[0].add("1. Метод createList должен объявлять и инициализировать массив с типом элементов ArrayList<String>.");
    arrSL[0].add("2. Метод createList должен возвращать созданный массив.");
    arrSL[0].add("3. Метод createList должен добавлять в массив элементы (списки строк). Списки должны быть не пустые.");

    arrSL[1].add("1. Метод createList должен объявлять и инициализировать массив с типом элементов ArrayList<String>.");
    arrSL[1].add("2. Метод createList должен возвращать созданный массив.");
    arrSL[1].add("3. Метод createList должен добавлять в массив элементы (списки строк). Списки должны быть не пустые.");

    arrSL[2].add("1. Метод createList должен объявлять и инициализировать массив с типом элементов ArrayList<String>.");
    arrSL[2].add("2. Метод createList должен возвращать созданный массив.");
    arrSL[2].add("3. Метод createList должен добавлять в массив элементы (списки строк). Списки должны быть не пустые.");
    return arrSL;
  }

       //   "1. Метод createList должен объявлять и инициализировать массив с типом элементов ArrayList<String>."
       //   "2. Метод createList должен возвращать созданный массив."
      //    "3. Метод createList должен добавлять в массив элементы (списки строк). Списки должны быть не пустые."


  public static void printList(ArrayList<String>[] arrayOfStringList) {
    for (ArrayList<String> list : arrayOfStringList) {
      for (String string : list) {
        System.out.println(string);
      }
    }
  }
}
*/
/*
public class Solution {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    // Алфавит
    List<Character> alphabet = Arrays.asList(
            'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
            'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
            'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
            'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

    // Ввод строк
    ArrayList<String> list = new ArrayList<String>();
//    for (int i = 0; i < 10; i++) {
//      String line = reader.readLine();
//      list.add(line.toLowerCase());
//    }

    list.add("Введи с клавиатуры 10 строчек и посчитай в них количество различных букв без учета регистра. Результат выведи на экран в алфавитном порядке.".toLowerCase());
    list.add("Введи с клавиатуры 10 строчек и посчитай в них количество различных букв без учета регистра. Результат выведи на экран в алфавитном порядке.".toLowerCase());
    list.add("Введи с клавиатуры 10 строчек и посчитай в них количество различных букв без учета регистра. Результат выведи на экран в алфавитном порядке.".toLowerCase());
    list.add("Введи с клавиатуры 10 строчек и посчитай в них количество различных букв без учета регистра. Результат выведи на экран в алфавитном порядке.".toLowerCase());
    list.add("Введи с клавиатуры 10 строчек и посчитай в них количество различных букв без учета регистра. Результат выведи на экран в алфавитном порядке.".toLowerCase());
    list.add("Введи с клавиатуры 10 строчек и посчитай в них количество различных букв без учета регистра. Результат выведи на экран в алфавитном порядке.".toLowerCase());
    list.add("Введи с клавиатуры 10 строчек и посчитай в них количество различных букв без учета регистра. Результат выведи на экран в алфавитном порядке.".toLowerCase());
    list.add("Введи с клавиатуры 10 строчек и посчитай в них количество различных букв без учета регистра. Результат выведи на экран в алфавитном порядке.".toLowerCase());
    list.add("Введи с клавиатуры 10 строчек и посчитай в них количество различных букв без учета регистра. Результат выведи на экран в алфавитном порядке.".toLowerCase());
    list.add("Введи с клавиатуры 10 строчек и посчитай в них количество различных букв без учета регистра. Результат выведи на экран в алфавитном порядке.".toLowerCase());

    int[] res = new int[33];
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
      for (int j = 0; j < list.get(i).length(); j++) {
        for (int k = 0; k < alphabet.size(); k++) {
          if (list.get(i).toCharArray()[j] == alphabet.get(k)) res[k]++;
        }
      }
    }
    for (int i = 0; i < alphabet.size(); i++) {
      System.out.println(alphabet.get(i) + " "+  res[i]);
    }



    // напишите тут ваш код
  }
}
*/
/*

Количество букв
Введи с клавиатуры 10 строчек и посчитай в них количество различных букв без учета регистра. Результат выведи на экран в алфавитном порядке.

Пример вывода:
а 5
б 8
в 3
г 7
д 0
...
я 9


Requirements:
1. Программа должна 10 раз считывать данные с клавиатуры.
2. Программа должна выводить текст на экран.
3. Выведенный текст должен содержать 33 строки.
4. Каждая строка вывода должна содержать букву русского алфавита, пробел и количество раз, которое буква встречалась в введенных строках.
 */

/*
public class Solution {
  public static void main(String[] args) {
    String text = "Я не хочу изучать Java, я хочу большую зарплату";
    for (int i = 0; i < 40; i++) System.out.println(text.substring(i));


    //напишите тут ваш код
  }

}

*/

/*
public class Solution {

    public static void main(String[] args) {
      int a = 257;
      int b = 4;
      int c = 3;
      int e = 2;
      double d = (byte) a + b / c / e;

      System.out.println(d);
    }

}
*/

/*
public class Solution {
  public static void main(String[] args) {
    long l = 1234_564_890L;
    int x = 0b1000_1100_1010;
    double m = (byte) 110_987_654_6299.123_34;
    float f =  l++ + 10 + ++x - (float) m;
    l = (long) f / 1000;
    System.out.println(l);
  }
}
*/
/*
public class Solution {
  public static void main(String[] args) {
    double d = (short) 2.50256e2d;
    char c = (short) 'd';
    short s = (short) 2.22;
    int i = 150000;
    float f =  0.50f;
    double result = f + (i / c) - (d * s)  - 500e-3;
    System.out.println("d- "+ d);
    System.out.println("c- "+ c);
    System.out.println("s- "+ s);
    System.out.println("i- "+ i);
    System.out.println("f- "+ f);
    System.out.println("result: " + result);
  }
}
*/
/*
public class Solution {
  public static void main(String[] args) {
    int a = (byte) 44;
    int b = (byte) 300;
    short c = (short) (b - a);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}
*/
/*
public class Solution {
  public static void main(String[] args) {
    short number = 9;
    char zero =  '0';
    int nine = ((int) zero + number);
    System.out.println(zero);
    System.out.println(number);
    System.out.println((char)nine);
  }
}
*/
/*
public class Solution {
  public static void main(String[] args) {
    float f = (float) 128.50;
    int i = (byte) f;
    int b = (int) (i + f);
    System.out.println(b);
  }
}
*/
/*
public class Solution {
  public static void main(String[] args) {
    int a = 15;
    int b = 4;
    float c = (float) a / b;
    double d = a * 1e-3 + c;

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
  }
}
*/
/*

public class Solution {
  public static void main(String[] args) {
    int a = 0;
    int b = (byte) a + 46;
    byte c = (byte) (a * b);
    double f = (char) 1234.15;
    long d = (int) (a + f / c + b);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(f);
  }
}
*/

/*
public class Solution {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<String> list = new ArrayList<>();
//    String line = reader.readLine();
//    while (!line.isEmpty()) {
//      list.add(line);
//      line = reader.readLine();
//    }
    list.add("Вишня");
    list.add("1");
    list.add("Боб");
    list.add("3");
    list.add("Яблоко");
    list.add("22");
    list.add("0");
    list.add("Арбуз");


    String[] array = list.toArray(new String[0]);
    sort(array);

    for (String x : array) {
      System.out.println(x);
    }
  }

  public static void sort(String[] array) {
    boolean isSwap = true;
    while (isSwap) {
      isSwap = false;
      for (int i = 0; i < array.length-1; i++) {
        if (isNumber(array[i])) {
          for (int j = i + 1; j < array.length; j++) {
            if (isNumber(array[j]) && (Integer.parseInt(array[i]) < Integer.parseInt(array[j])))
            {
              isSwap = true;
              String swap = array[i];
              array[i] = array[j];
              array[j] = swap;
             }
          }
        } else {
          for (int j = i + 1; j < array.length; j++) {
            if (!isNumber(array[j]) && isGreaterThan(array[i], array[j])) {
              isSwap = true;
              String swap = array[i];
              array[i] = array[j];
              array[j] = swap;
            }
          }
        }
      }
    }
  }

  // Метод для сравнения строк: 'а' больше чем 'b'
  public static boolean isGreaterThan(String a, String b) {
    return a.compareTo(b) > 0;
  }


  // Переданная строка - это число?
  public static boolean isNumber(String text) {
    if (text.length() == 0) {
      return false;
    }

    char[] chars = text.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      char character = chars[i];

      // есть '-' внутри строки
      if (i != 0 && character == '-') {
        return false;
      }

      // не цифра и не начинается с '-'
      if (!Character.isDigit(character) && character != '-') {
        return false;
      }

      // одиночный '-'
      if (chars.length == 1 && character == '-') {
        return false;
      }
    }
    return true;
  }
}
*/
/*

Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция
Задача: Пользователь вводит с клавиатуры список слов (и чисел).
Слова вывести в возрастающем порядке, числа - в убывающем.

Пример ввода:
Вишня
1
Боб
3
Яблоко
22
0
Арбуз

Пример вывода:
Арбуз
22
Боб
3
Вишня
1
0
Яблоко


Requirements:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить данные на экран.
3. Выведенные слова должны быть упорядочены по возрастанию (используй готовый метод isGreaterThan).
4. Выведенные числа должны быть упорядочены по убыванию.
5. Метод main должен использовать метод sort.
6. Метод sort должен использовать метод isGreaterThan.
7. Метод sort должен использовать метод isNumber.
 */



/*
public class Solution {
  public static void main(String[] args) {
    Map<String, Cat> map = createMap();
    Set<Cat> set = convertMapToSet(map);
    printCatSet(set);
  }

  public static Map<String, Cat> createMap() {
    Map<String, Cat> cats = new HashMap<>();
    cats.put("Васька1", new Cat("Васька1"));
    cats.put("Васька2", new Cat("Васька2"));
    cats.put("Васька3", new Cat("Васька3"));
    cats.put("Васька4", new Cat("Васька4"));
    cats.put("Васька5", new Cat("Васька5"));
    cats.put("Васька6", new Cat("Васька6"));
    cats.put("Васька7", new Cat("Васька7"));
    cats.put("Васька8", new Cat("Васька8"));
    cats.put("Васька9", new Cat("Васька9"));
    cats.put("Васька10", new Cat("Васька10"));
    return cats;

  }

  public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
    //напишите тут ваш код
    Set<Cat> myset = new HashSet<>(map.values());

    return myset;
  }

  public static void printCatSet(Set<Cat> set) {
    for (Cat cat : set) {
      System.out.println(cat);
    }
  }

  public static class Cat {
    private String name;

    public Cat(String name) {
      this.name = name;
    }

    public String toString() {
      return "Cat " + this.name;
    }
  }


}
*/

/*
Десять котов
Есть класс кот - Cat, с полем "имя" (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
Получить из Map множество(Set) всех котов и вывести его на экран.


Requirements:
1. Программа не должна считывать данные с клавиатуры.
2. Метод createMap должен создавать новый объект HashMap<String, Cat>.
3. Метод createMap должен добавлять в словарь 10 котов в виде «Имя»-«Кот».
4. Метод createMap должен возвращать созданный словарь.
5. Метод convertMapToSet должен создать и вернуть множество котов, полученных из переданного словаря.
6. Программа должна вывести всех котов из множества на экран.
 */

/*
public class Solution {
  public static void main(String[] args) {
    ArrayList<int[]> list = createList();
    printList(list);
  }

  public static ArrayList<int[]> createList() {
    //напишите тут ваш код
    ArrayList<int[]> arr = new ArrayList<>();
    arr.add(new int[5]);
    arr.add(new int[2]);
    arr.add(new int[4]);
    arr.add(new int[7]);
    arr.add(new int[0]);
    for (int i = 0; i < arr.size(); i++) {
      for (int j = 0; j < arr.get(i).length; j++) {
        arr.get(i)[j] = i+j;
      }
    }
    return arr;
  }

  public static void printList(ArrayList<int[]> list) {
    for (int[] array : list) {
      for (int x : array) {
//        System.out.println(x);
        System.out.print(x);
     }
      System.out.println();
    }
  }
}
*/
/*

Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов-массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.


Requirements:
1. Программа не должна считывать данные с клавиатуры.
2. Метод createList должен объявлять и инициализировать переменную типа ArrayList<int[]>.
3. Метод createList должен возвращать созданный список.
4. Метод createList должен добавлять в список 5 элементов.
5. Каждый элемент в списке должен быть массивом чисел. Длина первого должна быть 5 элементов, второго - 2, следующих - 4, 7, 0 соответственно.
6. Программа должна выводить на экран элементы всех массивов из списка. Каждый элемент с новой строки.
 */


/*
public class Solution {
  public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

  public static void main(String[] args) throws Exception {
    String buffer = "Мама мыла раму.";
    String type1 = "";
    String type2 = "";


    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      buffer = reader.readLine();
    } catch (Exception e) {};



    for (char element: buffer.toCharArray()
    ) if (element != ' ')
      if (isVowel(element))
          type1 = type1 + element + ' ';
          else type2 = type2 + element + ' ';
      

    System.out.println(type1);
    System.out.println(type2);
    //напишите тут ваш код
  }

  // метод проверяет, гласная ли буква
  public static boolean isVowel(char character) {
    character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
    for (char vowel : vowels) {  // ищем среди массива гласных
      if (character == vowel) {
        return true;
      }
    }
    return false;
  }
}
*/

/*
public class Solution {

  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String input = "";

    try {
      input = reader.readLine();
    } catch (Exception e) {};

    Locale locale = new Locale("en");
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", locale);
    Date currentDate = sdf.parse(input);

    SimpleDateFormat outputFormat = new SimpleDateFormat("MMM dd, yyyy", locale);
    System.out.println(outputFormat.format(currentDate).toUpperCase());
    //напишите тут ваш код
  }
}
*/
/*
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
*/

/*
public class Solution {
  public static void main(String[] args) {
    readData();
  }

  public static void readData() {
    ArrayList<Integer> list = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      while (true) {
        list.add(Integer.parseInt(reader.readLine()));
      }
    } catch (Exception e) {
      for (Integer element : list) {
        System.out.println(element);
      }
      }
    }
    //напишите тут ваш код
}

*/
/*
public class Solution {
  public static void main(String[] args) {
    for (int i = 10; i >= 0; i--) {
      System.out.println(i);
      try {
        Thread.sleep(100);
      } catch (InterruptedException e)
      {}

      //напишите тут ваш код
    }
  }
}

*/
/*
public class Solution {

  public static void main(String[] args) {

    try {
    divideByZero();
    } catch (ArithmeticException e) {
      e.printStackTrace();
      }


  }

  public static void divideByZero(){
      int i = 100 / 0;
    System.out.println(i);
  }
}
*/
/*
  Деление на ноль
        Создай метод public static void divideByZero, в котором подели любое число на ноль и выведи на экран результат деления.
        Оберни вызов метода divideByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()


        Requirements:
        1. В классе должен быть метод public static void divideByZero().
        2. Метод divideByZero должен содержать операцию деления любого целого числа на ноль.
        3. Метод divideByZero должен вызывать System.out.println или System.out.print.
        4. Метод main должен содержать блок try..catch.
        5. Метод main должен отлавливать любые исключения метода divideByZero.
        6. Программа должна выводить стек-трейс пойманого исключения.
*/
/*
public class Solution {
  public static void main(String[] args) {
  }

  static class MyException extends Exeption {
  }

  static class MyException2 extends Exeption {
  }

  static class MyException3 extends Exeption {
  }

  static class MyException4 extends Exeption {
  }
}
*/

/*
public class Solution {
  public static void main(String[] args) {
    handleExceptions(new Solution());
  }

  public static void handleExceptions(Solution obj) {

    try {
      obj.method1();
      obj.method2();
      obj.method3();
    } catch (NullPointerException | IndexOutOfBoundsException| NumberFormatException e) {
      printStack(e);

    }
  }

  public static void printStack(Throwable throwable) {
    System.out.println(throwable);
    for (StackTraceElement element : throwable.getStackTrace()) {
      System.out.println(element);
    }
  }

  public void method1() {
    throw new NullPointerException();
  }

  public void method2() {
    throw new IndexOutOfBoundsException();
  }

  public void method3() {
    throw new NumberFormatException();
  }
}

*/
/*
public class Solution {
  public static void main(String[] args) {
    handleExceptions(new Solution());

  }

  public static void handleExceptions(Solution obj) {

    try {
      obj.method1();
      obj.method2();
      obj.method3();
    } catch (IOException e) {
      System.out.println(e);
    } catch (NoSuchFieldException e) {
      System.out.println(e);
    }
  }

  public void method1() throws IOException {
    throw new IOException();
  }

  public void method2() throws NoSuchFieldException {
    throw new NoSuchFieldException();
  }

  public void method3() throws RemoteException {
    throw new RemoteException();
  }
}
*/
/*

public class Solution {
  public static StatelessBean BEAN = new StatelessBean();

  public static void main(String[] args) throws CharConversionException, FileSystemException, IOException{
    try {
      handleExceptions();
    } catch (FileSystemException e) {
      BEAN.log(e);
    }

  }

  public static void handleExceptions() throws CharConversionException, FileSystemException, IOException{
    try {
      BEAN.methodThrowExceptions();
    } catch (FileSystemException e) {
      BEAN.log(e);
      throw e;
    } catch (CharConversionException e) {
      BEAN.log(e);
    } catch (IOException e) {
      BEAN.log(e);
    }
  }

  public static class StatelessBean {
    public void log(Exception exception) {
      System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
    }

    public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
      int i = (int) (Math.random() * 3);
      if (i == 0) {
        throw new CharConversionException();
      } else if (i == 1) {
        throw new FileSystemException("");
      } else if (i == 2) {
        throw new IOException();
      }
    }
  }
}
*/
/*

public class Solution {
  public static void main(String[] args) throws Exception {
    //напишите тут ваш код
try {
  method1();
} catch (NullPointerException e) {
  System.out.println(e);
} catch (FileNotFoundException e) {
    System.out.println(e);
}
    //напишите тут ваш код
  }

  public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
    int i = (int) (Math.random() * 4);
    if (i == 0) {
      throw new NullPointerException();
    } else if (i == 1) {
      throw new ArithmeticException();
    } else if (i == 2) {
      throw new FileNotFoundException();
    } else if (i == 3) {
      throw new URISyntaxException("", "");
    }
  }
}
*/
/*
public class Solution {
  public static void main(String[] args) {
    //напишите тут ваш код
    try {
    int num = Integer.parseInt("XYZ");
    System.out.println(num);
    } catch (NumberFormatException e) {
      System.out.println(e);
    }
    //напишите тут ваш код
  }
}
*/

/*
public class Solution {
  public static void main(String[] args) {
    //напишите тут ваш код
    try {
      HashMap<String, String> map = new HashMap<String, String>(null);
      map.put(null, null);
      map.remove(null);
    } catch (NullPointerException e) {
      System.out.println(e);
    }
    //напишите тут ваш код
  }
}
*/
// NullPointerException

/*
public class Solution {
  public static void main(String[] args) {
    //напишите тут ваш код
try {
  ArrayList<String> list = new ArrayList<String>();
  String s = list.get(18);
} catch (IndexOutOfBoundsException e) {
  System.out.println(e);
}
    //напишите тут ваш код
  }
}
*/
/*
  Исключение при работе с коллекциями List
  Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
        ArrayList<String> list = new ArrayList<String>();
        String s = list.get(18);


        Requirements:
        1. Программа должна выводить сообщение на экран.
        2. В программе должен быть блок try-catch.
        3. Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
        4. Выведенное сообщение должно содержать тип возникшего исключения.
        5. Имеющийся код в методе main не удалять.
*/
/*
public class Solution {
  public static void main(String[] args) {
    //напишите тут ваш код
try {
  int[] m = new int[2];
  m[8] = 5;
} catch (ArrayIndexOutOfBoundsException e)
{
  System.out.println(e);
}
    //напишите тут ваш код
  }
}

*/
/*

Исключение при работе с массивами
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int[] m = new int[2];
m[8] = 5;


Requirements:
1. Программа должна выводить сообщение на экран.
2. В программе должен быть блок try-catch.
3. Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
4. Выведенное сообщение должно содержать тип возникшего исключения.
5. Имеющийся код в методе main не удалять.
 */



/*
public class Solution {
  public static void main(String[] args) {
    //напишите тут ваш код
try {
  String s = null;
  String m = s.toLowerCase();

} catch (NullPointerException e) {
  System.out.println(e);
}

    //напишите тут ваш код
  }
}

*/



/*
Исключение при работе со строками
        Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
        String s = null;
        String m = s.toLowerCase();


        Requirements:
        1. Программа должна выводить сообщение на экран.
        2. В программе должен быть блок try-catch.
        3. Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
        4. Выведенное сообщение должно содержать тип возникшего исключения.
        5. Имеющийся код в методе main не удалять.
*/


/*
public class Solution {
  public static void main(String[] args) {
    //напишите тут ваш код
try {
  int a = 42 / 0;
}
catch (ArithmeticException e) {
  System.out.println(e);
}

    //напишите тут ваш код
  }
}
*/

/*


Исключение при работе с числами Ӏ Java Syntax: 9 уровень, 6 лекция
Перехватить исключение, возникающее при выполнении кода:
int a = 42 / 0;
Вывести на экран тип перехваченного исключения.


Requirements:
1. Программа должна выводить сообщение на экран.
2. В программе должен быть блок try-catch.
3. Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
4. Выведенное сообщение должно содержать тип возникшего исключения.
5. Имеющийся код в методе main не удалять.
 */



/*
public class Solution {
  public static void main(String[] args) {
    log("In main method");
  }

  public static void log(String text) {
    System.out.println("" + Thread.currentThread().getStackTrace()[2].getClassName()+": "
            + Thread.currentThread().getStackTrace()[2].getMethodName() + ": "+ text);
  }
}

*/

/*
Логирование стек-трейса
        Реализовать метод log.
        Он должен выводить на экран имя класса и имя метода (в котором вызывается метод log), а также переданное сообщение.
        Имя класса, имя метода и сообщение разделить двоеточием с пробелом.

        Пример вывода:
        com.javarush.task.task09.task0906.Solution: main: In main method


        Requirements:
        1. Метод log должен выводить сообщение на экран.
        2. Выведенное сообщение должно содержать имя класса, метод которого вызвал метод log.
        3. Выведенное сообщение должно содержать имя метода, который вызвал метод log.
        4. Выведенное сообщение должно содержать переданное сообщение.
        5. Вывод должен соответствовать примеру из задания.
*/
/*

Кто меня вызывал?
Написать пять методов, которые вызывают друг друга.
Метод должен вернуть номер строки кода, из которого вызвали этот метод.
Воспользуйся функцией: element.getLineNumber().


Requirements:
1. В классе должно быть 5 методов (метод main не учитывать).
2. Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
3. Каждый метод должен возвращать номер строки кода, из которого вызвали этот метод.
4. Для получения номера строки, используй метод getLineNumber класса StackTraceElement.
 */

/*
public class Solution {
  public static void main(String[] args) {
    System.out.println(method1());
  }

  public static String method1() {
    System.out.println(method2());
    return Thread.currentThread().getStackTrace()[1].getMethodName();
  }

  public static String method2() {
    System.out.println("method2 " + method3());
    return Thread.currentThread().getStackTrace()[1].getMethodName();
  }

  public static String method3() {
    System.out.println(method4());
    return Thread.currentThread().getStackTrace()[1].getMethodName();
  }

  public static String method4() {
    System.out.println(method5());
    return Thread.currentThread().getStackTrace()[1].getMethodName();
  }

  public static String method5() {
    return Thread.currentThread().getStackTrace()[1].getMethodName();
  }

}
*/
/*
И снова StackTrace
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.


Requirements:
1. В классе должно быть 5 методов (метод main не учитывать).
2. Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
3. Каждый метод должен возвращать имя метода, вызвавшего его.
4. Для получения имени вызвавшего метода, используй метод getMethodName.
 */

/*

public class Solution {
  public static void main(String[] args) {
    method1();
  }

  public static StackTraceElement[] method1() {
    method2();

    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    System.out.println(stackTraceElements[1].getMethodName());
    return stackTraceElements;
  }

  public static StackTraceElement[] method2() {
    method3();
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    System.out.println(stackTraceElements[1].getMethodName());
    return stackTraceElements;
  }

  public static StackTraceElement[] method3() {
    method4();
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    System.out.println(stackTraceElements[1].getMethodName());
    return stackTraceElements;
  }

  public static StackTraceElement[] method4() {
    method5();
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    System.out.println(stackTraceElements[1].getMethodName());
    return stackTraceElements;
  }

  public static StackTraceElement[] method5() {
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    System.out.println(stackTraceElements[1].getMethodName());
    return stackTraceElements;
  }
}

*/
/*

Возвращаем StackTrace
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать свой StackTrace.


Requirements:
1. В классе должно быть 5 методов (метод main не учитывать).
2. Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
3. Каждый метод должен возвращать свой StackTrace.
4. Для получения StackTrace воспользуйся Thread.currentThread().getStackTrace().
 */


/*
public class Solution {
  // static Function<String, Integer> stringLength = String::length +10 ;
  static Function<String, Integer> stringLength = t -> t.length() ;

    public static void main(String[] args) throws Exception {
    Integer length = stringLength.apply("Hello, World!");
    System.out.println(length);  // 13

    }
}

*/
/*
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

*/
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