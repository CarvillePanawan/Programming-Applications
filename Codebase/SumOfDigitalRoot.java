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
   *1.Declare int sum, that will be used to store the sum of digital roots
   *2.while number is greater than 9
   *2.1.Let sum be equal to 0
   *2.2.while number is greater than 0
   *2.2.1.Let remainder be an integer
   *2.2.2.Let remainder be equal to number% 10
   *2.2.3.Let sum be equal to sum + remainder
   *2.2.4.Let number be equal to number/10
   *2.3.Let number be equal to sum
   *3.return sum
   *@param
   *@return the sum of digital roots.
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
