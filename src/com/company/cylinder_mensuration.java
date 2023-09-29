package com.company;

import java.lang.Math;
class cylinder{
    private int radius;
    private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;                //constructor
        this.height = height;
    }

    public int getRadius() {                    //getter
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public double surfaceArea(){
        return 2*Math.PI*radius*(radius+height);
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }

}
class rectangl{
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public rectangl(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}
public class cylinder_mensuration {
    public static void main(String[] args) {
        cylinder c1=new cylinder(6,5);
        //c1.setHeight(5);
        //c1.setRadius(6);
        System.out.println(c1.getHeight());
        System.out.println(c1.getRadius());
        System.out.println(c1.surfaceArea());
        System.out.println(c1.volume());
        rectangl r1=new rectangl(2,3);
        System.out.println(r1.getBreadth());
        System.out.println(r1.getLength());
    }
}
