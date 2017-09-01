public class SumOfDigitalRoot {
  /*
   *6 kyu Sum of digit/digital roots
   *A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n. If that value has two digits, continue reducing in this way until a single-digit number is produced. This is only applicable to the natural numbers.
	Here's how it works:
	digital_root(16)
	=> 1 + 6
	=> 7
	
	digital_root(942)
	=> 9 + 4 + 2
	=> 15 ...
	=> 1 + 5
	=> 6
   */
  
  /**
   *Algorithm:
   *Let sum be an integer initialized to 0
   *while number is greater than 9
   *	Let sum be equal to 0
   *	while number is greater than 0
   *		Let remainder be an integer
   *		Let remainder be equal to number% 10
   *		Let sum be equal to sum + remainder
   *		Let number be equal to number/10
   *	Let number be equal to sum
   *return sum
   *@param
   */
  public static int digital_root_sum(int number) {
    int sum=0;
    while (number>9){
      sum = 0;
      while (number>0){
        int remainder;
        remainder = number % 10;
        sum = sum + remainder;
        number = number / 10;
      }
      number = sum;
    }
    return sum;
  }
}
