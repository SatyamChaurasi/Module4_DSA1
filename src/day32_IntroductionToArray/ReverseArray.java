package day32_IntroductionToArray;

public class ReverseArray {

	public static void main(String[] args) {
		int [] arry = {1,2,3,4,5,6,7};
		reverseArr(arry);

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
		System.out.println("after reverse-------------");
		for(int n: arr) {
			System.out.print(n+" ,");
		}
	}
}
