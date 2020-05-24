//Do not want to create objects from this class there for we are makingit abstract. Can not create objects in an abstract class but you can create objects from classes that inheriet the abstract class
public abstract class Account implements IBaseRate {
    // List commone properties for Checking and Savings account
    String name;
    String sSN;
    double balance, rate;
    String accountNumber;

    // Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        System.out.println("Name: " + name + " SSN: " + sSN + " Balance: $" + balance);
    }

    // List common methods

}