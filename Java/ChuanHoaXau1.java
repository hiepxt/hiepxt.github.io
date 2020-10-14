/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author no name
 */
public class ChuanHoaXau1 {

    static String convert(String str) {
        String temp = "";
        temp += String.valueOf(str.charAt(0)).toUpperCase();
        temp += str.substring(1).toLowerCase();
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int k = 0; k < t; k++) {
            String s = sc.nextLine();
            s = s.trim();
            s = s.replaceAll("\\s+", " ");
            StringTokenizer tok = new StringTokenizer(s, " ");
            while (tok.hasMoreTokens()) {
                System.out.print(convert(tok.nextToken()) + " ");
            }
            System.out.println("");
        }
    }
}
