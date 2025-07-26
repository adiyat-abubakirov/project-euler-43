public class p38 {
  public static void main(String[] args) {
    int max = 0;
    for (int i = 1; i < 9999; i++) {
      String num=getPandigital(i);
      if(isPandigital(num)){
        int n=Integer.parseInt(num);
        max=Math.max(n,max);
      }
    }
    System.out.println(max);
  }

  public static boolean isPandigital(String num) {
    try {
      if (num.length() != 9)
        return false;
      int[] digits = new int[9];
      for (int i = 0; i < num.length(); i++)
        digits[num.charAt(i) - 49]++;
      int sum = 1;
      for (int i : digits)
        sum *= i;
      return sum == 1;
    } catch (Exception e) {
      return false;
    }
  }
  public static String getPandigital(int i){
    String num="";
    int j=1;
    while(num.length()<9) {
      num=num.concat(Integer.toString(i*j));
      j++;
    }
    return num;
  }
}
