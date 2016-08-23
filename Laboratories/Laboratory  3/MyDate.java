/*Name: James Moore
  Date: May 26th 2016
*/
package lab3;
import java.util.*;  
public class MyDate {
	private int day, month, year; 
	StringTokenizer myTokens;
	
	// Constructor 
	public MyDate(String Date)
	{
		myTokens = new StringTokenizer(Date,"/");
		day = Integer.parseInt(myTokens.nextToken());
		month = Integer.parseInt(myTokens.nextToken()); 
		year = Integer.parseInt(myTokens.nextToken());
	}
	
	// Copy constructor 
	public MyDate(MyDate aDate)
	{
		day = aDate.day; 
		month = aDate.month; 
		year = aDate.year; 
	}
	
	// needs the month specifier to be fixed ! !! ! ! 
	public String toString()
	{
		String monthName = ""; 
		int lastTwoDigitsOfYear = year % 100; 
		if(month == 1){monthName = "Jan"; }
		if(month == 2){monthName = "Feb"; }
		if(month == 3){monthName = "Mar"; }
		if(month == 4){monthName = "Apr"; }
		if(month == 5){monthName = "May"; }
		if(month == 6){monthName = "June";}
		if(month == 7){monthName = "July";}
		if(month == 8){monthName = "Aug"; }
		if(month == 9){monthName = "Sep"; }
		if(month == 10){monthName = "Oct";}
		if(month == 11){monthName = "Nov";}
		if(month == 12){monthName = "Dec";}
		
		if(lastTwoDigitsOfYear < 10)
        {
        return monthName + " " + day + ", '0" + lastTwoDigitsOfYear;  
        }
        return monthName + " " + day + ", '" + lastTwoDigitsOfYear;
	}
	// stupid method get fixed 
	
	//Less Than Method 
	public boolean lessThan(MyDate aDate)
	{
		boolean lessThan = false; 
		if(year < aDate.year)
		{
			lessThan = true; 
		}
		if(year == aDate.year)
		{
			if(month < aDate.month)
			{
				lessThan = true; 
			}
		}
		if(year == aDate.year)
		{
			if(month == aDate.month)
			{
				if(day < aDate.day)
				{
					lessThan = true; 
				}
			}
		}
		return lessThan; 
	} // end of method lessThan 
	
	// Equals Method 
	public boolean equals(MyDate aDate)
	{
		boolean answer = false; 
		if(year == aDate.year)
		{
			if(month == aDate.month)
			{
				if(day == aDate.day)
				{
					answer = true; 
				}
			}
		}
		return answer; 
	}// end of method equals 
	
	// getters 
	public int getDay()
	{
		return day; 
	}
	
	public int getMonth()
	{
		return month; 
	}
	
	public int getYear()
	{
		return year; 
	}
	
}
