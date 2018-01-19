package com.codility;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = new int[]{5,6,1,9,11,-1,55,29,8,8,1};
		new QuickSort().sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}	
	}
	
	public void sort(int arr[]){
		quickSort(arr,0,arr.length -1);
	}
	
	
	public void quickSort(int arr[], int start, int end){
		if(start<end){
			int pp = partition(arr, start, end);
			quickSort(arr, start, pp-1);
			quickSort(arr, pp+1, end);
		}
	}
	
	public int partition(int[] arr,int start, int end){
		int pvalue = arr[end]; //selected pivot point.
		int i = start-1;
		
		for(int j = start ;j<=end-1;j++){
			if(arr[j]<=pvalue){
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[end];
		arr[end] = temp;
		
		return i+1;
	}
	
	

}
