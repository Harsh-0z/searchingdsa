// Binary Search_Floor in an Array

// Success rate: 18.82%
// Given a sorted array of n integers and a number k, Return floor(k).

// Input Format:
// First line contains integer n representing the length of array
// Second line contains n integers
// Third line contains integer k

// Output Format:
// Return floor of k.

// Constraints:
// 1 <= n <= 10^9

import java.util.Scanner;


public class BinarySearchFloork {
	public static void main(String[] args) {
		// write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int[] arr = new int[n];

		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}

		int k = s.nextInt();

		System.out.println(binarySrchFloorK(arr,k));
	}
	public static int binarySrchFloorK(int[]arr,int k){
		int n = arr.length;

		int lo = 0;
		int hi = n-1;

		int ans = Integer.MIN_VALUE;
		while(lo<=hi){
			int m = lo+(hi-lo/2);
			
			if(arr[m]==k){
				return k;
			}else if(arr[m]<k){
				if(arr[m]>ans){
					ans=arr[m];
				}
				hi = m-1;
			}else{
				lo=m+1;
			}
			
		}
		return ans;
		
	}
}