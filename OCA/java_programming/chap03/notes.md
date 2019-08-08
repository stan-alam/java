```java

class Point {

	private int x;
	private int y;

	public Point() {
		x = 10;
		y = 10;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}

class CustomConstructorApp {

	public static void main(String[] args) {
		System.out.println("Create a Point Object ... ");

		Point p = new Point();

		System.out.println("\nPrinting Point Object");

		System.out.println("Point p (" + p.getX() + "," + p.getY() + ")");

	}
}

```

## Rules for Defining a Constructor

* A constructor must have the same name as the class name

* A constructor does not return anything, not even a **void** type

* A constructor may take zero or more arguments

* By default, the compiler provides a no-argument constructor

* If you provide any constructor -- either a no-argument constructor or a constructor with arguments --the compiler does not provide a default constructor

