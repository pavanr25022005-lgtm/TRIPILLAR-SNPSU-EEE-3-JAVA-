package ARRAYS;

public class twosumproblem {
    int[] arr = {2, 7, 11, 15};
    int[] twosum = new int[arr.length];
    int target = 9;

    void main() {


        for (int i = 0; i < arr.length; i++) {
            for (int j=i+1; j < arr.length; j++){
                if (arr[i] + arr[j] == target){
                    System.out.println("the pair is found =" + arr[i] + " " +arr[i+1]);
                }
                System.out.println("Indexes are" + i + " " + j);
            }
        }

    }
}