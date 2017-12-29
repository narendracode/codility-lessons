package com.codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FrogRiverOne {

	public static void main(String[] args) {
		//System.out.println(new Sol8().solution(5, new int[]{1,3,1,4,2,3,5,4}));
		System.out.println(new FrogRiverOne().solution(3, new int[]{1, 3, 1, 3, 2, 1, 3}));
	}
	
	public int solution(int X, int[] A){
		if(A.length == 0){
			return -1;
		}else{
			TreeSet<Integer> set = new TreeSet<>();
			HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
			for (int i = 0; i < A.length; i++) {
				if(!map.containsKey(A[i])){
					map.put(A[i], i);
				}
				set.add(A[i]);
			}
			
			List<Integer> list = set.stream().collect(Collectors.toList());
			if(list.contains(X) && list.indexOf(X) == X-1){
				return map.get(X);
			}else
				return -1;
			
		}

	}//solution
	
}
