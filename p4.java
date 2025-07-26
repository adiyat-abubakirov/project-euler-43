import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p4 {
  public static void main(String[] args) {
    int lgest = 999;
    int slest = 100;
    int max = 0;
    for (int i = 999; i > slest; i--) {
      for (int j = i; j > slest; j--) {
        if (isPalindrome(i * j)) {
          max = max >= i * j ? max : i * j;
          slest = slest <= j ? j : slest;
          break;
        }
      }
    }
    System.out.println(max);
  }

  public static boolean isPalindrome(int x) {
    int r = 0;
    int temp = x;
    while (temp > 0) {
      r = r * 10 + temp % 10;
      temp /= 10;
    }
    return r == x;
  }
}
