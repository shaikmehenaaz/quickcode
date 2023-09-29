package com.company;

class square{
    //side
    //area
    //perimeter
    int side;
    public void setside(int n){
        side=n;
    }
    public int getarea(){ return side*side;}
    public int getperimeter(){ return side*4;}
}
class rectangle{
    int length;
    int breadth;
    public void setlengthAndBreadth(int n,int m){
        length=n;
        breadth=m;
    }
    public int getarea(){
        return length*breadth;
    }
    public int getperimeter(){
        return 2*(length+breadth);
    }
}
public class mensuration {
    public static void main(String[] args) {
        square s=new square();
        s.setside(5);
        System.out.println(s.getarea());
        System.out.println(s.getperimeter());
        rectangle r=new rectangle();
        r.setlengthAndBreadth(2,3);
        System.out.println(r.getarea());
        System.out.println(r.getperimeter());
    }
}
