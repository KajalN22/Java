package com.coding;

public class ReverseArray {

	public static void main(String[] args) {
		
		int [] orgArr= {1,2,3,4,5,6};
		System.out.println("Original Array: ");
		for(int i:orgArr) {
			System.out.print(i+ " ");
		}
		System.out.println();
		ReversedArray(orgArr);

	}

	private static void ReversedArray(int[] arr) {
		
		int[] ReversedArray=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			ReversedArray[i]=arr[arr.length-i-1];
		}	
			System.out.println("Reversed Array: ");
			for(int i:ReversedArray) {
				System.out.print(i+ " ");
			}
		
		
		
	}

}
