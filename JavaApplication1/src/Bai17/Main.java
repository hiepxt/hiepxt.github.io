/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai17;

import static Bai17.IOExceptions.sapXep;
import static Bai17.IOExceptions.sapXepGia;
import static Bai17.IOFile.docS;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author NONAME
 */
public class Main {

    private static IOFile file;

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Sach> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (Object s : docS()) {
            sb.append(s);
        }
        System.out.println(sb);

        list = file.docS();
        sapXepGia(list);
        file.ghiS(list);

        sapXep(list);
        file.sapXepCN(list);
    }
}
