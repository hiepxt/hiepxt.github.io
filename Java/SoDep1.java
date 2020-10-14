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
public class SoDep1 {

    static int check(String n) {
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) % 2 != 0) {
                return 0;
            }
        }
        return 1;
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

            if (isReversible(n) == 1 && check(n) == 1) {

                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
