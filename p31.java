public class p31 {
  public static void main(String[] args) {
    /*
     * Explanation: https://raw.org/puzzle/project-euler/problem-31/
     */
    int target = 200;
    int[] coins = { 1, 2, 5, 10, 20, 50, 100, 200 };
    int[][] targets = new int[target + 1][coins.length];
    for (int i = 0; i < target + 1; i++)
      targets[i][0] = 1;
    for (int i = 0; i < target + 1; i++) {
      for (int j = 1; j < coins.length; j++) {
        targets[i][j] = targets[i][j - 1];
        if (i >= coins[j])
          targets[i][j] += targets[i - coins[j]][j];
      }
    }
    System.out.println(targets[target][coins.length - 1]);
    /*
     * Second approach
     */
    // int target = 200;
    // int[] coins = { 1, 2, 5, 10, 20, 50, 100, 200 };
    // int[] targets = new int[target + 1];
    // targets[0] = 1;
    // for (int i = 0; i < coins.length; i++)
    // for (int j = coins[i]; j < target + 1; j++)
    // targets[j] += targets[j - coins[i]];
    // System.out.println(targets[target]);
  }
}
