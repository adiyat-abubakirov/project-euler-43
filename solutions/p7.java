import java.util.ArrayList;
import java.util.List;

public class p7 {
  public static void main(String[] args) {
    int num=10001;
    List<Integer> list=new ArrayList<>();
    list.add(2);
    list.add(3);
    int n=1;
    while(list.size()<num){
      if(isPrime(6*n-1)) list.add(6*n-1);
      if(isPrime(6*n+1)) list.add(6*n+1);
      n++;
    }
    System.out.println(list.get(num-1));
  }

  public static boolean isPrime(int x) {
    for (int i = 2; i <= Math.sqrt(x); i++) {
      if (x % i == 0)
        return false;
    }
    return true;
  }
}
