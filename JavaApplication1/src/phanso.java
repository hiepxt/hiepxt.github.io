/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 *
 * @author NONAME
 */
public class phanso {

    static class PhanSo {

        private int tu, mau;

        public PhanSo() {
            tu = 1;
            mau = 1;
        }

        public PhanSo(int tu, int mau) {
            this.tu = tu;
            this.mau = mau;
        }

        public int gcd(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }

        static int sc() throws IOException {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            String s = br.readLine();
            return Integer.valueOf(s);
        }

        public PhanSo nhap(PhanSo p) throws IOException {
            p.tu = sc();
            p.mau = sc();
            return p;
        }

        public PhanSo rutGon(PhanSo phanso) {
            int temp = Math.abs(gcd(phanso.tu, phanso.mau));
            PhanSo p = new PhanSo();
            p.tu = phanso.tu / temp;
            p.mau = phanso.mau / temp;
            return p;
        }

        public PhanSo cong(PhanSo p1, PhanSo p2) {
            PhanSo phanso = new PhanSo();
            phanso.tu = p1.tu * p2.mau + p2.tu * p1.mau;
            phanso.mau = p1.mau * p2.mau;
            return rutGon(phanso);
        }

        public PhanSo tich(PhanSo p1, PhanSo p2) {
            PhanSo phanso = new PhanSo();
            phanso.tu = p1.tu * p2.tu;
            phanso.mau = p1.mau * p2.mau;
            return rutGon(phanso);
        }

        public PhanSo tru(PhanSo p1, PhanSo p2) {
            PhanSo phanso = new PhanSo();
            phanso.tu = p1.tu * p2.mau - p2.tu * p1.mau;
            phanso.mau = p1.mau * p2.mau;
            return rutGon(phanso);
        }

        public PhanSo thuong(PhanSo p1, PhanSo p2) {
            PhanSo phanso = new PhanSo();
            phanso.tu = p1.tu * p2.mau;
            phanso.mau = p1.mau * p2.tu;
            return rutGon(phanso);
        }

        static void hienthi(PhanSo p) {
            if (p.tu == 0 || p.mau == 1) {
                System.out.println(p.tu);
            } else {
                System.out.println(p.tu + "/" + p.mau);
            }
        }

        public static void main(String[] args) throws IOException {
            PhanSo p = new PhanSo();
            PhanSo p1 = new PhanSo();
            PhanSo p2 = new PhanSo();
            System.out.println("Nhap phan so thu 1: ");
            p.nhap(p1);
            System.out.println("Nhap phan so thu 2: ");
            p.nhap(p2);
            System.out.println("Tong cua hai phan so la: ");
            hienthi(p.tich(p1, p2));
        }
    }
}
