package Q5ReentrantLock;


import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    public static void main(String[] args) {

        ReentrantLock re = new ReentrantLock();
        // t1 tries to lock resource1 then resource2
        Thread t1 = new Thread() {
            public void run() {

                re.lock();
                System.out.println("Thread 1: locked resource 1");

                try { Thread.sleep(100);}
                catch (Exception e) {

                }

                re.lock();
                System.out.println("Thread 1: locked resource 2");
                re.unlock();
                re.unlock();
            }
        };

        // t2 tries to lock resource2 then resource1
        Thread t2 = new Thread() {
            public void run() {
                re.lock();
                System.out.println("Thread 2: locked resource 2");

                try { Thread.sleep(100);} catch (Exception e) {}

                re.lock();
                System.out.println("Thread 2: locked resource 1");
                re.unlock();
                re.unlock();
            }
        };


        t1.start();
        t2.start();
    }
}
