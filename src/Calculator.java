import java.util.Scanner;

public class Calculator {

  private static float result;

  public static void main(String[] args) {
    Scanner inputParameters = new Scanner(System.in);

    System.out.println("Please type in the expression:");
    String userInput = inputParameters.nextLine();

    System.out.println(calculate(userInput));
  }

  private static float calculate(String userInput) {

    String[] splitInput = userInput.split(" ");

    String operation = splitInput[0];
    float operandOne = Float.parseFloat(splitInput[1]);
    float operandTwo = Float.parseFloat(splitInput[2]);
// Allowed operations: +, -, *, /, %
    if (operation.equals("+")) {
      result = operandOne + operandTwo;
    } else if (operation.equals("-")) {
      result = operandOne - operandTwo;
    } else if (operation.equals("*")) {
      result = operandOne * operandTwo;
    } else if (operation.equals("/")) {
      result = operandOne / operandTwo;
    } else if (operation.equals("%")) {
      result = operandOne % operandTwo;
    } else {
      System.out.println("This operand is not allowed");
      System.exit(400);
    }
    return result;
  }
}
