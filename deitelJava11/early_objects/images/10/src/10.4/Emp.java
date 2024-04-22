// 10.4
// Emp

public abstract class Emp {
    private final String fName;
    private final String lName;
    private final String SSN; //should be ssn; leave it for now

    public Emp(String fName, String lName, String SSN) { //constrcutor
        this.fName = fName;
        this.lName = lName;
        this.SSN = SSN;
    }
// return fName or First Name
public String getFname() {
    return fName;
}
// return lName or Last Name
public String getLname() {
    return lName;
}
// return SSN
public String getSSN() {
    return SSN;
}

//return the string representation of the emp object
@Override
public String toString() {
    return String.format("%s %s%/nSSN is: %s", getFname(), getLname(), getSSN());
}

//abstract method must be ovreridden by the concrete subclass
public abstract double earnings();
}