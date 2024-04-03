class Cache {
    private static int sum = 0;

    static {
        System.out.println("5 - static" + sum);
        initializeIfNecessary();
    }

    public static int getSum() {
        System.out.println("10 - getsum" + sum);
        initializeIfNecessary();
        return sum;
    }

    private static boolean initialized = false;

    private static synchronized void initializeIfNecessary() {
        if (!initialized) {
            for (int i = 0; i < 5; i++)
                sum += i;
            initialized = true;
        }
    }
}

class Client {
    public static void main(String[] args) {
        System.out.println("25 - main - ");

        System.out.println(Cache.getSum());
    }
}