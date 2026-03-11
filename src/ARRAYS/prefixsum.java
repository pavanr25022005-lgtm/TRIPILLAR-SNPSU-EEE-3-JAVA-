package ARRAYS;
public class prefixsum {
    static void main() {
        int[] array = {2,4,6,8,};
        int[] prefix = new int[array.length];

        prefix[0]=array[0];

        for (int i = 1; i < array.length; i++) {
            prefix[i] = prefix[i - 1] + array[i];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print( prefix[i]+" ");
        }
        System.out.println();

        int L = 1;
        int R = 3;
        int sum;
        if(L==0){
            sum = prefix[R];
        }
        else {
            sum = prefix[R] - prefix[L - 1];
        }
        System.out.println("sum of range =" + sum);
    }
}
