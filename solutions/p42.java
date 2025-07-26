import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p42 {
  public static void main(String[] args) throws FileNotFoundException {
    int count = 0;
    Scanner scan = new Scanner(new File("texts/42.txt"));
    scan.useDelimiter("\"");
    while (scan.hasNext())
      if (isTriangle(scan.next()))
        count++;
    System.out.println(count);
  }

  public static boolean isTriangle(String word) {
    int sum = 0;
    for (char letter : word.toCharArray())
      sum += (letter - 64);
    double quadsum = .25 + 2 * sum;
    if (quadsum > 0) {
      quadsum = Math.sqrt(quadsum);
      return quadsum > .5 && (quadsum - (int) quadsum) == .5;
    }
    return false;
  }
}
