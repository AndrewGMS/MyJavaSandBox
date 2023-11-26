//556
public class deleteDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Это простой тест.");

        sb.delete(3, 11);
        System.out.println("После вызова метода delete(): " + sb);

        sb.deleteCharAt(0);
        System.out.println("После вызова метода deleteCharAt(): " + sb);




    }
}
