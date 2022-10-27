package que3;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        IntStream.rangeClosed(1,5).forEach(e->System.out.print(e+" "));
        System.out.println();
        IntStream.range(1,5).forEach(e->System.out.print(e+" "));
    }

}
