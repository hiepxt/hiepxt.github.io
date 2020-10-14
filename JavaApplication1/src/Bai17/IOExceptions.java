/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai17;

import java.util.*;
import java.util.regex.Pattern;

/**
 *
 * @author NONAME
 */
public class IOExceptions {
    
    static boolean OK(Sach s, ArrayList<Integer> list) {
        if (s.getMaSach() >= 1000 && s.getMaSach() <= 9999 && !list.contains(s.getMaSach())) {
            return true;
        }
        return false;
    }
    
    static boolean OK1(Sach s) {
        if (s.getTenSach().length() > 0 && s.getTenSach() != null) {
            return true;
        }
        return false;
    }
    
    static boolean OK2(Sach s) {
        if (s.getChuyenNganh() != null) {
            return true;
        }
        return false;
    }
    
    static boolean OK3(Sach s) {
        if (s.getGiaBan() > 0) {
            return true;
        }
        return false;
    }
    
    static void sapXepGia(ArrayList<Sach> list) {
        Collections.sort(list, new Comparator<Sach>() {
            @Override
            public int compare(Sach s1, Sach s2) {
                return (int) (s2.getGiaBan() - s1.getGiaBan());
            }
            
        });
    }
    
    static void sapXep(ArrayList<Sach> list) {
        Collections.sort(list, new Comparator<Sach>() {
            @Override
            public int compare(Sach o1, Sach o2) {
                return o1.getTenSach().substring(0).
                        compareTo(o2.getTenSach().substring(0));
            }
        });
        Collections.sort(list, new Comparator<Sach>() {
            @Override
            public int compare(Sach o1, Sach o2) {
                return o2.getChuyenNganh().compareTo(o1.getChuyenNganh());
            }
            
        });
    }
}
