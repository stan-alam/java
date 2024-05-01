//10.6
//ContractEmp extends class emp

public class ContractEmp extends Emp{
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
    }
        this.wage = wage;
        this.hours = hours;
}