//618
class NewThread extends Thread {
    boolean suspendFlag;

    NewThread(String threadname, ThreadGroup tgOb) {
        super(tgOb, threadname);
        System.out.println("Новый поток: " + this);
        suspendFlag = false;
        start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
                synchronized (this) {
                    while(suspendFlag) {
                        wait();
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("Исключение в " + getName());
        }
        System.out.println(getName() + " завершается.");
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}



public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup groupA = new ThreadGroup("Группа A");
        ThreadGroup groupB = new ThreadGroup("Группа B");

        NewThread ob1 = new NewThread("Один", groupA);
        NewThread ob2 = new NewThread("Два", groupA);
        NewThread ob3 = new NewThread("Три", groupB);
        NewThread ob4 = new NewThread("Четыре", groupB);

        System.out.println("\nВывод из метода list(): ");
        groupA.list();
        groupB.list();
        System.out.println();

        System.out.println("Прерывается Группа A");
        Thread tga[] = new Thread [groupA.activeCount()];
        groupA.enumerate(tga);
        for (int i = 0; i < tga.length; i++) {
            ((NewThread)tga[i]).mysuspend();
        }

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток исполнения прерван.");
        }

        System.out.println("Возобновление Группы А");

        for (int i = 0; i < tga.length; i++) {
            ((NewThread)tga[i]).myresume();
        }


        try {
            System.out.println("Ожидание зпвершения потоков исполнения.");
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        } catch (Exception e) {
            System.out.println("Исключение в главном потоке исполнения.");
        }
        System.out.println("Главный поток исполнения завершен.");

    }

}
