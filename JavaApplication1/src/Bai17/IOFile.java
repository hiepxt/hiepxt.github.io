/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai17;

import static Bai17.IOExceptions.OK;
import static Bai17.IOExceptions.OK1;
import static Bai17.IOExceptions.OK2;
import static Bai17.IOExceptions.OK3;
import java.io.*;
import java.util.*;

/**
 *
 * @author NONAME
 */
public class IOFile {

    static ArrayList docS() {
        ArrayList<Sach> list = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("SACH.INP"))) {
            while (sc.hasNextLine()) {
                Sach s = new Sach();
                s.setMaSach(Integer.parseInt(sc.nextLine()));
                s.setTenSach(sc.nextLine());
                s.setChuyenNganh(sc.nextLine());
                s.setGiaBan(Double.parseDouble(sc.nextLine()));
                if (OK(s, temp) && OK1(s) && OK2(s) && OK3(s)) {
                    list.add(s);
                    temp.add(s.getMaSach());
                }
            }
        } catch (Exception e) {
            System.out.println("Got an Exception!");
        }
        return list;
    }

    static void ghiS(ArrayList<Sach> list) throws FileNotFoundException {
        try (PrintWriter pw = new PrintWriter(new File("SX.OUT"))) {
            for (Sach s : list) {
                pw.print(s.getMaSach() + " ");
                pw.print(s.getTenSach() + " ");
                pw.print(s.getChuyenNganh() + " ");
                pw.println(s.getGiaBan());
            }
        } catch (Exception e) {
            System.out.println("Got anException!");
        }
    }

    static void sapXepCN(ArrayList<Sach> list) {
        try (PrintWriter pw = new PrintWriter(new File("CN.OUT"))) {
            for (Sach s : list) {
                pw.print(s.getMaSach() + " ");
                pw.print(s.getTenSach() + " ");
                pw.print(s.getChuyenNganh() + " ");
                pw.println(s.getGiaBan());
            }
        } catch (Exception e) {
            System.out.println("Got anException!");
        }
    }
}
