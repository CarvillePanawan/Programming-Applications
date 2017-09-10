import org.junit.Assert.assertEquals;
import org.junit.Test;


public class DRootTesting{
	
		@Test
		public void test0(){
     	  assertEquals( "Nope!" , DRoot.digital_root(16), 7);
		}
		
		@Test
		public void test1(){
		  assertEquals( "Nope!" , DRoot.digital_root(942), 6);	
		}
		
		
		@Test
		public void test2(){
		  assertEquals( "Nope!" , DRoot.digital_root(132189), 6);
		}
		
		@Test
		public void test3(){
		  assertEquals( "Nope!" , DRoot.digital_root(493193), 2);
		}
		
}