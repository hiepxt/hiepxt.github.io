/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.util.*;

/**
 *
 * @author NONAME
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StackOfIntegers s = new StackOfIntegers();
        System.out.println("Nhập vào số nguyên dương n: ");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                n /= i;
                if (s.isFull() == false) {
                    s.push(i);
                } else {
                    System.out.println(" Stack Full.");
                    break;
                }
            }
        }
        while (s.isEmpty() == false) {
            System.out.print(s.pop() + " ");
        }
        System.out.println("");
    }
}
