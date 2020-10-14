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
public class MangDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 1; j <= t; j++) {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int li = sc.nextInt();
                arr.add(li);
            }
            for (int i = 0; i < arr.size() / 2; i++) {
                if (arr.get(i) == arr.get(arr.size() - i - 1)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }break;
            }
        }
    }
}
