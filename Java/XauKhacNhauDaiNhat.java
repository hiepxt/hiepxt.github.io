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
public class XauKhacNhauDaiNhat {
    static int check(String s1, String s2) {
        if (s1.equals(s2)) {
            return -1;
        } else if (!s1.equals(s2) && s1.length() > s2.length()) {
            return s1.length();
        } else {
            return s2.length();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(check(s1, s2));
            t--;
        }
    }
}
