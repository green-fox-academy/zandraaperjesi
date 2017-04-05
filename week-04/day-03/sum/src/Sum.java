import java.util.List;

public class Sum {

  public int sumUp(List<Integer> toSum) {
    int sum = 0;
    try {
      for (int i : toSum) {
        sum += i;
      }
      return sum;
    }
    catch (Exception e) {
      isNull();
      throw e;
    }
  }

  public Object isNull() {
    return null;
  }
}
