import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BogusStringRotationTest {
  @Test
  public void checkRotation_shouldTrueForGivenTest() {
    BogusStringRotation bsr = new BogusStringRotation();
    assertEquals(true, bsr.checkRotation("erbottlewat", "waterbottle"));
  }
}
