package com.codility;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class PrimeSieve {
	
	
	public static void main(String[] args){
	//	primeNumbers(10);
		
		HashSet<Integer> primeFactors = primeFactor(70,arrayF(70));
		
		Iterator<Integer> ite = primeFactors.iterator();
		System.out.println("total : "+primeFactors.size());
		while(ite.hasNext()){
			System.out.println("pf : "+ite.next());
		}
	}
	
	public static void primeNumbers(int n) { 
        // initially assume all integers are prime
        boolean[] isPrime = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // mark non-primes <= n using Sieve of Eratosthenes
        for (int factor = 2; factor*factor <= n; factor++) {
            // if factor is prime, then mark multiples of factor as nonprime
            // suffices to consider mutiples factor, factor+1, ...,  n/factor
            if (isPrime[factor]) {
                for (int j = factor; factor*j <= n; j++) {
                    isPrime[factor*j] = false;
                }
            }
        }

        // count primes
        int primes = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) primes++;
        }
        System.out.println("The number of primes <= " + n + " is " + primes);
    }
	
	
	
	public static HashSet<Integer> primeFactor(int n, int[] F){
		HashSet<Integer> primeFactors = new HashSet<Integer>();
		while(F[n] > 0){
			primeFactors.add(F[n]);
			n /=F[n];
		}
		primeFactors.add(n);
		
		
		return primeFactors;
	}
	
	
	public static int[] arrayF(int n){
		int[] F = new int[n+1];
		int i = 2;
		while(i*i <=n){
			if(F[i] == 0){
				int k = i*i;
				while(k<=n){
					if(F[k] == 0){
						F[i] = i;
					}
					k+=1;
				}
			}
			i+=1;
		}
		
		return F;
	}
	
	
	
	
}
