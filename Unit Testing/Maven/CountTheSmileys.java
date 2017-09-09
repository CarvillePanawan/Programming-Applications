import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CountTheSmileys {

   	
 @Test   	
	public void test1() {
		assertEquals(2,CountTheSmileys.countSmileys(":)", ";(", ";}", ":-D"));
			}

	public void test2() {
		assertEquals(3, CountTheSmileys.countSmileys(";D", ":-(", ":-)", ";~)"));
	  		}

	public void test3() {
		assertEquals(1, CountTheSmileys.countSmileys(";]", ":[", ";*", ":$", ";-D"));
			}

	public void test4() {
		assertEquals(0,CountTheSmileys.countSmileys(";8D", "p)D", "')", "p8D", ";-pp", "8)", ":DP", ":~-)"));
			}

	public void test5() {
		assertEquals(1, CountTheSmileys.countSmileys("4)", "5D", ";pP", "5~ox", ":X", ";)", "4P"));
			}

    		
	}