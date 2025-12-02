import java.util.Scanner;

public class Bank_Manager {
    public static void main(String[] args) {
        boolean infiniteLoop = true;
        double[] accountBalance = new double[10000];
        String[] accountHolderName = new String[10000];
        int option, size = 100;
        while (infiniteLoop) {
            System.out.println("Welcome to codingal banking services");
            System.out.println("Banking Menu Options:");
            System.out.println("1. Create Account");
            System.out.println("2. Change Account Holder Name");
            System.out.println("3. Check Account Balance");
            System.out.println("4. Update Account Balance");
            System.out.println("5. Sum of All Account Balances");
            System.out.println("6. Exit");

            Scanner sc = new Scanner(System.in);
            System.out.print("Please select an option (1-6): ");
            option = sc.nextInt();

            if (option==1){
                System.out.println("\n Enter Account Holder Name: ");
                String name = sc.nextLine();
                accountHolderName[size] = name;
                System.out.println("Enter opening balance amount: ");
                double amt = sc.nextDouble();
                accountBalance[size] = amt;

                System.out.println("Account created successfully. Your account number is: " + size);
                System.out.println("Account Holder Name: " + accountHolderName[size]);
                System.out.println("Account Balance: " + accountBalance[size] + "Rs \n");
                System.out.println("----------------------------------------");

                size = size + 1;

            }
            else if (option==2){
                System.out.println("\n Change Account Holder Name");
                System.out.print("Enter your account number: ");
                int accNo;
                String temp;
                accNo = sc.nextInt();
                sc.nextLine();

                if (accNo > size) {
                    System.out.println("Invalid account number.");
                }
                else{
                    temp = accountHolderName[accNo];
                    System.out.println("Enter the new account holder name: ");
                    String newName = sc.nextLine();
                    accountHolderName[accNo] = newName;
                    System.out.println("Account holder name updated successfully.");
                    System.out.println("--------------------------------");
                }


            }
            else if (option==3){
                System.out.println("\n Check Account Balance");
                System.out.print("Enter your account number: ");
                int accNo;
                accNo = sc.nextInt();
                if (accNo > size) {
                    System.out.println("Invalid account number.");
                }
                else{
                    System.out.println("Account Balance: " + accountBalance[accNo] + " Rs");
                    System.out.println("--------------------------------");
                }
        }
            else if (option==4){
                System.out.println("\n Update Account Balance");
                System.out.print("Enter your account number: ");
                int accNo;
                accNo = sc.nextInt();
                if (accNo > size) {
                    System.out.println("Invalid account number.");
                }
                else{
                    System.out.println("Enter the amount to update: ");
                    double updateAmt = sc.nextDouble();
                    accountBalance[accNo] = accountBalance[accNo] + updateAmt;
                    System.out.println("Account balance updated successfully.");
                    System.out.println("New Account Balance: " + accountBalance[accNo] + " Rs");
                    System.out.println("--------------------------------");
                }

            }
            else if (option==5){
                System.out.println("\n Sum of All Account Balances");
                double sum = 0;
                for (int i = 100; i < size; i++) {
                    sum += accountBalance[i];
                }
                System.out.println("Total Sum of All Account Balances: " + sum + " Rs");
                System.out.println("--------------------------------");

            }
            else if (option==6){
                System.out.println("Exiting the banking services. Thank you!");
                infiniteLoop = false;
            }
            else{
                System.out.println("Invalid option. Please select a valid option (1-6).");
                System.exit(0);
            }

    }
}
}