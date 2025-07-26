import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p18 {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner scan = new Scanner(new File("texts/18.txt"));
    List<List<Integer>> triangle = new ArrayList<>();
    int size = 0;
    while (scan.hasNextInt()) {
      size++;
      triangle.add(new ArrayList<>());
      for (int j = 0; j < size; j++) {
        triangle.get(size - 1).add(scan.nextInt());
      }
    }
    for (int i = size - 2; i >= 0; i--) {
      for (int j = 0; j < i + 1; j++) {
        int max = Math.max(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1));
        triangle.get(i).set(j, triangle.get(i).get(j) + max);
      }
      triangle.remove(i + 1);
    }
    System.out.println(triangle.get(0).get(0));
  }
}
