package day31_Time_Space_Complexity;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		if(isPrime(num)) {
			System.out.println(num+" is prime number");
		}else {
			System.out.println(num+" is non prime number");
		}
		
		sc.close();
		
	}
	static boolean isPrime(int num) {
		int factors = countFactors(num);
		if (factors ==2) {return true;}
		else {return false;}
	}
	
	static int countFactors(int n) {
		int count = 0;
		//int iter = 0;
		for(int i=1;i*i <=n ;i++) {
			if(n%i==0) {
				int j=n/i;
				if(i==j) {
					count+=1;
				}else {
					count+=2;
				}
			}
			//iter+=1;
			//System.out.println(iter);
		}
		return count;
	}

}
