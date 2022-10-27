package Q4a;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,24,33,45,68,89,210,99);
        l1=l1.stream().filter(i->i%2==0).collect(Collectors.toList());

        for(Integer i: l1){
            System.out.println(i);
        }
    }
}
