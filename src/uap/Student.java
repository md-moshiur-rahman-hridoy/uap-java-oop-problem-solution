package uap;

public class Student {
    private String name;
    private String id;
    private int semester;
    private double totalCreditCompleted;
    private double cgpa;

    public Student(String name, String id, int semester, double totalCreditCompleted, double cgpa) {
        this.name = name;
        this.id = id;
        this.semester = semester;
        this.totalCreditCompleted = totalCreditCompleted;
        this.cgpa = cgpa;
    }

    public void updateResult(double credit, double gpa) {
        double totalPoints = cgpa * totalCreditCompleted;
        totalCreditCompleted += credit;
        totalPoints += credit * gpa;
        cgpa = totalPoints / totalCreditCompleted;
    }

    public void promote() {
        semester++;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getSemester() {
        return semester;
    }

    public double getTotalCreditCompleted() {
        return totalCreditCompleted;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Name: " + name + "; ID: " + id + "; Semester: " + semester +
               "; Credit Completed: " + totalCreditCompleted + "; CGPA: " + cgpa;
    }
}
