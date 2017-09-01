/*
Solution for "Are we alternate?"
Algorithm:
    1. Creates an array of vowels
    2. Declare boolean variables (vowelP, vowelC, isAlternating) 
       vowelP = stands for vowel previous, checks if the first character of the string is in the array
       vowelC = stands for vowel current, checks if the second character of the string is in the array
       isAlternating = confirms if its an alternating vowel and consonant or consonant and vowel
    3. Add a for loop to check each letter of the given string
    4. Add another for loop inside the first for loop to check each indexes of the array
        4.1 If the first character of the string is in the array
        4.2 Then, vowelP is true
        4.3 Also add an if statement to check if the second character of the string is in the array,.
        4.3  Then, vowelC is true.
    5. If Vowel previous and Vowel current are not equal, then it is alternating
    6. Vowel previous and vowel current must be equal since the latter indicates that the
       letter is a consonant and is not found in the array.
      
*/
import java.util.*;
public class AreWeAlternate {

    public static boolean isAlt(String word) {
        char [] vowels = {'a','e','i','o','u'};  
     	boolean vowelP = false;
     	boolean vowelC = false;
     	boolean isAlternating=false;
    	
    	for(int x = 0; x <word.length()-1; x++){
            for(int y = 0; y<vowels.length; y++){
            	if(x==0 && word.charAt(x)==vowels[y]){
            		vowelP = true;
                    }
            	if(word.charAt(x+1)==vowels[y]){
            		vowelC = true;
                    }
           	}
           	if(vowelP!=vowelC){
           		isAlternating=true;
                    }
           	vowelP=vowelC;
             }
        
        return isAlternating;
    }

    public static void main(String[]args){
        AreWeAlternate  s = new AreWeAlternate();
        System.out.println(s.isAlt("banana"));
    }
}
