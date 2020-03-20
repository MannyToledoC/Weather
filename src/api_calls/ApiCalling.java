package api_calls;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ApiCalling {
	private static String APIKey = "31c61d21d28c0dd5f1bfdb4a80d4bfec";
	// String Location = "Miami, Florida";
	
	public static String buildData(String location) {
		//TODO: make sure location is a valid one.
		
		String data;
		String finalData = "error";
		String APIUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + location + "&appid=" + APIKey + "&units=imperial";
		try {
			StringBuilder output = new StringBuilder();
			URL url = new URL(APIUrl);
			URLConnection connection = url.openConnection();
			BufferedReader read = new BufferedReader(new InputStreamReader(connection.getInputStream()));
					
			while((data = read.readLine()) != null) {
				output.append(data);
			}
			finalData = output.toString();
		}catch (IOException e){
			System.out.println(e.getMessage());
		}
		// System.out.println(output.toString());
		//return output.toString();
		return finalData;
	}
}
