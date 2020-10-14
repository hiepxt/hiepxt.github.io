/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author NONAME
 */
public class Rectange {

    private double width, height;
    private String color;

    public Rectange() {
        this.width = 1;
        this.height = 1;
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea() {
        return this.width * this.height;
    }

    public double findPerimeter() {
        return (this.height + this.width) * 2;
    }
}
