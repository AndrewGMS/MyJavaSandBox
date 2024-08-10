public class FibonacciClassic {

    public record Book(String name, double price) { };
    public static void main(String[] args) {
        long n = 91 /*91*/, accumulatorOne = 0, accumulatorSecond = 1;
        long tt = System.currentTimeMillis();

        //       System.out.println(1 +  ". "+ accumulatorOne);
        //       System.out.println(2 +  ". "+ accumulatorSecond);
        //    accumulatorSecond++;
        for (long i = 3; i < n; i++) {
            //          System.out.println(i +  ". "+ (accumulatorOne + accumulatorSecond));
            long swapValue = accumulatorOne;
            accumulatorOne = accumulatorSecond;
            accumulatorSecond = accumulatorOne + swapValue;
        }
        System.out.println(n + ". " + (accumulatorOne + accumulatorSecond));
        System.out.println("Time - " + (System.currentTimeMillis() - tt) + "ms");
    }
}

