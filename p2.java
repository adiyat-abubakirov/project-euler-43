public class p2 {
  public static void main(String[] args) {
    /*
     * 2nd Approach: https://raw.org/puzzle/project-euler/problem-25/ (formula for
     * nth fibonacci number)
     */
    int num = 4000000;
    int j = 1;
    int i = 1;
    int sum = 0;
    while (true) {
      if (i + j > num)
        break;
      else if ((i + j) % 2 == 0)
        sum += i + j;
      i = i + j;
      j = i - j;
    }
    System.out.println(sum);
  }
}
