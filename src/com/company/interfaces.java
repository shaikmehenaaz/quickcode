package com.company;

interface bicycle{
    int x=45; // this becomes final by default
    void applybreak(int decrement);
    int speedup(int increment);
}
interface horncycle{
    void playhorn();
    void redhorn();
}
class newcycle implements bicycle,horncycle{
    int speed=7;
    public void applybreak(int decrement){
        this.speed=this.speed-decrement;
    }
    public int speedup(int increment){
        this.speed=this.speed+increment;
        return this.speed;
    }
    public void blowhorn(){
        System.out.println("thujhe dekha tho ye jana sanam.mp3");
    }
    public void playhorn(){
        System.out.println("kuch bhi");
    }
    public void redhorn(){
        System.out.println("haan mai hun na");
    }
}

public class interfaces {
    public static void main(String[] args) {
        newcycle nc=new newcycle();
        System.out.println(nc.speedup(2));
        nc.blowhorn();
        nc.redhorn();
    }
}
