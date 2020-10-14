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
public class CapSoCoTongBangK {

    static long count(long arr[], int n, long k) {
        HashMap<Long, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], 0);
            }
            hm.put(arr[i], hm.get(arr[i])+1);
        }
        long count = 0;
        for (int i = 0; i < n; i++) {
            if (hm.get(k - arr[i]) != null) {
                count += hm.get(k - arr[i]);
            }
            if (k - arr[i] == arr[i]) {
                count--;
            }
        }
        return count / 2;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t; z++) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] arr = new long[n+1];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(count(arr, n, k));
        }
    }
}
