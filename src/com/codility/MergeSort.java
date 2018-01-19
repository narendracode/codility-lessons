package com.codility;



public class MergeSort {
	public static void main(String[] args) {
		int[] arr = new int[]{5,6,1,9,11,-1,55,29,8,8,1};
		new MergeSort().sort(arr,0,arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}		
	}
	
	public void mergeSort(int[] arr,int start, int end){
		if(end<=start)
			return;
	
		int mid = (start + end)/2;
		mergeSort(arr,start,mid);
		mergeSort(arr,mid+1,end);
		merge(arr,start,mid,end);
		
	}
	
	
	public void sort(int[] arr, int start, int end){
		mergeSort( arr, start,  end);
	}
	
	public void merge(int[] arr,int start, int mid, int end){
		int leftCnt = mid - start+1;
		int rightCnt = end - mid;

		int[] leftArr  = new int[leftCnt+1];
		int[] rightArr = new int[rightCnt+1];
		
		for (int i = 0; i < leftCnt; i++) {
			leftArr[i] = arr[start+i];
		}
		
		for (int i = 1; i <= rightCnt; i++) {
			rightArr[i-1] = arr[mid+i];
		}
		
		leftArr[leftCnt] = Integer.MAX_VALUE;
		rightArr[rightCnt] = Integer.MAX_VALUE;
		
		int i = 0; int j = 0;
		
		for (int k = start; k <= end; k++) {
			if(leftArr[i] > rightArr[j] ){
				arr[k] = rightArr[j];
				j++;
			}else{
				arr[k] = leftArr[i];
				i++;
			}
		}
	}
	
	
	
	

}
