/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import Bai1.SinhVien;
import Bai1.Main;
import java.util.*;

/**
 *
 * @author NONAME
 */
public class Main2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int so, n = 0;
        String s = "";
        ArrayList<String> arr = new ArrayList();
        SinhVien[] sv = null;
        do {
            System.out.println("Mời bạn lựa chọn: ");
            System.out.println("1. Nhập trông tin sinh viên. \n"
                    + "2. In toàn bộ danh sách ra màn hình. \n"
                    + "3. Sắp xếp danh sách theo tên sinh viên. \n"
                    + "4. In danh sách sinh viên theo lớp. \n");
            so = sc.nextInt();
            switch (so) {
                case 1:
                    System.out.println("Nhập số lượng sinh viên: ");
                    n = sc.nextInt();
                    sv = new SinhVien[n];
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập thông tin sinh viên thứ " + (i + 1));
                        sv[i] = new SinhVien();
                        nhapTT(sv[i]);
                        sc.nextLine();
                        arr.add(sv[i].getName());
                    }
                    break;
                case 2:
                    System.out.printf("%-20s %-20s %-20s %-5s \n", "Ma sinh vien", "Ten sinh vien", "Lop", "Khoa");
                    for (int i = 0; i < n; i++) {
                        sv[i].hienThi();
                    }
                    break;
                case 3:
                    System.out.println("a. Sắp xếp tăng dần. \n"
                            + "b. Sắp xếp giảm dần. \n");
                    sc.nextLine();
                    s = sc.nextLine();
                    switch (s) {
                        case "a":
                            SinhVien temp;
                            System.out.printf("%-20s %-20s %-20s %-5s \n", "Ma sinh vien", "Ten sinh vien", "Lop", "Khoa");
                            for (int i = 0; i < n - 1; i++) {
                                for (int j = i + 1; j < n; j++) {
                                    if (sv[i].getName().compareTo(sv[j].getName()) > 0) {
                                        temp = sv[i];
                                        sv[i] = sv[j];
                                        sv[j] = temp;
                                    }
                                }
                            }
                            for (int i = 0; i < n; i++) {
                                sv[i].hienThi();
                            }
                            break;
                        case "b":
                            SinhVien temp1;
                            System.out.printf("%-20s %-20s %-20s %-5s \n", "Ma sinh vien", "Ten sinh vien", "Lop", "Khoa");
                            for (int i = 0; i < n - 1; i++) {
                                for (int j = i + 1; j < n; j++) {
                                    if (sv[i].getName().compareTo(sv[j].getName()) < 0) {
                                        temp1 = sv[i];
                                        sv[i] = sv[j];
                                        sv[j] = temp1;
                                    }
                                }
                            }
                            for (int i = 0; i < n; i++) {
                                sv[i].hienThi();
                            }
                            break;
                    }
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Nhập tên lớp cần hiển thị sinh viên: ");
                    String search = sc.nextLine();
                    System.out.println("Danh sách sinh viên lớp " + search);
                    System.out.printf("%-20s %-20s %-20s %-5s \n", "Ma sinh vien", "Ten sinh vien", "Lop", "Khoa");
                    int i = 0;
                    while (i < n) {
                        if (search.equalsIgnoreCase(sv[i].getLop())) {
                            sv[i].hienThi();
                        }
                        i++;
                    }
            }
        } while (true);
    }

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
}
