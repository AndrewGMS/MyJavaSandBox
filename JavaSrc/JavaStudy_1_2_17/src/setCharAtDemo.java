//553
public class setCharAtDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("бужер до  = " + sb);
        System.out.println("до вызова charAt(1) = " + sb.charAt(1));
        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println("бужер после  = " + sb);
        System.out.println("после вызова charAt(1) = " + sb.charAt(1));

    }
}
