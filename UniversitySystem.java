import java.util.*;

// Enrolling students in courses
class EnrollingStudents {
    List<String> OOP = new ArrayList<>();
    List<String> SCD = new ArrayList<>();

    public void addingtoOOP(String studentID) {
        OOP.add(studentID);
    }

    public void addingtoSCD(String studentID) {
        SCD.add(studentID);
    }

    public void printEnrolment() {
        System.out.println("OOP Enrollment: " + OOP);
        System.out.println("SCD Enrollment: " + SCD);
    }
}

// Recording grades using stack
class Grades {
    Stack<String> grades = new Stack<>();

    public void addGrades(String gradeRecord) {
        grades.push(gradeRecord);
    }

    public void printGrades() {
        while (!grades.isEmpty()) {
            System.out.println("Grade: " + grades.pop());
        }
    }
}

// Notifying students using queue
class Notifier {
    Queue<String> q = new LinkedList<>();

    public void notifyStudent(String studentID) {
        q.add(studentID);
    }

    public void printNotification() {
        while (!q.isEmpty()) {
            System.out.println("Notify: " + q.poll());
        }
    }
}

// Main system
public class UniversitySystem {
    public static void main(String[] args) {
        String student1 = "2022-SE-001";
        String student2 = "2022-SE-002";

        EnrollingStudents courseManager = new EnrollingStudents();
        courseManager.addingtoOOP(student1);
        courseManager.addingtoOOP(student2);
        courseManager.addingtoSCD(student1);
        courseManager.printEnrolment();

        Grades gradeManager = new Grades();
        gradeManager.addGrades("OOP - " + student1 + ": A");
        gradeManager.addGrades("Data Structures - " + student1 + ": A+");
        gradeManager.addGrades("OOP - " + student2 + ": B");
        gradeManager.printGrades();

        Notifier notifier = new Notifier();
        notifier.notifyStudent(student1);
        notifier.notifyStudent(student2);
        notifier.printNotification();
    }
}
