package com.umesh.sample;

import java.util.stream.IntStream;

public class PrimeNumWithWithoutLambda {

	public static void main(String[] args) {
		
		System.out.println(PrimeNumWithWithoutLambda.isPrimeWithoutLamda(13));		
		System.out.println(PrimeNumWithWithoutLambda.isPrimeWithLambda(0));
		
	}
		
		private static boolean isPrimeWithoutLamda(int num){
			if(num<2){
				return false;
			}

			for (int i = 2; i < num; i++) {
				if(num%i==0){
					return false;
				}
			}
			return true;
		}
		
        private static boolean isPrimeWithLambda(int num){
			
			return num > 1 && IntStream.range(2, num).noneMatch(index->num%index==0);
		 }
	
	
		
		
	     
	}




