/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai15;

import static Bai15.IOExceptions.OK;
import static Bai15.IOExceptions.OK1;
import static Bai15.IOExceptions.OK2;
import static Bai15.IOExceptions.OK3;
import java.io.*;
import java.util.*;

/**
 *
 * @author NONAME
 */
public class IOFile {

    static ArrayList docSV() throws FileNotFoundException {
        ArrayList<SinhVien> list = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("SV.INP"))) {
            while (sc.hasNextLine()) {
                SinhVien s = new SinhVien();
                s.setMaSV(Integer.parseInt(sc.nextLine()));
                s.setTen(sc.nextLine());
                s.setLop(sc.nextLine());
                s.setDtb(Double.parseDouble(sc.nextLine()));
                if (OK(s, temp) && OK1(s) && OK2(s) && OK3(s)) {
                    list.add(s);
                    temp.add(s.getMaSV());
                }
            }
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
        return list;
    }

    static void ghiSV(ArrayList<SinhVien> list) {
        try (PrintWriter pw = new PrintWriter(new File("SX.OUT"))) {
            for (SinhVien sv : list) {
                pw.print(sv.getMaSV() + " ");
                pw.print(sv.getTen() + " ");
                pw.print(sv.getLop() + " ");
                pw.println(sv.getDtb());

            }
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }

    static void xepLoai(ArrayList<SinhVien> list) {
        try (PrintWriter pw = new PrintWriter(new File("XEPLOAI.OUT"))) {
            for (SinhVien sv : list) {
                if (sv.getDtb() >= 8) {
                    pw.print(sv.getMaSV() + " ");
                    pw.print(sv.getTen() + " ");
                    pw.print(sv.getLop() + " ");
                    pw.print(sv.getDtb() + " ");
                    pw.println("học lực Giỏi");
                }
                if (sv.getDtb() >= 7 && sv.getDtb() < 8) {
                    pw.print(sv.getMaSV() + " ");
                    pw.print(sv.getTen() + " ");
                    pw.print(sv.getLop() + " ");
                    pw.print(sv.getDtb() + " ");
                    pw.println("học lực Khá");
                }
                if (sv.getDtb() >= 5 && sv.getDtb() < 7) {
                    pw.print(sv.getMaSV() + " ");
                    pw.print(sv.getTen() + " ");
                    pw.print(sv.getLop() + " ");
                    pw.print(sv.getDtb() + " ");
                    pw.println("học lực Trung Bình");
                }
                if (sv.getDtb() < 5) {
                    pw.print(sv.getMaSV() + " ");
                    pw.print(sv.getTen() + " ");
                    pw.print(sv.getLop() + " ");
                    pw.print(sv.getDtb() + " ");
                    pw.println("học lực Yếu");
                }
            }
        } catch (Exception e) {
            System.out.println("Got an Exception");
        }
    }
}
