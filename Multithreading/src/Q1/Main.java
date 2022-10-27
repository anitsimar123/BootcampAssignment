package Q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
     ThreadImplement threadImplement = new ThreadImplement();
     RunnableImplement runnableImplement = new RunnableImplement();


//        Thread thread = new Thread(runnableImplement);
//        thread.start();
//
//        System.out.println("Thread created using Runnable");
//        thread.join();
//        System.out.println("Second Thread created using Thread class");
//        threadImplement.start();


        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        for(Integer l: list){
            l=l+10;
            System.out.println(l);
        }
    }
}