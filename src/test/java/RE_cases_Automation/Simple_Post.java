package RE_cases_Automation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Simple_Post {
	String url = "https://ebenrolliq-qa-api.empoweredbenefits.com/api/Dependent/AddBeneficiaryDependent";
	@Test
	public void Add_Beneficiary() {
		given().contentType("application/json")
				.body("["+"{" + "\"customerId\": 1787," + "\"firstName\": \"John\"," + "\"lastName\": \"Smith\","
						+ "\"relationship\": \"Friend\"," + "\"isBeneficiary\": true " + "}"+"]")
				.when().post(url)
				.then().statusCode(200).log().all();
		
	}
}
