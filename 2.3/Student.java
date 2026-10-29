public class Student implements Comparable<Student> {

  private static final int MIN_AGE = 0;

  private final String name;
  private final int age;

  public Student(String name, int age) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Имя студента не может быть пустым");
    }
    if (age < MIN_AGE) {
      throw new IllegalArgumentException("Возраст не может быть отрицательным");
    }
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public int compareTo(Student other) {
    return Integer.compare(age, other.age);
  }
}
