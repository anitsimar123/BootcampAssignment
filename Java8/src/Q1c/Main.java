package Q1c;

public class Main {
    public static void main(String[] args) {
        FunctionalInterface functionalInterface = (s1,s2)->s1+s2;

        System.out.println(functionalInterface.concatenation("Amritpal","Singh"));
        System.out.println(functionalInterface.concatenation("Aarush","Goel"));

    }
}