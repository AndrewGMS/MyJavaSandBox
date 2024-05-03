import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Quiz{
    public static final String FILE_NAME = "birds.txt";
    public static final String NEW_FILE_NAME = "birds-new.txt";
    public static void main(String[] args) throws IOException {
        File file = new File(FILE_NAME);
        try(FileOutputStream out = new FileOutputStream(FILE_NAME)) {
            out.write("Duck\n".getBytes());
            out.flush();
            file.renameTo(new File(NEW_FILE_NAME));
            out.write("Crow".getBytes());
        }
        printFile();
    }
    public static void printFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(NEW_FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        new File(NEW_FILE_NAME).deleteOnExit();
    }
//    private String level;
//    public static void main(String[] args) {
//        var q = new Quiz();
//        System.out.println("Level:" + q.level);
//    }
//
//    public Quiz() {
//        this("Eazy");
//    }
//
//    public Quiz(String level) {
//      //  this.level = level;
//        level = level;
//    }


//    public static void main(String[] args) {
//        // double d = 5; int i = (int) d;
//        double d = 5; int i =  d;
//        short s = 2;
//        float a = 1.234;
//        double[] numbers = {10.2, 56.0, 54.7};
//        Arrays.stream(numbers)
//                .map(n -> n + 1)
//                .toArray();
//        System.out.println(Arrays.toString(numbers));
//    }

}


/*    public static void main(String[] args) {
        int a = 0;
        while ((a == a++) & (a < 100)) {
            System.out.println(++a);

        }
        String _My_String;
        System.out.println(_My_String);
    } */
