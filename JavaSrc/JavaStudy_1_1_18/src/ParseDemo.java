//576
import java.io.*;
public class ParseDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String str;
        int i;
        int sum = 0;
        System.out.println("Введите число, 0 - для выхода.");
        do {
            str = br.readLine();

            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("Неверный фоормат");
                i = 0;
            }
        } while (i !=0);

    }
}
