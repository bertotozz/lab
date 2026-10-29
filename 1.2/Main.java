import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите размер массива:");
    int size = scanner.nextInt();
    int[] arr = readArray(scanner, size);
    System.out.println("Введите число, которое нужно удалить:");
    int val = scanner.nextInt();
    scanner.close();

    Remover remover = new Remover();
    int newSize = remover.removeElementInplace(arr, val);
    System.out.println("Новый размер: " + newSize);
    printArray(arr, newSize);
  }

  private static int[] readArray(Scanner scanner, int size) {
    System.out.println("Введите элементы массива через пробел:");
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = scanner.nextInt();
    }
    return arr;
  }

  private static void printArray(int[] arr, int newSize) {
    StringBuilder answer = new StringBuilder("Массив: [");
    for (int i = 0; i < newSize; i++) {
      if (i > 0) {
        answer.append(", ");
      }
      answer.append(arr[i]);
    }
    answer.append("]");
    System.out.println(answer);
  }
}
