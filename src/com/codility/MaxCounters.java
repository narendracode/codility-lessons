package com.codility;

import java.util.Arrays;

public class MaxCounters {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new MaxCounters().solution(5, new int[]{3,4,4,6,1,4,4})));
	
	}
	
	
	 public int[] solution(int N, int[] A){
		 int[] counters = new int[N];
		 int max = 0;
		 int lastUpdateForAll = 0;
		 for (int i = 0; i < A.length; i++) {
			 
			 if(A[i] <= N && A[i] >= 1){
				 if(counters[A[i] -1] < lastUpdateForAll)
					 counters[A[i] -1] = lastUpdateForAll;
				 
				 counters[A[i] - 1] = counters[A[i] - 1] + 1;
				if(max <= counters[A[i] - 1])
					max = counters[A[i] - 1];
			}
			
			if(A[i] == N + 1){
				//Arrays.fill(counters, max);
				lastUpdateForAll = max;
			}
		}
		 
		for (int i = 0; i < counters.length; i++) {
			if(counters[i]<lastUpdateForAll){
				counters[i] = lastUpdateForAll;
			}
		}
		 
		 return counters;
	 }
	
	
	/* public int[] solution(int N, int[] A){
		 int[] counters = new int[N];
		 int max = 0;
		 
		 for (int i = 0; i < A.length; i++) {
			if(A[i] <= N && A[i] >= 1){
				counters[A[i] - 1] = counters[A[i] - 1] + 1;
				if(max <= counters[A[i] - 1])
					max = counters[A[i] - 1];
			}
			
			if(A[i] == N + 1){
				Arrays.fill(counters, max);
			}
		}
		 
		 return counters;
	 }*/

}
