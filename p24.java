import java.util.ArrayList;
import java.util.List;

public class p24 {
  public static void main(String[] args) {
    List<Integer> digits = new ArrayList<>();
    for (int i = 0; i < 10; i++)
      digits.add(i);
    int position = 1000000;
    int limit = position - 1;
    String permutation = "";
    int test = limit;
    int i = 1;
    int t = 1;
    while (limit / t > 0) {
      i++;
      t *= i;
    }
    while (limit > 1) {
      int sum = factorial(i);
      int k = limit / sum;
      if (k > 0) {
        limit -= k * sum;
        permutation = permutation.concat(digits.get(k).toString());
        digits.remove(k);
      }
      i--;
    }
    for (int j = digits.size() - 1; j >= 0; j--)
      permutation = permutation.concat(digits.get(j).toString());
    System.out.println(permutation);
  }

  public static int factorial(int n) {
    if (n == 2)
      return 2;
    return n * factorial(n - 1);
  }
}
