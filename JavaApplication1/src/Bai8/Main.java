/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai8;

import java.util.Scanner;

/**
 *
 * @author NONAME
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    static int priority(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } else if (ch == '*' || ch == '/') {
            return 2;
        }
        return 0;
    }

    static boolean isOperator(char s) {
        if (s == '+' || s == '-' || s == '*' || s == '/') {
            return true;
        }
        return false;
    }

    public static boolean toanHang(char s) {
        int n = (int) s;
        if ((n >= 48 && n <= 57) || (n >= 65 && n <= 90) || (n >= 97 && n <= 122)) {
            return true;
        }
        return false;
    }

    public static boolean phepToan(char s) {
        if (s == '+' || s == '-' || s == '*' || s == '/') {
            return true;
        }
        return false;
    }

    static String fix(String s) {
        String s0 = s.replaceAll("\\s+", " ");
        return s0;
    }

    public static void main(String[] args) {
        StackOfChars th = new StackOfChars();
        StackOfChars ss = new StackOfChars();
        StringBuilder sb = new StringBuilder();
        System.out.println("Nhap bieu thuc: ");
        String s = sc.nextLine();
        int n = fix(s).length();
        char[] bt = fix(s).toCharArray();
        for (int i = 0; i < n; i++) {
            char c = bt[i];
            if (toanHang(c)) {
                sb.append(c).append(" ");
                th.push(c);
            }
            if (c == '(') {
                ss.push(c);
            }
            if (phepToan(c)) {
                if (ss.isEmpty() == false || ss.peak() == '(') {
                    ss.push(c);
                } else {
                    if (priority(c) > priority(ss.peak())) {
                        ss.push(c);
                    } else if (priority(c) == priority(ss.peak())) {
                        char c1 = ss.pop();
                        sb.append(c1).append(" ");
                        th.push(c1);
                        ss.push(c);
                    }
                    if (priority(c) < priority(ss.peak())) {
                        while (s.isEmpty() != true && ss.peak() != '(') {
                            char c1 = ss.pop();
                            sb.append(c1).append(" ");
                            th.push(c1);
                        }
                        ss.push(c);
                    }
                }
            }
            if (c == ')') {
                char c1;
                do {
                    c1 = ss.pop();
                    if (c1 != '(') {
                        sb.append(c1).append(" ");
                        th.push(c1);
                    }
                } while (c1 != '(');

            }
        }
        while (ss.isEmpty() == false) {
            char c1 = ss.pop();
            sb.append(c1).append(" ");
            th.push(c1);
        }
        System.out.println(sb);
    }
}
