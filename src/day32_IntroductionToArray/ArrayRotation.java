package day32_IntroductionToArray;

import java.util.ArrayList;

public class ArrayRotation {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,0};
		int[] solutionArr = solve(arr,4);
		System.out.println("Solution ");
		for(int ar : solutionArr) {
			System.out.print(" "+ar);
		}

	}
	
	//Array Support
	static void reversePart (int arr[],int l,int r){
		System.out.println("l "+l+" r "+r);
        int i=l,j=r;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static int[] solve(int[] A, int B) {
       int n= A.length;
       B= B % n;
    reversePart(A,0,n-1);

    reversePart(A,0,B-1);

    reversePart(A,B,n-1);
    return A;
    }
    
    //Java 8 
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int n= A.size();
        B= B % n;
        reversePart(A,0,n-1);

        reversePart(A,0,B-1);

        reversePart(A,B,n-1);
        return A;
    }

    static void reversePart (ArrayList<Integer> arr,int l,int r){
		
        int i=l,j=r;
        while(i<j){
            Integer temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
    }
}
