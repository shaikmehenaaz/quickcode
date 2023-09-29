package com.company;

interface sample{
    void meth1();
    void meth2();
}
interface childsample extends sample{
    void meth3();
    void meth4();
}
class mysample implements childsample{
    public void meth3(){
        System.out.println("meth 3");
    }
    public void meth4(){
        System.out.println("meth 4");
    }
    public void meth1(){
        System.out.println("meth 1");
    }
    public void meth2(){
        System.out.println("meth 2");
    }
}
public class inheritance_in_interfaces {
    public static void main(String[] args) {
        mysample m=new mysample();
        m.meth1();
        m.meth2();
        m.meth3();
        m.meth4();
    }
}
