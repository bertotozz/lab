import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    List<Integer> nums = readNumbers();
    Sorting<Integer> sorting = new MergeSort();
    sorting.sort(nums);
    printNumbers(nums);
  }

  private static List<Integer> readNumbers() {
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();
    List<Integer> nums = new ArrayList<>();
    for (int i = 0; i < count; i++) {
      nums.add(scanner.nextInt());
    }
    scanner.close();
    return nums;
  }

  private static void printNumbers(List<Integer> nums) {
    StringBuilder answer = new StringBuilder();
    for (int i = 0; i < nums.size(); i++) {
      if (i > 0) {
        answer.append(" ");
      }
      answer.append(nums.get(i));
    }
    System.out.println(answer);
  }
}
