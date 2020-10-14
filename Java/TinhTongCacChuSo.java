/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author NONAME
 */
public class TinhTongCacChuSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String s = sc.nextLine();
            String s1 = s.replaceAll("\\d", "");
            String s2 = s.replaceAll("[^0-9]", "");
            char[] arr = s1.toCharArray();
            Arrays.sort(arr);
            int sum = 0;
            for (int i = 0; i < s2.length(); i++) {
                sum += Integer.parseInt(String.valueOf(s2.charAt(i)));
            }
            System.out.println(String.valueOf(arr).concat(String.valueOf(sum)));
            t--;
        }
    }
}
