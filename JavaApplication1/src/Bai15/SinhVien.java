/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai15;

/**
 *
 * @author NONAME
 */
public class SinhVien {

    private int maSV;
    private String ten, lop;
    private double dtb;

    public SinhVien() {
    }

    public SinhVien(int m, String t, String l, double d) {
        this.maSV = m;
        this.ten = t;
        this.lop = l;
        this.dtb = d;
    }

    public int getMaSV() {
        return maSV;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }

    public double getDtb() {
        return dtb;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    public String toString() {
        return maSV + " " + ten + " " + lop + " " + dtb + "\n";
    }

}
