package com.api;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetDemo {
	
	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://reqres.in/";
		
		RequestSpecification given = RestAssured.given();
		
		Response post = given.post("/api/users");
		
		//System.out.println(res);
		
		String asString = post.asString();
		
		System.out.println("Respponse body : " + asString);
		
		int statusCode = post.getStatusCode();
		
		System.out.println("Status code :" + statusCode);
		
		Assert.assertEquals(statusCode, 415);
		
		
		System.out.println("validation successful");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
