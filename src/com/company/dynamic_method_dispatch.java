package com.company;

class one{
    public void name(){
        System.out.println("my name is java");
    }
    public void greet(){
        System.out.println("good morning");
    }
}
class two extends one{
    @Override
    public void name(){
        System.out.println("my name is java in class two");
    }
    public void night(){
        System.out.println("good night");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
        one o=new one();
        o.name();
        two t=new two();
        t.name();
        one d=new two();
        d.name();
        d.greet();
    }
}
