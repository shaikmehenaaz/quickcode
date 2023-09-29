package com.company;

class models{
    private String name;
    private int modelno;
    public models(String n){
        name=n;
        modelno=25;
    }
    public models(String n,int i){
        name=n;
        modelno=i;
    }
    public void setName(String n){ name=n; }
    public String getname(){return name; }
    public void setModelno(int i){ modelno=i ;}
    public int getModelno(){return modelno;}
}
public class cars {
    public static void main(String[] args) {
        //models bmw=new models();
        //bmw.setName("BMW");
        //System.out.println(bmw.getname());
        models bmw=new models("BMW");
        System.out.println(bmw.getname());
        System.out.println(bmw.getModelno());
        models audi=new models("AUDI",26);
        System.out.println(audi.getname());
        System.out.println(audi.getModelno());
    }
}
