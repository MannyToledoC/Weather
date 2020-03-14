package api_calls;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ApiCalling {
	private String APIKey = "31c61d21d28c0dd5f1bfdb4a80d4bfec";
	// String Location = "Miami, Florida";
	
	public String buildData(String location) throws IOException{
		//TODO: make sure location is a valid one.
		
		String data;
		String APIUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + location + "&appid=" + APIKey + "&units=metric";
		
		StringBuilder output = new StringBuilder();
		URL url = new URL(APIUrl);
		URLConnection connection = url.openConnection();
		BufferedReader read = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				
		while((data = read.readLine()) != null) {
			output.append(data);
		}
		// System.out.println(output.toString());
		return output.toString();
	}
}
