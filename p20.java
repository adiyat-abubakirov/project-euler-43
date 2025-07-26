import java.math.BigInteger;

public class p20 {
  public static void main(String[] args) {
    BigInteger num = factorial(100);
    String[] digits = num.toString().split("");
    int sum = 0;
    for (String digit : digits) {
      sum += Integer.parseInt(digit);
    }
    System.out.println(sum);
  }

  public static BigInteger factorial(int n) {
    if (n == 2)
      return new BigInteger("2");
    return new BigInteger(Integer.toString(n)).multiply(factorial(n - 1));
  }
}
