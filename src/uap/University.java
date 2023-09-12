package uap;

import java.util.ArrayList;

public class University {
    private String univName;
    private ArrayList<Student> students;

    public University(String univName) {
        this.univName = univName;
        this.students = new ArrayList<>();
    }

    public void addNewStudent(String name, String id, int semester, double totalCreditCompleted, double cgpa) {
        Student newStudent = new Student(name, id, semester, totalCreditCompleted, cgpa);
        students.add(newStudent);
    }

    public Student findStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public void updateResult(String id, double credit, double gpa) {
        Student student = findStudent(id);
        if (student != null) {
            student.updateResult(credit, gpa);
        }
    }

    public void promote(String id) {
        Student student = findStudent(id);
        if (student != null) {
            student.promote();
        }
    }

    public void getStudents(int semester) {
        for (Student student : students) {
            if (student.getSemester() == semester) {
                System.out.println(student);
            }
        }
    }

    public ArrayList<Student> getStudentsList() {
        return students;
    }

    public String getUnivName() {
        return univName;
    }
}
