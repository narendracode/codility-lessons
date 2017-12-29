package com.codility;

import java.util.Arrays;

public class CyclicRotation {

	public static void main(String[] args) {
		//System.out.println(Arrays.toString(new Sol3().solution(new int[]{1,2,3,4}, 2)));
		System.out.println(Arrays.toString(new CyclicRotation().solution(new int[]{}, 2)));
	}
	
	public int[] solution(int[] A, int K){
		while(K>0 && A.length>0){
			int temp = A[A.length - 1];
			for (int i = 0; i < A.length; i++) {
				int temp1 = A[i];
				A[i] = temp;
				temp = temp1; 
			}
			K--;
		}
		return A;
	}
}
