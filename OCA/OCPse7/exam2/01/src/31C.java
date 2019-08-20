class Employee {}
class CEO extends Employee {}
class Travel {
    static String bookTicket(Employee val) {
        return "coach";
    }
    static String bookTicket(CEO val) {
        return "business class";
    }
}
