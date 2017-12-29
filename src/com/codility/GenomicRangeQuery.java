package com.codility;



public class GenomicRangeQuery {

	public static void main(String[] args) {
		System.out.println(java.util.Arrays.toString(new GenomicRangeQuery().solution("CAGCCTA", new int[]{2,5,0}, new int[] {4,5,6})));
	}
	
	public int[] solution(String S, int[] P, int[] Q){
		java.util.Map<Character,Integer> map = new java.util.HashMap<Character,Integer>();
		map.put('A', 1);
		map.put('C', 2);
		map.put('G', 3);
		map.put('T', 4);
		
		int[] result = new int[P.length];
		
		
		for (int i = 0; i < P.length; i++) {
			int pVal = P[i];
			int qVal = Q[i];
			
			int min = map.get(S.charAt(pVal));
			
			for (int j = pVal; j <= qVal; j++) {
				if(min> map.get(S.charAt(j)))
					min = map.get(S.charAt(j));
			}
			result[i] = min;
		}
		
		return result;
	}
}
