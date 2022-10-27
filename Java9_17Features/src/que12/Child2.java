package que12;

sealed class Child2 extends Parent permits GrandChild1 {
    public Child2() {
        System.out.println("Child2 Class");
    }
}
