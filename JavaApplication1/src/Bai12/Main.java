/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai12;

import java.util.Scanner;

/**
 *
 * @author NONAME
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        Matrix a = new Matrix();
        Matrix b = new Matrix();
        Matrix kq1 = new Matrix();
        Matrix kq2 = new Matrix();
        System.out.println("------------------------Menu--------------------------");
        System.out.println("1. Tính tổng hiệu của 2 ma trận");
        System.out.println("2. Tính tích của 2 ma trận");
        System.out.println("3. Tìm chuyển vị của 1 ma trận");
        System.out.println("4. Kết thúc chương trình");
        n = in.nextInt();

        switch (n) {
            case 1:
                System.out.println("Nhập ma trận thứ 1");
                a.input();
                System.out.println("Nhập ma trận thứ 2");
                b.input();
                System.out.println("Tổng của 2 ma trận là: ");
                kq1 = a.add(b);
                if (kq1 != null) {
                    kq1.print();
                }
                System.out.println("Hiệu của 2 ma trận là: ");
                kq2 = a.sub(b);
                if (kq2 != null) {
                    kq2.print();
                }
                break;

            case 2:
                System.out.println("Nhập ma trận thứ 1");
                a.input();
                System.out.println("Nhập ma trận thứ 2");
                b.input();
                System.out.println("Tính tích của 2 ma trận là: ");
                kq1 = a.mul(b);
                if (kq1 != null) {
                    kq1.print();
                }
                break;

            case 3:
                System.out.println("Nhập ma trận cần chuyển vị: ");
                a.input();
                System.out.println("Ma trận chuyển vị là: ");
                kq1 = a.transpose();
                kq1.print();
                break;
            case 4:
                System.out.println("Kết thúc chương trình");
                break;

            default:
                break;
        }
    }
}
