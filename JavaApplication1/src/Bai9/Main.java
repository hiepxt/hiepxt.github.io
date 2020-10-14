/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai9;

import java.util.*;

/**
 *
 * @author NONAME
 */
public class Main {

    static final char CHAR_55 = 55;
    static final char CHAR_48 = 48;
    static Scanner sc = new Scanner(System.in);

    static void convert(int n, int b) {
        if (n < 0 || b < 2 || b > 36) {
            System.out.println("");
        }
        StackOfChars soc = new StackOfChars();
        int m;
        int temp = n;
        while (temp > 0) {
            if (b > 0) {
                m = temp % b;
                if (m >= 10) {
                    if (soc.isFull() == false) {
                        soc.push((char) (CHAR_55 + m));
                    }
                } else {
                    soc.push((char) (CHAR_48 + m));
                }
            } else {
                soc.push((char) ((temp % b) + CHAR_48));
            }
            temp /= b;
        }
        while (soc.isEmpty() == false) {
            System.out.print(soc.pop());
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        System.out.println("Nhập số nguyên n: ");
        int n = sc.nextInt();
        System.out.println("Nhập hệ cơ số b: ");
        int b = sc.nextInt();
        System.out.println("Số " + n + " trong hệ cơ số " + b + " là:");
        convert(n, b);
    }
}
