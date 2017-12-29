package com.codility;

import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class OddOccurrencesInArray {

	public static void main(String[] args) {
		int a = new OddOccurrencesInArray().solution(new int[]{2,2,5,1,3,1,3});
		System.out.println(a);
	}
	public int solution(int[] A){

		Arrays.sort(A);
		Integer[] boxedInts = IntStream.of(A).boxed().toArray(Integer[]::new);
		List<Integer> list = Arrays.asList(boxedInts);
		

		 Map<Integer,Long> map = list.stream().collect(Collectors.groupingBy(p->p,Collectors.counting()) );
		
		Iterator<Integer> i =   map.keySet().iterator();
		while(i.hasNext()){
			int key = i.next();
			long val = map.get(key);
			if(val%2 !=0){
				return (int)key;
			}
		}

		return -1;
	}
}
