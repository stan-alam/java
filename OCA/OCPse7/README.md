## Java OCA se7 II

## 1 **Java Class Design**             

- [X]  Use access modifiers: private, protected, and public

- [X] Override Methods

- [X] Overload constructors and Methods

- [ ] Use the -instanceof- operator and casting

- [ ] Use virtual method invocation

- [ ] Override the hashcode, equals, and toString methods from the Object class to
improve the functionality of your Class

- [ ] Use package and import statements

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%200.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%201.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%202.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%203.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%204.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%205.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%206.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%207.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%208A.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%208B.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%209.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2010.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2011.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2012A.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2012B.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2013.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2014.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2015.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2016.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2017.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2018.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2019.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2020.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2022A.png" width="80%" height="80%">
</a>

```java
//code stub 30-A
class Result {
    double calcAvg(int grade01, int grade02) {
        return(grade01 + grade02)/2;
    }
    double calcAvg(int grade01, int grade02, int grade03) {
    return (grade01 + grade02 + grade03)/3;
    }
}
```

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2022B.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2023A.png" width="80%" height="80%">
</a>

```java
//code stub 31-A
class Result {
    double calcAvg(int grade01, double grade02) {
        return(grade01 + grade02)/2;
    }
    double calcAvg(double grade01, double grade02) {
    return (grade01 + grade02)/2;
    }
}
```

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2023B.png" width="80%" height="80%">
</a>

```Java
//code 31B
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
```


```java
//code stub 31-C
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
```

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2024A.png" width="80%" height="80%">
</a>

```java
//code stub 32-A
class TravelAgent {
    public static void main(String[] args) {
        System.err.println(Travel.bookTicket ( new CEO ())); //prints business class
     }
}
```

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2024B.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2025.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2026A.png" width="80%" height="80%">
</a>

```java
// src/33B.java
double  calcAvg( double grade1, int grade2 )
{
  return (grade1 + grade2 ) / 2;
}
double calcAvg ( int grade1, double grade2 ) {
  return ( grade1 + grade2 ) / 2;
}
```
<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2027A.png" width="80%" height="80%">
</a>

```java
// src/GradeResultsAvg.java
class GradeResultsAvg {
  public double calcAvg(int grade1, int grade2) {  //access is public
    return (grade1 + grade2) / 2;
  }
  protected double calcAvg(int grade1, int grade2) { // access is protected
    return (grade1 + grade2) / 2;
  }
}
```

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2028A.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2028B.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2029Edit.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2030.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2032.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2033.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2034.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2035.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2036.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2037.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2038.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2039.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2040.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2041.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2042.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2043A.png" width="80%" height="80%">
</a>

```Java
//codeblock 38A
class Pencil {
    public Pencil() {
        System.err.println("Pencil:constructor");
    }
    public Pencil(String a) {
        System.err.println("Pencil:constructor2");
    }
    {
        System.err.println("Pencil:init1");
    }
    {
        System.err.println("Pencil:init2");
    }

    public static void main(String[] args) {
        new Pencil();
        new Pencil("a Value");
    }
}
```
<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2043B.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2044.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2045.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2046.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2047.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2048A.png" width="80%" height="80%">
</a>

```Java
//code-stub 41.A
class Tome {
    void issueTome(int days) {
        if (days > 0)
            System.out.println("Tome is is issued");
        else
            System.err.println("Cannot issue tome for zero or negative days.");
    }
}
```
<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2048B.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2049A.png" width="80%" height="80%">
</a>

```java
//code-block 42.A
class SpellBook extends Tome {
    boolean onlyForReference;
    SpellBook(boolean value) {
        onlyForReference = value;
    }
    @Override
    void issueTome(int days) {
    if (onlyForReference)
        System.out.println("Reference Tome");
    else
        if (days < 666)
            super.issueTome(days);
        else
            System.err.println("days => 666");
    }
}
```
<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2049B.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2050.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2051.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2052.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2053A.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2053B.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2054A.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2054B.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2055.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2056.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2057.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2058.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2059.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2060.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2061.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2062.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2063.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2064.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2065.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2066A.png" width="80%" height="80%">
</a>

<p align="center">
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/svg/49A.svg" width="90%" height="90%">
</p

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2066B.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2067.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2068.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2069.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2070.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2071.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2072.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2073.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2074A.png" width="80%" height="80%">
</a>

```Java
//codeblock 52.A - 53
```

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2074Bpng" width="80%" height="80%">
</a>

```java
//codeblock 53B    
```
<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2074Cpng" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2075Apng" width="80%" height="80%">
</a>

```Java
//codeblock 54A  
```

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2075Bpng" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2076.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2077.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2078.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2079.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2080.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2081.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2082.png" width="80%" height="80%">
</a>

<a>
  <img src="https://github.com/stan-alam/java/blob/develop/OCA/OCPse7/exam2/01/images/ocp-se7%20-%2083.png" width="80%" height="80%">
</a>

## 2 **Advanced Class Design**

- [ ] Identify when and how to apply abstract classes

- [ ] Construct abstract Java classes and subclasses

- [ ] Use the static and final keywords

- [ ] Create top-level and nested subclasses

- [ ] Use enumerated types

## 3 **Object-oriented  Design Principles**

- [ ] Write code that declares, implements, and/or extends interfaces

- [ ] Choose between interface inheritance and class inheritance

- [ ] Apply cohesion, low-coupling, IS-A, and HAS-A Principles

- [ ] Apply object composition Principles (including HAS-A relationships)

- [ ] Design a class using the **the Singleton design pattern**

- [ ] Design and create objects using the **Factory Pattern**

## 4 **Generics and Collections**

- [ ] Create Generic classes

- [ ] Use the diamond for type inference

- [ ] Analyze the interoperability of collections that use raw types and
generic types

- [ ] Use wrapper classes, auto-boxing, and unboxing

- [ ] Create and use **List**, **Set** and **Deque** implementations

- [ ] Create and use **Map** implementations

- [ ] Use **java.util.Comparator** and **java.lang.Comparable**

- [ ] Sort and search arrays and lists

## 5 **String processing**

- [ ] Search, parse and build strings (including **Scanner, String-Tokenizer, StringBuilder,
  String**, and **String Formatter**)

- [ ] Search, parse, and replace strings by using regular expressions, using expression patterns for
matching limited to:. .(dot), *(star),* + (plus), ?, \d, \D, \s, \S, \w, \W, \b, \B, [], ()

- [ ] Format strings using the formatting parameters: %b, %c, %d, %f, and %s in format strings

## 6 **Exceptions and Assertions**

- [ ] Use **throw** and **throws** statements

- [ ]  
