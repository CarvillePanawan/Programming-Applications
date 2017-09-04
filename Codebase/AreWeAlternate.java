/*
 *Solution for Are we alternate?
 *Algorithm:
 *1. Declare initial variables to hold for the truth values
 *2. If the length of the word is even
 *	2.1 Use the method pattern to check if the initial character is a vowel following a consonant per se
 *	2.1 Use the method pattern to check if the initial character is a consonant following a vowel per se
 *3. Otherwise, if odd, add vowels
 *4. Add consonants if odd
 *5. If the length of the string returns 1, return true
 * */
import java.util.regex.Pattern;
public class Solution3 {	
  public static boolean isAlt(String word) {
	  boolean a = true;
      boolean b = true;
        
      if(word.length() % 2 == 0){
       	a = Pattern.matches("([aeiou][bcdfghjklmnpqrstvwxz])+", word);
        b = Pattern.matches("([bcdfghjklmnpqrstvwxz][aeiou])+", word);
       }else{
        a = Pattern.matches("([aeiou][bcdfghjklmnpqrstvwxz])+[aeiou]", word);
        b = Pattern.matches("([bcdfghjklmnpqrstvwxz][aeiou])+[bcdfghjklmnpqrstvwxz]", word);
        if(word.length() == 1){
         a = Pattern.matches("[aeiou]", word);
         b = Pattern.matches("[bcdfghjklmnpqrstvwxz]", word);
        	}
       }
       
       return a || b;
    }

    public static void main(String[]args){
        Solution3 s = new Solution3();
        String[] test = {"abopuvlr","ihiseqog","tcc","avif","tezevaaf","osbizudef","exq","ufudelwod","uosun","juhueepip","eotuyif","ihootkuv","xetio","tede",
					"itakasap","uyvovmav","avnapea","ezijedah","ehbucjtoh","aulipfaf","uvdogijer","imuv","xwiaduxg","zac"};
		
		for(int i = 0; i < test.length; i++){
			System.out.println(test[i]+" "+s.isAlt(test[i]));
				}
    		}
		}
