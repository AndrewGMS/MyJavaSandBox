// 546
// не компилируется
import java.io.*;
public class UseTrim {

    public static void main(String[] args) {
        BufferedReader br = new
                BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Введите 'стоп' для завершения.");
        System.out.println("Введите названи штата: ");
        do {
        //    str = br.readLine();
            str = "Иллинойс   ";
            System.out.println(str);
            str = str.trim();
            System.out.println("|"+str+"|");
            if (str.equals("Иллинойс"))
                System.out.println("Столица - Спрингфилд.");
            else if (str.equals("Миссури"))
                System.out.println("Столица - Джефферсон-сити.");
            else if (str.equals("Калифорния"))
                System.out.println("Столица - Сакраменто.");
            else if (str.equals("Вашингтон"))
                System.out.println("Столица - Олимпия.");
            str = "стоп";
        } while (!str.equals("стоп"));

    }

}
