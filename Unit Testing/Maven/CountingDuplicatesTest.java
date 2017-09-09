/**
 * @(#)CountingDuplicatesTest.java
 *
 *
 * @author 
 * @version 1.00 2017/9/9
 */


public class CountingDuplicatesTest {

   @Test
    public void abcdeReturnsZero() {
        assertEquals(0, CountingDuplicates.duplicateCount("abcde"));
    }
    
    @Test
    public void abcdeaReturnsOne() {
        assertEquals(1, CountingDuplicates.duplicateCount("abcdea"));
    }
    
    @Test
    public void indivisibilityReturnsOne() {
        assertEquals(1, CountingDuplicates.duplicateCount("indivisibility"));
    }
     @Test
    public void emptyReturnsZero() {
        assertEquals(0, CountingDuplicates.duplicateCount("empty"));
    }
    @Test
    public void abcdefghijklmnopqrstuvwxyzReturnsZero() {
        assertEquals(1, CountingDuplicates.duplicateCount("abcdefghijklmnopqrstuvwxyz"));
    }
    
    
}