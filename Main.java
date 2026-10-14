import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter student ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter marks: ");
                    double marks = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("1. Regular Student");
                    System.out.println("2. Graduate Student");
                    System.out.print("Choose student type: ");
                    int type = sc.nextInt();
                    sc.nextLine();

                    if (type == 2) {
                        System.out.print("Enter specialization: ");
                        String specialization = sc.nextLine();

                        manager.addStudent(
                            new GraduateStudent(name, id, marks, specialization)
                        );
                    } else {
                        manager.addStudent(new Student(name, id, marks));
                    }
                    break;

                case 2:
                    manager.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter student ID to delete: ");
                    int deleteId = sc.nextInt();
                    sc.nextLine();

                    if (manager.deleteStudent(deleteId)) {
                        System.out.println("Student deleted successfully!");
                    } else {
                        System.out.println("Student ID not found.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you! Program closed.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}