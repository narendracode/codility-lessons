package com.codility;

import java.util.Arrays;

public class PermCheck {

	public static void main(String[] args) {
		System.out.println(new PermCheck().solution(new int[]{2,3,4,1,5}));
	}
	 
	public int solution(int[] A){
		Arrays.sort(A);
		if(A.length == 0)
			return 0;
		
		int count = 1;
		for (int i = 0; i < A.length; i++) {
			if(A[i] !=count)
				return 0;
			count++;
		}
		
		return 1;
	}
}
