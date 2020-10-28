package it.unical.Esercizio28_10;

import java.util.LinkedList;

import java.util.List;

public class Math {
	
	public List<Integer> generaNumeriPrimi(int n){
		List<Integer> primeNumbers = new LinkedList<>();
		if(n>=2)
			primeNumbers.add(2);
		for(int i=3; i<=n; i+=2) {
			if(primo(i))
				primeNumbers.add(i);
		}
		return primeNumbers;
	}

	public boolean primo(int num) {
		int lim = num/2;
		boolean isPrimo = true;
		for(int div = 2; div <= lim && isPrimo; div++)
			if (num % div == 0)
				isPrimo = false;
		return isPrimo;
	}
}
