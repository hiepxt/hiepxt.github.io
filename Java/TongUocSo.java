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
public class TongUocSo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            int j = 2;
            while (arr[i] > 1) {
                if (arr[i] % j == 0) {
                    list.add(j);
                    arr[i] /= j;
                } else {
                    j++;
                }
            }
        }
        long sum = 0;
        for (int i=0;i<list.size();i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}
