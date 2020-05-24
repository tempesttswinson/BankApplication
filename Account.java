//Do not want to create objects from this class there for we are makingit abstract. Can not create objects in an abstract class but you can create objects from classes that inheriet the abstract class
public abstract class Account implements IBaseRate {
    // List commone properties for Checking and Savings account

    // Constructor to set base properties and initialize the account
    public Account(String name) {
        System.out.println("Name is " + name);
        System.out.print("New Account ");
    }

    // List common methods

}