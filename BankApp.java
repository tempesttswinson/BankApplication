import java.util.List;

public class BankApp {

    public static void main(String[] args) {

        String file = "C:\\Users\\user\\WIN\\Notes\\Java\\BankApplication\\utilties\\NewBankAccounts.csv";
        // Checking chkacc1 = new Checking("Tom Wilson", "123456789", 1500);

        // Savings savacct1 = new Savings("Rich Love", "234567891", 2500);

        // chkacc1.showInfo();
        // System.out.println("************************************");
        // savacct1.compound();
        // savacct1.showInfo();

        // savacct1.deposit(5000);
        // savacct1.withdraw(200);
        // savacct1.transfer("Brokerage", 3000);

        // Read CSV File then create new accounts based on that data
        List<String[]> newAccountHolders = utilties.CSV.read(file);

        for (String[] accountHolder : newAccountHolders) {
            System.out.println("New Account");
            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);

        }
    }
}