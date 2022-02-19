package mainParams;

public class ControllerAndView {
public static void checkArgs(String[] args) {
	switch(args[0]) {
	case "MARKS":
		for(int i = 1; i < args.length; i++) {
			display(checkMarks(args[i]));
		}
		break;
	case "WEEK_DAYS":
		for(int i = 1; i < args.length; i++) {
			display(checkWeekDays(args[i]));
		}
		break;
	case "PLANETS":
		for(int i = 1; i < args.length; i++) {
			display(checkPlanets(args[i]));
		}
		break;
		default:
			display("Unknown type");
	}
}
public static void display(String result) {
	System.out.println(result);
}
static String checkMarks(String mark) {
	Marks m = new Marks();
	switch(mark) {
	case "0":
	case "1":
	case "2": return m.marksLevel.get(0);
	case "3": return m.marksLevel.get(1);
	case "4": return m.marksLevel.get(2);
	case "5": return m.marksLevel.get(3);
	default: return "Unknown mark";
	}
}
static String checkWeekDays(String day) {
	WeekDays wd = new WeekDays();
	switch(day) {
	case "1":
	case "2":
	case "3":
	case "4":
	case "5":
	case "6":
	case "7": return wd.week_days.get(Integer.parseInt(day)-1);
	default: return "Unknown day";
	}
}
static String checkPlanets(String planet) {
	Planets p = new Planets();
	switch(planet) {
	case "1":
	case "2":
	case "3":
	case "4":
	case "5":
	case "6":
	case "7":
	case "8": return p.solarPlanets.get(Integer.parseInt(planet)-1);
	default: return "Unknown planet";
	}
}
}
