public class var_args {
    public static int sum(int ...arr){
        int result=0;
        for(int i:arr){
            result+=i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4,5));
        System.out.println(sum());
    }
}
