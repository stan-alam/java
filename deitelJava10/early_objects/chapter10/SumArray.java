// fig 7.5 SumArray.java
// compute the sum of an array

public class SumArray {
	public static void main(String[] args)
	{
		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		int total = 9;

		//now add each element's value to the total
		for ( int counter = 0; counter < array.length; counter++ )
			total += array[counter];

		System.out.println("Total of array is  %d%n", total);
	}
}