package day31_Time_Space_Complexity;

import java.util.Scanner;

public class SumOfNaturalNumber {

//	The sum of n natural numbers is :
//	(n*(n+1))/2
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sumOfNatural = (num*(num+1))/2;
		sc.close();
		System.out.println("sum of Natural Number "+num +" is "+ sumOfNatural);
	}

	//How many elements are there between [135, 246] (inclusive of them) ?
	//112 
	// 246-135+1 = 112
}
