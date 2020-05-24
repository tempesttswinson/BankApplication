//keyword extends = inheritence
public class Savings extends Account {
    // List properties specific to savings account
    int safteyDepositBoxID, safeteyDepositKey;

    // constructor to initialize settings for savings properties
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
    }

    // List methods specific to savings account
    public void showInfo() {
        super.showInfo();
        System.out.println("Account Type: Savings");
    }
}