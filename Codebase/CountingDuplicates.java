
public class CountingDuplicates {
	public static int duplicateCount(String text) 
	 {
		/**
		 * 1. Variable originaltext copies the orginaltext from the parameter
		 * 2. Text is then converted to its lower case
		 * 3. Create and initialize a stringbuilder to copy the text
		 * 4. Create and initialize a counter for a character
		 * 5. Create a loop that will check for the length of the stringbuilder
		 * 6. Create and initialize a char variable to check the first character of the string.
		 * 7. Check if the first character is not out of range, then delete and increment the count variable
		 * 8. If a character occurs more than once increment the count variable else display none is repeated. 
		 */
	    
		
		String originaltext=text;
		text=text.toLowerCase();
		  StringBuilder sb = new StringBuilder(text);
			int count2=0;
			while(sb.length() != 0)
			{
				int count = 0;
			    char test = sb.charAt(0);
				while(sb.indexOf(test+"") != -1)
				{
					sb.deleteCharAt(sb.indexOf(test+""));
					count++;
				}
				if(count>1)
			  {
					count2++;
					System.out.println(originaltext+"-> "+count2+" "+test+" occurs "+count+" times");
				}
				if(count==0)
				{
				    System.out.println("no characters repeats more than once");
				              
				}
						        
			}
	        return count2;
	 }
}
