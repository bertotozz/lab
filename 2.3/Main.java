import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    List<Student> students = readStudents();
    Sorting<Student> sorting = new StudentSort();
    sorting.sort(students);
    printStudents(students);
  }

  private static List<Student> readStudents() {
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();
    List<Student> students = new ArrayList<>();
    for (int i = 0; i < count; i++) {
      String name = scanner.next();
      int age = scanner.nextInt();
      students.add(new Student(name, age));
    }
    scanner.close();
    return students;
  }

  private static void printStudents(List<Student> students) {
    StringBuilder answer = new StringBuilder();
    for (Student student : students) {
      answer.append(student.getName());
      answer.append(" ");
      answer.append(student.getAge());
      answer.append(System.lineSeparator());
    }
    System.out.print(answer);
  }
}
