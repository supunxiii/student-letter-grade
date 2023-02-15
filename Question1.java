interface Printable {
  void print();
}

class Letter implements Printable {
  private String text;
  Letter(String text) {
    this.text = text;
  }

public void print() {
  System.out.println("Text: " + text);
  }
}

class Student implements Printable {
  private String name;
  private String grades[] = new String[5];
  Student(String name, String grades[]) {
    this.name = name;
    int i = 0;
    while (i < 5 && i < grades.length) { // this loop will copy the first 5 elements of argument to instance field grades.
      this.grades[i] = grades[i];
      ++i;
    }
}

public void print() {
  System.out.println("Name: " + name);
  System.out.print("Grades: ");
  for (String s : grades)
  System.out.print(s + " ");
  System.out.println();
  }
}

public class Question1 {
  public static void main(String[] args){
    String grades1[] = {"A", "B", "B", "A", "C"};
    Student s1 = new Student("Supun", grades1);
    s1.print();
    String grades2[] = new String[5];
    grades2[0] = "C";
    grades2[1] = "A";
    grades2[2] = "B";
    grades2[3] = "D";
    grades2[4] = "F";
    Student s2 = new Student("Taylor", grades2);
    s2.print();
    Letter l1 = new Letter("Hello!");
    l1.print();
  }
}
