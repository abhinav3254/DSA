package array;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {2,4,1,7,3,6,7};
        System.out.println(secondLargest(arr));
    }

    private static int secondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (largest<arr[i]) {
                secondLargest = largest;
                largest = arr[i];
            } else if (secondLargest<arr[i] && largest != arr[i]) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

}
