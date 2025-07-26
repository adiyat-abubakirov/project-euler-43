import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class p3 {
  public static void main(String[] args) {
    long num = 600851475143l;
    long lgest = 0;
    for (long i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        if (isPrime(i)) {
          long pair = num / i;
          if (pair != i && isPrime(pair)) {
            long max = Long.max(pair, i);
            lgest = lgest >= max ? lgest : max;
          } else
            lgest = lgest >= i ? lgest : i;
        }
      }
    }
    System.out.println(lgest);
  }

  public static boolean isPrime(long x) {
    for (long i = 2; i <= Math.sqrt(x); i++)
      if (x % i == 0)
        return false;
    return true;
  }
}
