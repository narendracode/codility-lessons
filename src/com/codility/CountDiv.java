package com.codility;

public class CountDiv {

	public static void main(String[] args) {
		System.out.println(new CountDiv().solution(6, 10, 2));

	}

	public int solution(int A, int B, int K){
	  /*  int count = (B - A) / K;
	    if (B % K == 0 || A % K == 0)
	        count++;
	    return count; */
	    
	    return (B/K) - (A/K) + (A%K == 0 ? 1 : 0);
	    
	}
}
