package com.codility;

import java.util.Arrays;

public class MinAvgTwoSlice {

	public static void main(String[] args) {
		new MinAvgTwoSlice().solution(new int[]{4,2,2,5,1,5,8});

	}
	 public int solution(int[] A){
		 
		 int si = -1;
		 double min = 0.0;
		 
		 int[] prefA = new int[A.length];
		 
		 for (int i = 0; i < A.length; i++) {
			if(i == 0)
				prefA[i] = A[i];
			else{
				prefA[i] = prefA[i-1]+A[i]; 
			}
		}
		 
		 System.out.println(Arrays.toString(prefA));
		 

		 int minVal = 0;
		 int minI = 0;
		 
		 int[][] minVals = new int[A.length-2][1];
		 int[] minIs = new int[A.length-2];
		 
		
		 for (int i = 0; i < minVals.length; i++) {
			 for (int j = 0; j < A.length-2; j++) {
				 if(i == 0){ 
					 if(j == 0){
						 //initialize
						 minVals[i][0] = prefA[1];
						 minIs[0] = 0;
						 minVal = prefA[1];
						 minI = 0;
					 }else{
						 
						 int current = prefA[j+1];
						 if(minVal>current){
							 minVal = current;
						 }
					 }
				 }else{
					 
				 }
			 }//for
		}//for
		 
		 
		 return si;
		 
	 }
}
