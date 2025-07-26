public class p39 {
  public static void main(String[] args) {
    int max = 1;
    int p = 1000;
    for (int i = 999; i > 12; i--) {
      int temp = 0;
      for (int j = 1; j < i / 3; j++)
        if ((i * (i - 2 * j)) % (2 * (i - j)) == 0)
          temp++;
      if(max<temp){
        max=temp;
        p=i;
      }
    }
    System.out.println(p);
  }
}
