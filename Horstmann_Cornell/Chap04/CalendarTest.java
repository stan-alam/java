import java.util.*; // for Java 8
// 4.1
public class CalendarTest {

	public static void main(String[] args)
	{
		LocalDate date = LocalDate.now();
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();

		date = date.minusDays( today - 1 ); // this will set the start of month
		DayofWeek weekday = date.getDayOfWeek();
		int value = weekday.getValue(); // 1 = Monday, ... 7 = Sunday

		System.out.println("Monday Tuesday Wednesday Thursday Friday Saturday Sunday");
		for (int i = 1; i < value; i++)
			System.out.print("   ");
		while (date.getMonthValue() == month)
		{
			System.out.printf("%3d", date.getDayOfMonth());
			if ( date.getDayOfMonth() == today )
				System.out.print("*");
			else
				System.out.print(" ");
			date = date.plusDays(1);
			if (date.getDayOfWeek().getValue() == 1 )
				System.out.println();
		}
		if (date.getDayOfWeek().getValue() != 1)
			System.out.println();
	}
}