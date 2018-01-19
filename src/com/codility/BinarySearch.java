package com.codility;

public class BinarySearch {

	public static void main(String[] args) {
		
		System.out.println(new BinarySearch().binarySearch(new int[]{2,7,11,23,31,33,34,43,45,71,90,101}, 23));
		
		System.out.println(new BinarySearch().recursiveBinarySearch(new int[]{2,7,11,23,31,33,34,43,45,71,90,101}, 23,0,11));

	}
	
	public static int binarySearch(int[] arr,int num){
		int p = 0;
		int r = arr.length-1;
		while(p<=r){
			int q = (p+r)/2;
			if(arr[q] == num)
				return q;
			if(num>arr[q]){
				p = q+1;
			}else{
				r = q-1;
			}
		}
		
		return -1;
	}
	
	public static int recursiveBinarySearch(int[] arr, int num,int p, int r ){
		int q = (p+r)/2;
		if(p>r)
			return -1;
		
		if(arr[q] == num)
			return q;
		
		if(num>arr[q]){
			return recursiveBinarySearch(arr,num,q+1,r);
		}else
			return recursiveBinarySearch(arr,num,p,q-1);
		
		
	}
	
	
	

}
