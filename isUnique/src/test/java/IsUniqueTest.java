import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class IsUniqueTest {
  @Test
  public void testUniqueness_ShouldReturnBooleans() {
    IsUnique test = new IsUnique();

    assertEquals(false, test.testUniqueness("hello"));
    assertEquals(true, test.testUniqueness("gerbil"));
  }
}
