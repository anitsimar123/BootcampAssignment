package Q3;

public class Main {
    public static void main(String[] args) {
        Runnable r = ()->{
            for(int i=0;i<5;i++){
                System.out.println("Child Thread: "+i);
            }
        };
        Thread t1 = new Thread(r);
        t1.start();

        for(int i=0;i<5;i++){
            System.out.println("Main Thread: "+i);
        }
    }
}
