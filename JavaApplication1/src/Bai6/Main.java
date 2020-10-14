/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.util.*;

/**
 *
 * @author NONAME
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập số nguyên dương n: ");
        int n = sc.nextInt();
        StackOfIntegers s = new StackOfIntegers();
        if (n == 0) {
            s.push(n);
            System.out.print(s.pop());
        }
        while (n > 0) {
            if (s.isFull() == false) {
                s.push(n % 2);
            } else {
                System.out.println("Stack Full.");
                break;
            }
            n /= 2;
        }
        while (s.isEmpty() == false) {
            System.out.print(s.pop());
        }
        System.out.println("");
    }

}
