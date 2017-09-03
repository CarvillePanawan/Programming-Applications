/*
 *Solution for Count The Smileys
 *1. Check each index of the given array
 *2. If the length of the string is 2
 *	 2.1 Check if the index contains the ff: ":", ";" and ")","D"
 *	 2.2 If yes, count + 1
 *3. If the length of the string is 3 
 *	 3.1 Check each of the index if it contains the ff: ":" ";" "-" "~" ")" "D"
 *	 3.2 If yes, count + 1
 *
 *@param  list of the array that will contain the strings to be counted
 *@return number of the smileys given in the array */
import java.util.*;
public class CountTheSmileys {
  public static int countSmileys(List<String> arr) {
      int count = 0;
      for(int i=0; i< arr.size(); i++){
      	if(arr.get(i).length() == 2){
      		if((arr.get(i).indexOf(':') == 0 || arr.get(i).indexOf(';') == 0) && (arr.get(i).indexOf(')') == 1 || arr.get(i).indexOf('D') == 1)){
	      		count++;
	      	}
      	} 
      	else if(arr.get(i).length() == 3){
      		if((arr.get(i).indexOf(':') == 0 || arr.get(i).indexOf(';') == 0) && (arr.get(i).indexOf('-') == 1 || arr.get(i).indexOf('~') == 1) && (arr.get(i).indexOf(')') == 2 || arr.get(i).indexOf('D') == 2)){
	      		count++;
	      	}
      	}
      }
      return count;
  }
  
  public static void main(String args[]){
  	List<String> aa = Arrays.asList(":)", ":-");
  	System.out.println(countSmileys(aa));
  }
}