public class p15 {
  public static void main(String[] args) {
    int i=20;
    int j=20;
    long result=(long)(factorial(i+j)/factorial(i)/factorial(j));
    System.out.println(result);
  }
  public static double factorial(int n){
    if(n==0) return 1;
    return n*factorial(n-1);
  }
}
