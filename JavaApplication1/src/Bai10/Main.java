/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai10;

import java.util.*;

/**
 *
 * @author NONAME
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MyPoint[] p = new MyPoint[100];
        System.out.println("Nhập số điểm n:");
        int n = sc.nextInt();
        int h = 0, k = 0;
        double x, y, max = 0;
        for (int i = 1; i <= n; i++) {
            p[i] = new MyPoint();
            System.out.println("Nhập điểm thứ " + i);
            System.out.println("Nhập x:");
            x = sc.nextDouble();
            p[i].setX(x);
            System.out.println("Nhập y:");
            y = sc.nextDouble();
            p[i].setY(y);
        }
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (p[i].distance(p[j]) > max) {
                    max = p[i].distance(p[j]);
                    h = i;
                    k = j;
                }
            }
        }
        System.out.println("Khoảng cách lớn nhất là: " + max + " giữa 2 điểm: " + "(" + h + "," + k + ")");
    }
}
