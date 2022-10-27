package Q5;

import java.util.function.IntPredicate;

public class Main {

    void m1(){
        System.out.println("m1hello");
    }
        public static void main(String[] args) {
            Interf1 interf1 = new Main()::m1;

        }
    }
