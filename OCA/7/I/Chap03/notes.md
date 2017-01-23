##Methods and encapsulation

  * Defining the scope of variables
  * Explaining an object's life cycle
  * Creating methods with primitive and object arguments and return values
  * Reading and writing to object fields
  * Calling methods on objects
  * Applying encapsulation principles to a class


##3.1 Scope of Variables

  The scope of a variable specifies its lifespan.

   * local variables aka method-local variables
   * Method parameters aka method arguments
   * Instance variables aka attributes, fields, **nonstatic variables**
   * Class variables aka **static variables**


**3.1 Local Variables**

*Local Variables* are defined **within the Method**. They may be or may not be defined within code constructs such *if-else*
constructs, looping constructs, or switch statements. They are typically used to **store the intermediate results of a calculation**

            Local variables have the shortest life span or scope.





 ```java

public class Student {

	private double marks1, marks2, marks3;  // instance variables
	private double maxMarks = 100; //instance variables

	public double getAverage() {
	  double avg = 0; // <--- local variable
	  avg = ((marks1 + marks2 + marks3 ) /( maxMarks * 3 )) * 100;
	  return avg;
}
public void setAverage(double val) {
	avg = val // <------code will not compile because avg is not accessible from getAverage method
	}
} //end class Student

```

In this case the *variable* **avg** can not be accessed outside the **getAverage** method because it is defined locally in the **getAverage** method