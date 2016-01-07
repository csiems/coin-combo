import java.io.Console;
import java.lang.*;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    // Console myConsole = System.console();
    // System.out.println("How many cents?");
    // String userInput = myConsole.readLine();
    // String output = howMuchChange(userInput);
    // System.out.println(output);
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap model = new HashMap();
      model.put("templates", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/output", (request, response) -> {
      HashMap model = new HashMap();
      model.put("templates", "templates/output.vtl");
      String userInput = request.queryParams("userInput");
      String output = howMuchChange(userInput);
      model.put("userInput", userInput);
      model.put("output", output);

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }

  public static String howMuchChange (String userInput) {
    Integer quarters = 0;
    Integer dimes = 0;
    Integer nickels = 0;
    Integer pennies = 0;

    Integer userInputAsInteger = Integer.parseInt(userInput);

    while (userInputAsInteger > 0) {
      if (userInputAsInteger > 24) {
        userInputAsInteger -= 25;
        quarters++;
      } else if (userInputAsInteger > 9) {
        userInputAsInteger -= 10;
        dimes++;
      } else if (userInputAsInteger > 4) {
        userInputAsInteger -= 5;
        nickels++;
      } else {
        userInputAsInteger -=1;
        pennies++;
      }
    }

    String quartersString = quarters + " quarter";
    String dimesString = dimes + " dime";
    String nickelsString = nickels + " nickel";
    String penniesString = pennies + " penn";

    if (quarters > 1) {
      quartersString = "<li>" + quartersString + "s</li>";
    } else if (quarters == 1) {
      quartersString = "<li>" + quartersString + "</li>";
    } else {
      quartersString = "";
    }

    if (dimes > 1) {
      dimesString = "<li>" + dimesString + "s</li>";
    } else if (dimes == 1) {
      dimesString = "<li>" + dimesString + "</li>";
    } else {
      dimesString = "";
    }

    if (nickels > 1) {
      nickelsString = "<li>" + nickelsString + "s</li>";
    } else if (nickels == 1) {
      nickelsString = "<li>" + nickelsString + "</li>";
    } else {
      nickelsString = "";
    }

    if (pennies == 1) {
      penniesString = "<li>" + penniesString + "y</li>";
    } else if (pennies > 1) {
      penniesString = "<li>" + penniesString + "ies</li>";
    } else {
      penniesString = "";
    }

    String output = quartersString + dimesString + nickelsString + penniesString;

    return output;

  }
}
