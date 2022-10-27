package que2;


import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("1:");
        IntStream.range(1,10).takeWhile(x->x<7).forEach(e->System.out.printf(e+" "));

        System.out.println("\n2:");
        IntStream.range(10,1).takeWhile(x->x<7).forEach(e->System.out.printf(e+" "));

        System.out.println("\n3:");
        IntStream.range(1,10).dropWhile(x->x<7).forEach(e->System.out.printf(e+" "));

        System.out.println("\n4:");
        IntStream.range(10,1).dropWhile(x->x<7).forEach(e->System.out.printf(e+" "));
    }
}
