package com.codility;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = new SelectionSort().sort(new int[]{5,6,1,9,11,-1});
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}		
	}
	
	
	
	public static int[] sort(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for(int j = i+1;j<arr.length;j++){
				if(arr[min] > arr[j]){
					min = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		return arr;
	}

}
