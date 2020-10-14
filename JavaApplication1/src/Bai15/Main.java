/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai15;

import static Bai15.IOExceptions.sapXepDiem;
import static Bai15.IOExceptions.sapXepTen;
import static Bai15.IOFile.docSV;
import java.util.*;
import java.io.*;

/**
 *
 * @author NONAME
 */
public class Main {

   
    private static IOFile files;

    public static void main(String[] args) throws IOException {
        ArrayList<SinhVien> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (Object sv : docSV()) {
            sb.append(sv);
        }
        System.out.println(sb.toString());

        list = files.docSV();

        sapXepDiem(list);

        files.ghiSV(list);

        sapXepTen(list);

        files.xepLoai(list);
    }
}
