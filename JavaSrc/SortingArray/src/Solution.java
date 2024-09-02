
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.imageio.stream.FileImageOutputStream;
import java.awt.print.Book;
import java.io.*;
import java.math.BigDecimal;
import java.net.URISyntaxException;
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
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //String fileMane = bufferedReader.readLine();
        String fileName = "Y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\goodsdata.txt";
        bufferedReader.close();
//        System.out.println(fileName);
        for (String arg: args) {System.out.println(arg);}
        if ("-c".equals(args[0])) {
            FileReader fileReader = new FileReader(fileName);
            char charBuffer[] = new char[8+30+8+4];
            int maxId = 0;
            System.out.println("19846   Шорты пляжные синие           159.00  12  ".length());
            System.out.println("198478  Шорты пляжные черные с рисунко173.00  17  ".length());
            System.out.println("19847983Куртка для сноубордистов, разм10173.991234".length());


            while (fileReader.read(charBuffer) > 0) {
    //            System.out.println(String.copyValueOf(charBuffer, 0, charBuffer.length));
                String stringId = String.copyValueOf(charBuffer, 0, 8).trim();
             //   stringId = "19846";
                int currentId = Integer.parseInt(stringId);


                if (maxId < currentId ) maxId = currentId;
                System.out.println(String.copyValueOf(charBuffer, 0, charBuffer.length));
            }
            fileReader.close();
            System.out.println("maxId " + maxId);
            maxId++;
//            FileWriter fileWriter = new FileWriter(fileName);
//          //  fileWriter.flush();
//            String strId = String.valueOf(maxId);
//            System.out.println(String.format("%-8s%-30s%-8s%-4s", strId, args[1], args[2], args[3]));
//            fileWriter.write(String.format("%-8s%-30s%-8s%-4s", strId, args[1], args[2], args[3]).toCharArray());
//            fileWriter.close();

// .padEnd(desiredLength, ' * ');


        }




    }
}


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
/*
public class Solution {

    public class TableInterfaceWrapper implements TableInterface{
        TableInterface tableInterface;


        public TableInterfaceWrapper(TableInterface tableInterface) {
            this.tableInterface = tableInterface;
        }
        @Override
        public void setModel(List rows) {
                    System.out.println(rows.size());
                    tableInterface.setModel(rows);
                }


                @Override
                public String getHeaderText() {
                    return tableInterface.getHeaderText().toUpperCase();
                }

                @Override
                public void setHeaderText(String newHeaderText) {
                    tableInterface.setHeaderText(newHeaderText);
                }
        }


    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}
*/
/*
Таблица
Измени класс TableInterfaceWrapper так, чтобы он стал Wrapper-ом для TableInterface.
Метод setModel должен вывести в консоль количество элементов в списке перед обновлением модели (вызовом метода setModel у объекта типа TableInterface).
Метод getHeaderText должен возвращать текст в верхнем регистре - используй метод toUpperCase().


Requirements:
1. Класс TableInterfaceWrapper должен реализовывать интерфейс TableInterface.
2. Класс TableInterfaceWrapper должен инициализировать в конструкторе поле типа TableInterface.
3. Метод setModel() должен вывести в консоль количество элементов в новом листе перед обновлением модели.
4. Метод getHeaderText() должен возвращать текст в верхнем регистре.
5. Метод setHeaderText() должен устанавливать текст для заголовка без изменений.

 */


/*
public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    FileOutputStream fileOutputStream;

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }


    public AmigoOutputStream(FileOutputStream fileOutputStream) {
      super(fileName);
      this.fileOutputStream = fileOutputStream;
    }

    @Override
    public void write(int b) throws IOException {
        fileOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        super.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fileOutputStream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        flush();
        write("JavaRush © All rights reserved.".getBytes());
        fileOutputStream.close();
    }

    @Override
    public void flush() throws IOException {
        fileOutputStream.flush();
    }
}
*/
/*
AmigoOutputStream
1 Измени класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream. Используй наследование.
2 При вызове метода close() должны выполняться следующая последовательность действий:
2.1 Вызвать метод flush().
2.2 Записать в конец файла фразу "JavaRush © All rights reserved.", используй метод getBytes().
2.3 Закрыть поток методом close().


Requirements:
+ 1. Метод main изменять нельзя.
+ 2. Класс AmigoOutputStream должен наследоваться от класса FileOutputStream.
+ 3. Класс AmigoOutputStream должен принимать в конструкторе объект типа FileOutputStream.
4. Все методы write(), flush(), close() в классе AmigoOutputStream должны делегировать свое выполнение объекту FileOutputStream.
5. Метод close() должен сначала вызвать метод flush(), затем записать в конец файла текст, затем закрыть поток.

 */

/*
public class Solution {

    public static void main(String[] args) {
        new Thread(new DecoratorRunnableImpl(new DecoratorMyRunnableImpl(new RunnableImpl()))).start();
    }

    public static class RunnableImpl implements Runnable {
        @Override
        public void run() {
            System.out.println("RunnableImpl body");
        }
    }

    public static class DecoratorRunnableImpl implements Runnable {
        private Runnable component;

        public DecoratorRunnableImpl(Runnable component) {
            this.component = component;
        }

        @Override
        public void run() {
            System.out.println("DecoratorRunnableImpl body");
            component.run();
        }
    }


    public static class DecoratorMyRunnableImpl implements Runnable {
        private Runnable component;

        public DecoratorMyRunnableImpl(Runnable component) {
            this.component = component;
        }

        @Override
        public void run() {
            System.out.println("DecoratorMyRunnableImpl body");
            component.run();
        }
    }


}
*/
/*

Wrapper (Decorator)
Разберись, что делает программа.
Аналогично классу DecoratorRunnableImpl создай класс DecoratorMyRunnableImpl.
Вывод в консоль должен быть таким:
DecoratorRunnableImpl body
DecoratorMyRunnableImpl body
RunnableImpl body


Requirements:
1. Создай класс DecoratorMyRunnableImpl, аналогичный DecoratorRunnableImpl.
2. После запуска, каждый класс должен вывести в консоль "<свое имя класса> body", например "DecoratorRunnableImpl body".
3. Классы RunnableImpl и DecoratorRunnableImpl изменять нельзя.
4. Метод main изменять нельзя.
 */

/*
public class Solution {
    public static void main(String[] args) throws DownloadException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream;
        try {
            while (true) {


//        String fileName1 = bufferedReader.readLine();
            String fileName1 = "Y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data.txt";

            inputStream = new FileInputStream(fileName1);
            if (inputStream.available() < 1000) {
                inputStream.close();
                throw new DownloadException();
            }
            }

            } catch (Exception e) {
            e.printStackTrace();
         }

        }





    public static class DownloadException extends Exception {

    }
}

*/

/*

DownloadException
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть потоки работы с файлами.
2.2 Выбросить исключение DownloadException.


Requirements:
++ 1. Программа должна считать имена файлов с консоли.
++2. Для чтения из файлов используй поток FileInputStream.
3. Программа должна работать, пока введенный файл не окажется меньше 1000 байт.
4. Программа должна завершиться исключением DownloadException.
5. Поток FileInputStream должен быть закрыт.
 */

/*
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String fileName1 = bufferedReader.readLine();
        String fileName1 = "Y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data.txt";
//        String fileName2 = bufferedReader.readLine();
        String fileName2 = "Y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data1.txt";

        bufferedReader.close();
        FileInputStream inputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream1 = new FileOutputStream(fileName2);
        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
           byte[] buffer = new byte[inputStream.available()];
     //       byte buffer[] = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
           inputStream.read(buffer);
           for (int i = 0; i < buffer.length/2 ; i++) {
                byte buf = buffer[i];
                buffer[i] = buffer[buffer.length - 1 - i];
                buffer[buffer.length - 1 - i] = buf;
           }
           outputStream1.write(buffer, 0, buffer.length);
        }
        inputStream.close();
        outputStream1.close();
    }
}
*/

/*
Реверс файла
        Считать с консоли 2 имени файла: файл1, файл2.
        Записать в файл2 все байты из файл1, но в обратном порядке.
        Закрыть потоки.


        Requirements:
        1. Программа должна два раза считать имена файлов с консоли.
        2. Для чтения из файла используй поток FileInputStream, для записи в файл - FileOutputStream
        3. Во второй файл нужно записать все байты из первого в обратном порядке.
        4. Потоки FileInputStream и FileOutputStream должны быть закрыты.
*/
/*
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String fileName1 = bufferedReader.readLine();
        String fileName1 = "Y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data.txt";
//        String fileName2 = bufferedReader.readLine();
        String fileName2 = "Y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data1.txt";
//        String fileName3 = bufferedReader.readLine();
        String fileName3 = "Y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data2.txt";
        bufferedReader.close();
        FileInputStream inputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream1 = new FileOutputStream(fileName2);
        FileOutputStream outputStream2 = new FileOutputStream(fileName3);
        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            outputStream1.write(buffer, 0, buffer.length - buffer.length / 2);
            outputStream2.write(buffer, buffer.length - buffer.length / 2 , buffer.length / 2);
        }
        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
*/

/*
Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.


Requirements:
1. Программа должна три раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файлы - FileOutputStream
3. Первую половину байт из первого файла нужно записать во второй файл.
4. Вторую половину байт из первого файла нужно записать в третий файл.
5. Потоки FileInputStream и FileOutputStream должны быть закрыты.
 */
/*
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String fileName = bufferedReader.readLine();
            String fileName = "Y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data.txt";
        bufferedReader.close();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int count = 0;
        while(fileInputStream.available() > 0) {
            if (fileInputStream.read() == 44) count++;
        }
        fileInputStream.close();
        System.out.print(count);
    }
}

*/

/*
Подсчет запятых
С консоли считать имя файла.
Посчитать в файле количество символов ',', количество вывести на консоль.
Закрыть потоки.

Подсказка:
нужно сравнивать с ascii-кодом символа ','.


Requirements:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должно выводится число запятых в считанном файле.
4. Поток чтения из файла должен быть закрыт.
 */

/*
public class Solution {
    public static void main(String[] args) throws IOException {
//        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        FileInputStream inputStream = new FileInputStream("Y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data.txt");
        // Создаем поток-записи-байт-в-файл
//        FileOutputStream outputStream = new FileOutputStream("c:/result.txt");
        FileOutputStream outputStream = new FileOutputStream("Y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data1.txt");

        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            outputStream.write(buffer, 0, buffer.length);
        }

        inputStream.close();
        outputStream.close();
    }
}
*/



/*
Исправить ошибки
Исправить функциональность в соответствии с требованиями.

Программа должна:
1. Переписать все байты одного файла в другой одним куском.
2. Закрывать потоки ввода-вывода.

Подсказка:
4 ошибки.


Requirements:
+1. Программа должна использовать классы FileInputStream и FileOutputStream.
+2. Программа должна переписать все байты одного файла в другой одним куском.
+3. Потоки FileInputStream и FileOutputStream должны быть закрыты.
4. Нужно исправить 4 ошибки.
 */

/*
public class Solution {
    public static void main(String[] args) throws Exception {
        int arr[] = new int[256];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
    //    String fileName = "Y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data.txt";
        bufferedReader.close();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int buffer = 0;

        while(fileInputStream.available() > 0) {
            buffer = fileInputStream.read();
            arr[buffer]++;
        }
        fileInputStream.close();
             for (int i = 0; i < 256; i++) {
                 if (arr[i] > 0) System.out.print(i + " ");
             }
    }
}
*/
/*

Сортировка байт
Ввести с консоли имя файла.
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран.
Закрыть поток ввода-вывода.

Пример байт входного файла:
44 83 44

Пример вывода:
44 83


Requirements:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль через пробел должны выводиться все уникальные байты из файла в порядке возрастания.
4. Данные в консоль должны выводится в одну строку.
5. Поток чтения из файла должен быть закрыт.
 */




/*
public class Solution {
    public static Map<Integer, Integer> allBytes = new HashMap<>();

    public static void main(String[] args) throws Exception {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = bufferedReader.readLine();
            // String fileName = "Y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data.txt";
            bufferedReader.close();
            FileInputStream fileInputStream = new FileInputStream(fileName);
            int buffer = 0;

            while(fileInputStream.available() > 0) {
                buffer = fileInputStream.read();
                allBytes.computeIfPresent(buffer, (key, value) -> value + 1);
                allBytes.putIfAbsent(buffer, 1);
            }
            fileInputStream.close();

            int minCount = allBytes.get(buffer);
            for (Map.Entry<Integer, Integer> entry : allBytes.entrySet()) {
                if (minCount > entry.getValue()) {
                    minCount = entry.getValue();
                }
            }

//                System.out.println(allBytes.entrySet());

            for (Map.Entry<Integer, Integer> entry : allBytes.entrySet()) {
                if (minCount == entry.getValue()) {
                    System.out.print(entry.getKey() + " ");
                }
            }

    }
}
*/

/*
Самые редкие байты
Ввести с консоли имя файла.
Найти байт или байты с минимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.


Requirements:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль через пробел должны выводиться все байты из файла с минимальным количеством повторов.
4. Данные в консоль должны выводится в одну строку.
5. Поток чтения из файла должен быть закрыт.
 */

/*
public class Solution {
    public static Map<Integer, Integer> allBytes = new HashMap<>();

    public static void main(String[] args) throws Exception {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                //  String filename = bufferedReader.readLine();
                String fileName = "Y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data.txt";
                bufferedReader.close();
                FileInputStream fileInputStream = new FileInputStream(fileName);
                int buffer = 0;

                while((buffer = fileInputStream.read()) != -1) {

                    allBytes.computeIfPresent(buffer, (key, value) -> value + 1);
                    allBytes.putIfAbsent(buffer, 1);
                }

                fileInputStream.close();

                int maxCount = 0;
                for (Map.Entry<Integer, Integer> entry : allBytes.entrySet()) {
                    if (maxCount < entry.getValue()) {
                        maxCount = entry.getValue();
                    }
                }

//                System.out.println(allBytes.entrySet());

                for (Map.Entry<Integer, Integer> entry : allBytes.entrySet()) {
                    if (maxCount == entry.getValue()) {
                        System.out.print(entry.getKey() + " ");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
*/
/*
Самые частые байты
Ввести с консоли имя файла.
Найти байт или байты с максимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.


Requirements:
+1. Программа должна считывать имя файла с консоли.
+2. Для чтения из файла используй поток FileInputStream.
3. В консоль через пробел должны выводиться все байты из файла с максимальным количеством повторов.
4. Данные в консоль должны выводится в одну строку.
5. Поток чтения из файла должен быть закрыт.
 */


/*
public class Solution {
    public static void main(String[] args) throws Exception {
        String str = "dfdsfdsfs ";
        str.concat("10");
        System.out.println(str);
    }
}
*/

/*
public class Solution {
    public static void main(String[] args) throws Exception {
    try {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      //  String filename = bufferedReader.readLine();
        String fileName = "Y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data.txt";
        bufferedReader.close();
        FileInputStream fileInputStream = new FileInputStream(fileName);
   //     Scanner scanner = new Scanner(fileInputStream);
        int buffer = 0;
        int maxValue = 0;
         while((buffer = fileInputStream.read()) != -1) {
            maxValue = maxValue < buffer ? buffer : maxValue;
            }
         fileInputStream.close();
        System.out.println(maxValue);

    } catch (Exception e) {
        e.printStackTrace();
    }

    }


}

*/

/*
Максимальный байт
Ввести с консоли имя файла.
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.


Requirements:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должен выводиться максимальный байт, считанный из файла.
4. Поток чтения из файла должен быть закрыт.
 */


/*

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String firstFileName = "";
            String secondFileName = "";
            firstFileName = bufferedReader.readLine();
            secondFileName = bufferedReader.readLine();
//            firstFileName = "Y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data1.txt";
//            secondFileName = "Y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data.txt";
            bufferedReader.close();
            FileInputStream fileInputStream = new FileInputStream(firstFileName);
            Scanner scanner = new Scanner(fileInputStream);
            while (scanner.hasNext()) {
                allLines.add(scanner.next());
            }
            scanner.close();


            fileInputStream = new FileInputStream(secondFileName);
            scanner = new Scanner(fileInputStream);
            while (scanner.hasNext()) {
                forRemoveLines.add(scanner.next());
            }
            scanner.close();
            new Solution().joinData();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(allLines);
        System.out.println(forRemoveLines);
    }

    public void joinData() throws CorruptedDataException{
        if (allLines.containsAll(forRemoveLines))
            allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }



    }
}
*/
/*
Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла.
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines.
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines.
4. Если условие из п.3 не выполнено, то:
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
Не забудь закрыть потоки.


Requirements:
+1. Класс Solution должен содержать public static поле allLines типа List<String>.
+2. Класс Solution должен содержать public static поле forRemoveLines типа List<String>.
3. Класс Solution должен содержать public void метод joinData() который может бросать исключение CorruptedDataException.
+4. Программа должна считывать c консоли имена двух файлов.
+5. Программа должна считывать построчно данные из первого файла в список allLines.
+6. Программа должна считывать построчно данные из второго файла в список forRemoveLines.
7. Метод joinData должен удалить в списке allLines все строки из списка forRemoveLines, если в allLines содержатся все строки из списка forRemoveLines.
8. Метод joinData должен очистить список allLines и выбросить исключение CorruptedDataException, если в allLines не содержатся все строки из списка forRemoveLines.
9. Метод joinData должен вызываться в main.
 */


/*
public class Solution {
    public static void main(String[] args) {
        Thread myThread1 = new Thread(new MyRunnable("Коля", 35));
        Thread myThread2 = new Thread(new MyRunnable("Лена", 21));
        Thread myThread3 = new Thread(new MyRunnable("Ваня", 19));
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }

    public static synchronized void printInfo(String name, int age) {
        for (int i = 1; i <= 5; i++) {

                System.out.print(i);
                System.out.print(".");
                System.out.print(" ");
                System.out.print("Меня");
                System.out.print(" ");
                System.out.print("зовут");
                System.out.print(" ");
                System.out.print(name);
                System.out.print(",");
                System.out.print(" ");
                System.out.print("мне");
                System.out.print(" ");
                System.out.print(age);
                System.out.println();

        }
    }

    public static class MyRunnable implements Runnable {
        private final String name;
        private final int age;

        public MyRunnable(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public void run() {
            printInfo(name, age);
        }
    }
}

*/
/*
public class Solution {
    public static DrugsController drugsController = new DrugsController();
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Thread apteka = new Thread(new Apteka(), "Apteka");
        Thread man = new Thread(new Person(), "Мужчина");
        Thread woman = new Thread(new Person(), "Женщина");

        apteka.start();
        man.start();
        woman.start();
        System.out.println("Started");
        Thread.sleep(1000);
        isStopped = true;
        System.out.println("Stopped");
    }

    public static class Apteka implements Runnable{
        @Override
        public synchronized void run() {

                while (!Solution.isStopped) {
                    drugsController.buy(getRandomDrug(), getRandomCount());
                    waitAMoment();
                    waitAMoment();
                    waitAMoment();

                }

            }
    }

    public static class Person implements Runnable {
        @Override
        public synchronized void run() {

                while (!Solution.isStopped) {
                    drugsController.sell(getRandomDrug(), getRandomCount());
                    waitAMoment();

                }

        }
    }



    public static int getRandomCount() {
        return (int) (Math.random() * 3) + 1;
    }

    public static Drug getRandomDrug() {
        int index = (int) ((Math.random() * 1000) % (DrugsController.allDrugs.size()));
        List<Drug> drugs = new ArrayList<>(DrugsController.allDrugs.keySet());
        return drugs.get(index);
    }

    private static void waitAMoment() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}

*/



/*
Аптека
Реализуй интерфейс Runnable в классах Apteka и Person.
Все нити должны работать пока не isStopped.
Логика для Apteka: drugsController должен сделать продажу (вызвать метод void sell(Drug drug, int count)) случайного лекарства (getRandomDrug) в количестве (getRandomCount) и подождать 300 мс.
Логика для Person: drugsController должен сделать покупку (вызвать метод void buy(Drug drug, int count)) случайного лекарства (getRandomDrug) в количестве (getRandomCount) и подождать 100 мс.
Расставь synchronized там, где это необходимо.


Requirements:
+1. Класс Solution должен содержать public static поле drugsController типа DrugsController.
+2. Класс Solution должен содержать public static поле isStopped типа boolean.
+3. Класс Solution должен содержать private static void метод waitAMoment(), который должен ждать 100 мс.
+4. Класс Apteka должен реализовывать интерфейс Runnable.
+5. Нить Apteka должна работать пока isStopped = false.
6. Нить Apteka должна использовать drugsController для продажи случайного лекарства (getRandomDrug) в количестве (getRandomCount).
7. Нить Apteka должна ждать 300мс между продажами, используя метод waitAMoment().
8. Класс Person должен реализовывать интерфейс Runnable.
9. Нить Person должна работать пока isStopped = false.
10. Нить Person должна использовать drugsController для покупки случайного лекарства (getRandomDrug) в количестве (getRandomCount).
11. Нить Person должна ждать 100мс между покупками, используя метод waitAMoment().
12. Методы класса DrugsController должны быть synchronized.

 */


/*
public class Beach implements Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    @Override
    public synchronized  int compareTo(Beach o) {
        if (this.distance < o.distance) return 1;
        else if (this.distance > o.distance) return -1;
        else if (this.quality > o.quality) return 1;
        else if (this.quality < o.quality) return -1;
        else return 0;
    }

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {

    }
}
*/


/*

Comparable
Реализуй интерфейс Comparable<Beach> в классе Beach. Пляжи(Beach) будут использоваться нитями, поэтому позаботься, чтобы все методы были синхронизированы.
Реализуй метод compareTo так, чтобы при сравнении двух пляжей он выдавал:
– положительное число, если первый пляж лучше;
– отрицательное число, если второй пляж лучше;
– ноль, если пляжи одинаковые.
Сравни каждый критерий по отдельности, чтобы победителем был пляж с лучшими показателями по большинству критериев. Учти при сравнении, чем меньше расстояние к пляжу (distance), тем пляж лучше.


Requirements:
1. Класс Beach должен содержать три поля: String name, float distance, int quality.
2. Класс Beach должен реализовывать интерфейс Comparable<Beach>.
3. Метод compareTo класса Beach должен учитывать качество пляжа (quality) и дистанцию (distance).
4. Все методы класса Beach, кроме метода main, должны быть синхронизированы.
 */
/*
    Общий список
1. Изменить класс Solution так, чтобы он стал списком. (Необходимо реализовать интерфейс java.util.List).
        2. Список Solution должен работать только с целыми числами Long.
        3. Воспользуйся полем original.
        4. Список будет использоваться нитями, поэтому позаботься, чтобы все методы были синхронизированы.


        Requirements:
        1. Класс Solution должен реализовывать интерфейс List<Long>.
        2. Класс Solution должен содержать private поле original типа ArrayList<Long>.
        3. Все переопределенные в классе Solution методы интерфейса List должны вызывать соответствующие методы объекта original.
        4. Все методы класса Solution, кроме метода main, должны быть синхронизированы.

        */

/*
public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        switch (args[0]) {
            case "-c": synchronized(allPeople) {
//                -c name sex bd
                // -c Миронов м 15/04/1990 Смирнов м 18/04/1971 Смирнова м 19/04/1984
                int cntParams = (args.length - 1) / 3;
                Date bd;
                Locale locale = new Locale("en");
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", locale);

                for (int i = 0; i < cntParams; i++) {
                try {
                    bd = sdf.parse(args[i*3+3]);
                    if (args[i*3+2].equals("м")) {
                        allPeople.add(Person.createMale(args[i*3+1], bd));
                    }
                    if (args[i*3+2].equals("ж")) {
                        allPeople.add(Person.createFemale(args[i*3+1], bd));
                    }
                    System.out.println(allPeople.size()-1);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
//                    int id = allPeople.size()-1;
//                    System.out.println(allPeople.get(id).getName() + " " + (allPeople.get(id).getSex() == Sex.MALE ? "м" : "ж") + " " + sdf.format(allPeople.get(id).getBirthDate()));
            }
            }
            break;
            case "-i": synchronized (allPeople){
//                -i id
//                 name sex (м/ж) bd (формат 15-Apr-1990)
                Locale locale = new Locale("en");
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", locale);
                int cntParams = (args.length - 1) / 1;
                for (int i = 0; i < cntParams; i++) {
                    int id = Integer.parseInt(args[i + 1]);
                    System.out.println(allPeople.get(id).getName() + " " + (allPeople.get(id).getSex() == Sex.MALE ? "м" : "ж") + " " + sdf.format(allPeople.get(id).getBirthDate()));
                }
            }
            break;
            case "-u": synchronized (allPeople){
//                -u id name sex bd
                // -u 0 Миронов м 15/04/1990 1 Смирнов м 18/04/1971 0 Смирнова м 19/04/1984
                Date bd;
                Locale locale = new Locale("en");
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", locale);

                int cntParams = (args.length - 1) / 4;
                for (int i = 0; i < cntParams; i++) {
                try {
                    int id = Integer.parseInt(args[i*4+1]);

                    bd = sdf.parse(args[i*4+4]);
                    allPeople.get(id).setName(args[i*4+2]);
                    allPeople.get(id).setBirthDate(bd);


                    if (args[i*4+3].equals("м")) {
                        allPeople.get(id).setSex(Sex.MALE);
                    }
                    if (args[i*4+3].equals("ж")) {
                        allPeople.get(id).setSex(Sex.FEMALE);
                    }
//                    System.out.println(allPeople.get(id).getName() + " " + (allPeople.get(id).getSex() == Sex.MALE ? "м" : "ж") + " " + sdf.format(allPeople.get(id).getBirthDate()));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                }
            }


            break;
            case "-d": synchronized (allPeople){
//                -d id
                int cntParams = (args.length - 1) / 1;

                for (int i = 0; i < cntParams; i++) {
                    int id = Integer.parseInt(args[i + 1]);

                    allPeople.get(id).setName(null);
                    allPeople.get(id).setBirthDate(null);
                    allPeople.get(id).setSex(null);

//                    System.out.println(allPeople.get(id).getName() + " " + (allPeople.get(id).getSex() == Sex.MALE ? "м" : "ж") + " " );

                }
            }
            break;
        }
//        System.out.println(allPeople);
    }
}


*/
/*
CRUD 2
CrUD Batch - multiple Creation, Updates, Deletion.

Программа запускается с одним из следующих наборов параметров:
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...

Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
-u - обновляет соответствующие данные людей с заданными id
-d - производит логическое удаление человека с id, заменяет все его данные на null
-i - выводит на экран информацию о всех людях с заданными id: name sex bd

id соответствует индексу в списке.
Формат вывода даты рождения 15-Apr-1990
Все люди должны храниться в allPeople.
Порядок вывода данных соответствует вводу данных.
Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных).
Используй Locale.ENGLISH в качестве второго параметра для SimpleDateFormat.

Пример вывода для параметра -і с двумя id:
Миронов м 15-Apr-1990
Миронова ж 25-Apr-1997


Requirements:
+1. Класс Solution должен содержать public static volatile поле allPeople типа List<Person>.
+2. Класс Solution должен содержать статический блок, в котором добавляются два человека в список allPeople.
+ 3. При параметре -с программа должна добавлять всех людей с заданными параметрами в конец списка allPeople, и выводить id каждого (index) на экран.
+ 4. При параметре -u программа должна обновлять данные людей с заданными id в списке allPeople.
+ 5. При параметре -d программа должна логически удалять людей с заданными id в списке allPeople.
6. При параметре -i программа должна выводить на экран данные о всех людях с заданными id по формату указанному в задании.
+7. Метод main класса Solution должен содержать оператор switch по значению args[0].
+ 8. Каждый case оператора switch должен иметь блок синхронизации по allPeople.
 */




/*
public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }
 //   static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
 //   static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    public static void main(String[] args) {
        //напишите тут ваш код
        switch (args[0]) {
            case "-c": {
//                -c name sex bd
                Date bd;
                Locale locale = new Locale("en");
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", locale);
                try {
                    bd = sdf.parse(args[3]);
                    if (args[2].equals("м")) {
                        allPeople.add(Person.createMale(args[1], bd));
                    }
                    if (args[2].equals("ж")) {
                        allPeople.add(Person.createFemale(args[1], bd));
                    }
                    System.out.println(allPeople.size()-1);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
            break;
            case "-r": {
//                -r id
//                 name sex (м/ж) bd (формат 15-Apr-1990)
                Locale locale = new Locale("en");
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", locale);

                int id = Integer.parseInt(args[1]);
                System.out.println(allPeople.get(id).getName() + " " + (allPeople.get(id).getSex() == Sex.MALE ? "м" : "ж") + " " + sdf.format(allPeople.get(id).getBirthDate()));

            }
            break;
            case "-u": {
//                -u id name sex bd
                Date bd;
                Locale locale = new Locale("en");
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", locale);
                try {
                    int id = Integer.parseInt(args[1]);

                    bd = sdf.parse(args[4]);
                    allPeople.get(id).setName(args[2]);
                    allPeople.get(id).setBirthDate(bd);


                    if (args[3].equals("м")) {
                        allPeople.get(id).setSex(Sex.MALE);
                    }
                    if (args[3].equals("ж")) {
                        allPeople.get(id).setSex(Sex.FEMALE);
                    }

                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }


            break;
            case "-d": {
//                -d id
                int id = Integer.parseInt(args[1] );
                allPeople.get(id).setName(null);
                allPeople.get(id).setBirthDate(null);
                allPeople.get(id).setSex(null);
            }
            break;
        }
//        System.out.println(allPeople);
    }
}

*/
/*
CRUD
CRUD - Create, Read, Update, Delete.

Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-r id
-u id name sex bd
-d id

Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-r - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
-u - обновляет данные человека с данным id
-d - производит логическое удаление человека с id, заменяет все его данные на null

id соответствует индексу в списке.
Все люди должны храниться в allPeople.
Используй Locale.ENGLISH в качестве второго параметра для SimpleDateFormat.

Пример параметров:
-c Миронов м 15/04/1990

Пример вывода для параметра -r:
Миронов м 15-Apr-1990

Если программа запущена с параметрами, то они попадают в массив args (аргумент метода main - String[] args).
Например, при запуске программы c параметрами:
-c name sex bd
получим в методе main
args[0] = "-c"
args[1] = "name"
args[2] = "sex"
args[3] = "bd"
Для запуска кода с параметрами в IDE IntellijIDEA нужно их прописать в поле Program arguments в меню Run -> Edit Configurations.


Requirements:
+1. Класс Solution должен содержать public static поле allPeople типа List<Person>.
+2. Класс Solution должен содержать статический блок, в котором добавляются два человека в список allPeople.
+ 3. При запуске программы с параметром -с программа должна добавлять человека с заданными параметрами в конец списка allPeople, и выводить id (index) на экран.
4. При запуске программы с параметром -r программа должна выводить на экран данные о человеке с заданным id по формату указанному в задании.
5. При запуске программы с параметром -u программа должна обновлять данные человека с заданным id в списке allPeople.
6. При запуске программы с параметром -d программа должна логически удалять человека с заданным id в списке allPeople.
 */

/*
public class Solution {

    public static void main(String[] args) {

    }

    public static class Note {

        public final List<String> notes = new ArrayList<String>();

        public void addNote(int index, String note) {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
           synchronized (this) {notes.add(index, note);}

            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public void removeNote(int index) {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note;
            synchronized (this) {note = notes.remove(index);}
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }
    }

}
*/
/*
Синхронизированные заметки
1. Класс Note будет использоваться нитями. Поэтому сделай так, чтобы обращения к листу notes блокировали мьютекс notes, не this
2. Все System.out.println не должны быть заблокированы (синхронизированы), т.е. не должны находиться в блоке synchronized


Requirements:
1. Метод addNote() должен добавлять записки в список notes.
2. Метод removeNote() должен удалять записку из списка notes.
3. В методе addNote() должен находиться synchronized блок.
4. В методе removeNote() должен находиться synchronized блок.
5. Synchronized блок в методе addNote() должен блокировать мьютекс notes.
6. Synchronized блок в методе removeNote() должен блокировать мьютекс notes.
7. В synchronized блоке метода addNote() должен находиться вызов метода add у notes.
8. В synchronized блоке метода removeNote() должен находиться вызов метода remove у notes.
9. Все команды вывода на экран не должны находиться в блоке synchronized.
 */


/*
public class Solution {
    public static int threadCount = 10;
    public static int[] testArray = new int[1000];

    static {
        for (int i = 0; i < Solution.testArray.length; i++) {
            testArray[i] = i;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        StringBuffer expectedResult = new StringBuffer();
        for (int i = 1000 - 1; i >= 0; i--) {
            expectedResult.append(i).append(" ");
        }

        initThreads();

        StringBuffer result = new StringBuffer();
        for (int i = 0; i < testArray.length; i++) {
            result.append(testArray[i]).append(" ");
        }
        System.out.println(result);
        System.out.println((result.toString()).equals(expectedResult.toString()));
    }

    public static void initThreads() throws InterruptedException {
        List<Thread> threads = new ArrayList<Thread>(threadCount);
        for (int i = 0; i < threadCount; i++) threads.add(new SortThread());
        for (Thread thread : threads) thread.start();
        for (Thread thread : threads) thread.join();
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int k = array[i];
                    array[i] = array[j];
                    array[j] = k;
                }
            }
        }
    }

    public static class SortThread extends Thread {
        @Override
        public void run() {
            sort(testArray);
        }
    }
}

*/

/*
Вместе быстрее? Ща проверим :)
1. Разберись, что и как работает.
2. Создай public static нить SortThread, которая в методе run отсортирует статический массив testArray используя метод sort.


Requirements:
1. Класс Solution должен содержать public static класс SortThread.
2. Класс SortThread должен быть нитью.
3. В методе run класса SortThread должен вызывать метод sort() с параметром testArray.
4. Программа должна выводить текст на экран.
 */

/*
public class Solution {
    public static void main(String[] args) {
        new NoteThread().start();
        new NoteThread().start();
    }

    public static class Note {

        public static final List<String> notes = new ArrayList<>();

        public static void addNote(String note) {
            notes.add(0, note);
        }

        public static void removeNote(String threadName) {
            String note = notes.remove(0);
            if (note == null) {
                System.out.println("Другая нить удалила нашу заметку");
            } else if (!note.startsWith(threadName)) {
                System.out.println("Нить [" + threadName + "] удалила чужую заметку [" + note + "]");
            } else {
                System.out.println("Нить [" + threadName + "] удалила свою заметку [" + note + "]");
            }
        }
    }

    public static class NoteThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                Note.addNote(getName() + "-Note" + i);

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Note.removeNote(getName());
            }
        }
    }
}

*/


/*
Заметки
Асинхронность выполнения нитей.
1. Класс Note будет использоваться нитями.
2. Создай public static нить NoteThread (Runnable не является нитью), которая в методе run 1000 раз (index = 0-999) сделает следующие действия:
2.1. Используя метод addNote добавит заметку с именем [getName() + "-Note" + index], например, при index=4
"Thread-0-Note4"
2.2. Заснет на 1 миллисекунду
2.3. Используя метод removeNote удалит заметку
2.4. В качестве параметра в removeNote передай имя нити - метод getName()


Requirements:
+ 1. Класс Solution должен содержать public static класс NoteThread.
2. Класс NoteThread должен быть нитью.
3. В методе run класса NoteThread должен быть цикл.
4. Метод run класса NoteThread должен 1000 раз вызывать метод addNote c параметром (getName() + "-Note" + index).
5. Метод run класса NoteThread должен 1000 раз вызывать Thread.sleep() c параметром (1).
6. Метод run класса NoteThread должен 1000 раз вызывать метод removeNote c параметром (getName()).
 */



/*
public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //напишите тут ваш код
    static {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            firstFileName = bufferedReader.readLine();
//            secondFileName = bufferedReader.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        firstFileName = "Y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data.txt";
        secondFileName = "Y:\\MyJavaProjects\\JavaSrc\\SortingArray\\src\\data.txt";
    }


    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }


    //напишите тут ваш код
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fileName;
        private String result = "";

        @Override
        public void run() {
            try {
                FileInputStream fileInputStream = new FileInputStream(fileName);
                Scanner scanner = new Scanner(fileInputStream);
                while (scanner.hasNext()) {
                    if (!result.equals("")) {result = result + " ";}
                    result = result + scanner.next();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public String getFileContent() {

            return result;
        }
        @Override
        public void setFileName(String fullFileName) {
            fileName = fullFileName;
        }
    }
}
*/


/*
Последовательный вывод файлов
1. Разберись, что делает программа.
2. В статическом блоке считай 2 имени файла firstFileName и secondFileName.
+ 3. Внутри класса Solution создай нить public static ReadFileThread, которая реализует
интерфейс ReadFileInterface (Подумай, что больше подходит - Thread или Runnable).
3.1. Метод setFileName должен устанавливать имя файла, из которого будет читаться содержимое.
3.2. Метод getFileContent должен возвращать содержимое файла.
3.3. В методе run считай содержимое файла, закрой поток. Раздели пробелом строки файла.
4. Подумай, в каком месте нужно подождать окончания работы нити, чтобы обеспечить последовательный вывод файлов.
4.1. Для этого добавь вызов соответствующего метода.

Ожидаемый вывод:
[все тело первого файла]
[все тело второго файла]

(квадратные скобки выводить не нужно)

Requirements:
+ 1. Статический блок класса Solution должен считывать с консоли имена двух файлов и сохранять их в переменные firstFileName и secondFileName.
+ 2. Объяви в классе Solution public static класс ReadFileThread.
+3. Класс ReadFileThread должен реализовывать интерфейс ReadFileInterface.
+ 4. Класс ReadFileThread должен быть унаследован от подходящего класса.
5. Метод run класса ReadFileThread должен считывать строки из файла, установленного методом setFileName.
 А метод getFileContent, этого же класса, должен возвращать вычитанный контент.
 Возвращаемое значение - это одна строка, состоящая из строк файла, разделенных пробелами.
6. Метод systemOutPrintln должен вызывать метод join у созданного объекта f.
7. Вывод программы должен состоять из 2х строк. Каждая строка - содержимое одного файла.
 */

/*
public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут

    public static class Read3Strings extends Thread {
        private String result = "";


        public void printResult() {
            System.out.println(result);
        }

        @Override
        public void run() {

            try {
                result = reader.readLine();
                result = result + " " +reader.readLine();
                result = result + " " +reader.readLine();

            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}

*/
/*
Только по-очереди!
+ 1. В классе Solution создать public static класс нити Read3Strings унаследовавшись от Thread.
2. В методе run реализовать чтение с консоли трех строк.
3. Три подряд введенных строки должны считываться в одной нити и объединяться в одну строку через пробел.
4. В методе main вывести результат для каждой нити.
5. Используй join.

Пример:

Входные данные:
a
b
c
d
e
f

Выходные данные:
a b c
d e f


Requirements:
+1. Объяви в классе Solution public static класс Read3Strings.
+2. Класс Read3Strings должен быть унаследован от Thread.
+3. Метод run класса Read3Strings должен считывать три строки.
4. Класс Read3Strings должен содержать публичный метод printResult.
5. Метод printResult должен выводить в консоль 3 считанные строки, разделив их пробелами.
6. Метод main должен вызывать методы start у созданных нитей.
7. Метод main должен вызывать методы join у созданных нитей.
8. Вывод программы должен отображать, что потоки считывали строки последовательно, а не параллельно.
 */

/*
public class Solution {
    public static volatile AtomicInteger readStringCount = new AtomicInteger(0);
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        //read count of strings
        int count = Integer.parseInt(reader.readLine());

        //init threads
        ReaderThread consoleReader1 = new ReaderThread();
        ReaderThread consoleReader2 = new ReaderThread();
        ReaderThread consoleReader3 = new ReaderThread();

        consoleReader1.start();
        consoleReader2.start();
        consoleReader3.start();

        while (count > readStringCount.get()) {
        }

        consoleReader1.interrupt();
        consoleReader2.interrupt();
        consoleReader3.interrupt();
        System.out.println("#1:" + consoleReader1);
        System.out.println("#2:" + consoleReader2);
        System.out.println("#3:" + consoleReader3);

        reader.close();
    }

    public static class ReaderThread extends Thread {
        private List<String> result = new ArrayList<String>();

        public void run() {
            //напишите тут ваш код
            String string;
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    if ((string = reader.readLine()) != null) {
                        result.add(string);
                        readStringCount.incrementAndGet();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();

            }


        }

        @Override
        public String toString() {
            return result.toString();
        }
    }
}
*/
/*
Кто первый встал - того и тапки
1. Разберись, что делает программа.
1.1. Каждая нить должна читать с консоли строки. Используй готовый static BufferedReader reader.
1.2. Используй AtomicInteger readStringCount, чтобы посчитать, сколько строк уже считано с консоли всеми нитями.
2. Реализуй логику метода run:
2.1. Пока нить не прервана (!isInterrupted) читай с консоли строки и добавляй их в поле List<String> result.
2.2. Используй readStringCount для подсчета уже считанных с консоли строк.
2.3. Тело метода run нужно поместить в блок try-catch.


Requirements:
1. Метод run должен работать пока нить не прервана (!isInterrupted).
2. Метод run НЕ должен создавать свои InputStreamReader-ы или BufferedReader-ы.
3. Метод run должен считывать строки из reader и добавлять их в список result.
4. Метод run должен после каждого считывания увеличивать счетчик прочитанных строк readStringCount на 1.
5. Программа должна выводить данные, считанные каждым потоком.

 */





/*
public class Solution {
    public static void main(String[] args) throws InterruptedException {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread {
        public static volatile boolean isWinnerFound = false;

        public static List<String> steps = new ArrayList<String>();

        static {
            steps.add("Начало игры");
            steps.add("Сбор ресурсов");
            steps.add("Рост экономики");
            steps.add("Убийство врагов");
        }

        protected Gamer gamer1 = new Gamer("Ivanov", 3);
        protected Gamer gamer2 = new Gamer("Petrov", 1);
        protected Gamer gamer3 = new Gamer("Sidorov", 5);

        public void run() {
            gamer1.start();
            gamer2.start();
            gamer3.start();

            while (!isWinnerFound) {
            }
            gamer1.interrupt();
            gamer2.interrupt();
            gamer3.interrupt();
        }
    }

    public static class Gamer extends Thread {
        private int rating;

        public Gamer(String name, int rating) {
            super(name);
            this.rating = rating;
        }

        @Override
        public void run() {
            //Add your code here - добавь код тут

                try {
                    for (int i = 0; i < OnlineGame.steps.size(); i++) {
                    System.out.println(getName() +":"+ OnlineGame.steps.get(i));
                    Thread.sleep(1000/rating);
                    }

                    if (!OnlineGame.isWinnerFound) {
                        OnlineGame.isWinnerFound = true;
                        System.out.println(getName() + ":победитель!");
                    }



                } catch (InterruptedException e) {
                    System.out.println(getName() + ":проиграл");
                }



        }
    }
}
*/
/*
Поиграем?
Три человека играют в игру. Каждый игрок(Gamer) характеризуется двумя параметрами: фамилией(name) и количеством действий в секунду (rating).
Нужно вывести в консоль ход игры и определить победителя и проигравших.
Итак...
1. Разберись, что делает программа.
1.1. List<String> steps хранит последовательность действий, которое каждый игрок выполняет от 0 до последнего.
1.2. isWinnerFound показывает, найден победитель или нет.
1.3. Метод sleep выбрасывает InterruptedException и принимает параметр типа long.
1.4. Игроки играют независимо друг от друга.
2. Реализуй логику метода run так, чтобы для каждого игрока:
2.1. Через равные интервалы времени (1000ms / rating) выводились в консоль действия, описанные в steps.
2.2. Любой текст должен начинаться с фамилии игрока (метод getName()), потом следовать двоеточие, а затем сам текст.

Пример:
Ivanov:Начало игры

2.3. Когда игрок выполнит все действия из steps, то он считается победителем. Выведи getName() + ":победитель!"
2.4. Когда найден победитель, то игра останавливается, и остальные игроки считаются побежденными. Выведи для них getName() + ":проиграл"


Requirements:
1. Метод run класса Gamer через равные интервалы времени (1000ms / rating) должен выводить в консоль фамилию игрока (метод getName()), потом двоеточие, а затем текст из OnlineGame.steps. Пример: Ivanov:Начало игры
2. Когда все игровые шаги будут выполнены, а победитель еще не найден, метод run должен установить флаг OnlineGame.isWinnerFound в true (сообщить остальным, что он победитель).
3. Если игрок стал победителем, его метод run должен вывести надпись getName() + ":победитель!". Например: Sidorov:победитель!
4. Методы run всех игроков которые не стали победителями (были прерваны), должны вывести надписи getName() + ":проиграл". Например: Petrov:проиграл
5. Метод run не должен кидать исключение при прерывании.
*/


/*
public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable{
        //Add your code here - добавь код тут
        private int countIndexUp = 0;

        public void run() {
            try {
                while (true) {

                    countIndexUp += 1;
                    System.out.println(toString());
                    Thread.sleep(500);
                    if (countIndexUp == Solution.number) return;

                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexUp;
        }
    }


    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}
*/
/*
Создание по образцу
Разберись, как работает программа.
По образу и подобию CountdownRunnable создай нить CountUpRunnable, которая выводит значения в нормальном порядке - от 1 до number.


Requirements:
1. Класс CountUpRunnable должен реализовывать интерфейс Runnable.
2. Класс CountUpRunnable должен иметь публичный метод run без параметров.
3. Метод run класса CountUpRunnable должен работать примерно 2,5 секунды.
4. Метод run класса CountUpRunnable должен каждые полсекунды выводить имя потока, двоеточие и значение счетчика от 1 до 5 (например: "Увеличиваем: 1").
5. Метод run класса CountUpRunnable должен вызывать Thread.sleep(500).
 */

/*
public class Solution {
    static Thread t1 = new T1();
    static Thread t2 = new T2();

    public static void main(String[] args) throws InterruptedException {
        t1.start();
        t2.start();
        t1.interrupt();
     //   t2.interrupt();
    }

    public static class T1 extends Thread {
        @Override
        public void run() {
            try {
                t2.join();
                System.out.println("T1 finished");
            } catch (InterruptedException e) {
                System.out.println("T1 was interrupted");
            }
        }
    }

    public static class T2 extends Thread {
        @Override
        public void run() {
            try {
                t1.join();
                System.out.println("T2 finished");
            } catch (InterruptedException e) {
                System.out.println("T2 was interrupted");
            }
        }
    }
}
*/
/*
Взаимная блокировка
1. Разберись, как работает программа.
2. Не меняя классы T1 и T2 сделай так, чтобы их нити завершились, не обязательно успешно.
3. Метод sleep не использовать.


Requirements:
1. Метод main должен запускать нить t1.
2. Метод main должен запускать нить t2.
3. Класс T1 не изменять.
4. Класс T2 не изменять.
5. Метод sleep не использовать.
6. Вывод программы должен состоять из 2х строк, информирующих о завершении нитей. Например: "T1 was interrupted" и "T2 finished".
7. Нити t1 и t2 должны завершаться (не обязательно успешно).
 */
/*
public class Solution {
    public static MyThread t = new MyThread();
    static String message = "inside main ";

    public static void main(String a[]) throws Exception {
        t.start();
        t.join();
        for (int i = 0; i < 10; i++) {
            System.out.println(message + i);
            sleep();
        }
    }

    public static void sleep() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    static class MyThread extends Thread {
        String message = "inside MyThread ";

        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(message + i);
                Solution.sleep();
            }
        }
    }
}
*/
/*
Последовательные выполнения нитей Ӏ Java Core: 6 уровень, 13 лекция
1. Разберись, что делает программа.
2. Сделай так, чтоб программа сначала выводила результат нити, а когда нить завершится - продолжила метод main.

3. Пример выходных данных:
inside MyThread 0
inside MyThread 1
...
inside MyThread 9
inside main 0
inside main 1
...
inside main 9


Requirements:
1. Метод main должен вызывать метод start у нити t.
2. Метод main должен вызывать метод join у нити t.
3. Сначала программа должна вывести 10 строк начинающихся с "inside MyThread".
4. В конце программа должна вывести 10 строк начинающихся с "inside main".
5. Всего программа должна вывести 20 строк.
 */



/*
public class Solution {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
            System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread{
        @Override
        public String toString() {
            return getName() + " created";
        }

        @Override
        public void run() {
            if (createdThreadCount < count) System.out.println( new GenerateThread());
        }

        public GenerateThread() {
            super(String.valueOf(++createdThreadCount));
            start();
        }
    }
}
*/

/*
Рекурсивное создание нитей
1. Измени класс GenerateThread так, чтобы он стал нитью.
2. Создай конструктор GenerateThread, который должен:
2.1. Вызвать конструктор суперкласса с параметром String - номером созданной нити. Используй createdThreadCount.
2.2. Запустить текущую нить.
2.3. Номер первой нити должен начинается с 1.
3. Переопредели метод toString, для этого внутри GenerateThread нажми Alt+Insert -> Override Methods. Начни печатать toString.
3.1. Метод toString должен возвращать № текущей нити и слово " created". Используй getName().

Пример:
8 created

4. Пока количество созданных нитей меньше Solution.count метод run должен:
4.1. Создать новую нить типа GenerateThread.
4.2. Вывести в консоль созданную в пункте 4.1 нить.
5. В итоге должно быть выведено в консоль 15 строк.


Requirements:
+ 1. Класс GenerateThread должен быть унаследован от Thread.
2. В классе GenerateThread должен быть открытый конструктор без параметров.
3. Конструктор класса GenerateThread должен увеличивать значение createdThreadCount и передавать его в виде строки в конструктор суперкласса.
4. Конструктор класса GenerateThread должен запускать нить.
5. Метод toString класса GenerateThread должен возвращать имя нити и слово " created". Пример: "8 created".
6. Если количество созданных нитей меньше Solution.count, метод run должен создать новую нить типа GenerateThread.
7. Если количество созданных нитей меньше Solution.count, метод run должен вывести созданную нить в консоль.
8. Вывод программы должен соответствовать заданию, показывать, что все 15 нитей были созданы.

 */
/*
public class Solution {
    public volatile static int COUNT = 4;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < COUNT; i++) {
            new SleepingThread().join();
        }
    }

    public static class SleepingThread extends Thread {
        private static volatile int threadCount = 0;
        private volatile int countdownIndex = COUNT;

        public SleepingThread() {
            super(String.valueOf(++threadCount));
            start();
        }

        public void run() {
            while (true) {
                System.out.println(this);
                if (--countdownIndex == 0) return;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("Нить прервана");
                    return;
                }

            }
        }

        public String toString() {
            return "#" + getName() + ": " + countdownIndex;
        }
    }
}
*/
/*
Последовательные выполнения нитей Ӏ Java Core: 6 уровень, 13 лекция
1. В методе run после всех действий поставь задержку в 10 миллисекунд. Выведи "Нить прервана", если нить будет прервана.
2. Сделай так, чтобы все нити выполнялись последовательно: сначала для нити №1 отсчет с COUNT до 1, потом для нити №2 с COUNT до 1 и т.д.

Пример:
#1: 4
#1: 3
...
#1: 1
#2: 4
...


Requirements:
1. Программа должна создавать 4 объекта типа SleepingThread.
+  2. Метод main должен вызвать join у каждой создаваемой SleepingThread нити.
+ 3. Метод run должен использовать Thread.sleep(10).
4. Вывод программы должен соответствовать условию.
5. Если нить SleepingThread прерывается, она должна вывести сообщение "Нить прервана".
 */

/*
public class Solution {
    static int count = 5;

    public static void main(String[] args) {
        ThreadNamePrinter tnp = new ThreadNamePrinter();
        tnp.start();
        for (int i = 0; i < count; i++) {
            tnp.printMsg();
        }
    }

    public static class ThreadNamePrinter extends Thread {
        public void run() {
            for (int i = 0; i < count; i++) {
                printMsg();
            }
        }

        public void printMsg() {
            Thread t = Thread.currentThread();//присвой переменной t текущую нить
            String name = t.getName();
            System.out.println("Name=" + name);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
            //add sleep here - добавь sleep тут
        }
    }
}
*/
/*
Thread.currentThread - всегда возвращает текущую нить
        1. В методе printMsg присвой переменной t текущую нить.
        2. В методе printMsg после всех действий поставь задержку в 1 миллисекунду.


        Requirements:
        1. Метод printMsg должен получать текущую нить с помощью Thread.currentThread.
        2. Метод printMsg должен должен усыплять нить на 1 миллисекунду.
        3. Метод printMsg должен вызывать метод getName у текущей нити.
        4. Метод main должен вызвать метод printMsg у объекта типа ThreadNamePrinter 5 раз.
        5. Метод run должен вызвать метод printMsg 5 раз.
        6. Метод printMsg у объекта типа ThreadNamePrinter суммарно должен быть вызван 10 раз.
*/

/*
public class Solution {
    public static Thread.UncaughtExceptionHandler handler = new OurUncaughtExceptionHandler();

    public static void main(String[] args) {
        TestedThread commonThread = new TestedThread(handler);

        Thread threadA = new Thread(commonThread, "Нить 1");
        Thread threadB = new Thread(commonThread, "Нить 2");

        threadA.setUncaughtExceptionHandler(handler);
        threadB.setUncaughtExceptionHandler(handler);

        threadA.start();
        threadB.start();

        threadA.interrupt();
        threadB.interrupt();
    }

    public static class TestedThread extends Thread {
        public TestedThread(Thread.UncaughtExceptionHandler handler) {
            setUncaughtExceptionHandler(handler);
            start();
        }

        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException("My exception message");
            }
        }
    }

    public static class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println(t.getName() + ": " + e.getMessage());
        }
    }
}
*/

/*
Отдебажим все на свете
        Разобраться, что делает программа.

        Почитать про UncaughtExceptionHandler - это важно.

        Еще раз внимательно посмотреть программу.

        Разобраться - продебажить - почему наш OurUncaughtExceptionHandler не срабатывает.

        Исправить ошибку, т.е. все должно работать. :)

        Ожидаемый результат в произвольном порядке:

        Нить 1: My exception message

        Нить 2: My exception message


        Requirements:
        1. Метод main должен создавать нить с параметрами: commonThread и "Нить 1".
        2. Метод main должен создавать нить с параметрами: commonThread и "Нить 2".
        3. Метод main должен запускать две созданные нити типа Thread.
        4. Метод main должен прерывать две созданные нити типа Thread.
        5. Программа с помощью метода uncaughtException класса OurUncaughtExceptionHandler должна вывести 2 сообщения.
        6. Метод uncaughtException класса OurUncaughtExceptionHandler явно не вызывать.
        7. Вывод программы должен содержать строки: "Нить 1: My exception message" и "Нить 2: My exception message".
*/
/*
public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());

    }

    public static void main(String[] args){


        for (int i = 0; i < threads.size() ; i++) {
            threads.get(i).start();
        }




    }

    public static class Thread1 extends Thread{
        @Override
        public void run() {
            while (true) {}
        }
    }

    public static class Thread2 extends Thread{
        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static class Thread3 extends Thread{
        @Override
        public void run() {
         while (true) {
             System.out.println("Ура");
             try {
             Thread.sleep(500);

             } catch (Exception e) {
                 e.printStackTrace();
             }

         }

        }
    }

    public static class Thread4 extends Thread implements Message{
        @Override
        public void showWarning() {
           this.interrupt();
        }

        @Override
        public void run() {
        while (!isInterrupted()) {}

        }
    }

    public static class Thread5 extends Thread{
        @Override
        public void run() {
            try {

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                String buf = "";
                int acc = 0;
                while (!"N".equals(buf = bufferedReader.readLine())) {
                    acc += Integer.parseInt(buf);
                }
                System.out.println(acc);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
*/
/*
Клубок
1. Создай 5 различных своих нитей (наследников класса Thread):
1.1. Нить 1 должна бесконечно выполняться;
1.2. Нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. Нить 3 должна каждые полсекунды выводить "Ура";
1.4. Нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. Нить 5 должна читать с консоли числа пока не введено слово "N", а потом вывести в консоль сумму введенных чисел.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.

Подсказка:
Нить 4 можно проверить методом isAlive()


Requirements:
1. Статический блок класса Solution должен создавать и добавлять 5 нитей в список threads.
2. Нити из списка threads не должны стартовать автоматически.
3. Нить 1 из списка threads должна бесконечно выполняться.
4. Нить 2 из списка threads должна выводить "InterruptedException" при возникновении исключения InterruptedException.
5. Нить 3 из списка threads должна каждые полсекунды выводить "Ура".
6. Нить 4 из списка threads должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться.
7. Нить 5 из списка threads должна читать с консоли числа пока не введено слово "N", а потом вывести в консоль сумму введенных чисел.

 */


/*
public class Solution {
    public static byte threadCount = 3;
    static List<Thread> threads = new ArrayList<Thread>(threadCount);

    public static void main(String[] args) throws InterruptedException {
        initThreadsAndStart();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        //add your code here - добавь код тут
        for (int i = 0; i < threads.size(); i++) {
            threads.get(i).interrupt();

        }
    }

    private static void initThreadsAndStart() {
        Water water = new Water("water");
        for (int i = 0; i < threadCount; i++) {
            threads.add(new Thread(water, "#" + i));
        }

        for (int i = 0; i < threadCount; i++) {
            threads.get(i).start();
        }
    }

    public static class Water implements Runnable {
        private String sharedResource;


        public Water(String sharedResource) {
            this.sharedResource = sharedResource;
        }

        public void run() {
            //fix 2 variables - исправь 2 переменных
            boolean isCurrentThreadInterrupted = Thread.currentThread().isInterrupted();
            String threadName = Thread.currentThread().getName();

            try {
                while (!isCurrentThreadInterrupted) {

                    System.out.println("Объект " + sharedResource + ", нить " + threadName);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
            }
        }
    }
}

*/
/*
Один для всех, все - для одного
1. Разберись, как работает программа.
1.1. Обрати внимание, что объект Water - один для всех нитей.
2. Реализуй метод ourInterruptMethod, чтобы он прерывал все нити из threads.
3. В методе run исправь значения переменных:
3.1. isCurrentThreadInterrupted - должна равняться значению метода isInterrupted у текущей нити.
3.2. threadName - должна равняться значению метода getName (реализовано в классе Thread) у текущей нити.


Requirements:
1. Метод ourInterruptMethod должен прервать все нити из списка threads.
2. Метод run должен получать текущую нить с помощью Thread.currentThread.
3. Метод run должен использовать метод isInterrupted текущей нити.
4. Метод run должен использовать метод getName текущей нити.
5. Метод main должен работать примерно 3 сек.
 */


/*
public class Solution {
    public static boolean areStop = false;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }



    public static void ourInterruptMethod() {
      areStop = true;
    }

    public static class TestThread implements Runnable {

        public void run() {
            while (!areStop) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
*/

/*
А без interrupt слабо?
Разберись, как работает программа.
Реализуй метод ourInterruptMethod таким образом, чтобы он прерывал нить TestThread. Исправь остальной код программы, если это необходимо. Нельзя использовать метод interrupt.


Requirements:
+1. В классе Solution должен быть публичный статический метод ourInterruptMethod без параметров.
+2. Метод run должен выводить надпись "he-he" каждые пол секунды, пока не будет вызван метод ourInterruptMethod.
3. Необходимо изменить условие цикла while в методе run.
+4. Метод main должен создавать объект типа Thread передавая в конструктор объект типа TestThread.
+5. Метод main должен вызывать метод start у объекта типа Thread.
+6. Метод main должен вызывать метод ourInterruptMethod.
 */


/*
public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread testThread = new TestThread();
        testThread.start();
        testThread.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread{
        public void run() {}
    }
}
*/
/*
    Снова interrupt
    Создай нить TestThread.
        В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().


        Requirements:
        1. Класс TestThread должен быть унаследован от Thread.
        2. Класс TestThread должен иметь public void метод run.
        3. Метод main должен создавать объект типа TestThread.
        4. Метод main должен вызывать метод start у объекта типа TestThread.
        5. Метод main должен вызывать метод interrupt у объекта типа TestThread.

        */

/*
public class Solution {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
           start();



        }

        public void run() {
            //add your code here - добавь код тут
            try {
                while (numSeconds > 0) {
                    System.out.print(numSeconds + " ");
                    numSeconds--;
                    Thread.sleep(1000);
                }
                System.out.println("Марш!");
            } catch (InterruptedException e) {
                System.out.println("Прервано!");
            }
        }
    }
}
*/
/*

Отсчет на гонках
1. Разберись, что делает программа.
2. Реализуй логику метода run так, чтобы каждую секунду через пробел
выдавался отсчет начиная с numSeconds до 1, а потом слово [Марш!] (см примеры).
3. Если нить работает 3.5 секунды или более, прерви ее методом interrupt и внутри нити выведи в консоль слово [Прервано!].

Пример для numSeconds=4 :
"4 3 2 1 Прервано!"

4. Если нить работает менее 3.5 секунд, она должна завершиться сама.
Пример для numSeconds=3 :
"3 2 1 Марш!"

PS: метод sleep выбрасывает InterruptedException.


Requirements:
1. Метод run класса RacingClock должен содержать цикл.
2. Объект класса RacingClock должен каждую секунду уменьшать значение переменной numSeconds на единицу.
3. Метод main должен вызывать Thread.sleep(3500).
4. Метод main должен вызывать метод interrupt у объекта clock.
5. Если numSeconds равно 3, то программа должна вывести "3 2 1 Марш!".
6. Если numSeconds равно 4, то программа должна вывести "4 3 2 1 Прервано!".

 */


/*
public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        //create and run thread
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        //read a string
        reader.readLine();
        stopwatch.interrupt();
        //close streams
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread {
        private int seconds;

        public void run() {
            try {
                //напишите тут ваш код
                while (true) {
                    Thread.sleep(1000);
                    seconds++;
                }
            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }
}
*/
/*
Считаем секунды
1. Напиши реализацию метода run в нити Stopwatch (секундомер).
2. Stopwatch должен посчитать количество секунд, которое прошло от создания нити до ввода строки.
3. Выведи количество секунд в консоль.


Requirements:
1. Метод run класса Stopwatch (секундомер) должен содержать цикл.
2. Метод run должен вызывать Thread.sleep(1000).
3. Метод run должен увеличивать значение поля seconds на 1 каждую секунду.
4. После прерывания работы нити Stopwatch (вызова метода interrupt), метод run должен вывести количество секунд (seconds) в консоль.
5. В классе Stopwatch должен быть только один метод run.
 */

/*
public class Solution {
    public static volatile Runway RUNWAY = new Runway();   // взлетная полоса

    public static void main(String[] args) throws InterruptedException {
        Plane plane1 = new Plane("Самолет #1");
        Plane plane2 = new Plane("Самолет #2");
        Plane plane3 = new Plane("Самолет #3");
    }

    private static void waiting() {
        // напишите тут ваш код
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }

    }

    private static void takingOff() {
        // исправь этот метод
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }

    public static class Plane extends Thread {
        public Plane(String name) {
            super(name);
            start();
        }

        public void run() {
            boolean isAlreadyTakenOff = false;
            while (!isAlreadyTakenOff) {
                if (RUNWAY.trySetTakingOffPlane(this)) {    // если взлетная полоса свободна, занимаем ее
                    System.out.println(getName() + " взлетает");
                    takingOff();// взлетает
                    System.out.println(getName() + " уже в небе");
                    isAlreadyTakenOff = true;
                    RUNWAY.setTakingOffPlane(null);
                } else if (!this.equals(RUNWAY.getTakingOffPlane())) {  // если взлетная полоса занята самолетом
                    System.out.println(getName() + " ожидает");
                    waiting(); // ожидает
                }
            }
        }
    }

    public static class Runway { // взлетная полоса
        private Thread t;

        public Thread getTakingOffPlane() {
            return t;
        }

        public void setTakingOffPlane(Thread t) {
            synchronized (this) {
                this.t = t;
            }
        }

        public boolean trySetTakingOffPlane(Thread t) {
            synchronized (this) {
                if (this.t == null) {
                    this.t = t;
                    return true;
                }
                return false;
            }
        }
    }
}
*/
/*
Аэропорт
1. Разберись, что делает программа.
2. Исправь метод takingOff(взлет) - сейчас он работает оооочень долго. Взлет должен занимать 100 миллисекунд.
3. Реализуй метод waiting по аналогии с методом takingOff.


Requirements:
+1. Метод takingOff должен работать примерно 100 мс.
+2. Метод waiting должен работать примерно 100 мс.
+3. В методе main должно создаваться 3 самолета.
4. В классе Solution должен быть вложенный класс Plane (самолет).
5. В классе Solution должен быть вложенный класс Runway (взлетная полоса).
 */
/*
public class Solution {
    public static volatile List<String> list = new ArrayList<String>(5);

    static {
        for (int i = 0; i < 5; i++) {
            list.add("Строка " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Countdown(3), "Countdown");
        t.start();
    }

    public static class Countdown implements Runnable {
        private int countFrom;

        public Countdown(int countFrom) {
            this.countFrom = countFrom;
        }

        public void run() {
            try {
                while (countFrom > 0) {
                    printCountdown();
                }
            } catch (InterruptedException e) {
            }
        }

        public void printCountdown() throws InterruptedException {
            countFrom--;
            Thread.sleep(500);
            System.out.println(list.get(countFrom));

        }
    }
}
*/
/*
Обратный отсчет
1. Разберись, что делает программа.
2. Реализуй логику метода printCountdown так, чтобы программа каждые полсекунды выводила объект из переменной list. Выводить нужно в обратном порядке - от переданного в Countdown индекса до нуля.

Пример:
Передан индекс 3

Пример вывода в консоль:
Строка 2
Строка 1
Строка 0


Requirements:
1. Метод printCountdown должен работать примерно полсекунды.
2. Метод printCountdown должен уменьшать (декрементировать) значение переменной countFrom на 1.
3. Метод printCountdown должен выводить элемент списка list с индексом равным новому значению countFrom.
4. Метод main должен создавать один объект типа Countdown.
5. Вывод программы должен соответствовать примеру из условия.
 */

/*
public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock("Лондон", 23, 59, 57);
        Thread.sleep(4000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Clock extends Thread {
        private String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock(String cityName, int hours, int minutes, int seconds) {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTime();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTime() throws InterruptedException {
            //add your code here - добавь код тут

            if (seconds == 59) {
                seconds = 0;
                if (minutes == 59) {
                    minutes = 0;
                    if (hours == 23) {
                        hours = 0;
                    } else hours++;
                } else minutes++;
            } else seconds++;

            Thread.sleep(1000);
            if (hours == 0 && minutes == 0 && seconds == 0) {
                System.out.println(String.format("В г. %s сейчас полночь!", cityName));
            } else {
                System.out.println(String.format("В г. %s сейчас %d:%d:%d!", cityName, hours, minutes, seconds));
            }
        }
    }
}
*/
/*
Big Ben clock
1. Разберись, что делает программа.
2. Реализуй логику метода printTime так, чтобы каждую секунду выдавалось время начиная с установленного в конструкторе (время, которое передали в конструктор, не выводить).

Пример:
В г. Лондон сейчас 23:59:58!
В г. Лондон сейчас 23:59:59!
В г. Лондон сейчас полночь!
В г. Лондон сейчас 0:0:1!


Requirements:
1. Метод printTime должен работать примерно секунду.
2. Метод printTime должен увеличивать (инкрементировать) количество секунд, хранимое в переменной seconds.
3. Секунд, после инкремента времени, не может быть больше 59. Должно увеличиться количество минут.
4. Минут, после инкремента времени, не может быть больше 59. Должно увеличиться количество часов.
5. Часов, после инкремента времени, не может быть больше 23.
 */

/*
public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Runner ivanov = new Runner("Ivanov", 4);
        Runner petrov = new Runner("Petrov", 2);
        //на старт!
        //внимание!
        //марш!
        ivanov.start();
        petrov.start();
        Thread.sleep(2000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Stopwatch extends Thread {
        private Runner owner;
        private int stepNumber;

        public Stopwatch(Runner runner) {
            this.owner = runner;
        }

        public void run() {
            try {
                while (!isStopped) {
                    doStep();
                }
            } catch (InterruptedException e) {
            }
        }

        private void doStep() throws InterruptedException {
            stepNumber++;
            Thread.sleep(1000/owner.getSpeed());
            System.out.println(owner.getName() + " делает шаг №" + stepNumber + "!");
        }
    }

    public static class Runner {
        Stopwatch stopwatch;
        private String name;
        private int speed;

        public Runner(String name, int speed) {
            this.name = name;
            this.speed = speed;
            this.stopwatch = new Stopwatch(this);
        }

        public String getName() {
            return name;
        }

        public int getSpeed() {
            return speed;
        }

        public void start() {
            stopwatch.start();
        }
    }
}

*/
/*
Stopwatch (Секундомер)
1. Разберись, что делает программа.
2. Реализуй логику метода doStep так, чтобы учитывалась скорость бегуна.
2.1. Метод getSpeed() в классе Runner показывает, сколько шагов в секунду делает бегун.
Нужно, чтобы бегун действительно делал заданное количество шагов в секунду.
Если Иванов делает 4 шага в секунду, то за 2 секунды он сделает 8 шагов.
Если Петров делает 2 шага в секунду, то за 2 секунды он сделает 4 шага.
2.2. Метод sleep в классе Thread принимает параметр типа long.

ВАЖНО! Используй метод Thread.sleep(), а не Stopwatch.sleep().


Requirements:
+ 1. Метод getSpeed должен возвращать int.
+ 2. Поле speed класса Runner должно иметь тип int.
+ 3. Конструктор класса Runner должен принимать String и int.
4. Метод doStep должен учитывать скорость бегуна. Если скорость бегуна 2 шага в секунду, метод должен работать пол секунды; если скорость бегуна 4 шага в секунду, метод должен работать четверть секунды.
5. Вывод программы должен отображать сколько шагов сделали Иванов и Петров за 2 секунды.
 */

/*
public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread.sleep(2000);
        isStopped = true;
        System.out.println("The clock has to be stopped");
        Thread.sleep(2000);
        System.out.println("Double-check");
    }

    public static class Clock extends Thread {
        public Clock() {
            setPriority(MAX_PRIORITY);
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTikTak();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTikTak() throws InterruptedException {
            try {
                Thread.sleep(500);
                System.out.println("Tik");
                Thread.sleep(500);
                System.out.println("Tak");
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }
}
*/

/*
Часы
1. Разберись, что делает программа.
2. Реализуй логику метода printTikTak:
2.1. Через первые полсекунды должна выводиться в консоль фраза: Tik
2.2. Через вторые полсекунды должна выводиться в консоль фраза: Tak


Requirements:
1. Метод printTikTak должен выводить две строчки: "Tik" и "Tak".
2. Метод printTikTak должен работать примерно секунду.
3. Метод printTikTak должен два раза заснуть на полсекунды. Используй метод Thread.sleep(500)."Tik" и "Tak".
4. В консоли не должно быть сообщений после фразы "Double-check".
5. Метод main должен создавать объект типа Clock.

 */

/*
public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Мурка");
        Cat cat2 = new Cat("Пушинка");
    }

    private static void investigateWorld() {
        try {
            Thread.sleep(200);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static class Cat extends Thread {
        protected Kitten kitten1;
        protected Kitten kitten2;

        public Cat(String name) {
            super(name);
            kitten1 = new Kitten("Котенок 1, мама - " + getName());
            kitten2 = new Kitten("Котенок 2, мама - " + getName());
            start();
        }

        public void run() {
            System.out.println(getName() + " родила 2 котят");
            try {
                initAllKittens();
            } catch (InterruptedException e) {
            }
            System.out.println(getName() + ": Все котята в корзинке. " + getName() + " собрала их назад");
        }

        private void initAllKittens() throws InterruptedException {
            kitten1.start();
            kitten1.join();
            kitten2.start();
            kitten2.join();
        }
    }

    public static class Kitten extends Thread {
        public Kitten(String name) {
            super(name);
        }

        public void run() {
            System.out.println(getName() + ", вылез из корзинки");
            investigateWorld();
        }
    }
}

*/
/*
    Расставь вызовы методов join()
1. Разберись, что делает программа.
        2. Расставь вызовы методов join() так, чтобы для каждой кошки выполнялось следующее:
        2.1. Сначала кошка рожает котят.
        2.2. Потом все котята вылезают из корзинки в произвольном порядке.
        2.3. В конце кошка собирает их назад в корзинку.
        2.4. Все события для одной кошки могут быть перемешаны с событиями для другой кошки.
        2.5. Добавить сон котят (200 мс) в investigateWorld.


        Requirements:
        1. У каждого котенка (объекта типа Kitten) должен быть вызван метод join.
        2. Метод investigateWorld должен обеспечивать сон котенка на 200 мс. Используй метод Thread.sleep(200).
        3. Программа должна создавать две кошки и четырех котят.
        4. Методы, которые отвечают за вывод в консоль, не изменять.
        5. Вывод программы должен отображать выполнение требований условия.
        */

/*
public class Solution {
    public static int totalSpeechCount = 200;
    public static int utterancesPerSpeech = 1000000;

    public static void main(String[] args) throws InterruptedException {
        Politician ivanov = new Politician("Иванов");
        ivanov.join();
        Politician petrov = new Politician("Петров");
        Politician sidorov = new Politician("Сидоров");

        while (ivanov.getSpeechCount() + petrov.getSpeechCount() + sidorov.getSpeechCount() < totalSpeechCount) {

                   }

        System.out.println(ivanov);
        System.out.println(petrov);
        System.out.println(sidorov);
    }

    public static class Politician extends Thread {
        private volatile int utteranceCount;

        public Politician(String name) {
            super(name);
            start();
        }

        public void run() {
            while (utteranceCount < totalSpeechCount * utterancesPerSpeech) {
                utteranceCount++;
            }
        }

        public int getSpeechCount() {
            return utteranceCount / utterancesPerSpeech;
        }

        @Override
        public String toString() {
            return String.format("%s сказал речь %d раз", getName(), getSpeechCount());
        }
    }
}
*/
/*
Продвижение на политических дебатах
1. Разберись, что делает программа.
2. Нужно сделать так, чтобы Иванов сказал больше всего речей на политических дебатах.
3. Подумай, какой метод можно вызвать у объекта ivanov, чтобы Иванов разговаривал, пока не завершится всё свободное время.


Requirements:
1. Вызови метод join у нужного объекта.
2. Метод toString класса политик Politician должен выводить сколько речей сказал политик, например: "Иванов сказал речь 35 раз".
3. Программа должна создавать 3 объекта типа Politician.
4. Методы, которые отвечают за вывод в консоль, не изменять.
5. Вывод программы должен свидетельствовать о том, что Иванов сказал больше всего речей на политических дебатах.
 */

/*
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = prepareHorsesAndStart(10);
        while (calculateHorsesFinished(horses) != horses.size()) {
        }
    }

    public static int calculateHorsesFinished(List<Horse> horses) throws InterruptedException {
        int finishedCount = 0;
        for (Horse horse : horses) {
            if (!horse.isFinished()) {
                System.out.println(String.format("Waiting for %s",  horse.getName()));
                horse.join();

            } else finishedCount++;

        }

        return finishedCount;
    }

    public static List<Horse> prepareHorsesAndStart(int horseCount) {
        List<Horse> horses = new ArrayList<>(horseCount);
        String number;
        for (int i = 1; i < horseCount + 1; i++) {
            number = i < 10 ? ("0" + i) : "" + i;
            horses.add(new Horse("Horse_" + number));
        }

        System.out.println("All horses start the race!");
        for (int i = 0; i < horseCount; i++) {
            horses.get(i).start();
        }
        return horses;
    }
}

class Horse extends Thread {

    private boolean isFinished;

    public Horse(String name) {
        super(name);
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void run() {
        String s = "";
        for (int i = 0; i < 1001; i++) {   // Delay
            s += "" + i;
            if (i == 1000) {
                s = " has finished the race!";
                System.out.println(getName() + s);
                isFinished = true;
            }
        }
    }
}
*/
/*
Horse Racing
Разберись, что делает программа.
Реализуй метод calculateHorsesFinished.
Он должен:
1. Посчитать количество финишировавших лошадей и возвратить его. Используй метод isFinished().
2. Если лошадь еще не пришла к финишу (!isFinished()), то:
2.1. Вывести в консоль "Waiting for " + horse.getName().
2.2. Подождать, пока она завершит гонку. Подумай, какой метод нужно использовать для этого.
2.3. Не считать такую лошадь финишировавшей.


Requirements:
1. Метод calculateHorsesFinished должен вернуть количество финишировавших лошадей.
2. Метод calculateHorsesFinished должен вызывать метод isFinished у каждой лошади из переданного списка.
3. Если какая-либо из переданных в списке лошадей еще не финишировала, метод calculateHorsesFinished должен вывести в консоль "Waiting for " + horse.getName().

 Пример сообщения для первой лошади: "Waiting for Horse_01".
4. Если какая-либо из переданных в списке лошадей еще не финишировала, метод calculateHorsesFinished
должен подождать пока она финиширует. Используй правильный метод для ожидания.
5. После завершения работы программы, консоль должна содержать информацию о том, что все лошади финишировали.
Пример сообщения для первой лошади: "Horse_01 has finished the race!".
 */

/*
public class Solution {
    public static void main(String[] args) throws InterruptedException {
        PrintListThread firstThread = new PrintListThread("firstThread");
        PrintListThread secondThread = new PrintListThread("secondThread");
        firstThread.start();
        firstThread.join();
        secondThread.start();
    }

    public static void printList(List<String> list, String threadName) {
        for (String item : list) {
            System.out.println(String.format("%s : %s", threadName, item));
        }
    }

    public static List<String> getList(int n) {
        List<String> result = new ArrayList<String>();
        if (n < 1) return result;

        for (int i = 0; i < n; i++) {
            result.add(String.format("String %d", (i + 1)));
        }
        return result;
    }

    public static class PrintListThread extends Thread {
        public PrintListThread(String name) {
            super(name);
        }

        public void run() {
            printList(getList(20), getName());
        }
    }
}
*/
/*
join: в нужное время в нужном месте
Подумай, в каком месте и для какого объекта нужно вызвать метод join, чтобы результат выводился по-порядку
сначала для firstThread, а потом для secondThread.
Вызови метод join в нужном месте.

Пример вывода:
firstThread : String 1
firstThread : String 2
...
firstThread : String 19
firstThread : String 20
secondThread : String 1
...
secondThread : String 20


Requirements:
1. Метод main должен вызывать метод join для объекта firstThread.
2. Метод main не должен вызывать метод join для объекта secondThread.
3. Метод main не должен вызывать System.out.println() или System.out.print().
4. Вывод программы должен соответствовать примеру из задания.
 */

/*
public class Solution {
    public static int delay = 1000;

    public static void main(String[] args) {
        Thread violin = new Thread(new Violin("Player"));
        violin.start();
    }

    public static void sleepNSeconds(int n) {
        try {
            Thread.sleep(n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface MusicalInstrument extends Runnable {
        Date startPlaying();

        Date stopPlaying();
    }

    public static class Violin implements MusicalInstrument{
        private String owner;

        public Violin(String owner) {
            this.owner = owner;
        }

        public Date startPlaying() {
            System.out.println(this.owner + " is starting to play");
            return new Date();
        }

        public Date stopPlaying() {
            System.out.println(this.owner + " is stopping playing");
            return new Date();
        }

        @Override
        public void run() {
            Date dateStart = startPlaying();
            sleepNSeconds(1);
            Date dateEnd = stopPlaying();
            System.out.println(String.format("Playing %s ms", dateEnd.getTime() - dateStart.getTime()));

        }
    }
}
*/
/*
Поговорим о музыке
1. Измени класс Violin так, чтоб он стал таском для нити. Используй интерфейс MusicalInstrument
2. Реализуй необходимый метод в нити Violin. Реализация должна быть следующей:
2.1. Считай время начала игры - метод startPlaying().
2.2. Подожди 1 секунду - метод sleepNSeconds(int n), где n - количество секунд.
2.3. Считай время окончания игры - метод stopPlaying().
2.4. Выведи на консоль продолжительность игры в миллисекундах. Используй методы из пунктов 2.1 и 2.3.

Пример "Playing 1002 ms".


Requirements:
+ 1. Класс Violin не должен быть унаследован от какого-либо дополнительного класса.
+ 2. Класс Violin должен реализовывать интерфейс MusicalInstrument.
+ 3. Метод run класса Violin должен вызывать метод startPlaying.
4. Метод run класса Violin должен вызывать метод sleepNSeconds с параметром 1 секунда.
5. Метод run класса Violin должен вызывать метод stopPlaying.
6. Метод run класса Violin должен выводить на консоль продолжительность игры в миллисекундах. Используй формат из примера.
 */

/*
public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("*****************");

        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
    }

    public static class SpecialThread implements Runnable {
        @Override
        public void run() {
            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
                System.out.println(element);
            }
        }
    }
}
*/
/*
Вывод стек-трейса
1. Создать таск (public static класс SpecialThread, который реализует интерфейс Runnable).
2. SpecialThread должен выводить в консоль свой стек-трейс.

Подсказка: main thread уже выводит в консоль свой стек-трейс.


Requirements:
1. Добавь в класс Solution публичный статический класс SpecialThread.
2. Класс SpecialThread не должен быть унаследован от какого-либо дополнительного класса.
3. Класс SpecialThread должен реализовывать интерфейс Runnable.
4. Метод run класса SpecialThread должен выводить свой стек-трейс.
 */

/*
public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
*/
/*
    Список и нити
        В методе main добавить в статический объект list 5 нитей. Каждая нить должна быть новым объектом класса Thread, работающим со своим объектом класса SpecialThread.


        Requirements:
        1. В методе main создай 5 объектов типа SpecialThread.
        2. В методе main создай 5 объектов типа Thread.
        3. Добавь 5 разных нитей в список list.
        4. Каждая нить из списка list должна работать со своим объектом класса SpecialThread.
        5. Класс SpecialThread изменять нельзя.

        */



/*
public class Solution {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
    }

    public static class TestThread extends Thread {
        static {
            System.out.println("it's a static block inside TestThread");
        }

        @Override
        public void run() {
            System.out.println("it's a run method");
        }
    }
}

*/
/*
My second thread
1. Создать public static класс TestThread, унаследованный от класса Thread.
2. Создать статик блок внутри TestThread, который выводит в консоль "it's a static block inside TestThread".
3. Метод run должен выводить в консоль "it's a run method".


Requirements:
1. Добавь в класс Solution публичный статический класс TestThread.
2. Класс TestThread должен быть унаследован от класса Thread.
3. Класс TestThread не должен реализовывать какие-либо дополнительные интерфейсов.
4. Создать статик блок внутри TestThread, который выводит в консоль "it's a static block inside TestThread".
5. Метод run класса TestThread должен выводить "it's a run method".
6. Метод main не изменять.
 */

/*
public class Solution {
  public static void main(String[] args) {
    TestThread task = new TestThread();
    new Thread(task).start();
  }

  public static class TestThread implements Runnable {
      @Override
      public void run() {
          System.out.println("My first thread");
      }
  }
}

*/
/*

My first thread
Создать public static class TestThread - нить с интерфейсом Runnable.
TestThread должен выводить в консоль "My first thread".


Requirements:
1. Добавь в класс Solution публичный статический класс TestThread.
2. Класс TestThread должен реализовывать интерфейс Runnable.
3. Метод run класса TestThread должен выводить "My first thread".
4. Программа должна вывести "My first thread".
5. Метод main не изменять.
 */


/*
public class Solution {
  public static void main(String[] args) {
    System.out.println(new Hryvnia().getAmount());
  }

  public static abstract class Money {
    abstract Money getMoney();

    public Object getAmount() {
      return getMoney().getAmount();
    }
  }

  //add your code below - добавь код ниже
  public static class Hryvnia extends Money {
    private double amount = 123d;


    public Double getAmount() {
      return amount;
    }

    public Hryvnia getMoney() {
      return this;
    }
  }
}

*/
/*

ООП. Hryvnia — тоже деньги
Исправь класс Hryvnia так, чтоб избежать возникновения ошибки StackOverflowError.


Requirements:
+ 1. Класс Hryvnia должен быть потомком класса Money.
2. В классе Hryvnia должен быть реализован метод getAmount.
3. Метод getAmount в классе Hryvnia должен возвращать значение поля amount.
4. При выполнении программы не должны возникать исключения или ошибки.
 */


/*
public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//    String url = reader.readLine();
    String url = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";
//    String url = "http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo";
    String paramsSubString = url.substring(url.lastIndexOf("?") + 1);
    String[] splitParams = paramsSubString.split("&");
    String objValue = null;

    StringBuilder resultBuilder = new StringBuilder();
    for (String splitParam : splitParams) {
      String[] paramAndValue = splitParam.split("=");
      resultBuilder.append(paramAndValue[0]);
      resultBuilder.append(" ");

      if (paramAndValue[0].equals("obj")) {
        objValue = paramAndValue[1];
      }
    }

    System.out.println(resultBuilder.toString().trim());

    if (objValue != null) {
      try {
        alert(Double.parseDouble(objValue));
      } catch (NumberFormatException nfe) {
        alert(objValue);
      }
    }
  }

  public static void alert(double value) {
    System.out.println("double: " + value);
  }

  public static void alert(String value) {
    System.out.println("String: " + value);
  }
}
*/
/*
public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//    String url = reader.readLine();
    String url = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";
//    String url = "http://javarush.ru/alpha/index.html?obj=dfd3.14&name=Amigo";
    String params = "";
    String objValue = "";
 //   System.out.println(url);
    if (url.indexOf("?") > 0) {
      url = url.substring(url.indexOf("?") + 1);
      if (!url.substring(url.length() -1).equals("&")) {
        url += "&";
      }

  //    System.out.println(url);
      while (url.length() > 0) {
        String buf = url.substring(0, url.indexOf("&"));
        url = url.substring(url.indexOf("&") + 1);
   //     System.out.println(url);
   //     System.out.println(buf);
        String paramsName = buf.indexOf("=") >= 0 ? buf.substring(0, buf.indexOf("=")): buf;

        if (paramsName.equals("obj")) {
          objValue = paramsName.equals("obj") ? buf.substring(buf.indexOf("=") + 1) : "";
        }

        params += params.length() > 0 ? " " : "";
        params += paramsName;

     //   System.out.println(params);
//        int indexStart = url.indexOf("&");
//        int indexStart = url.indexOf("=");
//        int indexEnd = url.indexOf("=");
      }
      // System.out.println(params + "- params");
      // System.out.println(objValue + "- obj");
    }
    System.out.println(params);
    if (objValue.length() > 0) {
      try {
        alert(Double.parseDouble(objValue));
      } catch (Exception e) {
        alert(objValue);
      }
    }

    //напишите тут ваш код
  }

  public static void alert(double value) {
    System.out.println("double: " + value);
  }

  public static void alert(String value) {
    System.out.println("String: " + value);
  }
}
*/
/*

Парсер реквестов
Для решения этой задачи тебе нужно:
Считать с консоли URL-ссылку.
Вывести на экран список всех параметров через пробел (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
Если присутствует параметр obj, то передать его значение в нужный метод alert():
alert(double value) - для чисел (не забывай о том, что число может быть дробным);
alert(String value) - для строк.
Обрати внимание на то, что метод alert() необходимо вызывать после вывода списка всех параметров на экран.
Пример 1

Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo

Вывод:
lvl view name

Пример 2

Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo

Вывод:
obj name
double: 3.14


Requirements:
1. Программа должна считывать с клавиатуры только одну строку.
2. Класс Solution не должен содержать статические поля.
3. Программа должна выводить данные на экран в соответствии с условием.
4. Программа должна вызывать метод alert() с параметром double, если значение параметра obj можно корректно преобразовать в число типа double.
5. Программа должна вызывать метод alert() с параметром String, если значение параметра obj нельзя корректно преобразовать в число типа double.
 */

/*

public class Solution {
  public static void main(String[] args) {
    new B(6);
  }

  public static class A {
    private int f1 = 7;

    public A(int f1) {
      this.f1 = f1;
      initialize();
    }

    private void initialize() {

      System.out.println("A: " +  f1);
    }
  }

  public static class B extends A {
    protected int f1 = 3;

    public B(int f1) {
      super(f1);
      this.f1 += f1;
      initialize();
    }

    protected void initialize() {
      System.out.println("B: " +f1);
    }
  }
}
*/
/*
Дебаг, дебаг, и еще раз дебаг
Программа выводит 0 9, а должна — 6 9. Найди одну(!) ошибку и исправь ее.
Используй дебаг. Для этого поставь breakpoint-ы (Ctrl+F8), потом зайди в меню Run -> Debug.
F9 - выполнение кода до следующего breakpoint-а.
F8 - переход к следующей строке кода.


Requirements:
1. Программа должна выводить данные на экран.
2. Вывод на экран должен соответствовать условию задачи.
3. У метода initialize() в классе A должен быть правильный модификатор доступа.
4. Программа не должна считывать данные с клавиатуры.
 */


/*

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
 */
/*
public class Solution {
  public static List<String> lines = new ArrayList<String>();

  static {
    try {
      FileInputStream fileInputStream = new FileInputStream(Statics.FILE_NAME);
      Scanner scanner = new Scanner(fileInputStream);
      while (scanner.hasNext()) {
        lines.add(scanner.nextLine());
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    System.out.println(lines);
  }







}


*/
/*

Файл в статическом блоке
Для решения этой задачи:
+ Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по отдельности в List lines.

Requirements:
+1. Константа FILE_NAME не должна быть пустой.
2. В статическом блоке все строки из файла с именем FILE_NAME должны быть добавлены по отдельности в список lines.
+3. Поле FILE_NAME НЕ должно быть final.
+4. Класс Solution должен содержать список lines.
 */


/*
public class Solution {
  static {
    init();
  }

  static {
    System.out.println("Static block");
  }

  {
    System.out.println("Non-static block");
    printAllFields(this);
  }

  public int i = 6;

  public String name = "First name";



  public Solution() {
    System.out.println("Solution constructor");
    printAllFields(this);
  }

  public static void init() {
    System.out.println("static void init()");
  }

  public static void main(String[] args) {
    System.out.println("public static void main");
    Solution s = new Solution();
  }

  public static void printAllFields(Solution obj) {
    System.out.println("static void printAllFields");
    System.out.println(obj.i);
    System.out.println(obj.name);
  }
}
*/
/*
    Порядок загрузки переменных
        Разберись, что и в какой последовательности инициализируется в этой программе, а затем:
        Поставь брейкпойнты и используй дебаггер.
        Исправь порядок инициализации данных так, чтобы результат был следующим:
+ static void init()
+        Static block
+ public static void main
+        Non-static block
+ static void printAllFields
+        0
+        null
+        Solution constructor
+static void printAllFields
+        6
+        First name

        Requirements:
        1. Программа должна выводить данные на экран.
        2. Вывод на экран должен соответствовать условию задачи.
        3. Результатом работы статического инициализатора класса Solution должен быть вывод на экран строк "static void init()" и "Static block".
        4. Программа не должна считывать данные с клавиатуры.

     */


/*
public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String buffer = bufferedReader.readLine();
    while (!buffer.equals("exit")) {
       try {
        if (buffer.indexOf(".") >= 0) {
          print((Double) Double.parseDouble(buffer));
        } else if ((Integer.parseInt(buffer) > 0) && (Integer.parseInt(buffer) < 128)) {
          print((Short) Short.parseShort(buffer));
        } else if ((Integer.parseInt(buffer) >= 128) || (Integer.parseInt(buffer) <= 0)) {
          print((Integer) Integer.parseInt(buffer));
        } else {
          print("+" + buffer);
        }
      } catch (NumberFormatException e) {
        print(buffer);
      }
     buffer = bufferedReader.readLine();
    }



    //напиште тут ваш код
  }

  public static void print(Double value) {
    System.out.println("Это тип Double, значение " + value);
  }

  public static void print(String value) {
    System.out.println("Это тип String, значение " + value);
  }

  public static void print(short value) {
    System.out.println("Это тип short, значение " + value);
  }

  public static void print(Integer value) {
    System.out.println("Это тип Integer, значение " + value);
  }
}

*/
/*
Разные методы для разных типов
В этой задаче тебе нужно:
Считывать с консоли данные, пока не будет введено слово "exit".
Для каждого значения, кроме "exit", вызвать метод print(). Если значение:
содержит точку '.', вызвать метод print() для Double;
больше нуля, но меньше 128, вызвать метод print() для short;
меньше либо равно нулю или больше либо равно 128, вызвать метод print() для Integer;
иначе — вызвать метод print() для String.

Requirements:
+1. Программа должна считывать данные с клавиатуры.
+2. Программа должна прекращать считывать данные с клавиатуры после того, как введена строка "exit".
+3. Если введенная строка содержит точку("."), и ее можно корректно преобразовать в число типа Double - должен быть вызван метод print(Double value).
4. Если введенная строка может быть корректно преобразована в число типа short и полученное число больше 0, но меньше 128 - должен быть вызван метод print(short value).
5. Если введенная строка может быть корректно преобразована в число типа Integer и полученное число меньше или равно 0 или больше или равно 128 - должен быть вызван метод print(Integer value).
6. Во всех остальных случаях должен быть вызван метод print(String value).

 */


/*
public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//    int input = Integer.parseInt(reader.readLine());
    int input = 150;

    reader.close();

    System.out.println(factorial(input));
  }

  public static String factorial(int n) {
    //add your code here
    String result = "";
    if (n < 0) {
      result = "0";
    } else if (n == 0) {
      result = "1";
    } else {
      BigDecimal buf = new BigDecimal(1);
      for (int i = 1; i <= n ; i++) {
        buf = buf.multiply(new BigDecimal(i));
      }
      result = "" + buf;
    }
    return result;
  }
}
*/
/*
Факториал
Напиши метод, который вычисляет факториал - произведение всех чисел от 1 до введенного числа, включая его.

Пример вычислений: 4! = factorial(4) = 1*2*3*4
Пример вывода: 24

Для этого:
Введи с консоли число меньше либо равно 150.
Реализуй функцию factorial.
Если введенное число меньше 0, выведи 0.
0! = 1

Requirements:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить на экран факториал введенного числа.
3. Метод factorial должен возвращать строковое представление факториала числа, переданного ему в качестве параметра.
4. Метод factorial должен принимать один параметр типа int.
 */



/*
public class Solution {
  public static int A = 0;

  static {
    //throw an exception here - выбросьте эксепшн тут

    if (true) throw new ExceptionInInitializerError();

  }

  public static int B = 5;

  public static void main(String[] args) {
    System.out.println(B);
  }
}
*/
/*

Статики и исключения
В статическом блоке класса Solution напиши код, выполнение которого приведет к возникновению исключения.
В результате класс не загрузится, и вместо значения переменной B появится сообщение об ошибке:
Exception in thread "main" java.lang.ExceptionInInitializerError
at java.lang.Class.forName0(Native Method)
at java.lang.Class.forName(Class.java:186)
at com.intellij.rt.execution.application.AppMain.main(AppMain.java:113)
Caused by: java.lang.RuntimeException:
at com.javarush.task.task15.task1517.Solution.<clinit>(Solution.java:22)

Hint: Нужно погуглить причину, если получилось следующее:
java: initializer must be able to complete normally
java: unreachable statement


Requirements:
1. В классе Solution в статическом блоке должно возникать исключение (Exception).
2. Программа не должна ничего выводить на экран, кроме автоматического сообщения о возникшем исключении.
3. Программа не должна считывать данные с клавиатуры.
4. Класс Solution должен быть public.
 */

/*
public class Solution {
  int intVar;
  double doubleVar;
  Double DoubleVar;
  boolean booleanVar;
  Object ObjectVar;
  Exception ExceptionVar;
  String StringVar;

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.intVar);
    System.out.println(solution.doubleVar);
    System.out.println(solution.DoubleVar);
    System.out.println(solution.booleanVar);
    System.out.println(solution.ObjectVar);
    System.out.println(solution.ExceptionVar);
    System.out.println(solution.StringVar);

  }
}
*/
/*
Значения по умолчанию
В этой задаче тебе нужно:
Создать 7 нестатических public полей класса:
intVar типа int
doubleVar типа double
DoubleVar типа Double
booleanVar типа boolean
ObjectVar типа Object
ExceptionVar типа Exception
StringVar типа String
Убедиться, что они инициализируются дефолтными значениями.
Вывести их значения в заданном порядке в методе main()

Requirements:
1. В классе Solution должно быть объявлено поле intVar типа int.
2. В классе Solution должно быть объявлено поле doubleVar типа double.
3. В классе Solution должно быть объявлено поле DoubleVar типа Double.
4. В классе Solution должно быть объявлено поле booleanVar типа boolean.
5. В классе Solution должно быть объявлено поле ObjectVar типа Object.
6. В классе Solution должно быть объявлено поле ExceptionVar типа Exception.
7. В классе Solution должно быть объявлено поле StringVar типа String.
8. Метод main должен выводить значения полей на экран (каждое — с новой строки или через пробел) в заданном порядке. Инициализировать переменные не нужно.

 */

/*
public class Solution {
  public static int A;
  public static int B;
  static {
    try {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

      A = Integer.parseInt(bufferedReader.readLine());
      B = Integer.parseInt(bufferedReader.readLine());
    }
    catch (IOException e) {
      A = 0;
      B = 0;
    }
    finally {
      bufferedReader.close();
    }
  }


  public static final int MIN = min(A, B);

  public static void main(String[] args) {
    System.out.println(MIN);
  }

  public static int min(int a, int b) {
    return a < b ? a : b;
  }
}
*/

/*
Статики-2
        В этой задаче тебе нужно:
        В статическом блоке считать с консоли А и В — две переменные с типом int.
        Обработать IOException в блоке catch.
        Закрыть поток ввода методом close().

        Requirements:
        1. Поле A должно быть публичным и статическим.
        2. Поле B должно быть публичным и статическим.
        3. Программа должна считывать данные с клавиатуры в статическом блоке.
        4. Программа должна инициализировать поля A и B в статическом блоке согласно введенным с клавиатуры значениям.
        5. Программа должна выводить в консоль минимальное из введенных с клавиатуры значений.*/
/*
public class Solution {
  public static void main(String[] args) {
    printMatrix(2, 3, "8");
  }

  public static void printMatrix(int m, int n, String value) {
    System.out.println("Заполняем объектами String");
    printMatrix(m, n, (Object) value);
  }

  public static void printMatrix(String value) {
    printMatrix(3, 3, (Object) value);
  }




  public static void printMatrix(int m, int n, Object value) {
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(value);
      }
      System.out.println();
    }
  }
}

*/

/*
public class Solution {
  public static void main(String[] args) {
    print((short) 1);
    print((Number) 1);
    print(1);
    print((Integer) 1);
    print((int) 1);
  }

  public static void print(Integer i) {
    System.out.println("Это Integer");
  }

 // public static void print(int i) {System.out.println("Это Integer"); }

  // public static void print(Short i) {     System.out.println("Это Object");   }

  public static void print(Object i) {
    System.out.println("Это Object");
  }

  public static void print(double i) {
    System.out.println("Это double");
  }

  // public static void print(Double i) {    System.out.println("Это double");  }

 // public static void print(float i) {   System.out.println("Это Double");  }
}
*/
/*
Что-то лишнее
        Удали реализации всех лишних методов, чтобы вывод программы выглядел так:
        Это double
        Это Object
        Это double
        Это Integer
        Это double


        Requirements:
        1. В классе Solution должен остаться метод print() с одним параметром типа Integer.
        2. В классе Solution должен остаться метод print() с одним параметром типа Object.
        3. В классе Solution должен остаться метод print() с одним параметром типа double.
        4. Вывод на экран должен соответствовать условию.

*/


/*
public class Solution {
  public interface HasWeight {
    int getWeight();
  }

  public interface HasHeight {
    int getHeight();
  }

  public static class Human implements HasWeight, HasHeight {
    @Override
    public int getHeight() {
      return 1;
    }
    @Override
    public int getWeight() {
      return 2;
    }
  }

  public static void main(String[] args) {
    Human human = new Human();
    System.out.println(human.getHeight());
    System.out.println(human.getWeight());
  }
}

*/
/*
ООП - исправь ошибки в наследовании
У каждого человека есть рост и вес. Класс Human реализует соответствующие интерфейсы.
Но, похоже, в такой реализации закралась ошибка. Обрати внимание на вывод программы.
Исправь ошибки в интерфейсах (подсказка: переименуй методы, согласно требований к задаче) и,
соответственно, в остальном коде. На экран должны быть выведены рост и вес человека (любые положительные целые числа).


Requirements:
1. Метод int getValue() интерфейса HasWeight должен быть переименован в getWeight.
2. Метод int getValue() интерфейса HasHeight должен быть переименован в getHeight.
3. В классе Human должны быть переопределены методы getWeight и getHeight. Каждый из них должен возвращать любое целое число больше 0.
4. В классе Human не должно быть метода getValue.
5. В методе main у объекта класса human должны вызываться методы getWeight и getHeight.
 */


/*
public class Solution {
  public static void main(String[] args) {
    List<Book> books = new LinkedList<Book>();
    books.add(new MarkTwainBook("Tom Sawyer"));
    books.add(new AgathaChristieBook("Hercule Poirot"));
    System.out.println(books);
  }

  public static class MarkTwainBook extends Book {

    private String title;

    public MarkTwainBook(String title) {
      super("Mark Twain");
      this.title = title;
    }
    public String getTitle() {
      return title;
    }

    public MarkTwainBook getBook() { return this;}

  }

  public static class AgathaChristieBook extends Book {

    private String title;
    public AgathaChristieBook(String title) {
      super("Agatha Christie");
      this.title = title;
    }
    public String getTitle() {
      return title;
    }

    public AgathaChristieBook getBook() { return this;};

  }


  abstract static class Book {
    private String author;

    public Book(String author) {
      this.author = author;
    }

    public abstract Book getBook();

    public abstract String getTitle();

    private String getOutputByBookType() {
      String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
      String markTwainOutput = getBook().getTitle() + " was written by " + author;

      String output = "output";

      if (getBook() instanceof MarkTwainBook) {
        output = markTwainOutput;
      } else if (getBook() instanceof AgathaChristieBook) {
        output = agathaChristieOutput;
      }

      //Add your code here

      return output;
    }

    public String toString() {
      return getOutputByBookType();
    }
  }


}

*/
/*

ООП - книги
Давай напишем программу, которая будет определять жанр книги, или автора, который ее написал.
Для этого:
Создай public static класс MarkTwainBook, который наследуется от Book. Имя автора — [Mark Twain].
Параметр конструктора — название книги (title).
В классе MarkTwainBook реализуй все абстрактные методы.
Для метода getBook измени тип возвращаемого значения на более подходящий.
Создай по аналогии AgathaChristieBook. Имя автора — [Agatha Christie].
В классе Book реализуй тело метода getOutputByBookType() так, чтобы он возвращал:
agathaChristieOutput — для книг Агаты Кристи;
markTwainOutput — для книг Марка Твена.

Requirements:
1. Класс Solution должен содержать public static класс MarkTwainBook.
2. Класс MarkTwainBook должен быть потомком класса Book.
3. В классе MarkTwainBook должен быть корректно реализован конструктор с одним параметром типа String (название книги).
4. Конструктор класса MarkTwainBook должен вызывать конструктор класса предка (Book) с параметром "Mark Twain".
5. Метод getBook в классе MarkTwainBook должен иметь тип возвращаемого значения MarkTwainBook и возвращать текущий объект.
6. Класс Solution должен содержать public static класс AgathaChristieBook.
7. Класс AgathaChristieBook должен быть потомком класса Book.
8. В классе AgathaChristieBook должен быть корректно реализован конструктор с одним параметром типа String (название книги).
9. Конструктор класса AgathaChristieBook должен вызывать конструктор класса предка (Book) с параметром "Agatha Christie".
10. Метод getBook в классе AgathaChristieBook должен иметь тип возвращаемого значения AgathaChristieBook и возвращать текущий объект.
11. Метод getTitle в классах AgathaChristieBook и MarkTwainBook должен возвращать название конкретной книги.
12. Метод getOutputByBookType должен возвращать корректную строку для объектов типа AgathaChristieBook.
13. Метод getOutputByBookType должен возвращать корректную строку для объектов типа MarkTwainBook.
14. В классе MarkTwainBook должно быть создано поле title типа String (название книги).
15. В классе AgathaChristieBook должно быть создано поле title типа String (название книги).
 */



/*
public class Solution {
  public static void main(String[] args) {






  }
}
*/

/*
Singleton
Класс является синглтоном (реализует паттерн Singleton), если позволяет создать всего один объект своего типа.

Реализуй Singleton pattern:
Создай класс Singleton в отдельном файле.
Добавь в него статический метод getInstance().
При любом вызове метода getInstance() он должен возвращать один и тот же объект класса Singleton.
Подумай, каким образом можно запретить создание других объектов этого класса.
Сделай все конструкторы в классе Singleton приватными (private).
В итоге должна быть возможность создать объект (экземпляр класса) используя только метод getInstance.

Requirements:
1. Класс Singleton должен быть создан в отдельном файле.
2. Класс Singleton не должен позволять создавать объекты своего типа извне класса.
3. Класс Singleton должен содержать приватное статическое поле instance типа Singleton.
4. В классе Singleton должен быть реализован публичный статический метод getInstance() возвращающий значение поля instance.
5. Метод getInstance должен всегда возвращать один и тот же объект.
 */


/*
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

*/
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