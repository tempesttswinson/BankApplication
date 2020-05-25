public class BankApp {

    public static void main(String[] args) {
        Checking chkacc1 = new Checking("Tom Wilson", "123456789", 1500);

        Savings savacct1 = new Savings("Rich Love", "234567891", 2500);

        chkacc1.showInfo();
        System.out.println("************************************");
        savacct1.showInfo();

        savacct1.deposit(5000);
        savacct1.withdraw(200);
        savacct1.transfer("Brokerage", 3000);
        // Read CSV File then create new accounts based on that data
    }
}