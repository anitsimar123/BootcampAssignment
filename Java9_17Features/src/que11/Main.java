package que11;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student("Mohit Chitkara",1001,19);
        Student s2=new Student("Manoj Bhandari",1002,20);
        System.out.println(s1.equals(s2));
        System.out.println(Student.count);
    }
}
