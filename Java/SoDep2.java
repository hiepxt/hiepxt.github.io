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
public class SoDep2 {

    static int sum(String n) {
        int s = 0;
        for (int i = 0; i < n.length(); i++) {
            s += Character.getNumericValue(n.charAt(i));
        }
        return s;
    }

    static int isReversible(String n) {
        int size = n.length();
        for (int i = 0; i < size / 2; i++) {
            if (n.charAt(i) != n.charAt(size - i - 1)) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            String n = sc.next();
            if (isReversible(n) == 1 && sum(n) % 10 == 0 && n.charAt(0) == '8' && n.charAt(n.length() - 1) == '8') {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
