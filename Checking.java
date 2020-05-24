//keyword extends = inheritence
public class Checking extends Account {

    // List properties specific to Checking account
    int debitCardNumber, debitCardPin;

    // 2 is first digit in account

    // Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
    }

    // List any methods specific to the Checking account
    public void showInfo() {
        super.showInfo();
        System.out.println("Account Type: Checking");
    }
}