package api_calls;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class LocationCalls {
	
	public static String getApiJson() {
		String location = "error";
		try {
			URL ipapi = new URL("https://ipapi.co/city/");
			URLConnection c = ipapi.openConnection();
			c.setRequestProperty("User-Agent", "java-ipapi-client");
			
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(c.getInputStream()));
			
			location = reader.readLine();
			reader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return location;
		
	}

}
