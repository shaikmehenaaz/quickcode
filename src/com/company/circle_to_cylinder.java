package com.company;

class circle{
    public int radius;
    circle(int a){
        this.radius=a;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder1 extends circle{
    public int height;
    cylinder1(int r,int h){
        super(r);
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*height;
    }
}
public class circle_to_cylinder {
    public static void main(String[] args) {
        circle obj=new circle(2);
        System.out.println(obj.area());
        cylinder1 c=new cylinder1(2,3);
        System.out.println(c.volume());
    }
}