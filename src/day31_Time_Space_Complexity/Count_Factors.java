package day31_Time_Space_Complexity;

import java.util.Scanner;

public class Count_Factors {

	
//	Problem Description
//
//	Given an integer A, you need to find the count of it's factors.
//
//	Factor of a number is the number which divides it perfectly leaving no remainder.
//
//	Example : 1, 2, 3, 6 are factors of 6
//	Problem Constraints
//	1 <= A <= 109
//	Input Format
//	First and only argument is an integer A.
//	Output Format
//	Return the count of factors of A.
//
//	Example Input
//	Input 1:
//	5
//	Input 2:
//	10
	
//	Example Output
//	Output 1:
//	2
//	Output 2:
//	4
//
//
//	Example Explanation
//
//	Explanation 1:
//	Factors of 5 are 1 and 5.
//	Explanation 2:
//	Factors of 10 are 1, 2, 5 and 10.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Count of Factors of "+num+" is "+countFactors(num));
		System.out.println("=======================================");
		System.out.println("Count of Factors of "+num+" is "+countFactorsOptimized(num));
		sc.close();
	}
	//brute force
	static int countFactors(int n) {
		int iter = 0;
		int count = 0;
		for(int i=1;i<=n;i++) {
			if (n%i==0) {
				count++;
			}
			iter+=1;
			System.out.println(iter);
		}
		return count;
	}
	//SC = O(n);
	
	//Optimized Approach
	static int countFactorsOptimized(int n) {
		int count = 0;
		int iter = 0;
		for(int i=1;i*i <=n ;i++) {
			if(n%i==0) {
				int j=n/i;
				if(i==j) {
					count+=1;
				}else {
					count+=2;
				}
			}
			iter+=1;
			System.out.println(iter);
		}
		return count;
	}

}
