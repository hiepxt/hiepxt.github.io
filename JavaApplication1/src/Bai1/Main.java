/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.*;

/**
 *
 * @author NONAME
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    static void nhapTT(SinhVien tt) {
        System.out.println("Nhap ma sinh vien: ");
        tt.setID(sc.nextLine());
        System.out.println("Nhap ten sinh vien: ");
        tt.setName(sc.nextLine());
        System.out.println("Nhap lop cua sinh vien: ");
        tt.setLop(sc.nextLine());
        System.out.println("Nhap khoa hoc: ");
        tt.setKhoa(sc.nextInt());
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        nhapTT(sv);
        System.out.printf("%-20s %-20s %-20s %-5s \n", "Ma sinh vien", "Ten sinh vien", "Lop", "Khoa");
        sv.hienThi();
    }
}
