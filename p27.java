public class p27 {
  public static void main(String[] args) {
    /*
     * This approach uses a theory that a must be negative odd and b must be odd
     * prime starting from 41
     * it uses specific formulas for a and b derived from
     * n^2-79n+1601=(n-40)^2+(n-40)+41
     * This approach is not proved but I think it is valid, I got it from some math
     * website with detailed explanation
     */
    int a = 0;
    int b = 0;
    int k = 0;
    while (true) {
      k++;
      int an = -k * 2 + 1;
      int bn = (int) Math.pow(k, 2) - k + 41;
      if (Math.abs(an) >= 1000 || Math.abs(bn) > 1000)
        break;
      a = an;
      b = bn;
    }
    System.out.println(a * b);
  }
  /*
   * Another approach: From n^2+an+b equation, b must be prime, a must be even for
   * b=2, or must be odd for b!=2, because all primes are odd except 2.
   * Therefore define values for b from 2 to 1000, and test values for a from -999
   * to 999.
   * Source: https://raw.org/puzzle/project-euler/problem-27/
   */
}
