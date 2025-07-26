public class p40 {
  public static void main(String[] args) {
    System.out.println(getN(1) * getN(10) * getN(100) * getN(1000) * getN(10000) * getN(100000) * getN(1000000));
  }

  public static int getN(int num) {
    int n = 0;
    int i = 1;
    while ((int) Math.pow(10, i - 1) * 9 * i < num) {
      num -= (int) Math.pow(10, i - 1) * 9 * i;
      i++;
    }
    n = (int) Math.pow(10, i - 1) - 1 + (int) Math.ceil((double) num / i);
    num %= i;
    if (num == 0)
      num = i;
    return (n / (int) (Math.pow(10, i - num))) % 10;
  }
}
