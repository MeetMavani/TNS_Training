import java.util.Scanner;

public class BankingSystemApp {
    public static void main(String[] args) {
        BankingServiceImpl bankingService = new BankingServiceImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Banking System");
            System.out.println("1. Add Customers");
            System.out.println("2. Add Accounts");
            System.out.println("3. Add Beneficiary");
            System.out.println("4. Add Transaction");
            System.out.println("5. Find Customer by Id");
            System.out.println("6. List all Accounts of specific Customer");
            System.out.println("7. List all transactions of specific Account");
            System.out.println("8. List all beneficiaries of specific customer");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Customer Details");
                    System.out.print("Customer Id: ");
                    int customerId = scanner.nextInt();
                    System.out.print("Name: ");
                    String name = scanner.next();
                    System.out.print("Address: ");
                    String address = scanner.next();
                    System.out.print("Contact: ");
                    String contact = scanner.next();
                    Customer customer = new Customer(customerId, name, address, contact);
                    bankingService.addCustomer(customer);
                    break;

                case 2:
                    System.out.println("Enter Account Details");
                    System.out.print("Account Id: ");
                    int accountId = scanner.nextInt();
                    System.out.print("Customer Id: ");
                    int custId = scanner.nextInt();
                    System.out.print("Account Type (Saving/Current): ");
                    String type = scanner.next();
                    System.out.print("Balance: ");
                    double balance = scanner.nextDouble();
                    Account account = new Account(accountId, custId, type, balance);
                    bankingService.addAccount(account);
                    break;

                case 3:
                    System.out.println("Enter Beneficiary Details");
                    System.out.print("Beneficiary Id: ");
                    int beneficiaryId = scanner.nextInt();
                    System.out.print("Customer Id: ");
                    int custBenefId = scanner.nextInt();
                    System.out.print("Beneficiary Name: ");
                    String benName = scanner.next();
                    System.out.print("Beneficiary Account No.: ");
                    String accountNumber = scanner.next();
                    System.out.print("Beneficiary Bank Details: ");
                    String bankDetails = scanner.next();
                    Beneficiary beneficiary = new Beneficiary(beneficiaryId, custBenefId, benName, accountNumber, bankDetails);
                    bankingService.addBeneficiary(beneficiary);
                    break;

                case 4:
                    System.out.println("Enter Transaction Details");
                    System.out.print("Transaction Id: ");
                    int transactionId = scanner.nextInt();
                    System.out.print("Account Id: ");
                    int accId = scanner.nextInt();
                    System.out.print("Type (Deposit/Withdrawal): ");
                    String transactionType = scanner.next();
                    System.out.print("Amount: ");
                    double amount = scanner.nextDouble();
                    Transaction transaction = new Transaction(transactionId, accId, transactionType, amount);
                    bankingService.addTransaction(transaction);
                    break;

                case 5:
                    System.out.print("Enter Customer ID to find: ");
                    int findCustId = scanner.nextInt();
                    System.out.println(bankingService.findCustomerById(findCustId));
                    break;

                case 6:
                    System.out.print("Enter Customer ID to list accounts: ");
                    int custListId = scanner.nextInt();
                    for (Account acc : bankingService.getAccountsByCustomerId(custListId)) {
                        System.out.println(acc);
                    }
                    break;

                case 7:
                    System.out.print("Enter Account ID to list transactions: ");
                    int accListId = scanner.nextInt();
                    for (Transaction txn : bankingService.getTransactionsByAccountId(accListId)) {
                        System.out.println(txn);
                    }
                    break;

                case 8:
                    System.out.print("Enter Customer ID to list beneficiaries: ");
                    int custBenListId = scanner.nextInt();
                    for (Beneficiary ben : bankingService.getBeneficiariesByCustomerId(custBenListId)) {
                        System.out.println(ben);
                    }
                    break;

                case 9:
                    System.out.println("Thank you for using the Banking System!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
