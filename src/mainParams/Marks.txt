package mainParams;

import java.util.ArrayList;

public class Marks {
	public static String[] marks = {"Unsatisfactory","Satisfactory","Good","Excellent"};
	public ArrayList<String> marksLevel;

Marks(){
	marksLevel = new ArrayList<>();
	for(String mark:marks) {
		marksLevel.add(mark);
	}
}
}

