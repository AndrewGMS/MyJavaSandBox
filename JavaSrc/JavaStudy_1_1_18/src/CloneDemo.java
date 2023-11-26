//600
class TestCloneX implements Cloneable {
    int a;
    double b;
    TestCloneX cloneTest() {
        try {
            return (TestCloneX) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Клонирование неовозможно. ");
            return this;
        }
    }


}

public class CloneDemo {
    public static void main(String[] args) {
        TestCloneX x1 = new TestCloneX();
        TestCloneX x2;

        x1.a = 10;
        x1.b = 20.98;

        x2 = x1.cloneTest();

        System.out.println("x1: " + x1.a + " " + x1.b);
        System.out.println("x2: " + x2.a + " " + x2.b);
    }
}
