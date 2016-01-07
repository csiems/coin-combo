import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    //Spark and Velocity go in here!
  }

  public static Integer howMuchChange (Integer userInput) {
    Integer quarters = 0;

    while (userInput > 24) {
      userInput -= 25;
      quarters++;
    }

    return quarters;
    // String.format("You receive %d quarters, %d dimes, %d nickels, and %d pennies", quarters, dimes, nickels, pennies);
  }
}
