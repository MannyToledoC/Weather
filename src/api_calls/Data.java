package api_calls;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Map;

import api_calls.JsonToMap;
import api_calls.ApiCalling;

public class Data{
	
	private static String location = LocationCalls.getApiJson();

	private static Map<String, Object> dataMap 		= JsonToMap.toMap(ApiCalling.buildData(location));
	private static Map<String, Object> mainMap 		= JsonToMap.toMap(dataMap.get("main").toString());

	
	public static String getTemp() {
		String temp = mainMap.get("temp").toString();
		double t = Double.parseDouble(temp);
		String truncated = String.valueOf((int) t);
		return truncated;
	}
	
	public static String getHumidity() {
		return mainMap.get("humidity").toString();
	}
	
	public static String getTempMin() {
		return mainMap.get("temp_min").toString();
	}
	
	public static String getTempMax() {
		return mainMap.get("temp_max").toString();
	}
	
	public static String getLocation() {
		return location;
	}
	
	public static String getTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now);
	}

	public static int getHour() {
		LocalDateTime now = LocalDateTime.now();
		return now.getHour();
	}
	
	
	// TODO: find a way to get weather input
	// can't right now because of the brackets [] in weather: [{}]
	
	public static String getWeather() {
		return dataMap.get("weather").toString();
	}
}
