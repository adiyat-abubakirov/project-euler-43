public class p37 {
  public static void main(String[] args) {
    int count=0;
    int sum=0;
    for (int i = 2; count<11; i++) {
      int temp1=i*6-1;
      int temp2=i*6+1;
      if(isPrime(temp1) && isTrunctable(temp1)){
        sum+=temp1;
        count++;
      }
      if(isPrime(temp2) && isTrunctable(temp2)){
        sum+=temp2;
        count++;
      }
    }
    System.out.println(sum);
  }
  public static boolean isTrunctable(int n) {
    for (int i = 10; i < n; i *= 10)
      if (!isPrime(n % i) || !isPrime(n/i))
        return false;
    return true;
  }

  public static boolean isPrime(int n) {
    if(n<=1) return false;
    for (int i = 2; i <= Math.sqrt(n); i++)
      if (n % i == 0)
        return false;
    return true;
  }
}
