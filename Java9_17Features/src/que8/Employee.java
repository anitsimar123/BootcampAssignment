package que8;

class Employee implements AutoCloseable {

    public void display() {
        System.out.println("Displaying Employee");
    }

    @Override
    public void close() throws Exception {
        System.out.println("In Close Method");
    }
}
