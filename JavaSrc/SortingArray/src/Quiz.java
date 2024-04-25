public class Quiz{

    private String level;
    public static void main(String[] args) {
        var q = new Quiz();
        System.out.println("Level:" + q.level);
    }

    public Quiz() {
        this("Eazy");
    }

    public Quiz(String level) {
      //  this.level = level;
        level = level;
    }
}


/*    public static void main(String[] args) {
        int a = 0;
        while ((a == a++) & (a < 100)) {
            System.out.println(++a);

        }
        String _My_String;
        System.out.println(_My_String);
    } */
