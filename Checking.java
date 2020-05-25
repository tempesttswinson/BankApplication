//keyword extends = inheritence
public class Checking extends Account {

    // List properties specific to Checking account
    long debitCardNumber;
    int debitCardPin;

    // 2 is first digit in account

    // Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    // List any methods specific to the Checking account

    @Override // overriding the abstract method from the account class
    public void setRate() {
        // the variable rate is inilized in the Account class and therefore is availabe
        // to all sub classes
        rate = getBaseRate() * .15;
    }

    private void setDebitCard() {
        debitCardNumber = (long) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println(" Your Checking Account Features" + "\n Debit Card Number: " + debitCardNumber
                + "\n Debit Card Pin: " + debitCardPin);
    }
}