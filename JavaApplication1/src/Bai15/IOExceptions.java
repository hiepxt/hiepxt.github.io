/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai15;

import java.util.*;
import java.util.regex.Pattern;

/**
 *
 * @author NONAME
 */
public class IOExceptions {

    static Scanner sc = new Scanner(System.in);

    static boolean OK(SinhVien s, ArrayList<Integer> list) {
        if (s.getMaSV() >= 1000 && s.getMaSV() <= 9999 && !list.contains(s.getMaSV())) {
            return true;
        }
        return false;
    }

    static boolean OK1(SinhVien s) {
        if (s.getDtb() >= 0.0 && s.getDtb() <= 10.0) {
            return true;
        }
        return false;
    }

    static boolean OK2(SinhVien s) {
        if (s.getTen().length() > 1 && s.getTen() != null) {
            return true;
        }
        return false;
    }

    static boolean OK3(SinhVien s) {
        if (Pattern.matches("[D|d]+\\d{2}+[Cc][Qq]+[CcVvDdPp][NnTt]+\\d{1,2}", s.getLop())) {
            return true;
        }
        return false;
    }

    static void sapXepDiem(ArrayList<SinhVien> list) {

        Collections.sort(list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return String.valueOf(o2.getDtb()).compareTo(String.valueOf(o1.getDtb()));
            }
        });
        Collections.sort(list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getLop().compareToIgnoreCase(o2.getLop());
            }
        });
    }

    static void sapXepTen(ArrayList<SinhVien> list) {
        Collections.sort(list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien s1, SinhVien s2) {
                return s1.getTen().substring(s1.getTen().lastIndexOf(" ")).
                        compareTo(s2.getTen().substring(s2.getTen().lastIndexOf(" ")));
            }
        });
    }
}
