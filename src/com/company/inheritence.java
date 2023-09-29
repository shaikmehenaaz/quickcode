package com.company;

class animals{
    animals(){
        System.out.println("i am animal class constructor");
    }
    animals(int a){
        System.out.println("i am a: "+a);
    }
}
class wildanimals extends animals{
    wildanimals(){
        super(0);
        System.out.println("i am wildanimal class constructor");
    }
    wildanimals(int a,int b){
        super(a);
        System.out.println("kuch bhi: "+b);
    }

}
class verywildanimals extends wildanimals{
    verywildanimals(){
        System.out.println("i am verywildanimal class constructor");
    }
    verywildanimals(int a,int b, int c){
        super(a,b);
        System.out.println("finally: "+c);
    }

}
public class inheritence {
    public static void main(String[] args) {
        //animals a=new animals();
        //wildanimals w=new wildanimals(3);
        verywildanimals v=new verywildanimals(1,2,3);
    }
}
