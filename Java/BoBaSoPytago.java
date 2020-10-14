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
public class BoBaSoPytago {

    static boolean check(long[] arr, int n) {
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr);
        for (int i = n - 1; i >= 2; i--) { 
            int l = 0;
            int r = i - 1;
            while (l < r) {
                if (arr[l] + arr[r] == arr[i]) {
                    return true;
                }
                if (arr[l] + arr[r] < arr[i]) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t; z++) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int l=arr.length;
            if (check(arr, l) == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    
}