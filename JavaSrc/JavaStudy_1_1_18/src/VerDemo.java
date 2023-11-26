// 591
import java.lang.Runtime.*;
public class VerDemo {
    public static void main(String[] args) {
        Runtime.Version ver = Runtime.version();

        System.out.println("Основной номер версии: " + ver.major());
        System.out.println("Дополнгительный номер версии: " + ver.minor());
        System.out.println("Номер версии системы защиты: " + ver.security());
        System.out.println("Номер сборки: " + ver.build());

    }
}
