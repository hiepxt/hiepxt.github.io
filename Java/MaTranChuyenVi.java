
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author no name
 */
public class MaTranChuyenVi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t,x;
        t = sc.nextInt();
        for ( x = 1; x <= t; x++) {
            int n, m;
            n = sc.nextInt();
            m = sc.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[m][n];
            long[][] res = new long[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    res[i][j] = 0;
                    for (int k = 0; k < m; k++) {
                        res[i][j] += (a[i][k] * b[k][j]);
                    }
                }
            }
            System.out.println("Test " + x + ":");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println("");
            }

        }

    }

}
