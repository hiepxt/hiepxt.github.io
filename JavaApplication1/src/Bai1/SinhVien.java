package Bai1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NONAME
 */
public class SinhVien {

    private String ID, name, lop;
    private int khoa;

    public SinhVien() {
    }

    public SinhVien(String ID, String name, String lop, int khoa) {
        this.ID = ID;
        this.name = name;
        this.lop = lop;
        this.khoa = khoa;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getLop() {
        return lop;
    }

    public int getKhoa() {
        return khoa;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setKhoa(int khoa) {
        this.khoa = khoa;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "ID=" + ID + ", name=" + name + ", lop=" + lop + ", khoa=" + khoa + '}';
    }

    public void hienThi() {
        System.out.printf("%-20s %-20s %-20s %-5d", ID, name, lop, khoa);
        System.out.println("");
    }
}
