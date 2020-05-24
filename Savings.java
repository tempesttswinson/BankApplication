//keyword extends = inheritence
public class Savings extends Account {
    // List properties specific to savings account
    int safteyDepositBoxID, safeteyDepositKey;

    // constructor to initialize settings for savings properties
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        System.out.println("NEW SAVINGS ACCOUNT");
    }

    // List methods specific to savings account
}