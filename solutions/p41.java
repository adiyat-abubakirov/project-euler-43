import java.util.ArrayList;
import java.util.List;

public class p41 {
  public static void main(String[] args) {
    int max = 987654321;
    int result = 0;
    for (int l = 9; result == 0; max %= Math.pow(10, --l)) {
      for (int i = 1; i <= l && result==0; i++) {
        List<Integer> nums = new ArrayList<>();
        for (int j = i; j > 0; j--)
          nums.add(j);
        result = comb(max - (max % (int) Math.pow(10, i)), nums);
      }
    }
    System.out.println(result);
  }

  public static int comb(int n, List<Integer> nums) {
    if(nums.size()==0 && isPrime(n)) return n;
    for (int i = 0; i < nums.size(); i++) {
      int temp = nums.remove(i);
      int result=comb(n+(int)Math.pow(10, nums.size())*temp, nums);
      if(result!=0) return result;
      nums.add(temp);
    }
    return 0;
  }

  public static boolean isPrime(int n) {
    for (int i = 2; i <= Math.sqrt(n); i++)
      if (n % i == 0)
        return false;
    return true;
  }
}
