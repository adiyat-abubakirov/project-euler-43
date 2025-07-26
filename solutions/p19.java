public class p19 {
  public static void main(String[] args) {
    int count = 0;
    int weekday = 2;
    for (int i = 1901; i < 2001; i++) {
      for (int j = 1; j < 13; j++) {
        if (weekday % 7 == 0) {
          count++;
          weekday = 0;
        }
        if (j == 9 || j == 4 || j == 6 || j == 11)
          weekday += 30 % 7;
        else if (j == 2 && (i % 100 == 0 && i % 400 == 0 || i % 100 != 0 && i % 4 == 0))
          weekday += 29 % 7;
        else if (j != 2)
          weekday += 31 % 7;
      }
    }
    System.out.println(count);
  }
}
