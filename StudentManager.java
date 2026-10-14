import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        for (Student student : students) {
            System.out.println("--------------------");
            student.displayDetails();
        }
    }

    public boolean deleteStudent(int studentId) {
        return students.removeIf(
            student -> student.getStudentId() == studentId
        );
    }
}