import java.util.LinkedList;
import java.util.Queue;

public class p26 {
  public static void main(String[] args) {
    int d = 0;
    int max = 0;
    for (int i = 1; i < 1000; i++) {
      int temp = getLength(i);
      if (max < temp) {
        d = i;
        max = temp;
      }
    }
    System.out.println(d);
  }

  public static int getLength(int denominator) {
    int digit = 10;
    Queue<Integer> remainders = new LinkedList<>();
    while (true) {
      digit = digit % denominator;
      if (digit == 0)
        return 0;
      if (remainders.contains(digit))
        break;
      remainders.add(digit);
      while (digit < denominator)
        digit *= 10;
    }
    while (remainders.peek() != digit)
      remainders.poll();
    return remainders.size();
  }
}
