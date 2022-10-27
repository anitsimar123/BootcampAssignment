package que1;

public interface intrfc {
        private static void privateMethod(){
            System.out.println("Private Method called");
        }
        public static void newMethod(){
            privateMethod();
            System.out.println("Method 1");
        }
        public static void anotherMethod(){
            privateMethod();
            System.out.println("Method 2");
        }
}
