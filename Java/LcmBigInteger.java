
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
public class LcmBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < t; i++)
        {
          String s1,s2;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        BigInteger n1 = new BigInteger(s1);
           BigInteger n2 = new BigInteger(s2);
        while(!"0".equals(n1.remainder(n2).toString()))
        {
            BigInteger res = n1.remainder(n2);
            n1 = n2;
            n2 = res;
        }
        System.out.println(n2.toString());
        }
             
       
                    
    }
}
