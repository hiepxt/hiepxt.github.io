/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.*;

/**
 *
 * @author NONAME
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Nhập số nguyên dương n: ");
        int n = sc.nextInt();
        StackOfIntegers s = new StackOfIntegers();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                if (s.isFull() == false) {
                    s.push(i);
                } else {
                    System.out.println("Stack Full");
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
