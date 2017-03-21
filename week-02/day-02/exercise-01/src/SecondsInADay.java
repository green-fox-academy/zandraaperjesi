/**
 * Created by zandraa on 3/21/2017.
 */
public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;
    int secondsInADay = 24 * 60 * 60;
    int secondsTillCalculation = (currentHours * 60 * 60) + (currentMinutes * 60) + currentSeconds;
    System.out.println("Remaining seconds: " + (secondsInADay - secondsTillCalculation));
  }
}
