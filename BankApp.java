import java.util.LinkedList;
import java.util.List;

public class BankApp {

    public static void main(String[] args) {

        // creates a linked list of objects using the Account class
        List<Account> accounts = new LinkedList<Account>();

        // Read CSV File then create new accounts based on that data
        String file = "C:\\Users\\user\\WIN\\Notes\\Java\\BankApplication\\utilties\\NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilties.CSV.read(file);

        for (String[] accountHolder : newAccountHolders) {
            System.out.println("New Account");
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            System.out.println(name + " " + sSN + " " + accountType + "$" + initDeposit);
            if (accountType.equals("Savings")) {
                accounts.add(new Savings(name, sSN, initDeposit));
            } else if (accountType.equals("Checking")) {
                accounts.add(new Checking(name, sSN, initDeposit));
            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }

        // iterates through the account list and displays each new account to the
        // screen`
        for (Account acc : accounts) {
            System.out.println("\n***************************");
            acc.showInfo();
        }
    }
}