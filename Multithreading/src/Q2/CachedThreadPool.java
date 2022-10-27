package Q2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        // Cast the object to its class type
        ThreadPoolExecutor pool = (ThreadPoolExecutor) executor;

        //Stats before tasks execution
        System.out.println("Largest executions: "
                + pool.getLargestPoolSize());
        System.out.println("Maximum allowed threads: "
                + pool.getMaximumPoolSize());
        System.out.println("Current threads in pool: "
                + pool.getPoolSize());
        System.out.println("Currently executing threads: "
                + pool.getActiveCount());
        System.out.println("Total number of threads(ever scheduled): "
                + pool.getTaskCount());

        executor.submit(()->{
            Long duration = (long) (Math.random() * 5);
            System.out.println("Running Task! Thread Name: " +
                    Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(duration);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task Completed! Thread Name: " +
                    Thread.currentThread().getName());
        });

        executor.submit(()->{
            Long duration = (long) (Math.random() * 5);
            System.out.println("Running Task! Thread Name: " +
                    Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(duration);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task Completed! Thread Name: " +
                    Thread.currentThread().getName());
        });
    }
}
