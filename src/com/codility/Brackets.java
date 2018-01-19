package com.codility;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Brackets {

	public static void main(String[] args) {
		

	}
	 public int solution(String S){
		char[] chars =  S.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < chars.length; i++) {
			if(chars[i] == '(' || chars[i] ==  '{' || chars[i] ==  '[' || chars[i] ==  ']'|| chars[i] ==  '}' || chars[i] ==  ')'){
				continue;
			}else
				stack.push(chars[i]);
		}
		
		Queue<Character> queue = new LinkedList();
		
		return 0;
	 }
}
