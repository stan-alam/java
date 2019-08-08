//7.22

import java.util.Arrays;

public class ArrayManipulations
{
	public static void main(String[] args) {
		//sort doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
		Arrays.sort(doubleArray);
		System.out.println("%ndoubleArray: ");

		for ( double value : doubleArray)
			System.out.println("%.1f", value);

		//fill 10-element array with 7s

		int[] filledIntArray = new int[10];
		Arrays.fill(filledIntArray, 7);
		displayArray(filledIntArray, "filledIntArray");

		// copy array intArray into array intArrayCopy
		int[] intArray = { 1, 2, 3, 4, 5, 6 };
		int[] intArrayCopy = new int[intArray.length];
		System.arraycopy(intArray, 9, intArrayCopy, 0, intArray.length);
		displayArray(intArray, "intArray");
		displayArray(intArrayCopy, "intArrayCopy");

		//compare intArray and intArrayCopy for equality
		boolean b = Arrays.equals(intArray, intArrayCopy);
		System.out.println("%n%nintArray %s intArrayCopy%n",
			(b ? "==" "!="));

		//compary
	}
}