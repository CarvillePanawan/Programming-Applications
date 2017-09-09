/**
 *Get a prime number from the range of long start to long end
 *reverse the primbe number you got
 */
public class BackWardsPrime {
	
	/**
	 *Algorithm:
	 *1.Let result be a String that will hold the result of the method
	 *2.Let reversedPrime be a long that will hold the reverse of the prime number
	 *3.long i = start; i <= end; i++
	 *3.1. if i is prime
	 *3.2. assign the reverse number of i to reversedPrime
	 *3.3. if reversedPrime is prime and i is not equal to reversedPrime
	 *3.3.1. result+=i+""
	 *4. return result.trim()
	 *@param
	 */
	public static String backwardsPrime(long start, long end) {
		String result = "";
	    long reversedPrime= 0;
	    for(long i = start; i <= end; i++){
	      if(isPrime(i)){
	        reversedPrime = reverseNumber(i);
	        if(isPrime(reversedPrime) && !Long.toString(i).equals(new StringBuilder(Long.toString(reversedPrime)).toString())){
	        	result += i+" ";
	        }
	      }
	    }
	    return result.trim();
  	}
  	
  	/**
  	 *Algorithm:
  	 *1. if number modulo 2 is equal to 0
  	 *1.1. return false
  	 *		else
  	 *2.for(int i = 3; i*i <= number; i+=2)
  	 *2.1.if number modulo i is equal to 0
  	 *2.1.1. return false
  	 *3.return true
  	 *@param
  	 */
	public static boolean isPrime(long number){
		if(number%2 == 0){
			return false;
		}else{
			for(int i = 3; i*i <= number; i+=2){
				if(number%i == 0){
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 *Algorithm:
	 *1.Let reversedNum be a long that will hold the reverse of num
	 *2.while num is not equal to 0
	 *2.1.Let remainder be a long that will hold the value of num modulo 10
	 *2.2.Assign reversedNum*10+remainder to reversedNum
	 *2.2.Assign num/10 to num
	 *3.return reversedNum
	 *@param
	 */
	public static long reverseNumber(long num){
		long reversedNum = 0;
		while(num != 0){
			long remainder = num%10;
			reversedNum = reversedNum*10+remainder;
			num = num/10;
		}
		return reversedNum;
	}
}