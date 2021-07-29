package RE_cases_Automation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Simple_Get {
	@Test
	public void ViewAgency() {

		given().when().
		get("https://ebenrolliq-qa-api.empoweredbenefits.com/api/Agency/ViewAgencies").
		then().statusCode(200).log().all();
	}
}
