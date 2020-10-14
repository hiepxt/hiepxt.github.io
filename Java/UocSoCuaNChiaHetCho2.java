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
public class UocSoCuaNChiaHetCho2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long n;
        for (int k = 0; k < t; k++) {
            n = sc.nextLong();
            int count = 0;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (n / i == i) {
                        if (i % 2 == 0) {
                            count++;
                        }
                    } else {
                        if (i % 2 == 0) {
                            count++;
                        }
                        if (n / i % 2 == 0) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
