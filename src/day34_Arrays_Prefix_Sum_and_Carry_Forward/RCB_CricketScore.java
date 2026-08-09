package day34_Arrays_Prefix_Sum_and_Carry_Forward;

public class RCB_CricketScore {
//	Given Royal Challengers Bengaluru's cricket scores for first 10 overs of batting
//	Runs scored in 7th over =• A7-A6
//	Runs scored in 10th over =• A10-A9
//	Runs scored from 4 - 9th over =• A9-A3
//	Runs scored from 3 - 6th over =• A6-A2
//	Runs scored from 6 - 10th over = A10-A5
	
//	Run Scored in L Over - R Over = A[r] - A[L-1] 
	
//	Create Prefix Sum / Cumulative Sum
	public static void main(String[] args) {
		int arr[] = {10,32,6,12,20,1};
		PrefixSum(arr);
		
		

	}
	static void  PrefixSum(int arr[]) {
		int [] p = new int [arr.length];
		p[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			p[i]= p[i-1] + arr[i];
			
			System.out.println(p[i]);
		}
	}
	

}
