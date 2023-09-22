import java.util.*;
public class vowcons {

    static void vowelsconsonants(String s){
        int v_count=0;
        int c_count=0;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                v_count+=1;
            }else if(a==' '){
                continue;
            }else{
                c_count+=1;
            }
        }
        System.out.println(v_count);
        System.out.println(c_count);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println();
        String s=sc.nextLine();
        vowelsconsonants(s);
    }
}
