package com.MavenGrp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AreWeAlternateTest {

  
  @Test
    public void exampleTests1() {
        assertEquals(true, AllCodes.isAlt("amazon"));
        
    }
    @Test
     public void exampleTests2() {
        
        assertEquals(false, AllCodes.isAlt("apple"));

    }
    @Test
     public void exampleTests3() {
        
        assertEquals(true, AllCodes.isAlt("banana"));
    }
    
    
}