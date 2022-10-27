package que8;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Main method");

        Employee e1 = new Employee();
        Employee e2 =new Employee();
        try(e1;e2){
            e1.display();
            e2.display();
        }
    }
}
