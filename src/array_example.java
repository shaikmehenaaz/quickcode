public class array_example {
    static void balancedsum(int[] arr) {
        int leftsum = 0;
        int rightsum = 0;
        int minindex=-1;
        for (int i = 0; i < arr.length; i++) {
            rightsum=0;
            leftsum=0;
            for (int j = 0; j < i; j++) {
                leftsum += arr[j];
            }
            for (int k = arr.length-1; k >= 0; k--) {
                rightsum += arr[k];
            }
            if(leftsum==rightsum){
                System.out.println(i+1);
            }
        }
    }
        public static void main (String[]args){
            int[] arr = {1, 2, 3, 4, 6};
            balancedsum(arr);
        }
}
