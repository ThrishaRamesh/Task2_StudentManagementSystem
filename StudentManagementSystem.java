import java.util.ArrayList;

public class StudentManagementSystem {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void removeStudent(int roll) {

        for (Student s : students) {
            if (s.getRollNumber() == roll) {
                students.remove(s);
                System.out.println("Student removed successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public Student searchStudent(int roll) {

        for (Student s : students) {
            if (s.getRollNumber() == roll) {
                return s;
            }
        }

        return null;
    }

    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void editStudent(int roll, String newName, String newGrade) {

        Student s = searchStudent(roll);

        if (s != null) {
            s.setName(newName);
            s.setGrade(newGrade);
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }
}