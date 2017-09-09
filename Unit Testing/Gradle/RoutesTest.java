
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RoutesTest {
	@Test
	public void test11() {
		assertEquals("HQ, SH", Routes.findRoutes(String[][]{{"HQ", "SH"}}));
	}
	@Test
	public void test12() {
		assertEquals("UK, GER, BEL, CAN", Routes.findRoutes(String[][]{{"UK", "GER"}, {"GER", "BEL"}, {"BEL", "CAN"}}));
	}
	@Test
	public void test13() {
		assertEquals("Halifax, Montreal, Toronto, Chicago, Winnipeg, Seattle", Routes.findRoutes(String[][]{{"Chicago", "Winnipeg"}, {"Halifax", "Montreal"}, {"Montreal", "Toronto"}, {"Toronto", "Chicago"}, {"Winnipeg", "Seattle"}}));
	}
}