package Q3;


import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class SpecialStack {
    int[] stack;
    int topOfStack;
    
    SpecialStack(int capacity){
        stack = new int[capacity];
        topOfStack=-1;
    }

    void display(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = topOfStack; i >= 0; i--) {
            stringBuilder.append(stack[i] + " ");
        }
        String finalOutput = stringBuilder.toString().trim().concat("]");
        System.out.println(finalOutput);
    }

    OptionalInt getMin(){
        return(Arrays.stream(stack).filter(i->i>0).min());

    }
    boolean isEmpty(){
        boolean flag;
    if(topOfStack==-1){
        flag=true;
    }
    else{
         flag=false;
        }
    return flag;
    }

    boolean isFull(){

        boolean flag;
        if(topOfStack==stack.length-1){
            flag=true;
        }
        else{
            flag=false;
        }
        return flag;

    }

    int size(){
      return topOfStack+1;
    }
    int pop(){
        int x = 0;
        if(topOfStack==-1){
            System.out.println("Stack Underflow");
        }
        else{
            x=stack[topOfStack];
            stack[topOfStack]=0;
            topOfStack--;
        }
       return x;
    }

    void push(int x){
     if(topOfStack==stack.length-1){
         System.out.println("Stack Overflow");
     }
     else{
         topOfStack++;
         stack[topOfStack]=x;
     }
    }

    int top(){
        int x = 0;
        if(topOfStack==-1){
            System.out.println("Stack Underflow");
        }
        else{
            x=stack[topOfStack];
        }
        return x;
    }
}
