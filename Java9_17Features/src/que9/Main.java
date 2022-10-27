package que9;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.asList(1,2,3,4,5,6,7,8,9).stream()
                .filter(e->e%2==0).collect(Collectors.toUnmodifiableList()));
    }
}
