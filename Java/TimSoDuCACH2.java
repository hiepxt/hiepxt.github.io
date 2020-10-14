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
public class TimSoDuCACH2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            BigInteger n = sc.nextBigInteger();
            BigInteger temp = new BigInteger("4");
            BigInteger ze = new BigInteger("0");
            BigInteger mod=n.mod(temp);
            if (mod.compareTo(ze)==0) {
                System.out.println(4);
            } else {
                System.out.println(0);
            }
        }
    }
}
