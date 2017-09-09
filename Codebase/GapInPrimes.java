import java.util.Arrays;

/**
 * Class that finds the first pair of prime number with the specified gap and has no prime numbers in between of the pair.
 */
public class GapInPrimes {
	/**
	 * <p>
	 * Finds the first pair of prime numbers that corresponds to the given gap, and that has no prime numbers in between.
	 * </p>
	 * 
	 * Algorithm:
	 * <ul style="list-style-type:none">
	 * <li>1. Start at the lower limit to the upper limit and check if it is prime.
     *    <ul style="list-style-type:none">
	 *    <li>1.1 If the number is prime then check if the gap+1 is prime and if there's no prime numbers in between of them.
     *        <ul style="list-style-type:none">
	 *        <li>1.1.1 If there's none then return the current pair.
	 *        <li>1.1.2 Else, return null.
     *        </ul>
     *    </ul>
	 * </ul>
	 * 
	 * @param gap, integer value of the wanted gap between to primes.
	 * @param lLimit, lower limit to which where to start the search.
	 * @param uLimit, upper limit to which where to stop the search.
	 * @return an array of long that has the value of the pair prime number.
	 */
    public static long[] firstGap(int gap, long lLimit, long uLimit) {
		for(long i=lLimit; i<=uLimit; i++) {
	        if(isPrime(i)) {
	            long j = gap + i;
	            if (isPrime(j) && !repeatedIsPrime(i + 1, j - 1)) {
	                return new long[]{i, j};
	            }
	        }
	    }
	return null;
	}//firstGap
	
    /**
     * Checks if the given number is a prime number.
     * 
     * @param n, given integer
     * @return boolean value of whether n is prime or not.
     */
	public static boolean isPrime(long n) {
		for(int i=2;i<n;i++) {
	        if(n%i==0) {
	        	return false;
	        } 
	    }
	return true;
	}//isPrime
	
	/**
	 * Checks if there's a prime number between a lower limit and a higher limit.
	 * 
	 * @param x, lower limit
	 * @param y, upper limit
	 * @return boolean value of whether there's a prime number between x and y.
	 */
	public static boolean repeatedIsPrime(long x, long y) {
		for(long i=x; i<=y; i++) {
			if(isPrime(i)) {
				return true;
			}
		}
	return false;	
	}//repeatedIsPrime
}//Class
