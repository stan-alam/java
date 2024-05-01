//10.6
//ContractEmp extends class emp

public class ContractEmp extends Emp {
    private double wage;
    private double hours;

    //constructor
    public ContractEmp(String fName, String lName, String SSN, double wage, double hours){
        super(fName, lName, SSN);

        if (wage < 0.0){ //if wage is invalid
            throw new IllegalArgumentException("Wage must be >= 0.0");
        }

        if ((hours < 0.0) || (hours > 168.0)){ //if hours is invalid
            throw new IllegalArgumentException("Hours must be >= 0.0 and <= 168.0");
        }
    
        this.wage = wage;
        this.hours = hours;
    }

    //set wage
    public void setWage(double wage) {
        if (wage < 0.0 ) { //if wage is invalid
            throw new IllegalArgumentException("Wage must be >= 0.0");
        }
        this.wage = wage;
    }
    //return wage
    public double getWage() {
        return wage;
    }

    //set hours worked
    public void setHours(double hours) {
        if ((hours < 0.0) || (hours > 168.0)) { //if hours is invalid
            throw new IllegalArgumentException("Hours must be >= 0.0 and <= 168.0");
        }
        this.hours = hours;
    }

    //return hours worked
    public double getHours() {
        return hours;
    }

    //calculate earnings; meaning -> override abstract method earnings in Emp
    @Override //indicates that this method overrides a superclass method
    public double earnings(){
        if (getHours() <= 40) { 
            return getWage() * getHours();
        } else {
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
    }
    //return String representation of ContractEmp object
    @Override
    public String toString() {
        return String.format("contract emp: %s%n%s: $%,.2f; %s: %,.2f",
        super.toString(), "wage", getWage(), "hours", getHours());
    }
}