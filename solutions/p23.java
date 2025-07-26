import java.util.ArrayList;
import java.util.List;

public class p23 {
  static List<Integer> abundants = new ArrayList<>();

  public static void main(String[] args) {
    int limit = 28124;
    int total = 0;
    for (int i = 1; i < limit; i++) {
      if (isAbundant(i))
        abundants.add(i);
      // if (!isSumOfTwoAbs(i))
      // total += i;
    }
    int[] sums = new int[limit];
    for (int i = 0; i < abundants.size(); i++) {
      for (int j = i; j < abundants.size(); j++) {
        int sum = abundants.get(i) + abundants.get(j);
        if (sum < limit)
          sums[sum] = sum;
      }
    }
    for (int i = 1; i < sums.length; i++)
      if (sums[i] != i)
        total += i;
    System.out.println(total);
  }

  // public static boolean isSumOfTwoAbs(int n) {
  // for (int i : abundants) {
  // if(i>n/2) return false;
  // if(abundants.contains(n-i)) return true;
  // }
  // return false;
  // }

  public static boolean isAbundant(int n) {
    int sum = 1;
    for (int i = 2; i <= Math.sqrt(n); i++)
      if (n % i == 0) {
        sum += i;
        if (n / i != i)
          sum += n / i;
      }
    return sum > n;
  }
}
