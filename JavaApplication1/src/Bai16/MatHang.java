/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai16;

/**
 *
 * @author NONAME
 */
public class MatHang {

    private int maHang;
    private String ten, nhom;
    private double giaBan;

    public MatHang() {
    }

    public MatHang(int m, String t, String nhom, double gia) {
        this.maHang = m;
        this.ten = t;
        this.nhom = nhom;
        this.giaBan = gia;
    }

    public int getMaHang() {
        return maHang;
    }

    public String getTen() {
        return ten;
    }

    public String getNhom() {
        return nhom;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return maHang + " " + ten + " " + nhom + " " + giaBan + "\n";
    }

}
