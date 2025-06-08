package array;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 5, 4 };
        System.out.println(bruteForce(arr));
        System.out.println(arr[arr.length - 1]);
        System.out.println(optimalSolution(arr));
    }

    // brute force approach
    // Time Complexity - n logn

    private static int bruteForce(int[] arr) {
        // creating a copy so that it will not manipulate original array
        // ignore its complexity
        int[] temp = Arrays.copyOf(arr, arr.length);
        // step - 1 - sort the array
        Arrays.sort(temp);
        // step -2 return last index (n-1) index
        return temp[temp.length - 1];
    }

    // optimal solution
    // time complexity - O(n)
    // space complexity - O(1)
    private static int optimalSolution(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i])
                largest = arr[i];
        }
        return largest;
    }

}
