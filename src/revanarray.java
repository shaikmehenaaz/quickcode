import java.util.Arrays;
public class revanarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arrrev=new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            arrrev[j] = arr[i];
        }
        System.out.print(Arrays.toString(arrrev));
    }
}
