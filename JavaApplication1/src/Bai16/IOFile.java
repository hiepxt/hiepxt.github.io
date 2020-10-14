/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai16;

import static Bai16.IOExceptions.OK;
import static Bai16.IOExceptions.OK1;
import static Bai16.IOExceptions.OK2;
import static Bai16.IOExceptions.OK3;
import java.io.*;
import java.util.*;

/**
 *
 * @author NONAME
 */
public class IOFile {

    static ArrayList docMH() throws FileNotFoundException {
        ArrayList<MatHang> list = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("MH.INP"))) {
            while (sc.hasNextLine()) {
                MatHang mh = new MatHang();
                mh.setMaHang(Integer.parseInt(sc.nextLine()));
                mh.setTen(sc.nextLine());
                mh.setNhom(sc.nextLine());
                mh.setGiaBan(Double.parseDouble(sc.nextLine()));
                if (OK(mh, temp) && OK1(mh) && OK2(mh) && OK3(mh)) {
                    list.add(mh);
                    temp.add(mh.getMaHang());
                }
            }
        } catch (Exception e) {
            System.out.println("Got an Exception!");
        }
        return list;
    }

    static void ghiMH(ArrayList<MatHang> list) {
        try (PrintWriter pw = new PrintWriter(new File("SX.OUT"))) {
            for (MatHang mh : list) {
                pw.print(mh.getMaHang() + " ");
                pw.print(mh.getTen() + " ");
                pw.print(mh.getNhom() + " ");
                pw.println(mh.getGiaBan());
            }
        } catch (Exception e) {
            System.out.println("Got an Exception!");
        }
    }

    static void sapXepGB(ArrayList<MatHang> list) {
        try (PrintWriter pw = new PrintWriter(new File("NHOM.OUT"))) {
            for (MatHang mh : list) {
                pw.print(mh.getMaHang() + " ");
                pw.print(mh.getTen() + " ");
                pw.print(mh.getNhom() + " ");
                pw.println(mh.getGiaBan());
            }
        } catch (Exception e) {
            System.out.println("Got an Exception!");
        }
    }
}
