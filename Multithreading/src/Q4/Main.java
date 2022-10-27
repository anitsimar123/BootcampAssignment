package Q4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {

        ImplementRunnable runnable = new ImplementRunnable();

        Thread thread1 = new Thread(runnable);
        thread1.start();


        ImplementCallable callable = new ImplementCallable();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(callable);

            System.out.println(future.get());


        executorService.shutdown();
    }
}
