package com.qa.rest.tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetCallBDD {
	
	@Test
	public void test_title()
	{
		given().
		 when().
		       get("https://jsonplaceholder.typicode.com/posts/1").
		then().
		assertThat().statusCode(200);
		
		 
		        
	}
	

}
