package com.codility;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = new InsertionSort().sort(new int[]{-4,5,6,1,9,11,-1,8});

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}		
	}
	
	
	
	public static int[] sort(int[] arr){
		for (int i = 1; i < arr.length; i++) {
			for(int j = i;j>0;j--){
				if(arr[j-1] >arr[j]){
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		
		return arr;
	}

}
