package array;

import java.util.ArrayList;

public class MeanArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int[][] q = {
                {4,6}
        };
        findMeanRange(arr,q);
    }
    
    private static void findMeanRange(int[] arr,int[][] q) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int rows = 0; rows < q.length; rows++) {
            int sum = 0;
            int count = 0;
            int start = q[rows][0];
            int end = q[rows][1];
            for (int i = start-1; i < end; i++) {
                sum += arr[i];
                count++;
            }
            System.out.println("sum is "+sum);
            System.out.println("Diff is "+count);
            list.add(sum/count);
        }
        System.out.println(list);
    }
    
}
