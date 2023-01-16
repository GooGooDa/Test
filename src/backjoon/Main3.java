package backjoon;

import java.util.Scanner;


public class Main3 {
	
	public static void main(String[] args) {
		int[] nums = {100,90,80};
		int[] nums2;  
	}

	static double average(int nums[]) {
		int total = 0;
		for(int i=0;i<nums.length;i++) { 
			total += nums[i];
		}
		return total/3; 
		}
	
	static double average2(int nums2[]) {
		int total = 0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<nums2.length;i++) {
			nums2[i] = sc.nextInt();
			total += nums2[i];
		}
		return total/3;
		}
}


	


