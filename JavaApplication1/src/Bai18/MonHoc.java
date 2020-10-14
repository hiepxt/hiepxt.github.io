/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai18;

/**
 *
 * @author NONAME
 */
public class MonHoc {

    private int maMon;
    private String tenMon, nhomMon;
    private int soTinchi;

    public MonHoc() {
    }

    public MonHoc(int m, String t, String nhom, int so) {
        this.maMon = m;
        this.tenMon = t;
        this.nhomMon = nhom;
        this.soTinchi = so;
    }

    public int getMaMon() {
        return maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public String getNhomMon() {
        return nhomMon;
    }

    public int getSoTinchi() {
        return soTinchi;
    }

    public void setMaMon(int maMon) {
        this.maMon = maMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public void setNhomMon(String nhomMon) {
        this.nhomMon = nhomMon;
    }

    public void setSoTinchi(int soTinchi) {
        this.soTinchi = soTinchi;
    }

    @Override
    public String toString() {
        return maMon + " " + tenMon + " " + nhomMon + " " + soTinchi + "\n";
    }

}
