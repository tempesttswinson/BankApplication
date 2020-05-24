//keyword extends = inheritence
public class Savings extends Account {
    // List properties specific to savings account
    int safteyDepositBoxID, safeteyDepositBoxKey;

    // constructor to initialize settings for savings properties
    public Savings(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    // List methods specific to savings account
    public void showInfo() {
        super.showInfo();
        System.out.println("Your Savings Account Features" + "\nSafety Deposit Box ID: " + safteyDepositBoxID
                + "\nSafety Deposit BOx Key: " + safeteyDepositBoxKey);
    }

    private void setSafetyDepositBox() {
        safteyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safeteyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

}