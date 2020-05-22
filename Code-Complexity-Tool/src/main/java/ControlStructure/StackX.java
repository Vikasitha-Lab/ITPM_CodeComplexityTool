package ControlStructure;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class StackX {
    private int maxSize;  
    private int top;      
    private char[] stackArray;

    public StackX(int s) {
        super();
        maxSize = s;   
        top = -1;   
        stackArray = new char[maxSize];
    }

    public void push(char value) {
        if (top != maxSize - 1) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack is Full");
        }
    }

    public char pop() {
        if (top != -1) {
            return stackArray[top--];
        } else {
            return 'a';
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
