import javax.imageio.stream.FileImageOutputStream;
import java.awt.geom.RoundRectangle2D;
import java.awt.print.Book;
import java.io.*;
import java.math.BigDecimal;
import java.net.URISyntaxException;
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
import  java.util.function.Function;
import java.util.function.UnaryOperator;


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

