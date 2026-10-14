public class GraduateStudent extends Student {
    private String specialization;

    public GraduateStudent(String name, int studentId,
                           double marks, String specialization) {
        super(name, studentId, marks);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public void displayDetails() {
        System.out.println("Graduate Student Details");
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
    }
}