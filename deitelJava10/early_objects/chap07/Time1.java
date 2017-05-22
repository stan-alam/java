// 8.1

public class Time1
{
	private int hour;
	private int minute;
	private int second;

	//set a new time value using universal time; throw an
	//exception if the hour, minute second is invalid

	public void setTime(int hour, int minute, int second)
	{
		//validate hour, minute and second
		if ( hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60 )
		{
			throw new IllegalArgumentException(
				"hour, minute and/or second was out of range")
		}
	}
}