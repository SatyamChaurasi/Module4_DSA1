package day31_Time_Space_Complexity;

public class HowManyPrimeNumbers {

	public static void main(String[] args) {
		int nums[] = {10,11,23,2,25,27,31};
		
		int countPrimeNumbers = countPrimeNumbersList(nums);
		System.out.println(countPrimeNumbers +" are primes numbers in array");

	}
	static int countPrimeNumbersList(int []nums) {
		int CountPrimes = 0; 
		for(int i=0;i<nums.length;i++) {
			if(isPrime(nums[i])){
				CountPrimes++;
			}
		}
		return CountPrimes;
		
	}
	static boolean isPrime(int num) {
		int factors = countFactors(num);
		if(factors == 2) {
			return true;
		}else {
			return false;
		}
		
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
