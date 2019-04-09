package com.service.consume;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class DictionaryData {

	
	
		
	public String getDictionaries(String url) {

		String response = null;
		try {

			Client client = ClientBuilder.newClient();
			WebTarget target = client.target(url);
			
			response = target.request(MediaType.TEXT_XML).get(String.class);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;

	}


}
