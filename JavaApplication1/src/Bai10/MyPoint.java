/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai10;

/**
 *
 * @author NONAME
 */
public class MyPoint {
    
    private double x, y;
    
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }
    
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public MyPoint(MyPoint p) {
        this.x = p.x;
        this.y = p.x;
    }
    
    public double getX() {
        return this.x;
    }
    
    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double distance(MyPoint p1) {
        return Math.sqrt((this.x - p1.x) * (this.x - p1.x) + (this.y - p1.y) * (this.y - p1.y));
    }
    
    public double distance(MyPoint p1, MyPoint p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * p1.y - p2.y);
    }
}
