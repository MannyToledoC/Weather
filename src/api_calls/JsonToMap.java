package api_calls;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.Map;


public class JsonToMap {
	
	public static Map<String, Object> toMap(String s) {
		Map<String, Object> son = new Gson().fromJson(s,  new TypeToken<HashMap<String, Object>>() {}.getType());
		printMap(son);
		return son;
	}
	
	public static void printMap(Map<String, Object> s) {
		s.forEach((key, value) -> System.out.println(key + ":" + value));
		System.out.println("\n");
		
	

	}
	
}
