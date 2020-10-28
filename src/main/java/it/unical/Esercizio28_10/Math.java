package it.unical.Esercizio28_10;

import java.util.LinkedList;

import java.util.List;

public class Math {
	
	public List<Integer> generaNumeriPrimi(int n){
		List<Integer> primeNumbers = new LinkedList<>();
		if(n>=2)
			primeNumbers.add(2);
		for(int i=3; i<=n; i+=2) {
			if(isPrime(i))
				primeNumbers.add(i);
		}
		return primeNumbers;
	}

	public boolean isPrime(int number) {
	    if(number < 2)
	      return false;
	    
	    for(int i=2;i<=number;i++) {
	      if(number % i == 0 && i != number)
	        return false;
	    }
	    return true;
	  }
}
