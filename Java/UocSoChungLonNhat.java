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
public class UocSoChungLonNhat {

    static BigInteger UCLN(BigInteger a, BigInteger b) {
        BigInteger gcd = a.gcd(b);
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(UCLN(a, b));
        }
    }
}
