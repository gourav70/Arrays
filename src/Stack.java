/* A Java Program to show implementation of Stack 
using ArrayDeque */

import java.util.*; 

class Stack { 
    public static void main (String[] args) {
        // Stack<Integer> stack = new Stack<>(); 
        ArrayDeque<Integer> stack = new ArrayDeque<>(); 
        stack.push(10); 
        stack.push(20); 
        stack.push(30); 
        System.out.println(stack.peek()); 
        System.out.println(stack.pop()); 
        System.out.println(stack.peek()); 
    } 
} 
