package array;

public class ThirdLargest {

    public static void main(String[] args) {
        int[] arr = {10, 4, 3, 50, 23, 90};
        thirdLargest(arr);
    }

    private static void thirdLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;
        int tLargest = Integer.MIN_VALUE;

        for(int x:arr) {
            if (largest < x) {
                tLargest = sLargest;
                sLargest = largest;
                largest = x;
            } else if (sLargest < x && x != largest) {
                tLargest = sLargest;
                sLargest = x;
            } else if (tLargest < x && x != sLargest && x != largest) {
                tLargest = x;
            }
        }

        System.out.println("1st largest = "+largest);
        System.out.println("2nd largest = "+sLargest);
        System.out.println("3rd largest = "+tLargest);
    }

}
