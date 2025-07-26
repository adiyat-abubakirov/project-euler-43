import java.math.BigInteger;

public class p25 {
  public static void main(String[] args) {
    /*
     * 2nd Approach: https://raw.org/puzzle/project-euler/problem-25/ (formula for
     * nth fibonacci number)
     */
    int i = 2;
    BigInteger first = new BigInteger("1");
    BigInteger second = new BigInteger("1");
    while (second.toString().length() < 1000) {
      second = second.add(first);
      first = second.subtract(first);
      i++;
    }
    System.out.println(i);
  }
}
