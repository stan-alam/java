//164

class Person {
    private String name; //instance var
    private int count;   // instace var

    Person(String aName) { //lets call this a constructor
        name = aName;
        count++;
    }
    public String getName() {  //instance method
        return name;
    }
    public void setName(String aName) { //instance method }
        name = aName;
    }
    public int getCount() { //instance method
        return count;
    }
}

public class PersonExample{
    public static void main(String args[]) {
        Person p1 = new Person("Skywalker");
        Person p2 = new Person("Han Solo");
        Person p3 = new Person("Leia Organa");
        System.out.println("Let's get the name for p1: " + p1.getName());
        System.out.println("Let's get the name for p2: " + p2.getName());
        System.out.println("Let's get the name for p3: " + p3.getName());
        p1.setName("Anakin Skywalker");
        p2.setName("Vader");
       System.out.println("Let's get the name for p1 after the setName: " + p1.getName());}
}