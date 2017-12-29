package com.codility;


public class MaxProductOfThree {

	public static void main(String[] args) {
		System.out.println(new MaxProductOfThree().solution(new int[]{ -3,1,2,-2,5,6 }));
	}

	public int solution(int[] A){
		java.util.Arrays.sort(A);
		if(A.length>3){
			if(A[A.length -1] < 0){
				//if all negative
				return A[A.length-1] * A[A.length-2]*A[A.length-3];
			}
			if(A[1] < 0 && (A[0]*A[1]  > A[A.length-2] * A[A.length -3]) ){
				// first two are negative.
				return A[0]*A[1]*A[A.length-1];
			}else{
				//all positive
				return A[A.length-1] * A[A.length-2] * A[A.length-3];
			}
		}else{
			return A[2] * A[1] *A[0];
		}
	}
}
