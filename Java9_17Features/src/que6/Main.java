package que6;

import java.util.stream.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        IntStream.rangeClosed(1, 10).filter(e -> e > 7).findFirst().stream().mapMulti((s, c) -> c.accept(s * 4)).forEach(e -> System.out.print(e + " "));

    }
}
