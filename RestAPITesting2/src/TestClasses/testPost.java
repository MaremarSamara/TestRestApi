package TestClasses;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Ignore;
import org.junit.Test;

import Links.FilesPaths;
import Links.URLs;
import Utils.JSONUtils;
import enums.HTTPMethod;
import enums.HTTPRequestsContentTypes;
import requestHandling.RestClientHandler;

public class testPost {

//post for creat
	@Test
	public void TestPostData() throws Exception
	{
		//1. Get HttpURLConnection
		HttpURLConnection connection= RestClientHandler.connectServer(URLs.ReqResAPI, HTTPMethod.POST , HTTPRequestsContentTypes.JSON);
		
	  //2. Read JSON file		
		String json=JSONUtils.readJSONObjectFromFile(FilesPaths.CreatDataJSONFile);
		
		//3.sent post request
	    RestClientHandler.sendPost(connection, json, HTTPRequestsContentTypes.JSON);
	
		//4. Read Response
		String response=RestClientHandler.readResponse(connection);
		System.out.println(response);
		//5. convert string to json object 
		JSONObject obj= (JSONObject) JSONUtils.convertStringToJSON(response);
		System.out.println(obj.get("id"));
	}
	
	//Post for sucess register
		@Test
		public void TestPostData2() throws Exception
		{
			//1. Get HttpURLConnection
			HttpURLConnection connection= RestClientHandler.connectServer(URLs.RegisterSuccessful, HTTPMethod.POST , HTTPRequestsContentTypes.JSON);
			
			//2. Read JSON file		
			String json=JSONUtils.readJSONObjectFromFile(FilesPaths.SucessRegister);
			
			//3.sent post request
			RestClientHandler.sendPost(connection, json, HTTPRequestsContentTypes.JSON);
			
			//4. Read Response
			String response=RestClientHandler.readResponse(connection);
			System.out.println(response);
			//5. convert string to json object 
			JSONObject obj= (JSONObject) JSONUtils.convertStringToJSON(response);
			System.out.println(obj.get("email"));
			System.out.println(obj.get("passward"));
		}
//Post for login Scuess
		
	@Test
	public void TestPostData3() throws Exception
	{
		//1. Get HttpURLConnection
		HttpURLConnection connection= RestClientHandler.connectServer(URLs.LoginSuccessful, HTTPMethod.POST , HTTPRequestsContentTypes.JSON);
		
		//2. Read JSON file		
		String json=JSONUtils.readJSONObjectFromFile(FilesPaths.CreatDataJSONFile);
		
		//3.sent post request
		RestClientHandler.sendPost(connection, json, HTTPRequestsContentTypes.JSON);
		
		//4. Read Response
		String response=RestClientHandler.readResponse(connection);
		System.out.println(response);
		//5. convert string to json object 
		JSONObject obj= (JSONObject) JSONUtils.convertStringToJSON(response);
		System.out.println(obj.get("id"));
		System.out.println(obj.get("data"));
	}

//Post for login un Scuess

@Test
public void TestPostData4() throws Exception
{
//1. Get HttpURLConnection
HttpURLConnection connection= RestClientHandler.connectServer(URLs.LoginunSuccessful, HTTPMethod.POST , HTTPRequestsContentTypes.JSON);

//2. Read JSON file		
String json=JSONUtils.readJSONObjectFromFile(FilesPaths.loginUnSucess);

//3.sent post request
RestClientHandler.sendPost(connection, json, HTTPRequestsContentTypes.JSON);

//4. Read Response
String response=RestClientHandler.readResponse(connection);
System.out.println(response);
//5. convert string to json object 
JSONObject obj= (JSONObject) JSONUtils.convertStringToJSON(response);
System.out.println(obj.get("email"));
System.out.println(obj.get("passward"));
}


	



}



