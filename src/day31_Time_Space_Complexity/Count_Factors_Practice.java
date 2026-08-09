package day31_Time_Space_Complexity;

import java.util.Scanner;

public class Count_Factors_Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println(Count_Fact(num));
		
	}
	
	static int Count_Fact(int num) {
		int count=0,j;
		for(int i=1;i*i<=num;i++) {
			if(num%i==0) {
				j=num/i;
				if(i==j)
					count+=1;
				else
					count+=2;
			}
		}
		return count;
	}
}
