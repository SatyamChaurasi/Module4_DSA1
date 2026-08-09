package day32_IntroductionToArray;

import java.util.ArrayList;

//Problem Description
//Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.
//
//
//Problem Constraints
//
//1 <= N <= 105
//1 <= A[i] <=109
//1 <= B <= 109
//
//Input Format
//The first argument given is the integer array A.
//The second argument given is the integer B.
//
//Output Format
//Return the array A after rotating it B times to the right
//
//
//Example Input
//Input 1:
//A = [1, 2, 3, 4]
//B = 2
//
//Input 2:
//A = [2, 5, 6]
//B = 1
//
//
//Example Output
//Output 1:
//[3, 4, 1, 2]
//		
//Output 2:
//[6, 2, 5]
//
//Example Explanation
//Explanation 1:
//Rotate towards the right 2 times - [1, 2, 3, 4] => [4, 1, 2, 3] => [3, 4, 1, 2]
//		
//Explanation 2:
//Rotate towards the right 1 time - [2, 5, 6] => [6, 2, 5]

public class ArrayRotationPractice {

	public static void main(String[] args) {
		ArrayList<Integer> arl = new ArrayList<>();
		arl.add(1);
		arl.add(2);
		arl.add(3);
		arl.add(4);
		arl.add(5);
		ArrayList<Integer> rotateSol = Rotate(arl,2);
		System.out.println("Solution "+rotateSol);
		


	}
	static ArrayList<Integer> Rotate(ArrayList<Integer> arl,int b){
		int n = arl.size();
		b = b%n;
		reversePart(arl,0,n-1);

        reversePart(arl,0,b-1);

        reversePart(arl,b,n-1);
        return arl;
		
	}
	
	static void reversePart(ArrayList<Integer> A,int l, int r) {
		int i=l,j=r;
		while(i<j) {
			Integer temp = A.get(i);
			A.set(i, A.get(j));
			A.set(j, temp);
			i++;
			j--;
		}
	}

}
