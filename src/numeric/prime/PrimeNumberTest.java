package numeric.prime;

public class PrimeNumberTest {
	public static void main(String[] args) {
		PrimeNumber prime = new PrimeNumberImpl();
		
		for (int x : prime.getPrimes(10_000))
			assert prime.isPrime(x);
	}
}
