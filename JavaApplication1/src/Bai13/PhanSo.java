/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai13;

import static Bai13.Main.gcd;
import java.util.Scanner;

/**
 *
 * @author NONAME
 */
public class PhanSo {

    Scanner sc = new Scanner(System.in);
    private int ts, ms;

    public PhanSo() {
        this.ts = 0;
        this.ms = 1;
    }

    public PhanSo(int ts, int ms) {
        this.ts = ts;
        this.ms = ms;
    }

    public int getTs() {
        return ts;
    }

    public PhanSo cong(PhanSo sp2) {
        PhanSo p = new PhanSo();
        p.ts = this.ts * sp2.ms + this.ms * sp2.ts;
        p.ms = this.ms * sp2.ms;
        p = p.toiGian();
        return p;
    }

    public PhanSo tru(PhanSo sp2) {
        PhanSo p = new PhanSo();
        p.ts = this.ts * sp2.ms - this.ms * sp2.ts;
        p.ms = this.ms * sp2.ms;
        p = p.toiGian();
        return p;
    }

    public PhanSo nhan(PhanSo sp2) {
        PhanSo p = new PhanSo();
        p.ts = this.ts * sp2.ts;
        p.ms = this.ms * sp2.ms;
        p = p.toiGian();
        return p;
    }

    public PhanSo chia(PhanSo sp2) {
        PhanSo p = new PhanSo();
        p.ts = this.ts * sp2.ms;
        p.ms = this.ms * sp2.ts;
        p = p.toiGian();
        return p;
    }

    public PhanSo nghichDao() {
        PhanSo p = new PhanSo();
        p.ts = this.ms;
        p.ms = this.ts;
        p = p.toiGian();
        return p;
    }

    public PhanSo doiDau() {
        PhanSo p = new PhanSo();
        p.ts = -this.ts;
        p.ms = this.ms;
        p = p.toiGian();
        return p;
    }

    public boolean bangNhau(PhanSo sp2) {

        if (this.ts == sp2.ts && this.ms == sp2.ms || this.ts * sp2.ms == sp2.ts * this.ms) {
            return true;
        }
        return false;
    }

    public boolean lonHon(PhanSo sp2) {
        if (this.ts * sp2.ms > sp2.ts * this.ms) {
            return true;
        }
        return false;
    }

    public boolean nhoHon(PhanSo sp2) {
        if (this.ts * sp2.ms < sp2.ts * this.ms) {
            return true;
        }
        return false;
    }

    public PhanSo toiGian() {
        PhanSo p = new PhanSo();
        int temp = Math.abs(gcd(this.ts, this.ms));
        p.ts = this.ts / temp;
        p.ms = this.ms / temp;
        return p;
    }

    public void hien() {
        System.out.println(this.ts + "/" + this.ms);
    }

    public void nhap() {
        System.out.print("Nhập tử số: ");
        this.ts = sc.nextInt();
        System.out.print("Nhập mẫu số: ");
        this.ms = sc.nextInt();
    }
}
