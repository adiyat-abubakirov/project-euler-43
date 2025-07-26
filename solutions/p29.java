import java.util.ArrayList;
import java.util.List;

public class p29 {
  public static void main(String[] args) {
    List<Double> terms = new ArrayList<>();
    for (int i = 2; i <= 100; i++) {
      for (int j = 2; j <= 100; j++) {
        double result = Math.pow(i, j);
        if (!terms.contains(result))
          terms.add(result);
      }
    }
    System.out.println(terms.size());
  }
}
