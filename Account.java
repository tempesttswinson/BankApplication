//Do not want to create objects from this class there for we are makingit abstract. Can not create objects in an abstract class but you can create objects from classes that inheriet the abstract class
public abstract class Account implements IBaseRate {
    // List commone properties for Checking and Savings account
    String name;
    String sSN;
    double balance, rate;
    String accountNumber;
    static int index = 10000;

    // Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        // set account number
        index++;
        this.accountNumber = setAccountNumber();
    }

    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    // List common methods
    public void showInfo() {
        System.out.println("Name: " + name + "\nAccount Number: " + accountNumber + "\nBalance: " + balance);
    }

}