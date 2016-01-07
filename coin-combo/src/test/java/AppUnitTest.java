import org.junit.*;
import static org.junit.Assert.*;

public class AppUnitTest {

@Test
public void howMuchChange_forQuartersReceived_oneQuarter() {
  App appTest = new App();
  assertEquals("<li>1 quarter</li>", appTest.howMuchChange("25"));
}

@Test
public void howMuchChange_forDimesReceived_oneDime() {
  App appTest = new App();
  assertEquals("<li>1 dime</li>", appTest.howMuchChange("10"));
}

@Test
public void howMuchChange_forNickelReceived_oneNickel() {
  App appTest = new App();
  assertEquals("<li>1 nickel</li>", appTest.howMuchChange("5"));
}

@Test
public void howMuchChange_forPenniesReceived_onePenn() {
  App appTest = new App();
  assertEquals("<li>1 penny</li>", appTest.howMuchChange("1"));
}

}
