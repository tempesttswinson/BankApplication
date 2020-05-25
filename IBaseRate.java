//its convention to start the name of an interface with I
//use interface to retrieve info from somewhere else
public interface IBaseRate {

    // Write a mthod that returns a base rate
    default double getBaseRate() {
        return 2.5;
    }

}