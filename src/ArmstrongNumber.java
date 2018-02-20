import java.util.Scanner;

import static java.lang.Math.*;

public class ArmstrongNumber {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter some number to check if it's an Armstrong number!");

    int inputNumber = input.nextInt();

    if (checkIfArmstrongNumber(inputNumber)) {
      System.out.println("Hooray! " + inputNumber + " is an exceptionally great Armstrong Number!");
    } else System.out.println("Sorry, but " + inputNumber + " is not an Armstrong Number...");

  }

  private static boolean checkIfArmstrongNumber(int inputNumber) {
    if (inputNumber == sumOfNthPowers(inputNumber)) {
      return true;
    } else return false;
  }

  private static int sumOfNthPowers(int inputNumber) {

    int sum = 0;

    String numberSplit = Integer.toString(inputNumber);
    for (int i = 0; i < numberSplit.length(); i++) {
      int temp = (int) numberSplit.charAt(i);
      sum += (int) Math.pow((double) temp, (double) numberSplit.length());
    } return sum;
  }
}
