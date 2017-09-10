import org.junit.Assert.assertEquals;
import org.junit.Test;


public class TankTruckTest {
    
    @Test
    public void test0() {  
        assertEquals(2940, TankTruck.tankVol(5, 7, 3848));
        assertEquals(907, TankTruck.tankVol(2, 7, 3848));
    }
    
    @Test
    public void test1() {  
        assertEquals(1021, TankTruck.tankVol(40,120,3500));
    }
    
    @Test
    public void test2() {  
        assertEquals(1750, TankTruck.tankVol(60,120,3500));
    }
    
    @Test
    public void test3() {  
        assertEquals(2478, TankTruck.tankVol(80,120,3500));
    }
}
