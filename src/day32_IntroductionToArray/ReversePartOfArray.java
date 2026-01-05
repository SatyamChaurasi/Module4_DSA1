package day32_IntroductionToArray;

public class ReversePartOfArray {

	public static void main(String[] args) {
		int arry[] = {10,20,30,40,50,60,70,80,90};
		reversePart(arry,2,6);

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
		System.out.println("after part"+l+" to "+r+"  reverse-------------");
		for(int n: arr) {
			System.out.print(n+" ,");
		}
	}

}
