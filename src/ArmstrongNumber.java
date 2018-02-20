import java.util.Scanner;

import static java.lang.Math.*;

public class ArmstrongNumber {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter some number to check if it's an Armstrong number!");

    String inputNumber = input.nextLine();

    if (checkIfArmstrongNumber(inputNumber)) {
      System.out.println("Hooray! " + inputNumber + " is an exceptionally great Armstrong Number!");
    } else System.out.println("Sorry, but " + inputNumber + " is not an Armstrong Number...");

  }

  private static boolean checkIfArmstrongNumber(String inputNumber) {
    if (inputNumber.equals(Integer.toString(sumOfNthPowers(inputNumber)))) {
      return true;
    } else return false;
  }

  private static int sumOfNthPowers(String inputNumber) {

    String[] splitInput = inputNumber.split("(?!^)");

    int sum = 0;

    for (int i = 0; i < splitInput.length; i++) {
      int temp = Integer.parseInt(splitInput[i]);
      sum += (int) Math.pow((double) temp, (double) splitInput.length);
    } return sum;
  }
}
