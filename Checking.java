//keyword extends = inheritence
public class Checking extends Account {

    // List properties specific to Checking account
    // debit card
    // pin
    // 2 is first digit in account

    // Constructor to initialize checking account properties
    public Checking(String name) {
        super(name);
        System.out.println("New Checking Account");
    }

    // List any methods specific to the Checking account
}