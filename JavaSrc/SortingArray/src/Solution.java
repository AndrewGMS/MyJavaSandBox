import javax.imageio.stream.FileImageOutputStream;
import java.awt.geom.RoundRectangle2D;
import java.awt.print.Book;
import java.io.*;
import java.math.BigDecimal;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystemException;
import java.rmi.RemoteException;
import java.sql.Array;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.lang.StackTraceElement;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.UnaryOperator;


public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultPrintStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream =  new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        System.setOut(defaultPrintStream);
        String s1 = byteArrayOutputStream.toString().replaceAll("[^\\d+*-]","");
        String[] s2 = s1.split("[+*-]");

        if (s1.indexOf("-") >= 0) s1 = s2[0] + " - " + s2[1] + " = " + (Integer.parseInt(s2[0]) - Integer.parseInt(s2[1]));
        if (s1.indexOf("+") >= 0) s1 = s2[0] + " + " + s2[1] + " = " + (Integer.parseInt(s2[0]) + Integer.parseInt(s2[1]));
        if (s1.indexOf("*") >= 0) s1 = s2[0] + " * " + s2[1] + " = " + (Integer.parseInt(s2[0]) * Integer.parseInt(s2[1]));
        System.out.println(s1);
//        System.out.println(byteArrayOutputStream.toString().replaceAll("[^\\d+*-]",""));
//        System.out.println(byteArrayOutputStream.toString().replaceAll("\\D",""));
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}


/*
Решаем пример
В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна выводить на консоль решенный пример.
Вызови готовый метод printSomething(), воспользуйся testString.
Верни переменной System.out первоначальный поток.

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9


Requirements:
1. Класс Solution должен содержать класс TestString.
2. Класс Solution должен содержать публичное статическое поле testString типа TestString, которое сразу проинициализировано.
3. Класс TestString должен содержать публичный void метод printSomething().
4. Метод printSomething() класса TestString должен выводить на экран строку "3 + 6 = ".
5. Метод main(String[] args) класса Solution должен создавать поток PrintStream (используй PrintStream c параметром конструктора ByteArrayOutputStream).
6. Метод main(String[] args) класса Solution должен подменять и восстанавливать поток вывода в консоль объекта System.out.
7. Метод main(String[] args) класса Solution должен вызывать метод printSomething(),объекта testString.
8. Метод main(String[] args) класса Solution должен модифицировать строку выведенную методом printSomething() согласно заданию, и выводить её в консоль.
 */

/*
public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultPrintStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream =  new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        System.setOut(defaultPrintStream);
        System.out.println(byteArrayOutputStream.toString().replaceAll("[^\\d+]",""));
        System.out.println(byteArrayOutputStream.toString().replaceAll("\\D",""));

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
*/
/*
ыводим только цифры
В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна выводить только цифры.
Вызови готовый метод printSomething(), воспользуйся testString.
Верни переменной System.out первоначальный поток.
Выведи модифицированную строку в консоль.

Пример вывода:
12345678


Requirements:
1. Класс Solution должен содержать класс TestString.
2. Класс Solution должен содержать публичное статическое поле testString типа TestString, которое сразу проинициализировано.
3. Класс TestString должен содержать публичный void метод printSomething().
4. Метод printSomething() класса TestString должен выводить на экран строку "it's 1 a 23 text 4 f5-6or7 tes8ting".
5. Метод main(String[] args) класса Solution должен создавать поток PrintStream (используй PrintStream c параметром конструктора ByteArrayOutputStream).
6. Метод main(String[] args) класса Solution должен подменять и восстанавливать поток вывода в консоль объекта System.out.
7. Метод main(String[] args) класса Solution должен вызывать метод printSomething(),объекта testString.
8. Метод main(String[] args) класса Solution должен модифицировать строку выведенную методом printSomething() согласно заданию, и выводить её в консоль.
 */

/*
public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultPrintStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream =  new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        System.setOut(defaultPrintStream);
        System.out.println(byteArrayOutputStream.toString().replaceAll("te","??"));

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
*/

/*
Ридер обертка 2
В методе main подмените объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна заменять все подстроки "te" на "??".
Вызови готовый метод printSomething(), воспользуйся testString.
Верни переменной System.out первоначальный поток.
Выведи модифицированную строку в консоль.


Requirements:
1. Класс Solution должен содержать класс TestString.
2. Класс Solution должен содержать публичное статическое поле testString типа TestString, которое сразу проинициализировано.
3. Класс TestString должен содержать публичный void метод printSomething().
4. Метод printSomething() класса TestString должен выводить на экран строку "it's a text for testing".
5. Метод main(String[] args) класса Solution должен создавать поток PrintStream (используй PrintStream c параметром конструктора ByteArrayOutputStream).
6. Метод main(String[] args) класса Solution должен подменять и восстанавливать поток вывода в консоль объекта System.out
7. Метод main(String[] args) класса Solution должен вызывать метод printSomething(),объекта testString.
8. Метод main(String[] args) класса Solution должен модифицировать строку выведенную методом printSomething() согласно заданию, и выводить её в консоль.
 */

/*
public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultPrintStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream =  new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();

        System.setOut(defaultPrintStream);
        System.out.println(byteArrayOutputStream.toString().toUpperCase());

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
*/
/*
Ридер обертка
В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна преобразовывать весь текст в заглавные буквы.
Вызови готовый метод printSomething(), воспользуйся testString.
Верни переменной System.out первоначальный поток.
Выведи модифицированную строку в консоль.


Requirements:
+ 1. Класс Solution должен содержать класс TestString.
+ 2. Класс Solution должен содержать публичное статическое поле testString типа TestString, которое сразу проинициализировано.
+ 3. Класс TestString должен содержать публичный void метод printSomething().
+ 4. Метод printSomething() класса TestString должен выводить на экран строку "it's a text for testing".
5. Метод main(String[] args) класса Solution должен создавать поток PrintStream (используй PrintStream c конструктором принимающим ByteArrayOutputStream).
6. Метод main(String[] args) класса Solution должен подменять и восстанавливать поток вывода в консоль объекта System.out.
7. Метод main(String[] args) класса Solution должен вызывать метод printSomething(),объекта testString.
8. Метод main(String[] args) класса Solution должен модифицировать строку выведенную методом printSomething() согласно заданию, и выводить её в консоль.
 */

/*
public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            String fileName1 = bufferedReader.readLine();
//            String fileName2 = bufferedReader.readLine();
        String fileName1 = "y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data7.txt";
        String fileName2 = "y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data14.txt";
        bufferedReader.close();

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(fileName2));
        while (bufferedReader1.ready()) {
            String bufferString = bufferedReader1.readLine();
//            String replacedString = bufferString.replaceAll("\\p{P}", " ").replaceAll("\\s", " ");
            String replacedString = bufferString.replaceAll("\\p{P}", "");
//            String replacedString = bufferString.replaceAll("\\.", "!");
            bufferedWriter2.write(replacedString);
//            System.out.println(bufferString);
//            System.out.println(replacedString);
        }
        bufferedReader1.close();
        bufferedWriter2.close();
    }
}

*/
/*
Пунктуация
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Считать содержимое первого файла, удалить все знаки пунктуации, включая символы новой строки.

Результат вывести во второй файл.

Закрыть потоки.


Requirements:
1. Программа должна считывать имена файлов с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое первого файла (используй BufferedReader c конструктором FileReader).
4. Поток чтения из файла (BufferedReader) должен быть закрыт.
5. Программа должна записывать во второй файл содержимое первого файла, где удалены все знаки пунктуации, включая символы новой строки (Для записи в файл используй BufferedWriter с конструктором FileWriter).
6. Поток записи в файл (BufferedWriter) должен быть закрыт.
 */

/*
public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            String fileName1 = bufferedReader.readLine();
//            String fileName2 = bufferedReader.readLine();
        String fileName1 = "y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data7.txt";
        String fileName2 = "y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data13.txt";
        bufferedReader.close();

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(fileName2));
        while (bufferedReader1.ready()) {
            String bufferString = bufferedReader1.readLine();
            String replacedString = bufferString.replaceAll("\\.", "!");
            bufferedWriter2.write(replacedString + "\n");
//            System.out.println(bufferString);
//            System.out.println(replacedString);
        }
        bufferedReader1.close();
        bufferedWriter2.close();
    }
}
*/

/*
Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Считать содержимое первого файла и заменить все точки "." на знак "!".
Результат вывести во второй файл.
Закрыть потоки.


Requirements:
+ 1. Программа должна считывать имена файлов с консоли (используй BufferedReader).
+ 2. BufferedReader для считывания данных с консоли должен быть закрыт.
+ 3. Программа должна считывать содержимое первого файла (используй BufferedReader c конструктором FileReader).
+ 4. Поток чтения из файла (BufferedReader) должен быть закрыт.
+5. Программа должна записывать во второй файл содержимое первого файла, где заменены все точки "." на знак "!" (Для записи в файл используй BufferedWriter с конструктором FileWriter).
+6. Поток записи в файл (BufferedWriter) должен быть закрыт.
 */

/*
public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            String fileName1 = bufferedReader.readLine();
//            String fileName2 = bufferedReader.readLine();
        String fileName1 = "y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data11.txt";
        String fileName2 = "y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data12.txt";
        bufferedReader.close();

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(fileName2));

        String[] buffer1 = bufferedReader1.readLine().split(" ");
        String buffer2 = "";
        for (String s: buffer1) {
         try {
             Integer.parseInt(s);
             buffer2 = buffer2 + s + " ";
         } catch (NumberFormatException e) {
         }
        }
        bufferedWriter2.write(buffer2);
        bufferedReader1.close();
        bufferedWriter2.close();
  }
}

*/

/*
Выделяем числа
Считать с консоли 2 пути к файлам.
Вывести во второй файл все целые числа, которые есть в первом файле (54у не является числом).
Числа выводить через пробел.
Закрыть потоки.

Пример тела файла:
12 text var2 14 8ю 1

Результат:
12 14 1


Requirements:
1. Программа должна считывать пути к файлам с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое первого файла (используй BufferedReader c конструктором принимающим FileReader).
4. Поток чтения из файла (BufferedReader) должен быть закрыт.
5. Программа должна записывать во второй файл все числа, через пробел, из первого файла (используй BufferedWriter с конструктором FileWriter).
6. Поток записи в файл (BufferedWriter) должен быть закрыт.

 */


/*
public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            String fileName1 = bufferedReader.readLine();
        String fileName1 = "y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data10.txt";

        bufferedReader.close();
// Read
        int countWord = 0;
        String findWord = "Read";
        bufferedReader = new BufferedReader(new FileReader(fileName1));
        while (bufferedReader.ready()) {
            String bufferString = bufferedReader.readLine();
         //   String[] buffer = bufferString.split(findWord);
            String replacedString = bufferString.replaceAll("\\p{P}", " ").replaceAll("\\s", " ");
            System.out.println(bufferString);
            System.out.println(replacedString);

            for (String x : replacedString.split(" ")) {
                if (x.equals("Read")) {
                    countWord++;
                }
            }
//            System.out.println(buffer.length);
        }
        bufferedReader.close();
        System.out.println(countWord);
    }
}

*/
/*
Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки.


Requirements:
+ 1. Программа должна считывать имя файла с консоли (используй BufferedReader).
+ 2. BufferedReader для считывания данных с консоли должен быть закрыт.
+ 3. Программа должна считывать содержимое файла (используй FileReader c конструктором принимающим String).
+ 4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна выводить в консоль количество слов "world", которые встречаются в файле.
 */


/*
    public class Solution {
        public static void main(String[] args) throws IOException{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            String fileName1 = bufferedReader.readLine();
//            String fileName2 = bufferedReader.readLine();
        String fileName1 = "y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data7.txt";
        String fileName2 = "y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data9.txt";
            bufferedReader.close();

            try {
                FileReader fileReader = new FileReader(fileName1);
                FileWriter fileWriter = new FileWriter(fileName2);
                while (fileReader.ready()) {
                    fileReader.read();
                    int buffer = fileReader.read();
                    fileWriter.write(buffer);
                }
                fileWriter.close();
                fileReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

*/
/*
Четные символы
+ Считать с консоли 2 имени файла.
Вывести во второй файл все символы с четным порядковым номером (нумерация начинается с 1).

Пример первого файла:
text in file
Вывод во втором файле:
eti ie
Закрыть потоки ввода-вывод


Requirements:
+ 1. Программа должна считывать имена файлов с консоли (используй BufferedReader).
+ 2. BufferedReader для считывания данных с консоли должен быть закрыт.
+ 3. Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна записывать во второй файл все символы из первого файла с четным порядковым номером (используй FileWriter).
6. Поток записи в файл (FileWriter) должен быть закрыт.
 */

/*
public class Solution{
    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }



    public static void main(String[] args) {
        DataAdapter dataAdapter = new DataAdapter(
                new Customer() {
                    private String companyName = "JavaRush Ltd.";
                    @Override
                    public String getCompanyName() {
                        return companyName;
                    }
                    private String countryName = "Ukraine";
                    @Override
                    public String getCountryName() {
                        return countryName;
                    }
                },
                new Contact() {
                    private String name = "Ivanov, Ivan";
                    @Override
                    public String getName() {
                        return name;
                    }
                    private String phoneNumber = "+38(050)123-45-67";
                    @Override
                    public String getPhoneNumber() {
                        return phoneNumber;
                    }
                }
        );
        System.out.println(dataAdapter.getCountryCode());
        System.out.println(dataAdapter.getCompany());
        System.out.println(dataAdapter.getContactFirstName());
        System.out.println(dataAdapter.getContactLastName());
        System.out.println(dataAdapter.getDialString());



    }

    public static class DataAdapter implements RowItem {
        private Customer customer;
        private Contact contact;


        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {

            for (Map.Entry<String, String> entry: countries.entrySet()) {
              if (entry.getValue().equals(customer.getCountryName())) {
                  return entry.getKey();
              }
            }
            return null;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            return contact.getName().split(", ")[1];
        }

        @Override
        public String getContactLastName() {
            return contact.getName().split(", ")[0];
        }

        @Override
        public String getDialString() {
//            return "callto://+" + String.format("\d+", contact.getPhoneNumber();
            return "callto://+" + contact.getPhoneNumber().replaceAll("\\D", "");
        }
    }

    public static interface RowItem {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        String getDialString();         //For example: callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}
*/
/*
    Закрепляем адаптер
    Адаптировать Customer и Contact к RowItem.
        Классом-адаптером является DataAdapter.

        нициализируй countries перед началом выполнения программы. Соответствие кода страны и названия:
        UA Ukraine
        RU Russia
        CA Canada


        Requirements:
    +    1. Класс Solution должен содержать public static поле countries типа Map<String, String>.
    +    2. В статическом блоке класса Solution инициализируй поле countries тестовыми данными согласно заданию.
    +    3. Класс Solution должен содержать интерфейс RowItem.
    +    4. Класс Solution должен содержать интерфейс Contact.
    +    5. Класс Solution должен содержать интерфейс Customer.
    +    6. Класс DataAdapter должен реализовывать интерфейс RowItem.
    +    7. Класс DataAdapter должен содержать два приватных поля: customer типа Customer и contact Contact.
    +    8. Класс DataAdapter должен содержать конструктор с параметрами (Customer customer, Contact contact), который инициализирует поля contact и customer.
        9. В классе DataAdapter реализуй методы интерфейса RowItem используя подсказки в виде комментариев в интерфейсах.

*/

/*
public class Solution {

    public static void main(String[] args) throws Exception{
        String fileName = "y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\PersonScannerAdapter.txt";
        PersonScanner personScannerAdapter = new PersonScannerAdapter(new Scanner(new FileReader(fileName)));
        System.out.println(personScannerAdapter.read().toString());

    }
//++
    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;

    PersonScannerAdapter(Scanner fileScanner) {
        this.fileScanner = fileScanner;
    }

    @Override
    public Person read() throws IOException {
        String lastName = fileScanner.next();
        String firstName = fileScanner.next();
        String middleName = fileScanner.next();

        int dateDay = fileScanner.nextInt();
        int dateMonth = fileScanner.nextInt() - 1;
        int dateYear = fileScanner.nextInt() ;

        // Date birthDate = new Date( dateYear, dateMonth, dateDay);
        Calendar calendar = Calendar.getInstance();

        calendar.set(calendar.DATE, dateDay);
        calendar.set(calendar.MONTH, dateMonth);
        calendar.set(calendar.YEAR, dateYear);

   //     System.out.println(calendar.toString() + " calendar");
        Date birthDate = new Date(calendar.getTimeInMillis());

        Person person = new Person(firstName, middleName, lastName, birthDate);
//        System.out.println(firstName + " " + middleName + " " + lastName + " " + dateYear + " " + dateMonth + " " +  dateDay + " " + birthDate + " end");
//        while (fileScanner.hasNext())
//         System.out.println(fileScanner.next());

        return person;
    }

    @Override
    public void close() throws IOException {
        fileScanner.close();
    }
}
//++
}
*/

/*
еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
В классе адаптере создать приватное финальное поле Scanner fileScanner. Поле инициализировать в конструкторе с одним аргументом типа Scanner.

Данные в файле хранятся в следующем виде:

етров Петр Петрович 31 12 1957

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные только одного человека.


Requirements:
+ 1. PersonScanner должен быть интерфейсом.
+ 2. Класс PersonScannerAdapter должен реализовывать интерфейс PersonScanner.
+ 3. Класс PersonScannerAdapter должен содержать приватное поле fileScanner типа Scanner.
+ 4. Класс PersonScannerAdapter должен содержать конструктор с параметром Scanner.
+ 5. Метод close() класса PersonScannerAdapter должен делегировать полномочие такому же методу fileScanner.
6. Метод read() класса PersonScannerAdapter должен читать строку с файла, парсить её, и возвращать данные только одного человека, в виде объекта класса Person.
 */




/*
public class Solution {
    public static void main(String[] args) {
        String s1 = "501234567";
        String s2 = "0000000000";
        String s3 = s2.substring(0, 10 - s1.length()) +  s1;
        String s4 = String.format("+38(%s)%s-%s-%s", s3.substring(0, 3), s3.substring(3, 6), s3.substring(6, 8), s3.substring(8, 10));
// +38(050)123-45-67
// +38(050)123-45-67
// +38(050)12-4-6
        System.out.println(s3);
        System.out.println(s4);

    }
}

*/
/*



public class Solution {
    public static void main(String[] args) {
        //это пример вывода
        ATable aTable = new ATable() {
            @Override
            public String getCurrentUserName() {
                return "Amigo";
            }

            @Override
            public String getTableName() {
                return "DashboardTable";
            }
        };

        BTable table = new TableAdapter(aTable);
        System.out.println(table.getHeaderText());
    }

    public static class TableAdapter implements BTable{
        private ATable aTable;
        public TableAdapter(ATable aTable) {
            this.aTable = aTable;
        }

        @Override
        public String getHeaderText() {
            return "[" + aTable.getCurrentUserName() + "] : " + aTable.getTableName();
        }
    }

    public interface ATable {
        String getCurrentUserName();

        String getTableName();
    }

    public interface BTable {
        String getHeaderText();
    }
}
*/

/*
TableAdapter
Zзмени класс TableAdapter так, чтобы он адаптировал ATable к BTable.
Метод getHeaderText должен возвращать такую строку "[username] : tablename".

Пример, "[Amigo] : DashboardTable".


Requirements:
+1. Класс Solution должен содержать public static интерфейс ATable.
+2. Класс Solution должен содержать public static интерфейс BTable.
+3. Класс Solution должен содержать public static класс TableAdapter.
+4. Класс TableAdapter должен реализовывать интерфейс BTable.
+5. Класс TableAdapter должен содержать приватное поле aTable типа ATable.
+6. Класс TableAdapter должен содержать конструктор с параметром ATable.
7. Класс TableAdapter должен переопределять метод getHeaderText согласно заданию.
 */
/*
public class Solution {
    public static void main(String[] args) throws Exception {
        List<String> filesArray = new ArrayList<>();
        String partString = ".part";
//++    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//---
        String fileName = "y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\datalist.txt";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
//        System.out.println("reading filenames --------------");
//---

            String buffFileName;
            while (!("end".equals(buffFileName = bufferedReader.readLine()))) {
                filesArray.add(buffFileName);
//---

//                System.out.println(buffFileName);
//---
            }
            bufferedReader.close();
//--
//        System.out.println("before sort --------------");
//        for (String file: filesArray) {
//            System.out.println(file);
//        }
//--
        Collections.sort(filesArray, new FileNumberOrderComparator(partString));

//--
//        System.out.println("after sort --------------");
//        for (String file: filesArray) {
//            System.out.println(file);
//        }
//--
//
//        System.out.println(" - " + outputFileName);
//--
        String outputFileName =filesArray.get(0).substring(0, filesArray.get(0).lastIndexOf(partString)).trim();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFileName)));
        for (String file: filesArray) {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            while (bufferedReader.ready()) {
                bufferedWriter.write(bufferedReader.read());
            }
            bufferedReader.close();
        }
        bufferedWriter.close();
    }

    private static class FileNumberOrderComparator implements Comparator<String> {
        String partString;
        public int getFileNumber(String s) {
            return Integer.parseInt(s.substring(s.lastIndexOf(partString) + partString.length()).trim());
        }

        public FileNumberOrderComparator(String partString) {
            this.partString = partString;
        }

        @Override
        public int compare(String firstString, String secondString) {
            return getFileNumber(firstString) - getFileNumber(secondString);
        }
    }
}

*/
/*
Собираем файл
Собираем файл из кусочков.
Считывать с консоли имена файлов.
Каждый файл имеет имя: [someName].partN.

Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.


В папке, где находятся все прочтенные файлы, создать файл без суффикса [.partN].

Например, Lion.avi.

В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки.


Requirements:
+1. Программа должна считывать имена файлов с консоли, пока не будет введено слово "end".
2. Создай поток для записи в файл без суффикса [.partN] в папке, где находятся все считанные файлы.
3. В новый файл перепиши все байты из файлов-частей *.partN.
4. Чтение и запись должны происходить с использованием буфера.
5. Созданные для файлов потоки должны быть закрыты.
6. Не используй статические переменные.

 */


/*

Файлы и исключения
Читайте с консоли имена файлов.
Если файла не существует (передано неправильное имя файла), то перехватить исключение FileNotFoundException, вывести в консоль переданное неправильное имя файла и завершить работу программы.
Закрыть потоки.
Не используй System.exit();


Requirements:
1. Программа должна считывать имена файлов с консоли.
2. Для каждого файла нужно создавать поток для чтения.
3. Если файл не существует, программа должна перехватывать исключение FileNotFoundException.
4. После перехвата исключения, программа должна вывести имя файла в консоль и завершить работу.
5. Потоки для чтения из файла должны быть закрыты.
6. Команду "System.exit();" использовать нельзя.
 */

/*

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws Exception {
//+++        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//---
        String fileName = "y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\files.txt";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
//---
        String buffFileName;

        while (!("exit".equals(buffFileName = bufferedReader.readLine()))) {
            Thread thread = new ReadThread(buffFileName);
            thread.start();

//            System.out.println(buffFileName);
        }
        bufferedReader.close();
//--
        try {
            Thread.sleep(Math.round(1000));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(resultMap);
//--


    }

    public static class ReadThread extends Thread {
        String fileName;
        public ReadThread(String fileName) {
            super();
            this.fileName = fileName;
            //implement constructor body
        }

        @Override
        public void run() {
//--
            try {
                Thread.sleep(Math.round(Math.random()*100));
            } catch (Exception e) {
                e.printStackTrace();
            }

//--
            try {

            int arr[] = new int[256];
            File file1 = new File(fileName);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
            int buffer;
            while (bufferedReader.ready()) {
                buffer = bufferedReader.read();
                arr[buffer]++;
            }
            bufferedReader.close();

            int maxOccuringByteIndex = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > arr[maxOccuringByteIndex]) {
                    maxOccuringByteIndex = i;
                }
            }
                if (arr[maxOccuringByteIndex] != 0) {
                    resultMap.put(fileName, maxOccuringByteIndex);
                    System.out.println(fileName + " " + maxOccuringByteIndex);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
// implement file reading here - реализуйте чтение из файла тут
    }


}

*/

/*
Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit".
Передайте имя файла в нить ReadThread.
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз (если таких байтов несколько, выбрать наименьший), и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки.


Requirements:
1. Программа должна считывать имена файлов с консоли, пока не будет введено слово "exit".
2. Для каждого файла создай нить ReadThread и запусти ее.
3. После запуска каждая нить ReadThread должна создать свой поток для чтения из файла.
4. Затем нити должны найти максимально встречающийся байт в своем файле и добавить его в словарь resultMap.
5. Поток для чтения из файла в каждой нити должен быть закрыт.
 */



/*
public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String fileName = bufferedReader.readLine();
        String fileName = "y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data8.txt";
        bufferedReader.close();

        File file = new File(fileName);
        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

        String findLineString = "";
        while (bufferedReader.ready()) {
            findLineString = bufferedReader.readLine();
            if (args[0].equals(findLineString.split(" ")[0])) {
                break;
            }
        }
        bufferedReader.close();
        if (args[0].equals(findLineString.split(" ")[0])) System.out.println(findLineString);
    }
}

*/






/*
Поиск данных внутри файла
Считать с консоли имя файла.
Найти в файле информацию, которая относится к заданному id, и вывести ее на экран в виде, в котором она записана в файле.
Программа запускается с одним параметром: id (int).
Закрыть потоки.

В файле данные разделены пробелом и хранятся в следующей последовательности:
id productName price quantity
где id - int.
productName - название товара, может содержать пробелы, String.
price - цена, double.
quantity - количество, int.



Пример содержимого файла:
194 хлеб 12.6 25
195 масло сливочное 52.2 12
196 молоко 22.9 19

Пример вывода для id = 195:
195 масло сливочное 52.2 12


Requirements:
1. Программа должна считать имя файла с консоли.
2. В методе main создай для файла поток для чтения.
3. Программа должна найти в файле и вывести информацию о id, который передается первым параметром.
4. Поток для чтения из файла должен быть закрыт.
 */

/*

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        int arr[] = new int[256];
        File file1 = new File(fileName);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
        int buffer = 0;
        while (bufferedReader.ready()) {
            buffer = bufferedReader.read();
            arr[buffer]++;
        }
        bufferedReader.close();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) System.out.println((char) (i) + " " + arr[i]);
        }
    }
}
*/

/*

Встречаемость символов
        Программа запускается с одним параметром - именем файла, который содержит английский текст.
        Посчитать частоту встречания каждого символа.
        Отсортировать результат по возрастанию кода ASCII (почитать в инете).

        Пример:
        ','=44, 's'=115, 't'=116.

        Вывести на консоль отсортированный результат:
        [символ1] частота1
        [символ2] частота2
        Закрыть потоки.

        Пример вывода:
        , 19
        - 7
        f 361


        Requirements:
        1. Считывать с консоли ничего не нужно.
        2. Создай поток для чтения из файла, который приходит первым параметром в main.
        3. В файле необходимо посчитать частоту встречания каждого символа и вывести результат.
        4. Выведенный в консоль результат должен быть отсортирован по возрастанию кода ASCII.
        5. Поток для чтения из файла должен быть закрыт.
*/
/*
public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
//        String fileName1 = "y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data5.txt";
//        String fileName2 = "y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data6.txt";
        bufferedReader.close();

        File file1 = new File(fileName1);
        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
        String firstString = bufferedReader.readLine();
        bufferedReader.close();

     System.out.println(firstString);

        String arr[] = firstString.split(" ");

        String resultString = "";
        for(String element: arr) {
            resultString = resultString + Math.round(Float.parseFloat(element.trim())) + " ";
            System.out.println(Math.round(Float.parseFloat(element.trim())));
        }
        System.out.println(resultString);


        FileOutputStream fileOutputStream1 = new FileOutputStream(fileName2);
        for (char buf: resultString.toCharArray()) {
            fileOutputStream1.write(buf);
        }
        fileOutputStream1.close();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        try (BufferedReader bufferedFileReader = new BufferedReader(new FileReader(fileName1));
             PrintWriter printWriter = new PrintWriter(new FileWriter(fileName2))) {

            while (bufferedFileReader.ready()) {
                String[] splittedLine = bufferedFileReader.readLine().split(" ");
                for (String numberInString : splittedLine) {
                    double number = Double.parseDouble(numberInString);
                    long roundedNumber = Math.round(number);
                    printWriter.print(roundedNumber + " ");
                }
            }
        }
    }
}
*/




/*
Округление чисел
Считать с консоли 2 имени файла.
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415.
Округлить числа до целых и записать через пробел во второй файл.
Закрыть потоки.

Принцип округления:
3.49 => 3
3.50 => 4
3.51 => 4
-3.49 => -3
-3.50 => -3
-3.51 => -4


Requirements:
1. Программа должна два раза считать имена файлов с консоли.
2. Для первого файла создай поток для чтения. Для второго - поток для записи.
3. Считать числа из первого файла, округлить их и записать через пробел во второй.
4. Должны соблюдаться принципы округления, указанные в задании.
5. Созданные для файлов потоки должны быть закрыты.
 */


/*
public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //    String fileName1 = bufferedReader.readLine();
        //    String fileName2 = bufferedReader.readLine();
        String fileName1 = "y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data4.txt";
        String fileName2 = "y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data.txt";
        bufferedReader.close();

        File file1 = new File(fileName1);

        FileInputStream fileInputStream1 = new FileInputStream(file1);
        List<Integer> charBuffer = new ArrayList<>();
        while (fileInputStream1.available() > 0)
            charBuffer.add(fileInputStream1.read());
        fileInputStream1.close();


        FileInputStream fileInputStream2 = new FileInputStream(fileName2);
        FileOutputStream fileOutputStream1 = new FileOutputStream(fileName1);
        while (fileInputStream2.available() > 0)
            fileOutputStream1.write(fileInputStream2.read());
        for (Integer buf: charBuffer) {
            fileOutputStream1.write(buf);
        }

        fileInputStream2.close();
        fileOutputStream1.close();

    }
}

*/
/*
Объединение файлов
        Считать с консоли 2 имени файла.
        В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.
        Закрыть потоки.


        Requirements:
       + 1. Программа должна два раза считать имена файлов с консоли.
       + 2. Не используй в программе статические переменные.
        3. Для первого файла создай поток для чтения и считай его содержимое.
        4. Затем, для первого файла создай поток для записи(поток для записи должен быть один). Для второго - для чтения.
        5. Содержимое первого и второго файла нужно объединить в первом файле.
        6. Сначала должно идти содержимое второго файла, затем содержимое первого.
        7. Созданные для файлов потоки должны быть закрыты.
*/
/*
public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //    String fileName1 = bufferedReader.readLine();
        //    String fileName2 = bufferedReader.readLine();
        //    String fileName3 = bufferedReader.readLine();
        String fileName1 = "y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data4.txt";
        String fileName2 = "y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data.txt";
        String fileName3 = "y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data1.txt";
        bufferedReader.close();

        FileInputStream fileInputStream2 = new FileInputStream(fileName2);
        FileInputStream fileInputStream3 = new FileInputStream(fileName3);
        FileOutputStream fileOutputStream1 = new FileOutputStream(fileName1);
        while (fileInputStream2.available() > 0)
            fileOutputStream1.write(fileInputStream2.read());
        while (fileInputStream3.available() > 0)
            fileOutputStream1.write(fileInputStream3.read());
        fileInputStream2.close();
        fileInputStream3.close();
        fileOutputStream1.close();


    }
}

*/
/*
Два в одном
        Считать с консоли 3 имени файла.
        Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.
        Закрыть потоки.


        Requirements:
        1. Программа должна три раза считать имена файлов с консоли.
        2. Для первого файла создай поток для записи. Для двух других - потоки для чтения.
        3. Содержимое второго файла нужно переписать в первый файл.
        4. Содержимое третьего файла нужно дописать в первый файл (в который уже записан второй файл).
        5. Созданные для файлов потоки должны быть закрыты.
*/

/*
public class Solution  {
    public static void main(String[] args) throws IOException{

        FileReader fileReader = new FileReader(args[0]);
        int charBuffer = 0;
        int count = 0;
        int countSpaces = 0;
        while (fileReader.ready()) {
            charBuffer = fileReader.read();
            count++;
            if (charBuffer == ' ') countSpaces++;
        }
        fileReader.close();
        double percent = (1.00*countSpaces)/count*100;

        System.out.printf("%.2f\n", (1.00*countSpaces)/count*100);
        //System.out.println(String.format("%.2f", (1.00*countSpaces)/count*100));

    }
}

*/

/*
Пробелы
В метод main первым параметром приходит путь к файлу.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45.
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой до ближайшего.
4. Закрыть потоки.


Requirements:
1. Считывать с консоли ничего не нужно.
2. Создай поток чтения из файла, который приходит первым параметром в main.
3. Посчитай отношение пробелов ко всем символам в файле и выведи в консоль это число.
4. Выведенное значение необходимо округлить до 2 знаков после запятой до ближайшего.
5. Поток чтения из файла должен быть закрыт.
 */

/*
public class Solution  {
    public static void main(String[] args) throws IOException{

        FileReader fileReader = new FileReader(args[0]);
        int charBuffer = 0;
        int count = 0;
        while (fileReader.ready()) {
            charBuffer = fileReader.read();
            if ((charBuffer >= 'A') && (charBuffer <= 'z')) count++;
        }
        fileReader.close();
        System.out.println(count);
        }
}
*/
/*
Английские буквы
        В метод main первым параметром приходит путь к файлу.
        Посчитать количество символов в файле, которые соответствуют буквам английского алфавита.
        Вывести на экран число (количество символов).
        Закрыть потоки.


        Requirements:
        1. Считывать с консоли ничего не нужно.
        2. Создай поток чтения из файла, который приходит первым параметром в main.
        3. В файле необходимо посчитать количество символов, которые соответствуют буквам английского алфавита, и вывести это число в консоль.
        4. Нужно учитывать заглавные и строчные буквы.
        5. Поток чтения из файла должен быть закрыт.
*/


/*
public class Solution {
    static void init() throws Exception{
        String fileName = "y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\goodsdata.txt";
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write("19847   Шорты пляжные синие           159.00  12  ");
        fileWriter.write("\n");
        fileWriter.write("198479  Шорты пляжные черные с рисунко173.00  17  ");
        fileWriter.write("\n");
        fileWriter.write("19847983Куртка для сноубордистов, разм10173.991234");
        fileWriter.close();
    }

    public static void main(String[] args) throws Exception {
        init();
        if (args.length == 0) return;
        if (!(("-u".equals(args[0])) || ("-d".equals(args[0])))) return;
        List<String> dataBaseList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //    String fileName = bufferedReader.readLine();
        String fileName = "y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\goodsdata.txt";
        bufferedReader.close();
//        System.out.println(fileName);
//        for (String arg: args) {System.out.println(arg);}
            BufferedReader bufferedFileReader = new   BufferedReader(new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8));
     //       BufferedReader bufferedFileReader = new BufferedReader(new FileReader(fileName));
        int targetId = Integer.parseInt(args[1]);
            while (bufferedFileReader.ready()) {
                String currentString = bufferedFileReader.readLine();
                int currentId = Integer.parseInt(currentString.substring(0, 8).trim());
                if (targetId == currentId) {
//                    System.out.println(currentString);
                    switch (args[0]) {
                        case "-u" : {
                            dataBaseList.add(String.format("%-8s%-30s%-8s%-4s", args[1], args[2], args[3], args[4]));
                        }
                        }
                        break;
                        case "-d" : {

                        }
                        break;
                        default: {
                            dataBaseList.add(currentString);
                        }
                    }
                } else dataBaseList.add(currentString);
            }
            bufferedFileReader.close();

//        for (String dataBaseElement: dataBaseList)
//              {
//                  System.out.println(dataBaseElement);
//        }


        FileWriter fileWriter = new FileWriter(fileName);
        if (dataBaseList.size() > 0) fileWriter.write(dataBaseList.get(0));
        for (int i = 1; i < dataBaseList.size(); i++) {
            fileWriter.write("\n");
            fileWriter.write(dataBaseList.get(i));
        }
        fileWriter.close();
    }
}

*/



/*
CRUD для таблицы внутри файла.
Напиши программу, которая считывает с консоли путь к файлу для операций CRUD и при запуске в зависимости от флага, переданного в параметрах обновляет данные товара с заданным id или производит физическое удаление товара с заданным id (удаляет из файла все данные, которые относятся к переданному id).
-u id productName price quantity  19847   Шорты пляжные синие           159.00  12
-d id

Значения параметров:
-u - флаг, который означает обновление данных товара с заданным id
-d - флаг, который означает физическое удаление товара с заданным id (из файла удаляются все данные, которые относятся к переданному id)
id - id товара, 8 символов
productName - название товара, 30 символов
price - цена, 8 символов
quantity - количество, 4 символа

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity

Данные дополнены пробелами до их длины.

Для чтения и записи файла нужно использовать FileReader и FileWriter соответственно.

Пример содержимого файла:
19847   Шорты пляжные синие           159.00  12
198479  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234


Requirements:
1. Программа должна считать имя файла для операций CRUD с консоли.
2. При запуске программы без параметров список товаров должен остаться неизменным.
3. При запуске программы с параметрами "-u id productName price quantity" должна обновится информация о товаре в файле.
4. При запуске программы с параметрами "-d id" строка товара с заданным id должна быть удалена из файла.
5. Созданные для файлов потоки должны быть закрыты.
 */

/*
public class Solution {

    public static void main(String[] args) throws Exception {
        if (args.length == 0) return;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //    String fileName = bufferedReader.readLine();
        String fileName = "y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\goodsdata.txt";
        bufferedReader.close();
//        System.out.println(fileName);
//        for (String arg: args) {System.out.println(arg);}
        if ("-c".equals(args[0])) {

            BufferedReader bufferedFileReader = new   BufferedReader(new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8));
            // BufferedReader bufferedFileReader = new BufferedReader(new FileReader(fileName));
            int maxId = 0;
            while (bufferedFileReader.ready()) {
                String currentString = bufferedFileReader.readLine();
                System.out.println(currentString);
                int currentId = Integer.parseInt(currentString.substring(0, 8).trim());
                System.out.println(currentId);
                if (maxId < currentId) maxId = currentId;
            }
            bufferedFileReader.close();
//            System.out.println(maxId);
            maxId++;

            FileWriter fileWriter = new FileWriter(fileName, true);
            String strId = String.valueOf(maxId);
//            System.out.println(String.format("%-8s%-30s%-8s%-4s", strId, args[1], args[2], args[3]));
            fileWriter.write("\n");
            fileWriter.write(String.format("%-8s%-30s%-8s%-4s", strId, args[1], args[2], args[3]).toCharArray());
            fileWriter.close();
        }
    }
}

*/

/*
public class Solution {

    public static void main(String[] args) throws Exception {
        if (args.length == 0) return;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    //    String fileName = bufferedReader.readLine();
        String fileName = "y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\goodsdata.txt";
        bufferedReader.close();
//        System.out.println(fileName);
//        for (String arg: args) {System.out.println(arg);}
        if ("-c".equals(args[0])) {
         //   BufferedReader bufferedFileReader = new BufferedReader(new FileReader(fileName));


            FileReader fileReader = new FileReader(fileName);
            char charBuffer[] = new char[8+30+8+4+2];
            int maxId = 0;




            while (fileReader.read(charBuffer) > 0) {
                System.out.println(String.copyValueOf(charBuffer, 0, charBuffer.length));
                String stringId = String.copyValueOf(charBuffer, 0, 8).trim();
                System.out.println(stringId.equals("19846"));
//                stringId = "19846";
                int currentId = Integer.parseInt(stringId);
                if (maxId < currentId ) maxId = currentId;
                System.out.println(String.copyValueOf(charBuffer, 0, charBuffer.length));
            }
            fileReader.close();
   //         System.out.println("maxId " + maxId);
            maxId++;
            FileWriter fileWriter = new FileWriter(fileName, true);
            String strId = String.valueOf(maxId);
   //         System.out.println(String.format("%-8s%-30s%-8s%-4s", strId, args[1], args[2], args[3]));
            fileWriter.write(String.format("%-8s%-30s%-8s%-4s", strId, args[1], args[2], args[3]).toCharArray());
            fileWriter.close();
        }
    }
}
*/

/*
Прайсы
CRUD для таблицы внутри файла.
Напиши программу, которая считывает с консоли путь к файлу для операций CRUD и при запуске со следующим набором параметров:
-c productName price quantity
добавляет товар с заданными параметрами с новой строки в конец файла, генерируя id (8 символов) самостоятельно путем инкремента максимального id, найденного в файле.

Значения параметров:
-c - флаг, который означает добавления товара.
productName - название товара, 30 символов.
price - цена, 8 символов.
quantity - количество, 4 символа.

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity

Данные дополнены пробелами до их длины.

Для чтения и записи файла нужно использовать FileReader и FileWriter соответственно.

Пример содержимого файла:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234


Requirements:
+1. Программа должна считать имя файла для операций CRUD с консоли.
+2. В классе Solution не должны быть использованы статические переменные.
+3. При запуске программы без параметров список товаров должен остаться неизменным.
4. При запуске программы с параметрами "-c productName price quantity" в конец файла должна добавится новая строка с товаром.
+5. Товар должен иметь следующий id, после максимального, найденного в файле.
6. Форматирование новой строки товара должно четко совпадать с указанным в задании.
7. Созданные для файлов потоки должны быть закрыты.
 */

/*
public class Solution {
    public static void main(String[] args) throws IOException{

        if ((args[0].equals("-e")) || (args[0].equals("-d"))) {
            try (FileInputStream fileInputStream = new FileInputStream(args[1]);
            FileOutputStream fileOutputStream = new FileOutputStream(args[2]))
            {
                switch (args[0]) {
                    case "-e" : {
                        while (fileInputStream.available() > 0)
                            fileOutputStream.write(fileInputStream.read() + 1);
                    }
                    case "-d" : {
                        while (fileInputStream.available() > 0)
                            fileOutputStream.write(fileInputStream.read() - 1 );
                    }
                    default: {
                        fileInputStream.close();
                        fileOutputStream.close();
                    }

                }

            }
        }
    }
}
*/

/*
Шифровка
Придумать механизм шифровки/дешифровки.

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName

где:
fileName - имя файла, который необходимо зашифровать/расшифровать.
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования.
-e - ключ указывает, что необходимо зашифровать данные.
-d - ключ указывает, что необходимо расшифровать данные.


Requirements:
1. Считывать с консоли ничего не нужно.
2. Создай поток для чтения из файла, который приходит вторым параметром ([fileName]).
3. Создай поток для записи в файл, который приходит третьим параметром ([fileOutputName]).
4. В режиме "-e" программа должна зашифровать [fileName] и записать в [fileOutputName].
5. В режиме "-d" программа должна расшифровать [fileName] и записать в [fileOutputName].
6. Созданные для файлов потоки должны быть закрыты.

*/

