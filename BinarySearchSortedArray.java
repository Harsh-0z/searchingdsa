// Binary Search_ Search in Array

// Success rate: 27.35%
// Given a sorted array of n integers and a number k, Return true if k is present otherwise return false.

// Input Format:
// First line contains integer n representing the length of array
// Second line contains n integers
// Third line contains integer k

// Output Format:
// Return true if k is present else false.

// Constraints:
// 1 <= n <= 10^9

// Sample test cases
// Input

// 10
// 4 7 10 13 15 20 21 24 26 28
// 13
// Expected output
// true


import java.util.Scanner;
	//T.C=O(logN)
public class BinarySearchSortedArray {
	public static void main(String[] args) {
		// write your code here
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[] arr = new int[n];

		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		int k = s.nextInt();
		System.out.println(binarySearch(arr,k));//for sorted array
	}
	public static boolean  binarySearch(int[]arr,int k){
		int n = arr.length;
		int lo = 0 ; 
		int hi = n-1;

		


		while(lo<=hi){
			int m = lo+(hi-lo/2);
			if(arr[m]==k){
				return true;
			}else if(arr[m]>k){
				hi = m-1;
			}else{
				lo = m+1;
			}
			
		}
		return false;
	}
}