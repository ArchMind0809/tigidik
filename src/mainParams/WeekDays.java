package mainParams;

import java.util.ArrayList;

public class WeekDays {
	public static String[] weekDays = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	public ArrayList<String> week_days;

WeekDays(){
	week_days = new ArrayList<>();
	for(String day:weekDays) {
		week_days.add(day);
	}
}
}
