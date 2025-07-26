import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p22 {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner scan = new Scanner(new File("texts/22.txt"));
    String line = scan.nextLine();
    List<String> list = Arrays.asList(line.substring(1, line.length() - 1).split("\",\""));
    Collections.sort(list);
    Long total = 0l;
    for (int i = 0; i < list.size(); i++) {
      char[] characters = list.get(i).toCharArray();
      int sum = 0;
      for (char character : characters)
        sum += character - 64;
      total += (i + 1) * sum;
    }
    System.out.println(total);
  }
}
