package numeric.prime;

import java.util.List;

public interface PrimeNumber {
	
	// Return if x is prime number
	public abstract boolean isPrime(long x);
	
	// Return list of prime numbers between 1 to n
	public abstract List<Integer> getPrimes(int n);
	
	// Return list of prime numbers between a to b
	public abstract List<Integer> getPrimes(int a, int b);
}
