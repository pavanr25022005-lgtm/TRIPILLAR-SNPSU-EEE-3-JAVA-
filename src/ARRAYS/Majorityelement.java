package ARRAYS;

public class Majorityelement {
    static void main() {
        int[] arr = {2, 2, 1, 2, 3, 2, 2};
        int[] n = new int[]{arr.length};
        int size = 7;
        double half = 3.5;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count>half) {
                System.out.println("element=" + arr[i]);
            }else{
                System.out.println("no");


                }
            }
        }
    }

