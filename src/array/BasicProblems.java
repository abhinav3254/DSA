package array;

public class BasicProblems {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
//        findAlternate(arr);
        linearSearch(arr,50);
    }

    private static void findAlternate(int[] arr) {
        for (int i = 0; i < arr.length; i = i+2) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void linearSearch(int[] arr,int k) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i]) {
                index = i;
                break;
            }
        }
        if (index != -1) System.out.println("Element found at index - "+index);
        else System.out.println("Element not found");
    }

}
