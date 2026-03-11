package ARRAYS;

public class Reversearray {
    static void main() {
        int[] arr = {1,2,3,4,5,6,7};
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
        for (int i=arr.length; i>=0; i--){
            System.out.println(arr[1]+" ");
        }
    }
}
