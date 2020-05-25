//Do not want to create objects from this class therefore we are making it abstract. Can not create objects in an abstract class but you can create objects from classes that inheriet the abstract class
public abstract class Account implements IBaseRate {
    // List common properties for Checking and Savings account

    private String name;
    private String sSN;
    private double balance;
    private static int index = 10000;

    // use the access modifier of proctected if you want your subclasses to have
    // access but still want to keep hidden from other classes
    protected double rate;
    protected String accountNumber;

    // Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        // set account number
        index++;
        this.accountNumber = setAccountNumber();

        setRate();// setRate() method is called in the parent class because all subclass have the
                  // same name for the method
    }

    // Abstract methods are methods that are not defined in the class that they are
    // created. but all of the subclasses must implement and define the abstrast
    // method
    public abstract void setRate();

    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    public void compound() {
        double accruedInterest = balance * (rate / 100); // rate will be recieved from the respective object because
        // thats where it is defined
        balance += accruedInterest;
        System.out.println("Accured Interest: " + accruedInterest);
        printBalance();
    }

    // List common methods -transactions
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawing $" + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount) {
        balance -= amount;
        System.out.println("Transferring $" + amount + " to " + toWhere);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your balance is now: $" + balance);
    }

    public void showInfo() {
        System.out.println("Name: " + name + "\nAccount Number: " + accountNumber + "\nBalance: " + balance + "\nRate: "
                + rate + "%");
    }

}