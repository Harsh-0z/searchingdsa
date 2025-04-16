// Binary Search_Single Element in Array

// Success rate: 25.97%
// You are given an array consisting of n integers where every element appears exactly twice, except for one element which appears exactly once. Duplicate Numbers are adjacent to each other.

// Return the single element that appears only once.

// Your solution must run in O(log n) time and O(1) space.

// Input Format:
// First line contains integer n representing the length of array
// Second line contains n integers

// Output Format:
// Return the number appearing only once.

// Constraints:
// 1 <= n <= 10^9

// Sample test cases
// Input
// Expected output
// 15
// 4 4 1 1 9 9 11 11 20 7 7 3 3 5 5
// 20

import java.util.Scanner;

public class BinarySearchSingleElementArray {
	public static void main(String[] args) {
		// write your code here
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}

		System.out.print(uniqueElementBinarySearch(arr));


	}

	public static int uniqueElementBinarySearch(int[] arr){
		int n = arr.length;
		if(arr[0]!=arr[1]){
			return arr[0];
		}
		if(arr[n-1]!=arr[n-2]){
			return arr[n-1];
		}

		int lo = 2;
		int hi = n-3;

		while(lo<=hi){
			int m = lo+(hi-lo)/2;

			if(arr[m]!=arr[m-1]&&arr[m]!=arr[m+1]){
				return arr[m];
			}
			if(arr[m]==arr[m-1]){
				m--;
			}
			if(m%2==0){
				lo = m+2;//m+2 because m is on first occurance so we can skip the second occurance for sure.
			}else{
				hi = m-1;
			}
		}

		return -1;
	}
}