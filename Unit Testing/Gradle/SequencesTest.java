
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SequencesTest{
	@Test
	public void test01() {
		assertEquals(50, Sequences.getScore(1));
	}
	@Test
	public void test02() {
		assertEquals(1400, Sequences.getScore(7));
	}
	@Test
	public void test03() {
		assertEquals(381300, Sequences.getScore(123));
	}
	@Test
	public void test04() {
		assertEquals(38099750, Sequences.getScore(1234));
	}
	@Test
	public void test05() {
		assertEquals(3810284250L, Sequences.getScore(12345));
	}
}