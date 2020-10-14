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
public class RutGonXauKiTu {
    static String remove(String S) {
        String ans = "";
        for (int i = 0; i < S.length(); i++) {
            if (ans.isEmpty()
                    || ans.charAt(ans.length() - 1) != S.charAt(i)) {
                ans += S.charAt(i);
            } else if (ans.charAt(ans.length() - 1) == S.charAt(i)) {
                ans = ans.substring(0, ans.length() - 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = remove(s);
        if (result.isEmpty()) {
            System.out.println("Empty String");
        } else {
            System.out.println(result);
        }

    }
}
