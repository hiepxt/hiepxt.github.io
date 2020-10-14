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
public class HieuSoNguyenLon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger sub;
            if (a.compareTo(b) < 0) {
                sub = b.subtract(a);
                int size = sub.toString().length();
                int size1 = b.toString().length();
                int l = Math.abs(size - size1);
                for (int i = 0; i < l; i++) {
                    System.out.print('0');
                }
                System.out.println(sub);
            } else {
                sub = a.subtract(b);
                int size = sub.toString().length();
                int size1 = a.toString().length();
                int l = Math.abs(size - size1);
                for (int i = 0; i < l; i++) {
                    System.out.print('0');
                }
                System.out.println(sub);
            }

        }
    }
}
