/*Name: James Moore
  Date: May 26th 2016
*/
package assignment6;
import java.util.*;  
public class MyDate {
	int day, month, year; 
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
		int lastTwoDigitsOfYear = this.getYear() % 100; 
		if(this.month == 1){monthName = "Jan"; }
		if(this.month == 2){monthName = "Feb"; }
		if(this.month == 3){monthName = "Mar"; }
		if(this.month == 4){monthName = "Apr"; }
		if(this.month == 5){monthName = "May"; }
		if(this.month == 6){monthName = "June";}
		if(this.month == 7){monthName = "July";}
		if(this.month == 8){monthName = "Aug"; }
		if(this.month == 9){monthName = "Sep"; }
		if(this.month == 10){monthName = "Oct";}
		if(this.month == 11){monthName = "Nov";}
		if(this.month == 12){monthName = "Dec";}
		
		if(lastTwoDigitsOfYear < 10)
        {
        return monthName + " " + this.getDay() + ", '0" + lastTwoDigitsOfYear;  
        }
        return monthName + " " + this.getDay() + ", '" + lastTwoDigitsOfYear;
	}
	// stupid method get fixed 
	
	//Less Than Method 
	public boolean lessThan(MyDate aDate)
	{
		boolean lessThan = false; 
		if(this.year < aDate.year)
		{
			lessThan = true; 
		}
		if(this.year == aDate.year)
		{
			if(this.month < aDate.month)
			{
				lessThan = true; 
			}
		}
		if(this.year == aDate.year)
		{
			if(this.month == aDate.month)
			{
				if(this.day < aDate.day)
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
		if(this.year == aDate.year)
		{
			if(this.month == aDate.month)
			{
				if(this.day == aDate.day)
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
