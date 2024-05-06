//10.8

public class BasePlusCommissionEmp extends CommissionEmp {
    private double baseSalary;

    //constructor
    public BasePlusCommissionEmp(String  fName, String lName, String SSN, double grossSales, double commissionRate, double baseSalary) { //looks like code smell here
         super(fName, lName, SSN, grossSales, commissionRate);
       if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }
    //set base salary
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }
    //return base salary
    public double getBaseSalary() {
        return baseSalary;
    }
    //calculate earnings override method earnings in CommissionEmp
    @Override 
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }
    //return String representation of BasePlusCommissionEmp object
    @Override
    public String toString() {
        return String.format("%s %s; %s: $%,.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
    }
}