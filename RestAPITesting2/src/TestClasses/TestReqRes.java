package TestClasses;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.HttpURLConnection;

import org.junit.Test;

import Links.URLs;
import enums.HTTPMethod;
import enums.HTTPRequestsContentTypes;
import requestHandling.RestClientHandler;

public class TestReqRes {

	@Test
	public void test() {
		try
		{
		// 1. connect to server and open connection (get HttpURLConnection object)
		HttpURLConnection connection = RestClientHandler.connectServer(URLs.ReqResAPI, HTTPMethod.GET,
				HTTPRequestsContentTypes.JSON);
		
		//2. Send Post Request
		RestClientHandler.sendGet(connection, "", HTTPRequestsContentTypes.JSON);
		assertTrue("unable to connect to webservice", connection.getResponseCode() == 200);
		// 3. reading response using input stream
		String response = RestClientHandler.readResponse(connection);
		System.out.println(response);
		assertTrue("Data is empty", !response.equals(""));
		}catch(Exception ex)
	{
		ex.printStackTrace();
		}

	}
	
	
	//Get List of user
		@Test
	public void test1() throws Exception {
		// 1. connect to server and open connection (get HttpURLConnection object)
				HttpURLConnection connection = RestClientHandler.connectServer(URLs.GetListReqResAPI, HTTPMethod.GET,
						HTTPRequestsContentTypes.JSON);
				
				//2. Send Post Request
				RestClientHandler.sendGet(connection, "", HTTPRequestsContentTypes.JSON);
				assertTrue("unable to connect to webservice", connection.getResponseCode() == 200);
				// 3. reading response using input stream
				String response = RestClientHandler.readResponse(connection);
			    System.out.println(response);
				assertTrue("Data is empty", !response.equals(""));
               assertFalse("data.id[1]", equals(8));
                
	             assertFalse("data.first_name", equals("Rana"));
	             

	}
	
		//Get single of user
				@Test
			public void test2() throws Exception {
				// 1. connect to server and open connection (get HttpURLConnection object)
						HttpURLConnection connection = RestClientHandler.connectServer(URLs.GetSingleReqResAPI, HTTPMethod.GET,
								HTTPRequestsContentTypes.JSON);
						
						//2. Send Post Request
						RestClientHandler.sendGet(connection, "", HTTPRequestsContentTypes.JSON);
						assertTrue("unable to connect to webservice", connection.getResponseCode() == 200);
						// 3. reading response using input stream
						String response = RestClientHandler.readResponse(connection);
					    System.out.println(response);
						assertTrue("Data is empty", !response.equals(""));
		               assertFalse("data.id[1]", equals(8));
		                
			             assertFalse("data.first_name", equals("Michael"));
			             

			}
	
//Get NotFound of user
@Test
	public void test3() throws Exception {
		// 1. connect to server and open connection (get HttpURLConnection object)
					HttpURLConnection connection = RestClientHandler.connectServer(URLs.GetNotFoundReqResAPI, HTTPMethod.GET,
					HTTPRequestsContentTypes.JSON);
						
	//2. Send Post Request
			RestClientHandler.sendGet(connection, "", HTTPRequestsContentTypes.JSON);
			assertTrue("unable to connect to webservice", connection.getResponseCode() == 404);
	// 3. reading response using input stream
			String response = RestClientHandler.readResponse(connection);
			System.out.println(response);
			assertTrue("Data is empty", !response.equals(""));
		     assertFalse("data.id[1]", equals(8));
		                
			 assertFalse("data.first_name", equals("Michael"));
			             

			}


//Get list resourse 
@Test
	public void test4() throws Exception {
		// 1. connect to server and open connection (get HttpURLConnection object)
					HttpURLConnection connection = RestClientHandler.connectServer(URLs.GetListResourse, HTTPMethod.GET,
					HTTPRequestsContentTypes.JSON);
						
	//2. Send Post Request
			RestClientHandler.sendGet(connection, "", HTTPRequestsContentTypes.JSON);
			assertTrue("unable to connect to webservice", connection.getResponseCode() == 200);
	// 3. reading response using input stream
			String response = RestClientHandler.readResponse(connection);
			System.out.println(response);
			assertTrue("Data is empty", !response.equals(""));
		    
			}



//Get single resourse 
@Test
	public void test5() throws Exception {
		// 1. connect to server and open connection (get HttpURLConnection object)
					HttpURLConnection connection = RestClientHandler.connectServer(URLs.GetSingleResourse, HTTPMethod.GET,
					HTTPRequestsContentTypes.JSON);
						
	//2. Send Post Request
			RestClientHandler.sendGet(connection, "", HTTPRequestsContentTypes.JSON);
			assertTrue("unable to connect to webservice", connection.getResponseCode() == 200);
	// 3. reading response using input stream
			String response = RestClientHandler.readResponse(connection);
			System.out.println(response);
			assertTrue("Data is empty", !response.equals(""));
		    
			}

//Get single resourse not found 
@Test
	public void test6() throws Exception {
		// 1. connect to server and open connection (get HttpURLConnection object)
					HttpURLConnection connection = RestClientHandler.connectServer(URLs.GetSingleResourseNotFound, HTTPMethod.GET,
					HTTPRequestsContentTypes.JSON);
						
	//2. Send Post Request
			RestClientHandler.sendGet(connection, "", HTTPRequestsContentTypes.JSON);
			assertTrue("unable to connect to webservice", connection.getResponseCode() == 404);
	// 3. reading response using input stream
			String response = RestClientHandler.readResponse(connection);
			System.out.println(response);
			assertTrue("Data is empty", !response.equals(""));
		    
			}
}

