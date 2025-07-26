public class p6 {
  public static void main(String[] args) {
    int start=1;
    int end=100;
    int result=0;
    for (int i = start; i <= end; i++) {
      for (int j = i+1; j <= end; j++) {
        result+=i*j*2;
      }
    }
    System.out.println(result);
    /* Alternative solution using arithmetic formulas (much easier and faster)
     *
     * int limit = 100;
     * int sum_of_squares = Math.pow((limit * (1 + limit) / 2), 2);  // just uses old arithmetic formula to find sum from 1 to 100
     * int square_of_sum = (Math.pow(limit, 3)) / 3 + (Math.pow(limit, 2)) / 2 + limit / 6;  // just uses formula to find sum of the first n terms
     * System.out.println(sum_of_squares - square_of_sum);
     *
     * */
  }
}
