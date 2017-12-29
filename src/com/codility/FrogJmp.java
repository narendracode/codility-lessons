package com.codility;

import java.util.Arrays;


public class FrogJmp {

	public static void main(String[] args) {
		//System.out.println(new Sol4().solution(new int[]{3,1,2,4,3}));
		System.out.println(new FrogJmp().solution(new int[]{3,4}));
	}

	public int solution(int[] A){
		int min = 9999999;
		if(A.length ==1)
			min = A[0];

		int sum = Arrays.stream(A).sum();
		
		int sum1 = A[0];
		int sum2 = sum-A[0];
		
		for(int i = 1;i<A.length;i++){
			if(i>1){
				sum1 = sum1 + A[i-1];
				sum2 = sum2 - A[i-1];
			}
			
			int diff = sum1 - sum2;
			if(diff<0)
				diff = diff*-1;
			
			if(min>diff)
				min = diff;
		}
		
		return min;
	}
}
