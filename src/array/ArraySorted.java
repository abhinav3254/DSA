package array;

public class ArraySorted {

    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5,55,7,9,9,10};
        System.out.println(isSorted(arr));
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] <= arr[i]) {}
            else return false;
        }
        return true;
    }

}
