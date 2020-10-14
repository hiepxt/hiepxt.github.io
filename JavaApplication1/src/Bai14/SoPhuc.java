/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai14;

import java.util.Scanner;

/**
 *
 * @author NONAME
 */
public class SoPhuc {

    Scanner sc = new Scanner(System.in);
    private float a, b;

    public SoPhuc() {
        this.a = 0;
        this.b = 0;
    }

    public SoPhuc(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public SoPhuc cong(SoPhuc sp2) {
        SoPhuc sp = new SoPhuc();
        sp.a = this.a + sp2.a;
        sp.b = this.b + sp2.b;
        return sp;
    }

    public SoPhuc tru(SoPhuc sp2) {
        SoPhuc sp = new SoPhuc();
        sp.a = this.a - sp2.a;
        sp.b = this.b - sp2.b;
        return sp;
    }

    public SoPhuc nhan(SoPhuc sp2) {
        SoPhuc sp = new SoPhuc();
        sp.a = this.a * sp2.a - this.b * sp2.b;
        sp.b = this.a * sp2.b + this.b * sp2.a;
        return sp;
    }

    public SoPhuc chia(SoPhuc sp2) {
        SoPhuc sp = new SoPhuc();
        sp.a = (sp2.a * this.a + sp2.b * this.b) / (sp2.a * sp2.a + sp2.b * sp2.b);
        sp.b = (sp2.a * this.b - sp2.b * this.a) / (sp2.a * sp2.a + sp2.b * sp2.b);
        return sp;
    }

    public SoPhuc nghichDao() {
        SoPhuc sp = new SoPhuc();
        sp.a = this.a / (this.a * this.a + this.b * this.b);
        sp.b = -this.b / (this.a * this.a + this.b * this.b);
        return sp;
    }

    public float modul() {
        return (float) Math.sqrt(this.a * this.a + this.b * this.b);
    }

    public boolean bangNhau(SoPhuc sp2) {
        return (this.a == sp2.a && this.b == sp2.b);
    }

    public boolean lonhon(SoPhuc sp2) {
        return (this.modul() > sp2.modul());
    }

    public boolean nhohon(SoPhuc sp2) {
        return (this.modul() < sp2.modul());
    }

    public void hien() {
        System.out.println(this.a + " + " + this.b + "j");
    }

    public void nhap() {
        System.out.print("Nhập phần thực a: ");
        a = sc.nextFloat();
        System.out.print("Nhập phần ảo b: ");
        b = sc.nextFloat();
    }
}
