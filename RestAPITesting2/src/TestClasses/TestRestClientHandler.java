package TestClasses;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.HttpURLConnection;

import org.junit.Test;

import Links.URLs;
import enums.HTTPMethod;
import enums.HTTPRequestsContentTypes;
import requestHandling.RestClientHandler;

public class TestRestClientHandler {

	@Test
	public void test() throws IOException {
			// 1. connect to server and open connection (get HttpURLConnection object)
			HttpURLConnection connection = RestClientHandler.connectServer(URLs.ReqResAPI, HTTPMethod.GET,
					HTTPRequestsContentTypes.JSON);
			// 2. validate if the connection is successfully openned
			System.out.println("connection.getResponseCode() : " + connection.getResponseCode());
			assertTrue("unable to connect to webservice", connection.getResponseCode() == 200);
			// 3. reading response using input stream
			String response = RestClientHandler.readResponse(connection);
			System.out.println(response);
			assertTrue("Data is empty", !response.equals(""));

		}
			}


