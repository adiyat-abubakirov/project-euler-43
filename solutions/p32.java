import java.util.ArrayList;
import java.util.List;

public class p32 {
  static List<Integer> list = new ArrayList<>();

  public static void main(String[] args) {
    int sum = 0;
    for (int i = 2; i < 10; i++) {
      for (int j = 1001; j <= 10000 / i; j++) {
        int temp = i * j;
        if (isPandigital(i, j, temp) && !list.contains(temp)) {
          sum += temp;
          list.add(temp);
        }
      }
    }
    for (int i = 11; i <= 99; i++) {
      for (int j = 101; j <= 10000 / i; j++) {
        int temp = i * j;
        if (isPandigital(i, j, temp) && !list.contains(temp)) {
          sum += temp;
          list.add(temp);
        }
      }
    }
    System.out.println(sum);
  }

  public static boolean isPandigital(int i, int j, int temp) {
    try {
      String pand = "" + i + j + temp;
      int[] digits = new int[9];
      for (int k = 0; k < pand.length(); k++)
        digits[pand.charAt(k) - 49]++;
      int sum = 1;
      for (int k : digits)
        sum *= k;
      return sum == 1;
    } catch (Exception e) {
      return false;
    }
  }
}
