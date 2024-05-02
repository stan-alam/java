//10.9

public class PayRollSysTest {
    public static void main(String[] args){
        //create subclass objs 
        SalariedEmp salariedEmp = new SalariedEmp("Darth", "Vader", "123-45-6789", 500.00);
        
        ContractEmp contractEmp = new ContractEmp("Luke", "Skywalker", "987-65-4321", 10.00, 20);

        CommissionEmp commissionEmp = new CommissionEmp("Obi-Wan", "Kenobi", "135-79-2468", 1000.00, 0.06);

        BasePlusCommissionEmp basePlusCommissionEmp = new BasePlusCommissionEmp("Han", "Solo", "246-80-1357", 500.00, 0.04, 300.00);
        
    }
}