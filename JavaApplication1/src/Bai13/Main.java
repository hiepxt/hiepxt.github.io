/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai13;

import java.util.*;

/**
 *
 * @author NONAME
 */
public class Main {

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        PhanSo p = new PhanSo();
        PhanSo a = new PhanSo();
        PhanSo b = new PhanSo();
        System.out.println("Nhập phân số thứ 1:");
        a.nhap();
        System.out.println("Nhập phân số thứ 2:");
        b.nhap();
        System.out.println("");
        System.out.print("Tổng 2 phân số là: ");
        p = a.cong(b);
        p.hien();
        System.out.print("Hiệu 2 phân số là: ");
        p = a.tru(b);
        if (a.tru(b).getTs() == 0) {
            System.out.println("0");
        } else {
            p.hien();
        }
        System.out.print("Tích 2 phân số là: ");
        p = a.nhan(b);
        p.hien();
        System.out.print("Thương 2 phân số là: ");
        p = a.chia(b);
        p.hien();
        System.out.print("Phân số thứ 1 đa được rút gọn là: ");
        p = a.toiGian();
        p.hien();
        System.out.print("Phân số thứ 2 đa được rút gọn là: ");
        p = b.toiGian();
        p.hien();
        if (a.bangNhau(b)) {
            System.out.print("Hai phân số bằng nhau.");
        }
        if (a.lonHon(b)) {
            System.out.print("Phân số thứ 1 lớn hơn phân số thứ 2.");
        }
        if (a.nhoHon(b)) {
            System.out.print("Phân số thứ 1 nhỏ hơn phân số thứ 2.");
        }
        System.out.println("");
    }
}
