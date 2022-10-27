package Q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        SpecialStack s1 = new SpecialStack(10);

        s1.push(4);
        s1.push(63);
        s1.push(55);
        s1.push(41);
        s1.push(10);

        s1.display();
        System.out.println("Stack is full: "+s1.isFull());
        System.out.println("Get top element of Stack: "+s1.top());
        s1.pop();
        s1.pop();
        s1.display();
        System.out.println("Get mininum element of Stack: "+s1.getMin());

    }
}