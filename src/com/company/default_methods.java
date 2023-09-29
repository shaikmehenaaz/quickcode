package com.company;

interface camera{
    void takesnap();
    void recordvideo();
    private void greet(){
        System.out.println("greetings");
    }
    default void recordnew(){
        greet();
        System.out.println("can not implement without default keyword");
    }
}
interface wifi{
    String[] getNetworks();
    void connectNetwork(String network);
}
//interface mediaplayer{}
class cellphone{
    void callNumber(int phonenumber){
        System.out.println("calling "+phonenumber);
    }
    void pickcall(){
        System.out.println("picking call");
    }
}
class smartphone extends cellphone implements wifi,camera{
    @Override
    public void takesnap(){
        System.out.println("taking snap");
    }
    @Override
    public void recordvideo(){
        System.out.println("recording video");
    }
    @Override
    public String[] getNetworks(){
        System.out.println("getting list of networks");
        String[] nerworkList={"harry","sweety","daddy"};
        return nerworkList;
    }
    @Override
    public void connectNetwork(String network){
        System.out.println("connecting to"+network);
    }
    //@Override
//    public void recordnew(){
//        System.out.println("new method");
//    }
}
public class default_methods {
    public static void main(String[] args) {
        smartphone s=new smartphone();
        s.recordnew();
        String[] arr=s.getNetworks();
        for(String item:arr){
            System.out.println(item);
        }
    }
}
