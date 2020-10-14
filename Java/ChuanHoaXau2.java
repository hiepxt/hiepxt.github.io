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
public class ChuanHoaXau2 {
    
    static String convert(String s) {
        String temp = "";
        temp += String.valueOf(s.charAt(0)).toUpperCase();
        temp += s.substring(1).toLowerCase();
        return temp;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        for (int k = 0; k < t; k++) {
            String s = sc.nextLine();
            s = s.trim();
            s = s.replaceAll("\\s+", " ");
            StringTokenizer tok = new StringTokenizer(s, " ");
            while (tok.hasMoreTokens()) {
                arr.add(convert(tok.nextToken()));
            }
            for (int i = 1; i < arr.size(); i++) {
                System.out.print(arr.get(i));
                if (i < arr.size() - 1) {
                    System.out.print(" ");
                }
                if (i == arr.size() - 1) {
                    System.out.print(", " + arr.get(0).toUpperCase());
                }
            }
            arr.removeAll(arr);
            System.out.println("");
        }
    }
}
