//10.7
//commissioned emp extends Emp class

public class CommissionEmp extends Emp {
    private double grossSales;
    private double commissionRate;

    //constructor
    public CommissionEmp(String fName, String lName, String SSN, double grossSales, double commissionRate) {
        super(fName, lName, SSN);

        //validate the commission rate
        if ( commissionRate <= 0.0 || commissionRate >= 1.0 ) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        //validate the gross sales
        if(grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        } 
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    
    //set the gross sales amount
    public void setGrossSales(double grossSales){
        if (grossSales < 0.0) { 
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }
    //return gross sales amount
    public double getGrossSales() {
        return grossSales;
    }
//set the commission rate
    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
    }

}