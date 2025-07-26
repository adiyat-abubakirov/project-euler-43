public class p36 {
  public static void main(String[] args) {
    int limit=1000000;
    int sum=0;
    for (int i = 1; i < limit; i+=2) {
      if(i%10==0) continue;
      if(isPalindrome(i)) sum+=i;
    }
    System.out.println(sum);
  }
  public static boolean isPalindrome(int n){
    char[] base10=Integer.toString(n).toCharArray();
    char[] base2=Integer.toString(n,2).toCharArray();
    for (int i = 0; i < base10.length/2; i++) if(base10[i]!=base10[base10.length-1-i]) return false;
    for (int i = 0; i < base2.length/2; i++) if(base2[i]!=base2[base2.length-1-i]) return false;
    return true;
  }
}
