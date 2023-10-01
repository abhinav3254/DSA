package codechef75;

import java.util.Scanner;

public class TWORANGES {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while (t-- >0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int p = sc.nextInt();
			int q = sc.nextInt();
			
			int count = 0;
			boolean[] arr = new boolean[9];
			for (int i = 0;i<9;i++) {
				if (i>=a & i<=b) {
					arr[i] = true;
				} else if (i>=p & i<=q) {
					arr[i] = true;
				}
			}
			
			for (int i = 0;i<9;i++) {
				if (arr[i]) count++;
			}
			
			System.out.println(count);
		}
		
		sc.close();
	}
	
}
