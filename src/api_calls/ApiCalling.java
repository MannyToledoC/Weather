package api_calls;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ApiCalling {
	String APIKey = "";
	String Location = "Miami, FL";
	String APIUrl = "";
	
	public String buildData() throws IOException{
		String data = "";
			
		StringBuilder output = new StringBuilder();
		URL url = new URL(APIUrl);
		URLConnection connection = url.openConnection();
		BufferedReader read = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				
		while((data = read.readLine()) != null) {
			output.append(data);
		}
		return data;
	}
}
