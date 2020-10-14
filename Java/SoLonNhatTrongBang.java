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
public class SoLonNhatTrongBang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long mx = 0, yx = 0;
        int x, y;
        while (n > 0) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (mx == 0 && yx == 0) {
                mx = x;
                yx = y;
            } else if (yx > y) {
                yx = y;
            } else if (mx > x) {
                mx = x;
            }
            n--;
        }
        System.out.println(mx * yx);
    }
}
