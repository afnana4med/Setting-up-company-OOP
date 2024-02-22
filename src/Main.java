import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Company company = new Company();
        Scanner scanner = new Scanner(System.in);

        boolean Entry = true;
        while (Entry) {
            System.out.println();
            System.out.println("      ***Welcome to MSR***");
            System.out.println("\n1. Open New Office");
            System.out.println("2. Add Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Transfer Employee");
            System.out.println("5. Display Offices");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter office name: ");
                    scanner.nextLine();
                    String officeName = scanner.nextLine();
                    boolean opened = company.openOffice(officeName);
                    if (opened) {
                        System.out.println("Office opened successfully! Now press 5 to get officeNo");
                    } else {
                        System.out.println("Failed to open office.");
                    }
                    break;
                case 2:
                    System.out.print("Enter employee name: ");
                    scanner.nextLine();
                    String employeeName = scanner.nextLine();
                    System.out.print("Enter office number: ");
                    int officeNumberAdd = scanner.nextInt();
                    boolean added = company.addEmployee(employeeName, officeNumberAdd);
                    if (added) {
                        System.out.println("Employee added successfully!");
                    } else {
                        System.out.println("Failed to add employee.");
                    }
                    break;
                case 3:
                    System.out.print("Enter employee name: ");
                    scanner.nextLine();
                    String employeeNameRemove = scanner.nextLine();
                    System.out.print("Enter office number: ");
                    int officeNumberRemove = scanner.nextInt();
                    boolean removed = company.removeEmployee(employeeNameRemove, officeNumberRemove);
                    if (removed) {
                        System.out.println("Employee removed successfully!");
                    } else {
                        System.out.println("Failed to remove employee.");
                    }
                    break;
                case 4:
                    System.out.print("Enter employee name: ");
                    scanner.nextLine();
                    String employeeNameTransfer = scanner.nextLine();
                    System.out.print("Enter old office number: ");
                    int oldOfficeNumber = scanner.nextInt();
                    System.out.print("Enter new office number: ");
                    int newOfficeNumber = scanner.nextInt();
                    boolean transferred = company.transferEmployee(employeeNameTransfer, oldOfficeNumber, newOfficeNumber);
                    if (transferred) {
                        System.out.println("Employee transferred successfully!");
                    } else {
                        System.out.println("Failed to transfer employee.");
                    }
                    break;
                case 5:
                    company.displayOffices();
                    break;
                case 6:
                    Entry = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        scanner.close();
    }
}




