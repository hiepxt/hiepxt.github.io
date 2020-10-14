/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai16;

import java.util.*;
import java.util.regex.Pattern;

/**
 *
 * @author NONAME
 */
public class IOExceptions {

    static boolean OK(MatHang mh, ArrayList<Integer> list) {
        if (mh.getMaHang() >= 1000 && mh.getMaHang() <= 9999 && !list.contains(mh.getMaHang())) {
            return true;
        }
        return false;
    }

    static boolean OK1(MatHang mh) {
        if (String.valueOf(mh.getTen()).length() > 0 && mh.getTen() != null) {
            return true;
        }
        return false;
    }

    static boolean OK2(MatHang mh) {
        if (mh.getGiaBan() > 0) {
            return true;
        }
        return false;
    }

    static boolean OK3(MatHang mh) {
        if (Pattern.matches("(Điện tử - điện lạnh)|(Hàng thời trang)|(Hàng tiêu dùng)", mh.getNhom())) {
            return true;
        }
        return false;
    }

    static void sapXepGiaBan(ArrayList<MatHang> list) {
        Collections.sort(list, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang m1, MatHang m2) {
                return (int) (m2.getGiaBan() - m1.getGiaBan());
            }
        });
    }

    static void sapXep(ArrayList<MatHang> list) {
        Collections.sort(list, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang m1, MatHang m2) {
                return m1.getTen().substring(0).compareToIgnoreCase(m2.getTen().substring(0));
            }
        });
        Collections.sort(list, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang m1, MatHang m2) {
                return m2.getNhom().compareTo(m1.getNhom());
            }

        });
    }
}
