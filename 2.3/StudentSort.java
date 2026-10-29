import java.util.ArrayList;
import java.util.List;

public class StudentSort implements Sorting<Student> {

  @Override
  public void sort(List<Student> students) {
    quickSortByName(students, 0, students.size() - 1);
    sliceByAge(students, 0, students.size() - 1);
  }

  private void quickSortByName(List<Student> students, int start, int end) {
    if (start >= end) {
      return;
    }
    String pivot = students.get((start + end) / 2).getName();
    int left = start;
    int right = end;
    while (left <= right) {
      while (students.get(left).getName().compareTo(pivot) < 0) {
        left++;
      }
      while (students.get(right).getName().compareTo(pivot) > 0) {
        right--;
      }
      if (left <= right) {
        swap(students, left, right);
        left++;
        right--;
      }
    }
    quickSortByName(students, start, right);
    quickSortByName(students, left, end);
  }

  private void sliceByAge(List<Student> students, int start, int end) {
    if (start >= end) {
      return;
    }
    int middle = (start + end) / 2;
    sliceByAge(students, start, middle);
    sliceByAge(students, middle + 1, end);
    mergeByAge(students, start, middle, end);
  }

  private void mergeByAge(List<Student> students, int start, int middle, int end) {
    List<Student> temp = new ArrayList<>();
    int left = start;
    int right = middle + 1;
    while (left <= middle && right <= end) {
      if (students.get(left).getAge() <= students.get(right).getAge()) {
        temp.add(students.get(left));
        left++;
      } else {
        temp.add(students.get(right));
        right++;
      }
    }
    while (left <= middle) {
      temp.add(students.get(left));
      left++;
    }
    while (right <= end) {
      temp.add(students.get(right));
      right++;
    }
    for (int i = 0; i < temp.size(); i++) {
      students.set(start + i, temp.get(i));
    }
  }

  private void swap(List<Student> students, int first, int second) {
    Student temp = students.get(first);
    students.set(first, students.get(second));
    students.set(second, temp);
  }
}
