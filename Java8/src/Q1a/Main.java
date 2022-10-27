package Q1a;

public class Main {
    public static void main(String[] args) {
        FunctionalInterface functionalInterface = (a,b)->a>b?true:false;

        System.out.println(functionalInterface.operation(13,5));
        System.out.println(functionalInterface.operation(5,67));

    }
}