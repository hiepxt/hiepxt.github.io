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
public class BoiSoChungUocSoChung {

    static long BCNN(long a, long b) {
        if (a == 0 || b == 0) {
            return a + b;
        } else {
            return (a * b) / UCLN(a, b);
        }
    }

    static long UCLN(long a, long b) {
        if (a == 0 || b == 0) {
            return a + b;
        }
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long a = sc.nextLong(), b = sc.nextLong();
            System.out.println(BCNN(a, b) + " " + UCLN(a, b));
        }
    }
}
