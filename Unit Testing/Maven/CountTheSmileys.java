import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CountTheSmileys {

   	
 @Test   	
	public void test1() {
		assertEquals(2,CountTheSmileys.countSmileys(Arrays.asList(":)", ";(", ";}", ":-D"));
    	assertEquals(3, CountTheSmileys.countSmileys(Arrays.asList";D", ":-(", ":-)", ";~)")));
        assertEquals(1, CountTheSmileys.countSmileys(Arrays.asList(";]", ":[", ";*", ":$", ";-D")));
        assertEquals(0,CountTheSmileys.countSmileys(Arrays.asList(";8D", "p)D", "')", "p8D", ";-pp", "8)", ":DP", ":~-)")));
        assertEquals(0,CountTheSmileys.countSmileys(Arrays.asList(";8D", "p)D", "')", "p8D", ";-pp", "8)", ":DP", ":~-)")));
        assertEquals(1, CountTheSmileys.countSmileys(Arrays.asList("4)", "5D", ";pP", "5~ox", ":X", ";)", "4P")));
			}

    		
	}