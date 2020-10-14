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
public class XauDoiXung {
    static int check(String s) {
        int n = s.length(), count = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == s.charAt(n - i - 1)) {
                count++;
            }
        }
        return n-count*2;
    }

    static String result(String s) {
        int z=check(s);
        if (z==1||z==2||z==3) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String s = sc.nextLine();
            System.out.println(result(s));
            t--;
        }
    }
}
