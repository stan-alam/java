//10.7
//commissioned emp extends Emp class

public class CommissionEmp extends Emp {
    private double grossSales;
    private double commissionRate;

    //constructor
    public CommissionEmp(String fName, String lName, String SSN, double grossSales, double commissionRate){
        super(fName, lName, SSN);

        //validate the commission rate
        if ( commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

    }
}