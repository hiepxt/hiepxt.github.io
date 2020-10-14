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
public class TongUocSo {
    static long exe(int n) {
        long sum = 0;
        while (n % 2 == 0) {
            sum += 2;
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i+=2) {
            while (n % i == 0) {
                sum += i;
                n /= i;
            }
        }
        if (n > 2) {
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sum = 0;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sum += exe(n);
        }
        System.out.println(sum);
    }
}
