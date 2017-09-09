import java.util.Arrays;
import java.util.Comparator;

/**
 * Class that outputs the resulting mixture of two strings.
 */
public class StringMix {
	/**
	 * <p>
	 * Receives two string parameters which then puts them into a process that would later show the highest occurrence of each letter the appears
	 * more than twice.
	 * </p> 
	 * 
	 * Algorithm:
	 * <ul style="list-style-type:none">
	 * <li>1. Store the number of occurrence per character in two different integer array of the two strings.
	 * <li>2. Check if the number of occurrence per character is greater than the other.
	 *    <ul style="list-style-type:none">
	 * 	  <li>2.1 Concatenate "1:", "2:" or "=:", depends on which is higher, to a string array.
	 *    <li>2.2 Keep on concatenating the letter until the number reaches it's occurrences.
	 *    </ul>
	 * <li>3. Append the string array into one string and return then output.   
	 * </ul>
	 * 
	 * @param s1, String representation of the first sentence.
	 * @param s2, String representation of the second sentence.
	 * @return String, mixture of s1 and s2 that shows the occurrence of letters in both strings.
	 */
	public static String mix(String s1, String s2) {
		char[] alphabet = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] a = s1.replaceAll(" ", "").replaceAll("[^a-z]", "").toCharArray();
		int[] aa = new int[26];
		char[] b = s2.replaceAll(" ", "").replaceAll("[^a-z]", "").toCharArray();
		int[] bb = new int[26];
		String[] c = new String[26];
		String d = "";
		StringMix newInstance = new StringMix();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int i=0; i<a.length; i++) {
			aa[a[i] - 'a']++;			
		}
		for(int i=0; i<b.length; i++) {
			bb[b[i] - 'a']++;
		}
		
		for(int i=0; i<26; i++) {
			if(aa[i]>bb[i] && aa[i]>1) {
				c[i] = "1:";
				for(int j=0; j<aa[i]; j++) {
					c[i] += alphabet[alphabet[i]-'a'];
				}
			} else if(aa[i]<bb[i] && bb[i]>1) {
				c[i] = "2:";
				for(int j=0; j<bb[i]; j++) {
					c[i] += alphabet[alphabet[i]-'a'];
				}
			} else if(aa[i]==bb[i] && aa[i]>1 && bb[i]>1) {
				c[i] = "=:";
				for(int j=0; j<bb[i]; j++) {
					c[i] += alphabet[alphabet[i]-'a'];
				}
			} else {
				c[i]="";
			}
		}
		
		Arrays.sort(c, newInstance.new StringSorter());
		
		for(int i=0; i<c.length; i++) {
			if(c[i]=="") {
				break;
			}
			d += c[i]+"/";
		}

	return d = d=="" ? "" : d.substring(0, d.length()-1);	
	}//mix
	
	/**
	 * A custom comparator meant to satisfy the sorting needs of the program. It first compares the strings own length
	 * and then compares them lexicographically.
	 */
	class StringSorter implements Comparator<String> {
		public int compare(String s1, String s2) {
	    	if (s1.length() < s2.length()) {
	            return 1;
	        }
	        if (s1.length() > s2.length()) {
	            return -1;
	        }
	        return s1.compareTo(s2);
	    }
	}//Comparator
}//Class
