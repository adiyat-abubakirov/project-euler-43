public class p34 {
  public static void main(String[] args) {
    /*
     * Upper bound explanation: https://raw.org/puzzle/project-euler/problem-34/
     */
    int sum = 0;
    int limit = 4 * factorial(9);
    for (int i = 10; i <= limit; i++)
      if (isSumFactorial(i))
        sum += i;
    System.out.println(sum);
  }

  public static boolean isSumFactorial(int n) {
    int temp = n;
    int sum = 0;
    while (temp > 0) {
      sum += factorial(temp % 10);
      temp /= 10;
    }
    return sum == n;
  }

  public static int factorial(int n) {
    if (n <= 1)
      return 1;
    return n * factorial(n - 1);
  }
}
