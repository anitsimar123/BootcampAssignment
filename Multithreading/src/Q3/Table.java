package Q3;

import java.util.stream.IntStream;

public class Table {
synchronized public void table(int number){
    System.out.println("Print table of "+ number+" using syncronized method");
    IntStream.rangeClosed(1,10).map(i->i*number).forEach(System.out::println);
}

public void counting(){
    synchronized (this){
        System.out.println("Counting from 1 to 10 inside synchronized block");
        IntStream.rangeClosed(1,10).forEach(System.out::println);
    }
}
}
