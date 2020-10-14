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
public class PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 1; j <= t; j++) {
            int n = sc.nextInt();
            TreeMap<Integer, Integer> m = new TreeMap<Integer, Integer>();
            int count = 1;
            for (int i = 2; i <= n; i++) {
                while (n % i == 0) {

                    m.put(i, count++);
                    n /= i;
                }
                count = 1;
            }
            System.out.print("Test " + j + ": ");
            for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
                System.out.print(entry.getKey() + "(" + entry.getValue() + ")");
                if (entry.getKey() < m.lastKey()) {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }
}
