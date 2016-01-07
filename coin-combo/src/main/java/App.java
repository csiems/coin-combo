import java.io.Console;
import java.lang.*;
import java.util.Map;
import java.util.HashMap;
//import spark.ModelAndView;
//import spark.template.velocity.VelocityTemplateEngine;
//import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("How many cents?");
    String userInput = myConsole.readLine();
    String output = howMuchChange(userInput);
    System.out.println(output);
  }

  public static String howMuchChange (String userInput) {
    Integer quarters = 0;
    Integer dimes = 0;
    Integer nickels = 0;
    Integer pennies = 0;

    Integer userInputAsInteger = Integer.parseInt(userInput);

    while (userInputAsInteger > 24) {
      userInputAsInteger -= 25;
      quarters++;
    }

    while (userInputAsInteger > 9) {
      userInputAsInteger -= 10;
      dimes++;
    }

    while (userInputAsInteger > 4) {
      userInputAsInteger -= 5;
      nickels++;
    }

    String output = String.format("You receive %d quarters, %d dimes, %d nickels, and %d pennies", quarters, dimes, nickels, pennies);
    return output;

  }
}
