package Q2;

public class Main {
    public static void main(String[] args) {
     Interface i1 = (new BasicOperation()::add);
     Interface i2 = (new BasicOperation()::subtract);
     Interface i3 = (BasicOperation::multiply);
        System.out.println("Add");
        System.out.println(i1.operation(12,34)+"\n");

        System.out.println("Subtract");
        System.out.println(i2.operation(45,6)+"\n");

        System.out.println("Multiply");
        System.out.println(i3.operation(3,56)+"\n");
    }
}
