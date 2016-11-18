package numeric.prime;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberImpl implements PrimeNumber {
	
	@Override
	public boolean isPrime(long x) {
		if(x <= 1) {
			return false;
		} else if (x == 2) {
			return true;
		} else if (x % 2 == 0) {
			return false;
		} else {
			for (int divisor = 3; divisor <= (int) Math.sqrt(x); divisor += 2) {
				if (x % divisor == 0) return false;
			}
		}
		return true;
	}

	@Override
	public List<Integer> getPrimes(int n) {
		return getPrimes(1, n);
	}

	@Override
	public List<Integer> getPrimes(int a, int b) {
		if (a > b) return null;
		
		else if (a <= 0) a = 2;
		
		boolean[] numbers = new boolean[b+1];
		List<Integer> primes = new ArrayList<>();
		
		for (int i = 2; i < numbers.length; i++)
			numbers[i] = true;
			
		for (int num = 3; num <= (int) Math.sqrt(b); num += 2) {
			if (numbers[num] == true)
				for (int i = num; i < b + 1; i += num)
					numbers[i] = false;
		}
		
		if (b >= 2) primes.add(2);
		for (int i = 3; i < numbers.length; i += 2)
			if (numbers[i]) primes.add(i);
		
		return primes;
	}
	
	
}
