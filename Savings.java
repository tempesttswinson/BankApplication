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
    @Override
    public void setRate() {
        // the variable rate is inilized in the Account class and therefore is availabe
        // to all sub classes
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox() {
        safteyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safeteyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println(" Your Savings Account Features" + "\n Safety Deposit Box ID: " + safteyDepositBoxID
                + "\n Safety Deposit BOx Key: " + safeteyDepositBoxKey);
    }

}