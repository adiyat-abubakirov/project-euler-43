public class p9 {
  public static void main(String[] args) {
    int num = 1000;
    int i = 2;
    int j;
    int result;
    while (i<Math.sqrt(num/2)) {
      result = (int) (2 * i + Math.pow(i, 2) + Math.pow(i, 2));
      j=(num-result)/(2*i)+1;
      if (result == num) {
        System.out.println((int)(2 * i * (Math.pow(i, 2) - 1) * (Math.pow(i, 2) + 1)));
        break;
      }
      else if((num-result)%(2*i)==0 && Math.abs(j)<Math.abs(i)){
        System.out.println((int)(2 * i * j * (Math.pow(i, 2) - Math.pow(j,2)) * (Math.pow(i, 2) + Math.pow(j,2))));
        break;
      }
      i++;
    }
  }
}
