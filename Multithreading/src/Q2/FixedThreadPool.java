package Q2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService es= Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 6; i++) {
            String loopTask="LoopTask "+i;
            es.submit(()->{
                System.out.println("Starting "+loopTask);
                for (int j = 1; j <= 10; j++) {
                    System.out.println("Executing "+loopTask+" with "+Thread.currentThread().getName()+"===="+j);
                }
                System.out.println("Ending "+loopTask);
            });
        }
        es.shutdown();
    }
}
