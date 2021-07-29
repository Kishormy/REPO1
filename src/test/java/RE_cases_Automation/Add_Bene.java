package RE_cases_Automation;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Add_Bene {
	String url = "https://ebenrolliq-qa-api.empoweredbenefits.com/api/Dependent/AddBeneficiaryDependent";
	@Test
	public void Add_Beneficiary() {
		given().contentType("application/json").when()
				.body("["+"{" + "\"customerId\": 1787," + "\"firstName\": \"John\"," + "\"lastName\": \"Smith\","
						+ "\"relationship\": \"Friend\"," + "\"isBeneficiary\": true " + "}"+"]")
				.when().post(url)
				.then().statusCode(200).log().all();
		
	}
	
	
}
