package ARRAYS;

public class missingelement {
    static void main() {
        int[] array = {1, 2, 4, 5};
        int n = 5;
        int totalsum;
        int actualsum;
        totalsum = n * (n+1)/2;
        actualsum = 0;
        for (int i=0; i< array.length; i++){
            actualsum += array[i];
        }
        System.out.println("Missing number is ="+ (totalsum - actualsum));
    }
}