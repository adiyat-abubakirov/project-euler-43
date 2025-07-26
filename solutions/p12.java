public class p12 {
  public static void main(String[] args) {
    int result = 0;
    int i = 1;
    while (true) {
      result += i;
      if (factors(result) > 500) {
        System.out.println(result);
        break;
      }
      i++;
    }
  }

  public static int factors(int result) {
    int count = 2;
    for (int i = 2; i <= Math.sqrt(result); i++) {
      if(result%i==0) count+=2;
    }
    return count;
  }
}
