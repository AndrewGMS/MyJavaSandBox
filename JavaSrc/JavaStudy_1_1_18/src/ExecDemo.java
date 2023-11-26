//589
public class ExecDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
            p = r.exec("Notepad \"y:\\MyJavaProjects\\JavaSrc\\Указатель страницы\" ");
        } catch (Exception e) {
            System.out.println("Ошибка запуска Notepad.");
        }
    }
}
