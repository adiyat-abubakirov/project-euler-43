public class p17 {
  public static void main(String[] args) { // hardest part is to not mess up number of letters, substrings, main method,
                                           // and keep track of tricky situations in the other methods
    int sum = 0;
    for (int i = 1; i <= 1000; i++) {
      sum += gnol(i);
    }
    System.out.println(sum);
  }

  public static int gnol(int i) {
    String n = Integer.toString(i);
    if (n.length() == 1)
      return gnold(n);
    else if (n.length() == 2) {
      if (n.substring(0, 1).equals("1"))
        return gnolt(n);
      else {
        return gnold(n.substring(1, 2)) + gnolh(n.substring(0, 1));
      }
    } else if (n.length() == 3) {
      if (n.substring(1, 3).equals("00"))
        return gnolo(n.substring(0, 1));
      else {
        if (n.substring(1, 2).equals("1"))
          return 3 + gnolo(n.substring(0, 1)) + gnolt(n.substring(1, 3));
        else
          return 3 + gnolo(n.substring(0, 1)) + gnold(n.substring(2, 3)) + gnolh(n.substring(1, 2));
      }
    } else
      return 11;
  }

  public static int gnold(String n) {
    if (n.equals("1"))
      return 3;
    else if (n.equals("2"))
      return 3;
    else if (n.equals("3"))
      return 5;
    else if (n.equals("4"))
      return 4;
    else if (n.equals("5"))
      return 4;
    else if (n.equals("6"))
      return 3;
    else if (n.equals("7"))
      return 5;
    else if (n.equals("8"))
      return 5;
    else if (n.equals("9"))
      return 4;
    return 0;
  }

  public static int gnolt(String n) {
    if (n.equals("11"))
      return 6;
    else if (n.equals("12"))
      return 6;
    else if (n.equals("13"))
      return 8;
    else if (n.equals("14"))
      return 8;
    else if (n.equals("15"))
      return 7;
    else if (n.equals("16"))
      return 7;
    else if (n.equals("17"))
      return 9;
    else if (n.equals("18"))
      return 8;
    else if (n.equals("19"))
      return 8;
    return 3;
  }

  public static int gnolh(String n) {
    if (n.equals("2"))
      return 6;
    else if (n.equals("3"))
      return 6;
    else if (n.equals("4"))
      return 5;
    else if (n.equals("5"))
      return 5;
    else if (n.equals("6"))
      return 5;
    else if (n.equals("7"))
      return 7;
    else if (n.equals("8"))
      return 6;
    else if (n.equals("9"))
      return 6;
    return 0;
  }

  public static int gnolo(String n) {
    return 7 + gnold(n);
  }
}
