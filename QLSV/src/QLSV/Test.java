package QLSV;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add student");
            System.out.println("2. Update student");
            System.out.println("3. Remove student");
            System.out.println("4. Show all students");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1: 
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter full name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter date of birth (yyyy-mm-dd): ");
                    LocalDate dob = LocalDate.parse(sc.nextLine());
                    System.out.print("Enter score: ");
                    double score = sc.nextDouble();

                    manager.add(new Student(name, id, dob, score));
                    System.out.println("Student added successfully!");
                    break;

                case 2: 
                    System.out.print("Enter ID to update: ");
                    String idUpdate = sc.nextLine();
                    System.out.print("Enter new full name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter new date of birth (yyyy-mm-dd): ");
                    LocalDate newDob = LocalDate.parse(sc.nextLine());
                    System.out.print("Enter new score: ");
                    double newScore = sc.nextDouble();

                    if (manager.update(idUpdate, newName, newDob, newScore)) {
                        System.out.println("Student updated!");
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 3: 
                    System.out.print("Enter ID to remove: ");
                    String idRemove = sc.nextLine();
                    if (manager.remove(idRemove)) {
                        System.out.println("Student removed!");
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4: 
                    System.out.println("\n--- Student List ---");
                    manager.showAll();
                    break;

                case 0:
                    System.out.println("Bye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}