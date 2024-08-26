package com.coding;

import java.util.Arrays;

public class FindKthLargestAndSmallestEle {

	public static void main(String[] args) {
		
		int[] arr= {2,5,1,15,8,10};
		int k=2;
		
		System.out.println("Kth Largest element is: "+  kthLargest(arr,k));

	}

	private static int  kthLargest(int[] arr, int k) {
		//sort the given array
		Arrays.sort(arr);
		
		//return kth elemnet
		
		return arr[arr.length-2];
	}

}
