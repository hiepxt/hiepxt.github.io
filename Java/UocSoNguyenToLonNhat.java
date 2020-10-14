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
public class UocSoNguyenToLonNhat {
    static long check(long n) {
        long max = 0;
        for (long i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                max = i;
                n /= i;
            }
        }
        if (n > 2) {
            return n;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextLong();
            System.out.println(check(n));
            t--;
        }
    }
}
