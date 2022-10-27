package que11;

record Student(String name, int id, int age) {
    static int count = 0;

    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        count = count + 1;
    }

}
