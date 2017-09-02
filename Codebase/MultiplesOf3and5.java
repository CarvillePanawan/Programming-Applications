/**
 *6 kyu Muliples of 3 and 5
 *
 *Algorithm:
 *	1. Declare an integer
 *	2. Construct a loop that ends when  the value of i is greater 
 *	   or equal to the number.
 *	3. Check if i%3 is equal to 0 or i%5 is equal to zero
 *		3.1 If true, sum = sum + i
 *	4. Return sum
 */
public class MultiplesOf3and5{
	
	public static void main (String[]args){
		solution(10);
		System.out.println(solution(10));
	}
	
	/**
	 *This method returns an integer value of the sum
	 */
	public static int solution(int number) {
    	int sum = 0;
    	for(int i = 0; i<number; i++){
      		if(i%3==0 || i%5==0){
            sum += i;
     }
   }
   return sum;
  }
  
}