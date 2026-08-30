     import java.util.ArrayList;
import java.util.Scanner;

     public class LoginTest {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            double balance = 1000.00;
            ArrayList<String> statements = new ArrayList<>();

            // Initial statement
            statements.add("Initial balance: $" + balance);

            System.out.println("Welcome to the Bank Application");

            while (true) {

                System.out.println("n1. Check Balance");
                System.out.println("2. Check Statements");
                System.out.println("3. Deposit");
                System.out.println("4. Exit");

                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                // 1. Check Balance
                if (choice == 1) {

                    System.out.println("Your current balance is: $" + balance
                    );

                }

                // 2. Check Statements
                else if (choice == 2) {

                    System.out.println("--- Account Statements ---");

                    for (String statement : statements) {
                        System.out.println(statement);
                    }

                }

                // 3. Deposit
                else if (choice == 3) {

                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();

                    if (depositAmount > 0) {

                        balance = balance + depositAmount;

                        statements.add("Deposited: $" + depositAmount
                                        + " | New Balance: $" + balance
                        );

                        System.out.println("Deposit successful!");

                    } else {

                        System.out.println("Invalid amount. Deposit must be greater than 0."
                        );
                    }

                }

                // 4. Exit
                else if (choice == 4) {

                    System.out.println("Thank you for using our bank. Goodbye!"
                    );

                    break;
                }

                // Invalid choice
                else {

                    System.out.println(
                            "Invalid choice. Please enter a number between 1 and 4."
                    );
                }
            }

            sc.close();
        }
    }

