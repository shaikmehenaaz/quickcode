package com.company;

class oneclass{
    int a;
    oneclass(int v){
        this.a=v;
    }
    public int getA(){
        return a;
    }
}
class twoclass extends oneclass{
    twoclass(int c){
        super(c);
        System.out.println("I made a constructor");
    }
}
public class this_super {
    public static void main(String[] args) {
        oneclass o=new oneclass(5);
        System.out.println(o.getA());
        twoclass t=new twoclass(6);
        System.out.println(t.getA());
    }
}
