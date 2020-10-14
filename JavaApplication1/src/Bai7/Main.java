/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

import java.util.*;

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
    
    static String fix(String s) {
        String s0 = s.replaceAll("\\s+", " ");
        return s0;
    }
    
    static String[] processString(String sMath) { // xu ly bieu thuc nhap vao thanh cac phan tu
        String s1 = "", elementMath[] = null;
        sMath = sMath.trim();
        sMath = sMath.replaceAll("\\s+", " ");
        for (int i = 0; i < sMath.length(); i++) {
            char c = sMath.charAt(i);
            if (!isOperator(c)) {
                s1 = s1 + c;
            } else {
                s1 = s1 + " " + c + " ";
            }
        }
        s1 = s1.trim();
        s1 = s1.replaceAll("\\s+", " ");
        elementMath = s1.split(" ");
        
        return elementMath;
    }
    
    static String[] postfix(String[] elementMath) {
        
        String s1 = "", E[];
        StackOfChars S = new StackOfChars();
        for (int i = 0; i < elementMath.length; i++) {
            char c = elementMath[i].charAt(0);
            
            if (!isOperator(c)) {
                s1 = s1 + " " + elementMath[i];
            } else {
                if (c == '(') {
                    S.push(elementMath[i].charAt(i));
                } else {
                    if (c == ')') {
                        char c1;
                        do {
                            c1 = S.peak();
                            if (c1 != '(') {
                                s1 = s1 + " " + S.peak();
                            }
                            S.pop();
                        } while (c1 != '(');
                    } else {
                        while (!S.isEmpty() && priority(S.peak()) >= priority(c)) {
                            
                            s1 = s1 + " " + S.peak();
                            S.pop();
                        }
                        S.push(elementMath[i].charAt(i));
                    }
                }
            }
        }
        while (!S.isEmpty()) {
            s1 = s1 + " " + S.peak();
            S.pop();
        }
        E = s1.split(" ");
        return E;
    }
    
    static String valueMath(String[] elementMath) {
        Stack<String> S = new Stack<>();
        for (int i = 1; i < elementMath.length; i++) {
            char c = elementMath[i].charAt(0);
            if (!isOperator(c)) {
                S.push(String.valueOf(c));
            } else {
                double num = 0f;
                double num1 = Double.parseDouble(S.pop());
                double num2 = Double.parseDouble(S.pop());
                switch (c) {
                    case '+':
                        num = num2 + num1;
                        break;
                    case '-':
                        num = num2 - num1;
                        break;
                    case '*':
                        num = num2 * num1;
                        break;
                    case '/':
                        num = num2 / num1;
                        break;
                    default:
                        break;
                }
                S.push(String.valueOf(num));
            }
        }
        return S.pop();
    }
    
    public static void main(String[] args) {
        StackOfChars th = new StackOfChars();
        StackOfChars tt = new StackOfChars();
        StackOfChars s3 = new StackOfChars();
        String s;
        s = sc.nextLine();
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!isOperator(c)) {
                th.push(c);
            }
        }
    }
}
