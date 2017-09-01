

	/**
	 * Solution for Are we alternate? 
	 * Create a function isAlt() that accepts a string as an argument and validates 
	 * whether the vowels (a, e, i, o, u) and consonants are in alternate order.
	 * 
	 * ALGORITHM:
	 * 1. Given a string from a user input
	 * 2. Check if the first char is a vowel using the isVowel method
	 * 3. Using a for loop determine if the letters in the word are in alternate vowels
	 * 4. If true, return true else false
	 * 
	 *  @param word the user input
	 *  @return boolean value if its alternate or not
	 */
	public static boolean isAlt(String word) 
    {
      boolean b = isVowel(word.charAt(0));
  		for (int i = 1; i < word.length(); i++)
  		{
  			b = !b;
  			if (b != isVowel(word.charAt(i))) return false;
  		}
  		return true;	
    }
     static boolean isVowel(char ch) 
    {
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
		return true;
	}

        return false;

    }

