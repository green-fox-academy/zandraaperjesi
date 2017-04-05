import java.util.ArrayList;
import java.util.List;

public class Sum {
  private List<Integer> toSum;

  public Sum() {
    toSum = new ArrayList<>();
    toSum.add(5);
    toSum.add(6);
    toSum.add(8);
  }

  public int sumUp() {
    int sum = 0;
    for (int i : toSum) {
      sum += i;
    }
    return sum;
  }
}
