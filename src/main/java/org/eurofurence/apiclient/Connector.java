package org.eurofurence.apiclient;

import java.text.SimpleDateFormat;

import io.swagger.client.ApiException;
import io.swagger.client.api.DefaultApi;
import io.swagger.client.model.EventEntry;

public class Connector {
	public static void main(String[] args) throws ApiException {
		DefaultApi api = new DefaultApi();
		api.getApiClient().setDateFormat(new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss"));

		System.out.println("Server time:");
		System.out.println(api.endpointGet().getCurrentDateTimeUtc());

		for (EventEntry x : api.eventEntryGet(null)) {
			System.out.println(x.getTitle());
			System.out.println("------------------------");
			System.out.println(x.getDescription());
		}

	}
}
