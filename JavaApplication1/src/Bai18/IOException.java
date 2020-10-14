/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai18;

import java.util.*;
import java.util.regex.Pattern;

/**
 *
 * @author NONAME
 */
public class IOException {
    
    static boolean OK(MonHoc mh, ArrayList<Integer> list) {
        if (mh.getMaMon() >= 1000 && mh.getMaMon() <= 9999
                && !list.contains(mh.getMaMon())) {
            return true;
        }
        return false;
    }
    
    static boolean OK1(MonHoc mh) {
        if (mh.getTenMon().length() > 0 && mh.getTenMon() != null) {
            return true;
        }
        return false;
    }
    
    static boolean OK2(MonHoc mh) {
        if (Pattern.matches("(Cơ bản)|(Cơ sở ngành)|"
                + "(Chuyên ngành)|(Kỹ năng mềm)", mh.getNhomMon())) {
            return true;
        }
        return false;
    }
    
    static boolean OK3(MonHoc mh) {
        if (mh.getSoTinchi() > 0 && mh.getSoTinchi() < 7) {
            return true;
        }
        return false;
    }
    
    static void sapXepTC(ArrayList<MonHoc> list) {
        Collections.sort(list, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o2.getSoTinchi() - o1.getSoTinchi();
            }
        });
    }
    
    static void sapXep(ArrayList<MonHoc> list) {
        Collections.sort(list, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.getTenMon().substring(0).compareTo(o2.getTenMon().substring(0));
            }
        });
        Collections.sort(list, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o2.getNhomMon().substring(0).compareTo(o1.getNhomMon().substring(0));
            }
            
        });
    }
}
