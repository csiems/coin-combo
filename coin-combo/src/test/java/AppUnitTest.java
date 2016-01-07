import org.junit.*;
import static org.junit.Assert.*;

public class AppUnitTest {

@Test
public void howMuchChange_forQuartersReceived_three() {
  App appTest = new App();
  Integer quarters = 3;
  assertEquals(quarters, appTest.howMuchChange(75));
}

}
