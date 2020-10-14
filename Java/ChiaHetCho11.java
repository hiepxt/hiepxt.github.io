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
public class ChiaHetCho11 {

    static boolean check(String s) {
        int n = s.length();
        int odd = 0, even = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even += Integer.parseInt(String.valueOf(s.charAt(i)));
            } else {
                odd += Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        return (odd - even) % 11 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String s = sc.nextLine();
            if (check(s)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
            t--;
        }
    }
}
