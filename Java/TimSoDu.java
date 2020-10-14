/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.math.BigInteger;
import java.util.*;

/**
 *
 * @author no name
 */
public class TimSoDu {

    static int A_mod_B(String N, int a) {
        int len = N.length();
        int ans = 0;
        for (int i = 0; i < len; i++) {
            ans = (ans * 10 + (int) N.charAt(i) - '0') % a;
        }

        return ans % a;
    }
 
    static int findMod(String N) {
        int mod = A_mod_B(N, 4);
        int ans = (1 + (int) Math.pow(2, mod)
                + (int) Math.pow(3, mod)
                + (int) Math.pow(4, mod));

        return (ans % 5);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            String n = sc.next();
            System.out.println(findMod(n));
        }
    }
}
