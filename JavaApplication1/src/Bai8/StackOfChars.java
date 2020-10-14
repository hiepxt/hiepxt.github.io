/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai8;

/**
 *
 * @author NONAME
 */
public class StackOfChars {

    private int max;
    private char[] elements = new char[max];
    private int size;

    public StackOfChars() {
        this.size = 0;
        this.max = 16;
        this.elements = new char[max];
    }

    public StackOfChars(int max) {
        this.size = 0;
        this.max = max;
        this.elements = new char[max];
    }

    public boolean isFull() {
        return this.size == this.max;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void push(char ch) {
        this.elements[++size] = ch;
    }

    public char peak() {
        return this.elements[size];
    }

    public char pop() {
        return this.elements[size--];
    }

    public int getSize() {
        return this.size;
    }
}
