package com.company;

abstract class parent{
    public parent(){
        System.out.println("I am base constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class child extends parent{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("kuch bhi yaar");
    }
}
abstract class child2 extends parent{
    public void night(){
        System.out.println("good night");
    }
}
public class abstract_classes {
    public static void main(String[] args) {
        //abstract-in mind, concrete-in real
        //method without implementation
        //abstract method defined inside abstract class
        child c=new child();
        c.greet();
        //child2 cc=new child2(); -error cause it is abstract class
    }
}
