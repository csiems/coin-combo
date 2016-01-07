import org.junit.*;
import static org.junit.Assert.*;

public class AppUnitTest {

@Test
public void howMuchChange_forQuartersReceived_oneQuarter() {
  App appTest = new App();
  assertEquals("1 quarter", appTest.howMuchChange("25"));
}

@Test
public void howMuchChange_forDimesReceived_oneDime() {
  App appTest = new App();
  assertEquals("1 dime", appTest.howMuchChange("10"));
}

@Test
public void howMuchChange_forNickelReceived_oneNickel() {
  App appTest = new App();
  assertEquals("1 nickel", appTest.howMuchChange("5"));
}

@Test
public void howMuchChange_forPenniesReceived_onePenn() {
  App appTest = new App();
  assertEquals("One penn", appTest.howMuchChange("1"));
}

}
