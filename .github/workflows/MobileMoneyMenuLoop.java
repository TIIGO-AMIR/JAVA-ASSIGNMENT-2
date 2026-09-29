import java.util.Scanner;

public class MobileMoneyMenuLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n**** Mobile Money Menu ****");
            System.out.println("1. Send Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Buy Airtime");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Continue to Send Money.");
                    break;

                case 2:
                    System.out.println("Continue to Withdraw Money.");
                    break;

                case 3:
                    System.out.println("Contiue to Buy Airtime.");
                    break;

                case 0:
                    System.out.println("Thank you for using Mobile Money.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        input.close();
    }
}