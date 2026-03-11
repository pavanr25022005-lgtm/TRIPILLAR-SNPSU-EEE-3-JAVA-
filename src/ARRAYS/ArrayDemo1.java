package ARRAYS;

public class ArrayDemo1 {
    static void main() {
        String[] arr = {"*******"," *****","  ***", "   *","**","***","****","*****"}; //{1,2,3,4,5}
        String[] arr1 = new String[9]; //{0,0,0,0,0}
        String[] arr2 = new String[9];

 //       System.out.println(arr1); // wrong way
        for (int i=0; i<arr1.length; i++){
            System.out.println(arr[i]+"  ");
        }
        System.out.println();

        for (int i=0; i<arr2.length; i++){
            System.out.println(arr[i]+"  ");
        }
    }
}
