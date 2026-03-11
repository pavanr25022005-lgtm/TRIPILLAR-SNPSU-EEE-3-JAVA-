package timeandspacecomplexity;

public class InsertionSort {
    static void InsertionSort(int[] arr) {
        for ( int i=1; i<arr.length; i++){
            int key = arr[i]; //element to be inserted
            int j = i - 1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];  // 8,8,3,5,2,4
                j--;
            }
            arr[j+1] = key;
        }
    }

    static void main() {
        int[] arr = {8,3,5,2,4};
        InsertionSort(arr);

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
