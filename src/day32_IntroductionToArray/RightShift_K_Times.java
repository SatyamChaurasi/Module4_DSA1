package day32_IntroductionToArray;

public class RightShift_K_Times {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7};
		rotateKtimes(arr,2);

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
}
