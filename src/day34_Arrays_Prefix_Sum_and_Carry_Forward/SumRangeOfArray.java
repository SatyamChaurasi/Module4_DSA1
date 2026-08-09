package day34_Arrays_Prefix_Sum_and_Carry_Forward;

public class SumRangeOfArray {

	public static void main(String[] args) {
		int [] arr = {1,4,5,-6,9,3,2,8};
		System.out.println( SumRange(arr,1,3));
		

	}
	static int SumRange(int arr[],int l,int r) {
		int sum = 0;
		for(int i=l;i<=r;i++) {
			sum+=arr[i];
		}
		return sum;
	}

}