package uap.app;

import uap.University;
import uap.Student;

import java.util.Scanner;

public class UnivApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        University uap = new University("UAP University");

        int choice;
        do {
            System.out.println("University Application Menu:");
            System.out.println("1. Add a new student");
            System.out.println("2. Update result of a student");
            System.out.println("3. Promote a student");
            System.out.println("4. Display details of a particular student");
            System.out.println("5. Display details of students of a specific semester");
            System.out.println("6. Display details of all students");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter semester: ");
                    int semester = scanner.nextInt();
                    System.out.print("Enter total credit completed: ");
                    double totalCreditCompleted = scanner.nextDouble();
                    System.out.print("Enter CGPA: ");
                    double cgpa = scanner.nextDouble();

                    uap.addNewStudent(name, id, semester, totalCreditCompleted, cgpa);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.print("Enter student ID: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Enter credit: ");
                    double credit = scanner.nextDouble();
                    System.out.print("Enter GPA: ");
                    double gpa = scanner.nextDouble();

                    uap.updateResult(updateId, credit, gpa);
                    System.out.println("Student result updated successfully!");
                    break;

                case 3:
                    System.out.print("Enter student ID: ");
                    String promoteId = scanner.nextLine();
                    uap.promote(promoteId);
                    System.out.println("Student promoted successfully!");
                    break;

                case 4:
                    System.out.print("Enter student ID: ");
                    String findId = scanner.nextLine();
                    Student foundStudent = uap.findStudent(findId);
                    if (foundStudent != null) {
                        System.out.println("Student details:\n" + foundStudent);
                    } else {
                        System.out.println("Not a valid ID");
                    }
                    break;

                case 5:
                    System.out.print("Enter semester: ");
                    int semesterToDisplay = scanner.nextInt();
                    System.out.println("Students of semester " + semesterToDisplay + ":");
                    uap.getStudents(semesterToDisplay);
                    break;

                case 6:
                    System.out.println("Details of all students:");
                    for (Student student : uap.getStudentsList()) {
                        System.out.println(student);
                    }
                    break;

                case 0:
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
