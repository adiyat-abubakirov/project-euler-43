import java.util.ArrayList;
import java.util.List;

public class p35 {
  static List<Integer> circs = new ArrayList<>();

  public static void main(String[] args) {
    int limit = 1000000;
    if(2<limit) circs.add(2);
    if(3<limit) circs.add(3);
    for (int i = 1; true; i++) {
      int temp1 = 6 * i + 1;
      if (temp1 < limit) {
        if (!circs.contains(temp1) && isPrime(temp1))
          isCirc(temp1);
      } else
        break;
      int temp2 = 6 * i - 1;
      if (temp2 < limit) {
        if (!circs.contains(temp2) && isPrime(temp2))
          isCirc(temp2);
      } else
        break;
    }
    System.out.println(circs.size());
  }

  public static boolean isPrime(int n) {
    for (int i = 2; i <= Math.sqrt(n); i++)
      if (n % i == 0)
        return false;
    return true;
  }

  public static boolean isCirc(int n) {
    List<Integer> lcircs = new ArrayList<>();
    String num = "" + n;
    do {
      num = num.substring(1) + num.substring(0, 1);
      int temp = Integer.parseInt(num);
      if (!lcircs.contains(temp))
        lcircs.add(temp);
      if (!isPrime(temp))
        return false;
    } while (!num.equals("" + n));
    if (!lcircs.contains(n))
      lcircs.add(n);
    circs.addAll(lcircs);
    return true;
  }
}
