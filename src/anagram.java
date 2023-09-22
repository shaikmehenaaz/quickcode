import java.util.*;
public class anagram {
    static void anagram(String s1,String s2){
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length()==s2.length()){
            char[] arr1=s1.toCharArray();
            char[] arr2=s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2)){
                System.out.println("anagrams");
            }else{
                System.out.println("not anagrams");
            }
        }else{
            System.out.println("Not anagrams");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        String s1=sc.nextLine();
        System.out.println();
        String s2=sc.nextLine();
        anagram(s1,s2);
    }
}
