public class minTimeToPrintAString {
    public static void time(String str){
        System.out.println(str);
        for(int i=0;i<str.length();i++){
            int ascii=str.charAt(i);
            System.out.println(ascii);
        }

    }
    public static void main(String[] args) {
        String str="MEHENAAZ";
        time(str);
    }
}
