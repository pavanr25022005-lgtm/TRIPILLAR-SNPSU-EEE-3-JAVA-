package timeandspacecomplexity;

public class Binarysearch {
    static int Binarysearch(int key, int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }


    static void main() {
        int[] arr = {1,2,3,4,5,6,7,8};
        int key = 7;
        System.out.println(Binarysearch(key,arr));

    }
}
