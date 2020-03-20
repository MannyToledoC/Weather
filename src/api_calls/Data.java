package api_calls;

import java.util.Map;

import api_calls.JsonToMap;
import api_calls.ApiCalling;

public class Data{
	
	private static String location = "Miami, Florida"; // TODO: get input from computer

	private static Map<String, Object> dataMap 		= JsonToMap.toMap(ApiCalling.buildData(location));
	private static Map<String, Object> mainMap 		= JsonToMap.toMap(dataMap.get("main").toString());

	

	
	public static String getTemp() {
		return mainMap.get("temp").toString();
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
	
	
	// TODO: find a way to get weather input
	// can't right now because of the brackets [] in weather: [{}]
	
	public static String getWeather() {
		return dataMap.get("weather").toString();
	}
}
