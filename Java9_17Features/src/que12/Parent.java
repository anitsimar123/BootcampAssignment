package que12;

sealed class Parent permits Child1, Child2 {
    public Parent() {
        System.out.println("Parent Sealed Class");
    }
}
