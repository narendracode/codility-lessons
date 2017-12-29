package com.codility;

import java.util.Arrays;

public class MissingInteger {

	public static void main(String[] args) {
		System.out.println(new MissingInteger().solution( new int[]{1, 3, 6, 4, 1, 2})); //5
		System.out.println(new MissingInteger().solution( new int[]{1, 2, 3})); //4
		System.out.println(new MissingInteger().solution( new int[]{-1,-3})); //1
		System.out.println(new MissingInteger().solution( new int[]{4, 5, 6, 2})); //1
		System.out.println(new MissingInteger().solution( new int[]{4,1, 5, 6, 2})); //3
		
	}
	
	 public int solution(int[] A){
		 Arrays.sort(A);
		 if(A.length == 0 || A[A.length -1] <= 0)
			 return 1;
		 else if(A.length == 1){
			 if(A[0]<=0)
				 return 1;
			 else if(A[0] == 1){
				 return 2;
			 }else
				 return 1; 
		 }
		 else{
			 if(A[0]>1)
				 return 1;
			 int missMin = 1;
			 for (int i = 0; i < A.length; i++) {
				 if(A[i]<=0)
					 continue;
				 if(missMin==A[i]){
					missMin = missMin + 1;
					 continue;
				 }
				 if(A[i] > missMin+1){
					 break;
				 }
					 
			}
			return missMin;
		 }
		
	 }
}
