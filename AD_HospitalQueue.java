
import java.util.ArrayDeque;
import java.util.Scanner;

public class AD_HospitalQueue {
    public static void main(String[] args) {

        ArrayDeque<String> patients = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Hospital Patient Queue ---");
            System.out.println("1. Register Normal Patient");
            System.out.println("2. Register Emergency Patient");
            System.out.println("3. Treat Next Patient");
            System.out.println("4. View Next Patient");
            System.out.println("5. Display Waiting Patients");
            System.out.println("6. Check Whether Queue Is Empty");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter patient name: ");
                    String normal = sc.nextLine();
                    patients.offerLast(normal);
                    System.out.println("Normal patient registered.");
                    break;

                case 2:
                    System.out.print("Enter emergency patient name: ");
                    String emergency = sc.nextLine();
                    patients.offerFirst(emergency);
                    System.out.println("Emergency patient added to front.");
                    break;

                case 3:
                    if (patients.isEmpty()) {
                        System.out.println("No patients waiting.");
                    } else {
                        System.out.println(
                            "Treating patient: " + patients.pollFirst()
                        );
                    }
                    break;

                case 4:
                    if (patients.isEmpty()) {
                        System.out.println("No patients waiting.");
                    } else {
                        System.out.println(
                            "Next patient: " + patients.peekFirst()
                        );
                    }
                    break;

                case 5:
                    if (patients.isEmpty()) {
                        System.out.println("No patients waiting.");
                    } else {
                        System.out.println("Waiting patients: " + patients);
                    }
                    break;

                case 6:
                    System.out.println(
                        patients.isEmpty()
                            ? "Queue is empty."
                            : "Patients are waiting."
                    );
                    break;

                case 0:
                    System.out.println("Hospital queue closed.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}
