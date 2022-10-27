package Q1b;

public class Main {
    public static void main(String[] args) {
        FunctionalInterface functionalInterface = (a)->a+1;

        System.out.println(functionalInterface.increment(10));
        System.out.println(functionalInterface.increment(-1));

    }
}