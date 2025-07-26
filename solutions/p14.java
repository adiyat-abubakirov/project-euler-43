import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class p14 {
  static HashMap<Integer, Integer> previous = new HashMap<>();

  public static void main(String[] args) {
    int max = 0;
    int num = 0;
    for (int i = 2; i < 1000000; i++) {
      int temp = sequence(i);
      previous.put(i, temp);
      if (max < temp) {
        num = i;
        max = temp;
      }
    }
    System.out.println(num);
  }

  public static int sequence(long n) {
    int count = 1;
    while (n > 1) {
      if (previous.containsKey(n))
        return previous.get(n) + count - 1;
      if (n % 2 == 0) {
        count++;
        n /= 2;
      } else {
        count += 2;
        n = (n * 3 + 1) / 2;
      }
    }
    return count;
  }
}
