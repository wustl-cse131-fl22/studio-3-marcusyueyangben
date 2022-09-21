package studio3;

import java.util.Scanner;

public class SieveofEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] seive = new int[40];
		for(int k = 1; k<=40; k++) {
			seive[k-1] = k;
		}
		boolean[] prime = new boolean[40];
		int primeNum = 0;
		
		for(int i = 1;i<=40;i++) {
			primeNum = 0;
			for(int j=1;j<=40;j++) {
				if(seive[i-1]/j == (double)seive[i-1]/j) {
					primeNum++;
				}
			}
			if(primeNum == 2) {
				prime[i-1] = true;
			}
			else {
				prime[i-1] = false;
			}
		}
		
		for(int i = 1;i<=40;i++) {
			System.out.println(i+" "+prime[i-1]+" ");
		}
			
	}

}
