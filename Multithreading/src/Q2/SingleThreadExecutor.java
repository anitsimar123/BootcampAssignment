package Q2;


import java.util.concurrent.*;
import java.util.stream.IntStream;

public class SingleThreadExecutor {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<?> submit = executorService.submit(() -> {
            IntStream.rangeClosed(1, 10).forEach(System.out::println);
        });

        executorService.shutdown();
    }

}
