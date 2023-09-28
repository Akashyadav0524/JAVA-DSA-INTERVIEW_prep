package stacks;
//Stacks foloows LIFO proincipal exampl- stacks of plates
//Push-->insert
//pop-->remove

import java.util.ArrayDeque;
import java.util.Deque;

// implememtaion of stack is diffrent then array thats why we cant say thi is an array
// we cant acess the elemt with indeces in stacks
// when we use stacks and ques when we need to store our answer for future 
// we mostly use stacks and ques in tree graphs traversal 
// COMPLEXITY ANALYSIS
// O(n)

import java.util.Stack;

public class InBuiltExample {
    public static void main(String[] args) {
        Stack<Integer>  stack = new Stack<>();
        stack.push(23);
        stack.push(3);
        stack.push(93);
        stack.push(53);
        stack.push(27);
        stack.push(47);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        //DEQUEUE -- you can insert & delete queue in both side
        //faster then ll implementation nulls elemets are not allowed in it
        //it has no capacity restriction either
        Deque<Integer> deque =new ArrayDeque<>();
        deque.add(45);
        deque.addFirst(23);
      
    }

}
