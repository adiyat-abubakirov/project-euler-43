public class p33 {
  public static void main(String[] args) {
    /*
     * Explanation: https://raw.org/puzzle/project-euler/problem-33/
     * derive equations then code
     */
    int numerator = 1;
    int denominator = 1;
    for (int i = 1; i < 10; i++) {
      for (int j = 1; j < i; j++) {
        for (int j2 = 1; j2 < j; j2++) {
          if ((10 * j2 + i) * j == (10 * i + j) * j2) {
            numerator *= j2;
            denominator *= j;
          }
        }
      }
    }
    denominator = getSimplifiedDenominator(numerator, denominator);
    System.out.println(denominator);
  }

  public static int getSimplifiedDenominator(int i, int j) {
    int limit = (int) Math.min(Math.sqrt(i), Math.sqrt(j));
    int divider = 1;
    while (divider <= limit) {
      if (i % divider == 0 || j % divider == 0) {
        int temp = divider;
        int divideri = i / divider;
        if (i % divider != 0 && i % divideri == 0 && j % divider != 0 && j % divideri == 0)
          divider = divideri;
        else if (i % divider == 0 && i % divideri == 0 && j % divider == 0 && j % divideri == 0)
          divider = Math.max(divider, divideri);
        int dividerj = j / divider;
        if (i % divider != 0 && i % dividerj == 0 && j % divider != 0 && j % dividerj == 0)
          divider = dividerj;
        else if (i % divider == 0 && i % dividerj == 0 && j % divider == 0 && j % dividerj == 0)
          divider = Math.max(divider, dividerj);
        if (i % divider == 0 && j % divider == 0)
          break;
        else
          divider = temp;
      }
      divider++;
    }
    return j / divider;
  }
}
