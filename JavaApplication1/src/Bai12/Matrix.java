/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai12;

import java.util.*;

/**
 *
 * @author NONAME
 */
public class Matrix {

    Scanner sc = new Scanner(System.in);
    private int cols=100, rows=100;
    private float[][] a = new float[rows][cols];

    public Matrix() {
        this.rows = 3;
        this.cols = 3;
    }

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    public Matrix add(Matrix m) {
        Matrix kq = new Matrix(this.rows, this.cols);
        kq.rows = this.rows;
        kq.cols = this.cols;
        if (m.rows != this.rows || m.cols != this.cols) {
            System.out.println("Không hợp lệ!");
            return null;
        } else {
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= cols; j++) {
                    kq.a[i][j] = m.a[i][j] + this.a[i][j];
                }
            }
        }
        return kq;
    }

    public Matrix sub(Matrix m) {
        Matrix kq = new Matrix(this.rows, this.cols);
        kq.rows = this.rows;
        kq.cols = this.cols;
        if (m.rows != this.rows || m.cols != this.cols) {
            System.out.println("Không hợp lệ!");
            return null;
        } else {
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= cols; j++) {
                    kq.a[i][j] = m.a[i][j] - this.a[i][j];
                }
            }
        }
        return kq;
    }

    public Matrix neg() {
        Matrix kq = new Matrix();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                kq.a[i][j] = -this.a[i][j];
            }
        }
        return kq;
    }

    public Matrix transpose() {
        Matrix kq = new Matrix();
        kq.rows = this.cols;
        kq.cols = this.rows;
        for (int i = 1; i <= this.rows; i++) {
            for (int j = 1; j <= this.cols; j++) {
                kq.a[i][j] = this.a[j][i];
            }
        }
        return kq;
    }

    public Matrix mul(Matrix m) {
        Matrix kq = new Matrix(m.rows, this.cols);
        if (m.rows != this.cols) {
            System.out.println("Không hợp lệ!");
            return null;
        } else {
            for (int i = 1; i <= m.rows; i++) {
                for (int j = 1; j <= this.cols; j++) {
                    for (int k = 1; k <= m.cols; k++) {
                        kq.a[i][j] += m.a[i][k] * this.a[k][j];
                    }
                }
            }
        }
        return kq;
    }

    public void print() {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("  " + a[i][j]);
            }
            System.out.println("");
        }
    }

    public void input() {
        System.out.println("Nhập số hàng rows:");
        this.rows = sc.nextInt();
        System.out.println("Nhập số cột cols: ");
        this.cols = sc.nextInt();
        System.out.println("Nhập ma trận: ");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                this.a[i][j] = sc.nextFloat();
            }
            System.out.println("");
        }
    }
}
