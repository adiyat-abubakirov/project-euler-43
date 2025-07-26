public class p28 {
  public static void main(String[] args) {
    int limit = 1001;
    int sum = 1;
    for (int i = 3; i <= 1001; i += 2) {
      sum += (int) (4 * Math.pow(i, 2) - 6 * (i - 1));
    }
    System.out.println(sum);
  }
}
