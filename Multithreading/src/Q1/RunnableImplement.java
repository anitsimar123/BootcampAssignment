package Q1;

import java.util.stream.IntStream;

public class RunnableImplement implements Runnable{

    @Override
    public void run() {
        IntStream.rangeClosed(1,10).forEach(System.out::println);

        try {
            System.out.println("Sleeping");
            Thread.sleep(10000);
            System.out.println("Awake");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
