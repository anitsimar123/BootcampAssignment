package Q4;

import java.util.Random;
import java.util.concurrent.Callable;

public class ImplementCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Random randObj = new Random();

        Integer randNo = randObj.nextInt(10);

        return randNo;
    }
}
