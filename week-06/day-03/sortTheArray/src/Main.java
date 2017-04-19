import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Integer[] i = {5, 2, 9};
    System.out.println(Arrays.toString(sortArray(i)));

    Double[] d = {2.5, 9.1, 1.0, 4.6};
    System.out.println(Arrays.toString(sortArray(d)));
  }

  public static <T extends  Number> T[] sortArray(T[] toSort) {
    Arrays.sort(toSort);
    for(int i = 0; i < toSort.length / 2; i++)
    {
      T buffer = toSort[i];
      toSort[i] = toSort[toSort.length - i - 1];
      toSort[toSort.length - i - 1] = buffer;
    }
    return toSort;
  }
}
