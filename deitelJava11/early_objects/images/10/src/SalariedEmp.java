//Salaried Emp concrete class extends Emp abstract class

public class SalariedEmp extends Emp {
    private double weeklySal;

    public SalariedEmp(String fName, String lName, String SSN, double weeklySal) { //constructor, remember you can have multiple constructors with different parameters
        super(fName, lName, SSN);

        if (weeklySal < 0.0)
            throw new IllegalArgumentException("Weekly salary must be greater equal to 0.0");

        this.weeklySal = weeklySal;
    }

    //lets set the salary
    public void setWeeklySal(double weeklySal){
        if (weeklySal < 0.0)
            throw new IllegalArgumentException("Weekly salary must be greater equal to 0.0");

        this.weeklySal = weeklySal;
    }
    //return sal
    public double getWeeklySal(){
        return weeklySal;
    }

    //calculate the earnings; override the abstract method earnings in Emp
    @Override
    public String toString() {
        return String.format("Salaried Employee: %s\n%s: $%,.2f", super.toString(), "Weekly Salary", getWeeklySal());
    }
}