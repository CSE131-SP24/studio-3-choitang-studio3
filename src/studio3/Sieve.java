package studio3;

import java.util.Scanner;
import java.util.Arrays;


public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please input the numebr");
		
		int n = in.nextInt();
		
		boolean isPrime[] = new boolean[n+1];
		
		for(int i = 0; i <= n; i++) {
			isPrime[i] = true;
		}
		
		isPrime[0] = false;
		isPrime[1] = false;
		
		for(int i = 2; i*i <= n; i++) {
			
			if (isPrime[i]) {
				
				for(int j = i * i; j <= n; j+= i) {
					
					isPrime[j] = false;
					
				}
			}
		}
		
		System.out.println("Below are the primes below " + n);
		
		for (int i = 2; i <= n; i++) {
			
			if (isPrime[i])
				System.out.println(i+", ");
		}
	}

}
