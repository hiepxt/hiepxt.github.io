/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai17;

/**
 *
 * @author NONAME
 */
public class Sach {

    private int maSach;
    private String tenSach, chuyenNganh;
    private double giaBan;

    public Sach() {
    }

    public Sach(int m, String t, String cn, double gia) {
        this.maSach = m;
        this.tenSach = t;
        this.chuyenNganh = cn;
        this.giaBan = gia;
    }

    public int getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return maSach + " " + tenSach + " " + chuyenNganh + " " + giaBan + "\n";
    }

}
