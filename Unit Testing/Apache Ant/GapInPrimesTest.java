import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.Random;

public class GapInPrimesTest {
	private static int randInt(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
    private static long randLong(long low, long high) {
        long LOWER_RANGE = low;
        long UPPER_RANGE = high;
        Random random = new Random();
        long randomValue = LOWER_RANGE + 
                (long)(random.nextDouble()*(UPPER_RANGE - LOWER_RANGE));
        return randomValue;
    }
    //--------------
    private static Boolean primeSol(long n) {
        if (n == 2) return true;
        else if ((n < 2) || (n % 2 == 0)) return false;
        else {
            for (long i = 3; i <= Math.sqrt(n); ++i) {
                if (n % i == 0) return false;
            }
            return true;
        }
    }
    public static long[] gapSol(int g, long m, long n) {
        long[] res = new long[2];
        long i = m;
        while (i < n + 1) {
            if (primeSol(i)) {
                res[0] = i;
                break;
            }
            i++;
        }
        boolean cont = true;
        while (cont) {
            long j = i + 1;
            while (j < n + 1) {
                if (primeSol(j)) {
                    if (j - i == g) {
                        res[1] = j;
                        return res;
                    }
                    else {
                        res[0] = j;
                        i = j;
                    }
                }
                j++;
            }
            cont = false;
        }
        return null;
    }
    //--------------
    @Test
    public void test() {
        System.out.println("Fixed Tests");
        assertEquals("[101, 103]", Arrays.toString(GapInPrimes.firstGap(2,100,110)));
        assertEquals("[103, 107]", Arrays.toString(GapInPrimes.firstGap(4,100,110)));
        assertEquals(null, GapInPrimes.firstGap(6,100,110));
        assertEquals("[359, 367]", Arrays.toString(GapInPrimes.firstGap(8,300,400)));
        assertEquals("[337, 347]", Arrays.toString(GapInPrimes.firstGap(10,300,400)));
        
        assertEquals("[30109, 30113]", Arrays.toString(GapInPrimes.firstGap(4,30000,100000)));
        assertEquals("[30091, 30097]", Arrays.toString(GapInPrimes.firstGap(6,30000,100000)));
        assertEquals("[30161, 30169]", Arrays.toString(GapInPrimes.firstGap(8,30000,100000)));
        assertEquals(null, GapInPrimes.firstGap(11,30000,100000));
        assertEquals("[10000139, 10000141]", Arrays.toString(GapInPrimes.firstGap(2,10000000,11000000)));
    }
    @Test
    public void test1() {
        System.out.println("100 Random Tests");
        for (int i = 0; i < 100; i++) { 
            long n = 0;
            if (randInt(0, 99) % 5 == 0)
                n = randLong(1000, 2000);
            else n = randLong(100000, 1000000);
            //System.out.println(n);
            //System.out.println("****");
            assertEquals(Arrays.toString(gapSol(2, n, n + 1000)), 
                    Arrays.toString(GapInPrimes.firstGap(2, n, n + 1000)));

        }
    }
}
//TODO Testing should be fixed.