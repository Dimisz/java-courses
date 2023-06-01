public class Student {

  int studentId = 0;
  String firstName = "Not specified";
  String lastName = "Not specified";
  int enrollmentYear = 0;
  double avgMath = 0;
  double avgEcon = 0;
  double avgLang = 0;

  Student(String firstName, String lastName, int studentId, int enrollmentYear, double avgMath, double avgEcon,
      double avgLang) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.studentId = studentId;
    this.enrollmentYear = enrollmentYear;
    this.avgMath = avgMath;
    this.avgEcon = avgEcon;
    this.avgLang = avgLang;
  }

  double getAverage() {
    return (this.avgMath + this.avgEcon + this.avgLang) / 3;
  }

  void printInfo() {
    System.out.println("Student name:\t" + this.firstName + " " + this.lastName);
    System.out.println("Student id:\t" + this.studentId);
    System.out.println("Enrolled in:\t" + this.enrollmentYear);
    System.out
        .println("Math grade: " + this.avgMath + ", Econ grade: " + this.avgEcon + ", Language grade: " + this.avgLang);
    System.out.println("Average grade:\t" + this.getAverage());
  }

  public static void main(String[] args) {
    Student student1 = new Student("Mike", "Peterson", 1111, 2021, 3.9, 4.3, 5);
    Student student2 = new Student("John", "Doe", 1121, 2022, 4.9, 4.6, 3.5);
    student1.printInfo();
    student2.printInfo();
  }
}