package com.codility;

public class TapeEquilibrium {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new TapeEquilibrium().solution(10, 85, 30));
	}

	
	public int solution(int X, int Y, int D){
		int minJmp = 0;
		if(X<Y){
			if((Y-X)<=D){
				minJmp = 1;
			}else{
				int count = (Y-X)/D;
				if( ((Y-X) % D) != 0 ){
					count = count+1;
				}
				minJmp = count;
			}
		}
		return minJmp;
	}
}
