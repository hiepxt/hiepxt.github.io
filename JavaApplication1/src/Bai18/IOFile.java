/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai18;

import static Bai18.IOException.OK;
import static Bai18.IOException.OK1;
import static Bai18.IOException.OK2;
import static Bai18.IOException.OK3;
import java.io.*;
import java.util.*;

/**
 *
 * @author NONAME
 */
public class IOFile {

    static ArrayList docMH() throws FileNotFoundException {
        ArrayList<MonHoc> list = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("M.INP"))) {
            while (sc.hasNextLine()) {
                MonHoc mh = new MonHoc();
                mh.setMaMon(Integer.parseInt(sc.nextLine()));
                mh.setTenMon(sc.nextLine());
                mh.setNhomMon(sc.nextLine());
                mh.setSoTinchi(Integer.parseInt(sc.nextLine()));
                if (OK(mh, temp) && OK1(mh) && OK2(mh) && OK3(mh)) {
                    list.add(mh);
                    temp.add(mh.getMaMon());
                }
            }
            //sc.close();
        } catch (Exception e) {
            System.out.println("Got an Exception!");
        }
        return list;
    }

    static void ghiMH(ArrayList<MonHoc> list) {
        try (PrintWriter pw = new PrintWriter(new File("SX.OUT"))) {
            for (MonHoc mh : list) {
                pw.print(mh.getMaMon() + " ");
                pw.print(mh.getTenMon() + " ");
                pw.print(mh.getNhomMon() + " ");
                pw.println(mh.getSoTinchi());
            }
        } catch (Exception e) {
            System.out.println("Got anException!");
        }
    }

    static void sapXepNM(ArrayList<MonHoc> list) {
        try (PrintWriter pw = new PrintWriter(new File("NHOM.OUT"))) {
            for (MonHoc mh : list) {
                pw.print(mh.getMaMon() + " ");
                pw.print(mh.getTenMon() + " ");
                pw.print(mh.getNhomMon() + " ");
                pw.println(mh.getSoTinchi());
            }
            //pw.close();
        } catch (Exception e) {
            System.out.println("Got anException!");
        }
    }
}
