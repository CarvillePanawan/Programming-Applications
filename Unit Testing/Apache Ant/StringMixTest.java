import static org.junit.Assert.*;
import java.util.Comparator;
import java.util.Arrays;
import org.junit.Test;

public class StringMixTest {
    
    private static int randInt(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
    private static String doEx() {
        String res = "";
        int n = -1;
        for (int i = 0; i < 30; i++) {
            if (i % 5 == 0) n = randInt(35, 90); 
            else n = randInt(97, 122);
            res += (char)n;
        }
        return res;
    }
    // ---------------------------
    public static String mixSol(String s1, String s2) {
        int[] alpha1 = new int[26];
        for(int i = 0 ; i < alpha1.length ; i++) alpha1[i] = 0;
        int[] alpha2 = new int[26];
        for(int i = 0 ; i < alpha2.length ; i++) alpha2[i] = 0;
        for(int i = 0; i < s1.length(); i++) {
            int c = (int)s1.charAt(i);
            if (c >= 97 && c <= 122)
                alpha1[c - 97]++;
        }
        //afficheArray(alpha1);
        for(int i = 0; i < s2.length(); i++) {
            int c = (int)s2.charAt(i);
            if (c >= 97 && c <= 122)
                alpha2[c - 97]++;
        }
        //afficheArray(alpha2);
        String res = "";
        for(int i = 0; i < 26; i++) {            
            int sm = Math.max(alpha1[i], alpha2[i]);
            if (sm > 1) {
              if (sm > alpha1[i]) {
                res += "2:";
              } else {
                if (sm > alpha2[i]) {
                  res += "1:";
                }  else {
                    res += "=:";
                }
              }
              for(int j = 0; j < sm; j++) {
                  res += (char)(i+97);
              }
              res += "/";
            }
        }
        
        Comparator<String> cmp = new Comparator<String>() {
            public int compare(String o1, String o2) {
                int cp =  o1.length() - o2.length();
                if (cp == 0) 
                    return o1.compareTo(o2);
                if (cp > 0) return -1; else return 1;
            }
        };        
        if (res.length() == 0) return "";
        String[] lstr = res.substring(0, res.length() - 1).split("/");        
        Arrays.sort(lstr, cmp);
        res = String.join("/", lstr);
        return res;
    }
    // ---------------------------
    @Test
    public void test() {
        System.out.println("Mix Fixed Tests");
        assertEquals("2:eeeee/2:yy/=:hh/=:rr", StringMix.mix("Are they here", "yes, they are here"));
        assertEquals("1:ooo/1:uuu/2:sss/=:nnn/1:ii/2:aa/2:dd/2:ee/=:gg", 
                StringMix.mix("looping is fun but dangerous", "less dangerous than coding"));
        assertEquals("1:aaa/1:nnn/1:gg/2:ee/2:ff/2:ii/2:oo/2:rr/2:ss/2:tt", 
                StringMix.mix(" In many languages", " there's a pair of functions"));
        assertEquals("1:ee/1:ll/1:oo", StringMix.mix("Lords of the Fallen", "gamekult"));
        assertEquals("", StringMix.mix("codewars", "codewars"));
        assertEquals("1:nnnnn/1:ooooo/1:tttt/1:eee/1:gg/1:ii/1:mm/=:rr", 
                StringMix.mix("A generation must confront the looming ", "codewarrs"));
    }
    //.......................
    @Test
    public void test1() {
        System.out.println("100 Random Tests");
        for (int i = 0; i < 100; i++) { 
            String s1 = doEx();
            String s2 = doEx();
            //System.out.println(s1);
            //System.out.println(s2);
            //System.out.println(mixSol(s1, s2));
            //System.out.println("****");
            assertEquals(mixSol(s1, s2), StringMix.mix(s1, s2));
        }
    }
    
}