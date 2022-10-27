package que5;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //ifpresentorelse
        Optional.of(239324).ifPresentOrElse((e)->{System.out.println("Value is present");}
                ,()->{System.out.println("Not Present");});

        //orelsethrow
        Stream.of(1,2,3,4,5,6,7,8).filter(e->e>8).findFirst().orElseThrow();
        }
}
