import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FlamesTest {
  @Test
  public void test1{
    assertEquals("NEIL and MAE are enemies" ,
        "Enemies", Flames.showRelationship("NEIL", "MAE"));
  }

  public void test2{
    assertEquals("SILVESTER and GERICHELLE are friendship" ,
        "Friendship", Flames.showRelationship("SILVESTER", "GERICHELLE"));
  }

  public void test3{
    assertEquals("NEIL and MAE are affection" ,
        "Affection", Flames.showRelationship("JOSHUA", "CIELO"));
  }
  public void test4 {
    assertEquals("EDWARD and POTPOT are siblings" ,
        "Siblings", Flames.showRelationship("EDWARD", "POTPOT"));
 	 }
  public void test5{
    assertEquals("BRYANT and CHARLOTTE are love" ,
        "Love", Flames.showRelationship("BRYANT", "CHARLOTTE"));
  	}
  public void test6{
    assertEquals("RAPHA and KENNETH are marriage" ,
        "Marriage", Flames.showRelationship("RAPHA","KENNETH"));
  	}
  public void test7{
    assertEquals("ABCDEFGHIJKL and MNOPQRSTUVWXYZ are love" ,
        "Love", Flames.showRelationship("ABCDEFGHIJKL", " MNOPQRSTUVWXYZ"));
 	}
  public void test8{
    assertEquals("AAABBCC and ABCD are friendship" ,
        "Friendship", Flames.showRelationship("AAABBCC", " ABCD"));
 	}
 	
}
