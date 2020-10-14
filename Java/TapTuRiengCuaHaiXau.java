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
public class TapTuRiengCuaHaiXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            ArrayList arr = new ArrayList();
            ArrayList arr1 = new ArrayList();
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            s1 = s1.trim();
            s2 = s2.trim();
            s1 = s1.replaceAll("\\s+", " ");
            s2 = s2.replaceAll("\\s+", " ");
            StringTokenizer tok = new StringTokenizer(s1);
            while (tok.hasMoreTokens()) {
                arr1.add(tok.nextToken());
            }
            for (Object temp : arr1) {
                if (!s2.contains(String.valueOf(temp))) {
                    if (!arr.contains(temp)) {
                        arr.add(temp);
                    }
                }
            }
            Collections.sort(arr);
            for (Object c : arr) {
                System.out.print(c + " ");
            }
            System.out.println("");
            arr1.clear();
            arr.clear();
            t--;
        }
    }
}
