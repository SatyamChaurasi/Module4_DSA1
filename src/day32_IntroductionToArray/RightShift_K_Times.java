package day32_IntroductionToArray;

public class RightShift_K_Times {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7};
		//rotateKtimes(arr,2);
		rotateKtimes_Opti(arr,3);

	}
	//brute Force approach
	static void rotateKtimes(int [] A,int k) {
		for(int i=1;i <= k;i++) {
			rightShift(A);
		}
		for(int num:A) {
			System.out.print(num+", ");
		}
	}
	static void rightShift(int arr[]) {
		int n = arr.length;
		int temp = arr[n-1];
		for(int i=n-1; i >= 1 ; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
	}
	//Optimized Approach
	static void rotateKtimes_Opti(int [] A,int k) {
		k = k % A.length;
		System.out.println("Original Array");
		for(int num:A) {
			System.out.print(num+", ");
		}
		reverseArr(A);
		System.out.println("\n After Reverse Array");
		for(int num:A) {
			System.out.print(num+", ");
		}
		reversePart(A,0,k-1);
		System.out.println("\n Reverse Array 0 to K-1");
		for(int num:A) {
			System.out.print(num+", ");
		}
		reversePart(A,k,A.length-1);
		System.out.println("\n Reverse Array 0 to N-1 and Final Answer");
		for(int num:A) {
			System.out.print(num+", ");
		}
		
		
	}
	static void reverseArr(int [] arr) {
		int i = 0;
		int j = arr.length-1;
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
//		System.out.println("after reverse-------------");
//		for(int n: arr) {
//			System.out.print(n+" ,");
//		}
	}
	static void reversePart(int arr[],int l,int r) {
		int i =l;
		int j =r;
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
//		System.out.println("after part"+l+" to "+r+"  reverse-------------");
//		for(int n: arr) {
//			System.out.print(n+" ,");
//		}
	}
	
}
