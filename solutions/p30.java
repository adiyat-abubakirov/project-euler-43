public class p30 {
  public static void main(String[] args) {
    /*
     * calculating upper bound: 10^(d-1)<=d*9^5<10^d, conver it and then find d that
     * satisfies the inequality
     */
    int sum = 0;
    int limit = (int) (6 * Math.pow(9, 5));
    for (int i = 10; i < limit; i++)
      if (isSum(i))
        sum += i;
    System.out.println(sum);
  }

  public static boolean isSum(int n) {
    int temp = n;
    int sum = 0;
    while (temp > 0) {
      sum += (int) (Math.pow(temp % 10, 5));
      temp /= 10;
    }
    return sum == n;
  }
}
