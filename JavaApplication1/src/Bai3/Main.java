/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.*;

/**
 *
 * @author NONAME
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    static void nhapTT(Rectange tt) {
        System.out.println("Nhập chiều rộng hình chữ nhật.");
        tt.setWidth(sc.nextDouble());
        System.out.println("Nhập chiều dài hình chữ nhật.");
        tt.setHeight(sc.nextDouble());
        sc.nextLine();
        System.out.println("Nhập màu sắc của hình chữ nhật.");
        tt.setColor(sc.nextLine());
    }

    static void hienThi(Rectange ht) {
        System.out.println("Diện tích hình chữ nhật là: " + ht.findArea());
        System.out.println("Chu vi hình chữ nhật là: " + ht.findPerimeter());
        System.out.println("Màu của hình chữ nhật là: " + ht.getColor());
    }

    public static void main(String[] args) {
        Rectange re = new Rectange();
        nhapTT(re);
        hienThi(re);
    }
}
