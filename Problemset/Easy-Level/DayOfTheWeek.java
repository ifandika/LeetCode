import java.util.*;

To solve this problem, we can use the algorithm known as Zeller`s congruence. This algorithm allows us to calculate the day of the week for any given date. Here's how it works:

If the month is January or February, we add 12 to the month and subtract 1 from the year.

We calculate the year, century, and decade using the formulas:
year_of_century = year % 100
century = year // 100
decade = month.

We calculate the weekday using the formula:
weekday = (day + (13 * (decade + 1) // 5) + year_of_century + (year_of_century // 4) + (century // 4) - (2 * century)) % 7

We use the following table to convert the weekday number to the corresponding day of the week:
0 -> "Sunday"
1 -> "Monday"
2 -> "Tuesday"
3 -> "Wednesday"
4 -> "Thursday"
5 -> "Friday"
6 -> "Saturday"

public class DayOfTheWeek {
	public String solution(int day, int month, int year) {
		String format = String.format("%d-%d-%d", year, month, day);
		Date date = new SimpleDateFormat("yyyy-M-d").parse(format);
		String day = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(data);
		return day;
	}
}