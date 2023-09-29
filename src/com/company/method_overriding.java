package com.company;

import java.lang.annotation.Inherited;

class A{
    public int meth1(){
        return 5;
    }
    public void meth2(){
        System.out.println("i am 2nd method class A");
    }
}

class B extends A{
    @Override
    public void meth2(){
        System.out.println("i am meth 2 class B");
    }
    public void meth3(){
        System.out.println("i am meth 3");
    }
}
public class method_overriding {
    public static void main(String[] args) {
        A a=new A();
        a.meth2();
        B b=new B();
        b.meth2();
    }
}
