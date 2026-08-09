package day34_Arrays_Prefix_Sum_and_Carry_Forward;

public class Calculate_Sum_Of_Array {

	public static void main(String[] args) {
		int [] arr = {-3, 6, 2, 4, 5, 2 ,8 ,-9 ,3, 1 };
		int [][] queries = {{4,8},{3,7},{1,3}, {0,4},{7,7}};
		Q1(arr,queries);

	}
	static void Q1(int A[],int[][] queries) {
		//iterate over queries
		for(int i=0;i<queries.length;i++) {
			int l = queries[i][0];
			int r = queries[i][1];
			System.out.println(SumRange(A, l,r));
		}
	}
	static int SumRange(int arr[],int l,int r) {
		int sum = 0;
		for(int i=l;i<=r;i++) {
			sum+=arr[i];
		}
		return sum;
	}
}
