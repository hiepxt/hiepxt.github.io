/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai11;

import Bai10.MyPoint;
import java.util.*;

/**
 *
 * @author NONAME
 */
public class Main {

    static boolean check(MyPoint[] p) {
        double d1 = p[1].distance(p[2]);
        double d2 = p[2].distance(p[3]);
        double d3 = p[1].distance(p[3]);
        if (d1 + d2 > d3 || d1 + d3 > d2 || d2 + d3 > d1) {
            return true;
        }
        return false;
    }

    static int check1(MyPoint[] p) {
        double d1 = p[1].distance(p[2]);
        double d2 = p[2].distance(p[3]);
        double d3 = p[1].distance(p[3]);
        if (d1 * d1 + d2 * d2 == d3 * d3 || d1 * d1 + d3 * d3 == d2 * d2 || d2 * d2 + d3 * d3 == d1) {
            return 1;
        }
        if (d1 == d2 || d1 == d3 || d2 == d3) {
            return 2;
        }
        if (d1 == d2 && d2 == d3) {
            return 3;
        }
        return 0;
    }
    static Scanner sc = new Scanner(System.in);
    static MyPoint[] p = new MyPoint[4];

    public static void main(String[] args) {
        double x, y;
        for (int i = 1; i <= 3; i++) {
            p[i] = new MyPoint();
            System.out.println("Nhập điểm thứ " + i);
            System.out.println("Nhập x: ");
            x = sc.nextDouble();
            p[i].setX(x);
            System.out.println("Nhập y: ");
            y = sc.nextDouble();
            p[i].setX(y);
        }
        for (int i = 1; i < 3; i++) {
            for (int j = i + 1; j <= 3; j++) {
                if (check(p)) {
                    if (check1(p) == 1) {
                        System.out.println("3 đỉnh tạo thành tam giác vuông.");
                        break;
                    } else if (check1(p) == 2) {
                        System.out.println("3 đỉnh tạo thành tam giác cân.");
                        break;
                    } else if (check1(p) == 3) {
                        System.out.println("3 đỉnh tạo thành tam giác đều.");
                        break;
                    } else {
                        System.out.println("3 đỉnh tạo thành tam giác thường.");
                        break;
                    }
                } else {
                    System.out.println("3 đỉnh không tạo thành tam giác.");
                    break;
                }
            }
            break;
        }
    }
}
