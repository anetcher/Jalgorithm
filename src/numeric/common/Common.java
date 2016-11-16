package numeric.common;

public class Common {
	
	public static long gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
	
	public static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}
	
	public static long lcm(int a, int b) {
	    return a * (b / gcd(a, b));
	}
	
	public static long lcm(long a, long b) {
	    return a * (b / gcd(a, b));
	}
	
}
