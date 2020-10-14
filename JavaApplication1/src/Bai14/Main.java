/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai14;

import java.util.*;

/**
 *
 * @author NONAME
 */
public class Main {

    public static void main(String[] args) {
        SoPhuc a = new SoPhuc();
        SoPhuc b = new SoPhuc();
        System.out.println("Nhập vào số phức thứ 1: ");
        a.nhap();
        System.out.println("Nhập vào số phức thứ 2: ");
        b.nhap();
        System.out.print("Tổng 2 số phức là: ");
        a.cong(b).hien();
        System.out.print("Hiệu 2 số phức là: ");
        a.tru(b).hien();
        System.out.print("Tích 2 số phức là: ");
        a.nhan(b).hien();
        System.out.print("Thương 2 số phức là: ");
        a.chia(b).hien();
        System.out.print("Nghịch đảo số phức thứ 1: ");
        a.nghichDao().hien();
        System.out.print("Nghịch đảo số phức thứ 2: ");
        b.nghichDao().hien();
        if (a.bangNhau(b)) {
            System.out.print("Hai số phức bằng nhau.");
        }
        if (a.lonhon(b)) {
            System.out.print("Modul của số phức thứ 1 lớn hơn số phức thứ 2.");
        }
        if (a.nhohon(b)) {
            System.out.print("Modul của số phức thứ 2 lớn hơn số phức thứ 1.");
        }
        System.out.println("");
    }
}
