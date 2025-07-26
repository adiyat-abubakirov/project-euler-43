import java.util.ArrayList;
import java.util.List;

public class p43 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++)
      list.add(i);
    System.out.println(sumOfDivisiblePandigitalNums(list, 0l));
  }

  public static long sumOfDivisiblePandigitalNums(List<Integer> remains, long n) {
    if (remains.size() == 0 && isSubStringDivisible(n))
      return n;
    long sum = 0;
    for (int i = (remains.size() == 10 && n == 0) ? 1 : 0; i < remains.size(); i++) {
      int temp = remains.remove(i);
      sum += sumOfDivisiblePandigitalNums(remains, n + temp * (long) Math.pow(10, remains.size()));
      remains.add(i, temp);
    }
    return sum;
  }

  public static boolean isSubStringDivisible(long n) {
    // for (int i = 8; i >= 2; i--) {
    //   int temp = (int) (n / Math.pow(10, i - 2)) % 1000;
    //   if (isNotDivisible(temp))
    //     return false;
    // }
    // return true;
    List<Integer> list=new ArrayList<>();
    list.add(2);
    list.add(3);
    list.add(5);
    list.add(7);
    list.add(11);
    list.add(13);
    list.add(17);
    for (int i = 8; i >= 2; i--) {
      long temp = (long) (n / Math.pow(10, i - 2)) % 1000; // *** IMPORTANT *** be careful with data type limits!!! They are hard to see!!!
      if (temp%list.remove(0)!=0)
        return false;
    }
    return true;
  }
}
