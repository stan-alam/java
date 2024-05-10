public abstract class Emp implements Payable {
    private final String fName;
    private final String lName;
    private final String SSN;

    public Emp(String fName, String lName, String SSN) {
        this.fName = fName;
        this.lName = lName;
        this.SSN = SSN;    
    }

    // return first name
    public String getFname() {
        return fName;
    }
    //return last name
    public String getLname() {
        return lName;
    }
    //return SSN
    public String getSSN() {
        return SSN;
    }

    @Override public String toString() { // you're returning the String format of the object
        return String.format("%s: %s %s \n%s: %s", "Employee", getFname(), getLname(), "Social Security Number", getSSN());

    }

    // Note: you don't have to implement getPaymentAmount() here because this is an abstract class
    // and we can't create an object of an abstract class
    public abstract double earnings(); // this method will be implemented in the subclasses, no implementation here

    public double getPaymentAmount() {
        return earnings; // this is the implementation of the getPaymentAmount() method
    }

}