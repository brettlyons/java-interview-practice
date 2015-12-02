import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TelevisionTest {
  @Test
  public void isOffByDefault() {
    Television testTv = new Television();
    assertEquals(false, testTv.isOn());
  }

  @Test
  public void turnOnTurnsTheTvOn() {
    Television testTv = new Television();
    testTv.turnOn();
    assertEquals(true, testTv.isOn());
  }
  
  @Test
  public void testSettings() {
    Television testTv = new Television();
    testTv.set("contrast", 34);
    assertEquals(34, (int) testTv.get("contrast"));

    testTv.set("foo", "bar");
    assertEquals("bar", (String) testTv.get("foo"));
  }
}
