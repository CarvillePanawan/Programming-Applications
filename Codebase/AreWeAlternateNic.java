public class AreWeAlternateNic {
	
	/**
	 *Algorithm for isAlt method
	 *1. Declare a boolean variable to check if character at the first element of a string is a vowel.
	 *2. Using a for loop check if every character is a vowel return if its alternate. 
	 *
	 *@param word, String to be tested if it contains alternate vowels
	 *@return boolean value if its alternate or not
	 *
	 *
	 */
    public static boolean isAlt(String word) 
    {
      boolean b = isVowel(word.charAt(0));
  		for (int i = 1; i < word.length(); i++)
      	{
  			b = !b;
  			if (b != isVowel(word.charAt(i))) 
  			return false;
  		}
  		return true;	
    }
    /**
     *Algorithm for checking if its a vowel
     *1.Accept a character as input
     *2.Check if its a vowel or not, return true if it is, else false.
     *
     *@param ch is the character to be determined
     *@return boolean value if its a vowel or not
     */
     static boolean isVowel(char ch) 
    {
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
		return true;
	}

        return false;

    }
    public static void main(String [] args)
    {
    	System.out.print(isAlt("rbsoeuf"));
    }
}