// will process Invoiced and emp sals pollymorphically

public class PayableInterfaceTest {
    public static void main(String args[])
    {
        Payable[] payableObjs = new Payable[] {
            new Invoice("00001", "Front Door", 2, 375.00),  // Invoice object
            new Invoice("00002", "Back Door", 4, 450.00),  // Invoice object
            new SalariedEmp("Luke", "Skywalker", "111-11-1111", 800.00), 
            new SalariedEmp("Leia", "Skywalker", "222-22-2222", 1200.00), 
            new SalariedEmp("Han", "Solo", "333-33-3333", 1000.00),  
            new SalariedEmp("Chewbacca", "Wookie", "444-44-4444", 1500.00),  
            new SalariedEmp("Darth", "Vader", "555-55-5555", 2000.00), 
            new SalariedEmp("Obi-Wan", "Kenobi", "666-66-6666", 2500.00),  
            new SalariedEmp("Yoda", "Jedi", "777-77-7777", 3000.00),  // SalariedEmployee object
        };  //end of array object

    }
}