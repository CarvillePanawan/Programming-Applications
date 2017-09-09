/**
 * @(#)AreWeAlternateNicTest.java
 *
 *
 * @author 
 * @version 1.00 2017/9/9
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AreWeAlternateNicTest {

   
    	
    	
 		@Test   	
    	public void exampleTests() 
    		{
		        assertEquals(true, AreWeAlternateNic.isAlt("amazon"));
		        assertEquals(false,AreWeAlternateNic.isAlt("apple"));
		        assertEquals(true, AreWeAlternateNic.isAlt("banana"));
		        assertEquals(false, AreWeAlternateNic.isAlt("zuceygua"));
		        assertEquals(false, AreWeAlternateNic.isAlt("rbsoeuf"));
		        assertEquals(false, AreWeAlternateNic.isAlt("d"));
    		}
   		
    
}