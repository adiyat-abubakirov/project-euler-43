import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class p5 {
  static List<Integer> primes = new ArrayList<>();

  public static void main(String[] args) {
    int start = 2;
    int end = 20;
    int result = 1;
    for (int i = start; i <= end; i++)
      if (isPrime(i))
        primes.add(i);
    int[] factors = new int[primes.size()];
    Arrays.fill(factors, 1);
    for (int i = start; i <= end; i++) {
      int[] arr = prime_factors(i);
      for (int j = 0; j < primes.size(); j++) {
        factors[j] = Math.max(factors[j], arr[j]);
      }
    }
    for (int i = 0; i < primes.size(); i++)
      result *= Math.pow(primes.get(i), factors[i]);
    System.out.println(result);
  }

  public static boolean isPrime(int x) {
    if(x==2) return true;
    for (int i = 2; i <= Math.sqrt(x); i++) {
      if (x % i == 0)
        return false;
    }
    return true;
  }

  public static int[] prime_factors(int x) {
    int[] arr = new int[primes.size()];
    for (int i = 0; i < primes.size(); i++) {
      while (x % primes.get(i) == 0) {
        arr[i]++;
        x /= primes.get(i);
      }
    }
    return arr;
  }
}
