public class Student extends Person {
    private int studentId;
    private double marks;

    public Student(String name, int studentId, double marks) {
        super(name);
        this.studentId = studentId;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + getName());
        System.out.println("Marks: " + marks);
        System.out.println("Result: " + (marks >= 33 ? "PASS" : "FAIL"));
    }
}
