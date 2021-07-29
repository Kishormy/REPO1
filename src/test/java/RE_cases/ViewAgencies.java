package RE_cases;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class ViewAgencies {

	@Test
	public void ViewAgency() {

		given().
		when().
		get("https://ebenrolliq-qa-api.empoweredbenefits.com/api/Agency/ViewAgencies").
		then().
		statusCode(200).
		log().
		all();
	}
}