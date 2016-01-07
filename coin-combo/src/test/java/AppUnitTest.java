import org.junit.*;
import static org.junit.Assert.*;

public class AppUnitTest {

@Test
public void howMuchChange_forQuartersReceived_three() {
  App appTest = new App();
  assertEquals("You receive 3 quarters, 0 dimes, 0 nickels, and 0 pennies", appTest.howMuchChange(75));
}

@Test
public void howMuchChange_forDimesReceived_threeQuartersTwoDimes() {
  App appTest = new App();
  assertEquals("You receive 3 quarters, 2 dimes, 0 nickels, and 0 pennies", appTest.howMuchChange(95));
}

@Test
public void howMuchChange_forNickelReceived_oneQuarterOneDimeOneNickel() {
  App appTest = new App();
  assertEquals("You receive 1 quarters, 1 dimes, 1 nickels, and 0 pennies", appTest.howMuchChange(40));
}

}
