package numeric.prime;

public class PrimeNumberTest {
	public static void main(String[] args) {
		PrimeNumber prime = new PrimeNumberImpl();
		
		long start = System.currentTimeMillis();
		System.out.println("Start");
		
		for (int x : prime.getPrimes(100))
			assert prime.isPrime(x);
		
		System.out.println(String.format("End : %dms", System.currentTimeMillis() - start));
	}
}
