package array;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {

    public static void main(String[] args) {
//        int[] arr = {16,17,4,3,5,2};
        int[] arr = {16, 17, 4, 3, 5, 2};
        leaderBrute(arr);
    }
    
    private static void leaderBrute(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = i+1; j < arr.length; j++) {
                if (arr[i]<arr[j]) break;
            }
            if (j == arr.length) {
                list.add(arr[i]);
            }
        }
        for(int m:list) System.out.print(m+" ");
    }

}
