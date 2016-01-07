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

    // while (userInputAsInteger > 0) {
    //   if (userInputAsInteger > 24) {
    //     userInputAsInteger -= 25;
    //     quarters++;
    //   } else if (userInputAsInteger > 9) {
    //     userInputAsInteger -= 10;
    //     dimes++;
    //   } else if (userInputAsInteger > 4) {
    //     userInputAsInteger -= 5;
    //     nickels++;
    //   } else {
    //     userInputAsInteger -=1;
    //     pennies++;
    //   }
    // }

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

    while (userInputAsInteger > 0) {
      userInputAsInteger -=1;
      pennies++;
    }

    String quartersString = quarters + " quarter";
    String dimesString = dimes + " dime";
    String nickelsString = nickels + " nickel";
    String penniesString = pennies + " penn";

    if (quarters > 1) {
      quartersString += "s<br>";
    } else if (quarters == 1) {
      quartersString += "<br>"
    } {
      quartersString = "";
    }

    if (dimes > 1) {
      dimesString += "s<br>";
    } else {
      dimesString = "";
    }

    if (nickels > 1) {
      nickelsString += "s<br>";
    } else {
      nickelsString = "";
    }

    if (pennies == 1) {
      penniesString += "y";
    } else if (pennies > 1) {
      penniesString += "ies";
    } else {
      penniesString = "";
    }

    String output = quartersString + dimesString + nickelsString + penniesString;
    return output;

  }
}
