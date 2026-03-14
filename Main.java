import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while (true) {

            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display Students");
            System.out.println("5. Edit Student");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();

                    System.out.print("Enter Grade: ");
                    String grade = sc.next();

                    sms.addStudent(new Student(name, roll, grade));
                    break;

                case 2:
                    System.out.print("Enter Roll Number to remove: ");
                    int r1 = sc.nextInt();
                    sms.removeStudent(r1);
                    break;

                case 3:
                    System.out.print("Enter Roll Number to search: ");
                    int r2 = sc.nextInt();

                    Student s = sms.searchStudent(r2);

                    if (s != null)
                        System.out.println(s);
                    else
                        System.out.println("Student not found");
                    break;

                case 4:
                    sms.displayStudents();
                    break;

                case 5:
                    System.out.print("Enter Roll Number: ");
                    int r3 = sc.nextInt();

                    System.out.print("Enter New Name: ");
                    String newName = sc.next();

                    System.out.print("Enter New Grade: ");
                    String newGrade = sc.next();

                    sms.editStudent(r3, newName, newGrade);
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}