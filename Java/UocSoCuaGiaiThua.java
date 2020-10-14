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
public class UocSoCuaGiaiThua {

    static int pow(int n, int p) {
        int result = 0;
        while (n > 0) {
            n /= p;
            result += n;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            System.out.println(pow(n, p));
        }
    }
}
