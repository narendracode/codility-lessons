package com.codility;

import  java.util.Arrays;
public class Test {

	public static void main(String[] args) {
		System.out.println(new Test().solution(new int[]{1,4,7,3,3,5}));

	}
	public int solution(int[] array) {
		if (array.length == 1) {
			return -2;
		}

		Arrays.sort(array);

		long maxDistance = Long.MIN_VALUE;

		for (int i = 1; i < array.length; i++) {
			long distance = (long) array[i] - array[i-1];
			if (distance > maxDistance) {
				maxDistance = distance;
			}
		}

		return (int)maxDistance ;
	}
}
