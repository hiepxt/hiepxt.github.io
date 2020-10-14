
import java.math.BigInteger;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author no name
 */
public class SoFibonaci {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            n = sc.nextInt();
            BigInteger[] fi = new BigInteger[n + 1];
            fi[0] = new BigInteger("0");
            fi[1] = new BigInteger("1");
            for (int i = 2; i <= n; i++) {
                fi[i] = fi[i - 1].add(fi[i - 2]);
            }
            System.out.println(fi[n]);
        }
    }
}
