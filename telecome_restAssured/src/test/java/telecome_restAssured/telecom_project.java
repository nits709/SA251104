package telecome_restAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class telecom_project {

	/*
	 * given() - pre-condition header, path parameter, query parameter, request
	 * payload, authorization
	 * 
	 * When() : action | steps to follow Get(),post(),put(),patch(),delete()
	 * 
	 * Then(): Validate response status code, response, response time, cookies,
	 * header, response payload etc.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	String userToken;
	String userID;
	String userEmailID;
	
	@Test(priority=1)
	public void AddNewUser() {

		Response res = given().header("Content-Type", "application/json")
				.body("{\n" + "\"firstName\": \"nitin\",\n" + "\"lastName\": \"gupta\",\n"
						+ "\"email\": \"telecomeProject" + System.currentTimeMillis() + "@yopmail.com\",\n"
						+ "\"password\": \"Smart@123\"\n" + "}")
				.when().post("https://thinking-tester-contact-list.herokuapp.com/users");
		
		res.then().log().body();
		
		userToken =res.jsonPath().getString("token");
		userID = res.jsonPath().getString("user._id");
		userEmailID = res.jsonPath().getString("user.email");
		System.out.println("userID "+userID +" : "+userEmailID);
		System.out.println("token "+userToken);
		System.out.println("status code "+ res.statusCode());

	}

	@Test(priority=2)
	public void getProfile() {
		
		Response res = given().header("Content-Type", "application/json")
		.header("Authorization","Bearer "+userToken)
		.when().get("https://thinking-tester-contact-list.herokuapp.com/users/me");
		
		res.then().log().body();
		
	}
	
	@Test(priority=3)
	public void updateProfile() {
		Response res = given().header("Content-Type", "application/json")
		.header("Authorization","Bearer "+userToken)
		.body("{"
		        + "\"firstName\":\"Selenium\","
		        + "\"lastName\":\"WebDriver\","
		        + "\"email\":\"" + userEmailID + "\","
		        + "\"password\":\"Smart@123\""
		        + "}")
		.when().patch("https://thinking-tester-contact-list.herokuapp.com/users/"+userID);
		
		res.then().log().body();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
