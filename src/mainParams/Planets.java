package mainParams;

import java.util.ArrayList;

public class Planets {
	public static String[] planets = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};
	public ArrayList<String> solarPlanets;

Planets(){
	solarPlanets = new ArrayList<>();
	for(String planet:planets) {
		solarPlanets.add(planet);
	}
}
}

