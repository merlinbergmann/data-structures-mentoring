import java.util.*;

public class JosephusProblem {

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    System.out.println("Hey Josephus, how many rebels are with you this time?");
    int numberOfRebels = userInput.nextInt();

    simulateSuicideCircle(numberOfRebels);
  }

  private static void simulateSuicideCircle(int numberOfRebels) {

    String placeNumber = "1";

    int kills = 0;

    List<String> suicideCircle = new ArrayList<String>();

    for (int i = 1; i <= numberOfRebels; i++) {
      suicideCircle.add(placeNumber);
      placeNumber = Integer.toString(i + 1);
    }

    if (numberOfRebels == 1) {
      System.out.println(suicideCircle.get(0));
    } else while (kills < numberOfRebels - 1) {
        suicideCircle.add(suicideCircle.get(0));
        suicideCircle.remove(1);
        kills += 1;
        suicideCircle.remove(0);
      }
      System.out.println(suicideCircle.get(0));
    }
}
