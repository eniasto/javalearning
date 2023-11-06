package com.eniastoscode;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);
        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);

    }
}

// Stack uses LIFO >> The last one to be pushed is the first one to be
// popped. LAST IN FIRST OUT.
// peek looks at the top of the stack.ie the last one to be pushed.
// pop removes and return the top element.