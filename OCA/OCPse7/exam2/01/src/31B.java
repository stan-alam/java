class Employee{}
class SoftwareEngineerInTest extends Employee {}
class CEO extends Employee {}
class Travel {
    static String bookTicket(SoftwarEngineerInTest val) {
        return "coach";
  }
    static String bookTicket(CEO val) {
        return "business class";
  }
}
  
