public class method_overloading {
    public static void ok(int a){
        System.out.println(a);
    }
    public static void ok(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        int a=1;
        int b=2;
        ok(a);
        ok(a,b);
    }
}
