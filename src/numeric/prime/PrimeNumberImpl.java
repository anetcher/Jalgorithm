package numeric.prime;

import java.util.List;

public class PrimeNumberImpl implements PrimeNumber {
	
	@Override
	public boolean isPrime(int x) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPrime(long x) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Integer> getPrimes(int n) {
		return getPrimes(1, n);
	}

	@Override
	public List<Integer> getPrimes(int a, int b) {
		// TODO Auto-generated method stub
		
		// HINT: Sieve of Eratosthenes
		// TODO: Return empty list when a is larger then b
		// TODO: Ignore negative numbers when a is negative
		return null;
	}

}
