import java.util.ArrayList;
import java.util.List;

public class p21 {
  public static void main(String[] args) {
    List<Integer> anums = new ArrayList<>();
    int sum = 0;
    for (int i = 1; i < 10000; i++) {
      int a = AmicNumCheck(i);
      if (AmicNumCheck(a) == i && a != i && !anums.contains(i)) {
        anums.add(a);
        sum += a + i;
      }
    }
    System.out.println(sum);
  }

  public static int AmicNumCheck(int a) {
    int sum = 1;
    for (int i = 2; i <= Math.sqrt(a); i++)
      if (a % i == 0) {
        sum += i;
        if (a / i != i)
          sum += a / i;
      }
    return sum;
  }
}
