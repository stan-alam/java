//10.9

public class PayRollSysTest {
    public static void main(String[] args){
        //create subclass objs 
        SalariedEmp salariedEmp = new SalariedEmp("Darth", "Vader", "123-45-6789", 500.00);
        
        ContractEmp contractEmp = new ContractEmp("Luke", "Skywalker", "987-65-4321", 10.00, 20);

        CommissionEmp commissionEmp = new CommissionEmp("Obi-Wan", "Kenobi", "135-79-2468", 1000.00, 0.06);

        BasePlusCommissionEmp basePlusCommissionEmp = new BasePlusCommissionEmp("Han", "Solo", "246-80-1357", 500.00, 0.04, 300.00);
       
        System.out.println("Emplyees processed individually:\n");

        System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmp, "earned", salariedEmp.earnings());

        //System.out.println("Salaried Employee:\n" + salariedEmp + "\nearned: $" + salariedEmp.earnings() + "\n");

        System.out.printf("%s%n%s: $%,.2f%n%n", contractEmp, "earned", contractEmp.earnings());

        System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmp, "earned", commissionEmp.earnings());

        //creating an array of Employees
        Emp[] employees = new Emp[4];
        employees[0] = salariedEmp;
        employees[1] = contractEmp;
        employees[2] = commissionEmp;
        employees[3] = basePlusCommissionEmp;

        System.out.println("Employees processed polymorphically:%n%n");

        for(Emp currentEmployee : employees){
            System.out.println(currentEmployee);
            if (currentEmployee instanceof BasePlusCommissionEmp){
                BasePlusCommissionEmp employee = (BasePlusCommissionEmp) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
            }

            System.out.printf("earned $%, .2f%n%n", currentEmployee.earnings());

        }
        for (int j = 0; j < employees.length; j++){
            System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
        }
    }
}