import java.util.ArrayList;
import java.util.List;

public class p10 {
  public static void main(String[] args) {
    int num = 2000000;
    long sum=0;
    if(2<num) sum+=2;
    if(3<num) sum+=3;
    int i=1;
    while(true){
      if(isPrime(6*i-1) && (6*i-1)<num) sum+=(6*i-1);
      if(isPrime(6*i+1) && (6*i+1)<num) sum+=(6*i+1);
      i++;
      if((6*i+1)>=num && (6*i-1)>=num) break;
    }
    System.out.println(sum);
  }

  public static boolean isPrime(int x) {
    for (int i = 2; i <= Math.sqrt(x); i++) {
      if (x % i == 0)
        return false;
    }
    return true;
  }

}
