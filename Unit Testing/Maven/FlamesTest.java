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
}
