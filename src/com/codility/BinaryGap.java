package com.codility;

public class BinaryGap {

	public static void main(String[] args) {
		int max = new BinaryGap().solution(1041);
		System.out.println(max);
	}

	
	int solution(int N){
		int max=0;
		int count = 0;
		boolean end = false;
		char[] chars = Integer.toBinaryString(N).toCharArray();
		System.out.println(chars);
		for(int i=0;i<chars.length;i++){
			if(chars[i]=='1'){
				if(count>max)
					max = count;
				
				count = 0;
				end = true;
			}else{
				count++;
				end = false;
			}
		}
		
		if(end)
		if(count>max)
			max = count;
		
		return max;
	}
}
