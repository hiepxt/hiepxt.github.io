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
public class DemSoLanXuatHien {
    static int check(int[] a, int n, int i) {

        int t = a[i];
        for (int j = 0; j < i; j++) {
            if (t == a[j]) {
                return 0;
            }
        }
        return 1;
    }

    static int count(int[] a, int n, int i) {
        int t = a[i], j = 0;
        for (; i < n; i++) {
            if (t == a[i]) 
                j++;
            
        }
        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 1; z <= t; z++) {

            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println("Test " + z + ": ");
            for (int i = 0; i < n; i++) {
                if (check(a, n, i)==1) {
                    System.out.println(a[i] + " xuat hien " + count(a, n, i) + " lan");
                }
            }
        }
    }
}
