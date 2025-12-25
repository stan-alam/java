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