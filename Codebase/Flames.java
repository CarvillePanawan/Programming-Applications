/**
 * @(#)Flames.java
 *
 *
 * @author : Abiera, Gerichelle
 *
 */

import java.util.*;
public class Flames {
    Scanner reader = new Scanner(System.in);
    
     	/** Algorithm: 
		 *	1. Declare initial variables that will hold for the values of the names' combination,
		 *		its result, and count.
		 *	2. For every input, it should be in lowercase form
		 *	3. Declare a variable copy to hold the original letters of female input to use later
		 *	4. Use a for loop to check the length of the male string
		 *		4.1 Replace all the common letters of female string and male string to ""
		 *	5. Use a for loop to check the length of the female string (copy)
		 *		5.1 Replace all the common letters of male string and the original letters of female string (copy) to ""
		 *	6. Add the combined result of the previous loop and store it to the variable combined
		 *	7. Count the length of the result and store it to the variable count
		 *	8. Instead of cycling through all the letters, use modulo to determine the remainder and use it to count.
		 *  9. If result is greater than 6 or result is equal to 0, equate result to 6
		 * 10. Checks the result in the following array of strings
 		 **/
    public static String showRelationship(String male, String female) {
        String combined = "";
        int result = 0;
        int count = 0;
        
        female = female.toLowerCase();
        male = male.toLowerCase();
        String copy = female;
        
        for(int x = 0; x < male.length(); x++){
           female = female.replaceAll(String.valueOf(male.charAt(x)), "");
        	}
        
        for(int x = 0; x < copy.length(); x++){
           male = male.replaceAll(String.valueOf(copy.charAt(x)), "");
        	}
        
                
         combined = male + female; 
         count = combined.length();
          
         result = count%6;
        
         if(result > 6 || result == 0){
       		result = 6;
          }
          
         String[] flames = {"Friendship", "Love", "Affection", "Marriage", "Enemies", "Siblings"};
          return flames[result-1];
    }
    
    public static void main(String[]a){
        System.out.println(showRelationship("Neil", "mae"));
        }  
    }

