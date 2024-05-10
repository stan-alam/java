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

}