package com.codility;



public class Distinct {

	public static void main(String[] args) {
		System.out.println(new Distinct().solution(new int[]{ 2,1,2,2,3,1 }));
	}

	 public int solution(int[] A){
		java.util.Map<Integer,Integer> set = new java.util.HashMap<>();

		for (int i = 0; i < A.length; i++) {
			set.put(A[i],A[i]);
		}
		 
		 return set.keySet().size();
	 }
	
}
