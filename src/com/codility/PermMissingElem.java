package com.codility;

import java.util.Arrays;

public class PermMissingElem {

	public static void main(String[] args) {
		//System.out.println(new Sol5().solution(new int[]{2,3,1,5}));
		//System.out.println(new Sol5().solution(new int[]{}));
		System.out.println(new PermMissingElem().solution(new int[]{2,3,4,1}));

	}
	
	
	public int solution(int[] A){
		Arrays.sort(A);
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			count++;
			if(A[i] != i+1)
				return i+1;
				
		}
		
		if(count==A.length)
			return A.length+1;
		
		return 1;
	}
}
