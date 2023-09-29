package com.company;

class Base{
    int x;

    public int getX() {
        System.out.println("getting X in base");
        return x;
    }

    public void setX(int x) {
        System.out.println("setting X in base");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}
class Derive extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class inheritance {
    public static void main(String[] args) {
        Base b=new Base();
        b.setX(4);
        System.out.println(b.getX());
        //b.setY(5) -- not possible
        Derive d=new Derive();
        d.setX(4);
        System.out.println(d.getX());
        d.setY(5);
        System.out.println(d.getY());
    }
}
