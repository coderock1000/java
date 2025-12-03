import java.util.Scanner;

class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public double getBalance() {
        return balance;
    }

    public void updateBalance(double amount) {
        this.balance += amount;
    }
}

public class Bank_Account {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account[] accounts = new Account[10000];
        int totalAccounts = 0;
        boolean running = true;

        System.out.println("=======================================");
        System.out.println("      💰 Welcome to Codingal Bank 💰     ");
        System.out.println("=======================================\n");

        while (running) {

            System.out.println("\n🏦 Banking Menu:");
            System.out.println("1️⃣  Create Account");
            System.out.println("2️⃣  Change Account Holder Name");
            System.out.println("3️⃣  Check Account Balance");
            System.out.println("4️⃣  Update Account Balance");
            System.out.println("5️⃣  Sum of All Account Balances");
            System.out.println("6️⃣  Exit");
            System.out.print("\n👉 Choose Option (1-6): ");

            int option = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (option) {

                case 1:
                    System.out.print("\nEnter Account Holder Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Opening Balance: ");
                    double balance = sc.nextDouble();

                    accounts[totalAccounts] = new Account(name, balance);

                    System.out.println("\n🎉 Account Created Successfully!");
                    System.out.println("Your Account Number: " + totalAccounts);
                    System.out.println("Name: " + name);
                    System.out.println("Balance: ₹" + balance);
                    System.out.println("-----------------------------------");

                    totalAccounts++;
                    break;

                case 2:
                    System.out.print("\nEnter Account Number: ");
                    int accNo1 = sc.nextInt();
                    sc.nextLine();

                    if (accNo1 >= totalAccounts) {
                        System.out.println("❌ Invalid Account Number!");
                    } else {
                        System.out.print("Enter New Name: ");
                        String newName = sc.nextLine();
                        accounts[accNo1].setName(newName);
                        System.out.println("✅ Name Updated Successfully!");
                    }
                    break;

                case 3:
                    System.out.print("\nEnter Account Number: ");
                    int accNo2 = sc.nextInt();

                    if (accNo2 >= totalAccounts) {
                        System.out.println("❌ Invalid Account Number!");
                    } else {
                        System.out.println("\n💰 Account Balance: ₹" +
                                accounts[accNo2].getBalance());
                    }
                    break;

                case 4:
                    System.out.print("\nEnter Account Number: ");
                    int accNo3 = sc.nextInt();

                    if (accNo3 >= totalAccounts) {
                        System.out.println("❌ Invalid Account Number!");
                    } else {
                        System.out.print("Enter Amount to Add: ");
                        double amt = sc.nextDouble();
                        accounts[accNo3].updateBalance(amt);
                        System.out.println("✅ Balance Updated!");
                        System.out.println("New Balance: ₹" +
                                accounts[accNo3].getBalance());
                    }
                    break;

                case 5:
                    double sum = 0;
                    for (int i = 0; i < totalAccounts; i++) {
                        sum += accounts[i].getBalance();
                    }
                    System.out.println("\n📊 Total Money in Bank: ₹" + sum);
                    break;

                case 6:
                    System.out.println("\n👋 Exiting... Thank you for banking with us!");
                    running = false;
                    break;

                default:
                    System.out.println("⚠ Please choose a valid option (1-6)");
            }
        }

        sc.close();
    }
}
