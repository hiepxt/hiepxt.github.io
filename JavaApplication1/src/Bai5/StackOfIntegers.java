/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

/**
 *
 * @author NONAME
 */
public class StackOfIntegers {

    private int max = 100;
    private int[] elements = new int[max];
    private int size;

    public StackOfIntegers() {
        this.size = size;
        this.max = 16;
        this.elements = new int[max];
    }

    public StackOfIntegers(int max) {
        this.size = 0;
        this.max = max;
        this.elements = new int[max];
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return (size == max);
    }

    public int peak() {
        return elements[size];
    }

    public void push(int value) {
        elements[++size] = value;
    }

    public int pop() {
        return elements[size--];
    }

    public int getSize() {
        return this.size;
    }
}
