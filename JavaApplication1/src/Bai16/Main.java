/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai16;

import static Bai16.IOExceptions.sapXep;
import static Bai16.IOExceptions.sapXepGiaBan;
import static Bai16.IOFile.docMH;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author NONAME
 */
public class Main {
    
    private static IOFile file;
    
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<MatHang> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (Object mh : docMH()) {
            sb.append(mh);
        }
        System.out.println(sb);
        list = file.docMH();
        sapXepGiaBan(list);
        file.ghiMH(list);
        sapXep(list);
        file.sapXepGB(list);
    }
}
