package que4;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.iterate(1,i->i<=10,i->i*2)
                .forEach(System.out::println);
    }
}
