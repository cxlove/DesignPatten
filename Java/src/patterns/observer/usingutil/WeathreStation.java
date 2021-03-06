package patterns.observer.usingutil;

public class WeathreStation {
	public static void main(String argv[]) {
		WeatherData weather = new WeatherData();
		CurrentConditionDisplay curcondition = new CurrentConditionDisplay(weather);
		HeatIndexDisplay heatindex = new HeatIndexDisplay(weather);
		CurrentConditionDisplay curcondition2 = new CurrentConditionDisplay(weather);
		HeatIndexDisplay heatindex2 = new HeatIndexDisplay(weather);
		weather.setChange(0, 0, 0);
		weather.deleteObserver(curcondition2);
		weather.setChange(3, 2, 1);
		weather.deleteObserver(heatindex2);
		weather.setChange(1, 2, 3);	
	}
}
