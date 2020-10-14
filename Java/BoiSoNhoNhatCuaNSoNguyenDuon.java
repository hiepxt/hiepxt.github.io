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
public class BoiSoNhoNhatCuaNSoNguyenDuon {

    static long UCLN(long a,long b){
        if(b == 0) return a;
        return UCLN(b,a%b);
    }
    static long BCNN(long a,long b){
        return (a*b)/UCLN(a,b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            int n = sc.nextInt();
            long temp=1;
            for(int i=2;i<=n;i++){
                temp=BCNN(temp,i);
            }
            System.out.println(temp);
        }
    }
}
