package src.grades;

public class StudentTest {
     public static void main(String[] args) {
          Student student = new Student("TestStudent");
          student.addGrade(90);
          student.addGrade(80);
          student.addGrade(70);
          System.out.println(student.getGradeAverage());
     }
}
