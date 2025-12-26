class PersonTwo {
    private String name;    //instance var
    private static int count;   //class var

PersonTwo(String aName){ //constructor
    name = aName;
    PersonTwo.count++;
} 
public String getName() { // instance method
    return name;
}
public void setName(String aName) {  // instance method
    name = aName;
}
public static int getCount() { //class method
    return PersonTwo.count;
}
}

public class PersonExampleTwo {
    public static void main(String[] args) {
        PersonTwo p1 = new PersonTwo("Bobo");
        PersonTwo p2 = new PersonTwo("Koko");
        System.out.println("Total people: " + PersonTwo.getCount()); // 2
    }
}

