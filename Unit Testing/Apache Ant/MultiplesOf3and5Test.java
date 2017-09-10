import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultiplesOf3and5Test {
    
    public void test1() {
      assertEquals(23, new Solution().solution(10));
    }
    
    public void test2() {
      assertEquals(225, new Solution().solution(33));
    }
    
    public void test3() {
      assertEquals(0, new Solution().solution(2));
    }
    
    public void test4() {
      assertEquals(2418, new Solution().solution(101));
    }
    
    
    
}