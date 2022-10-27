package Q1d;

public class Main {
    public static void main(String[] args) {
        FunctionalInterface functionalInterface = s1->s1.toUpperCase();

        System.out.println(functionalInterface.concatenation("Amritpal"));
        System.out.println(functionalInterface.concatenation("Aarush"));

    }
}