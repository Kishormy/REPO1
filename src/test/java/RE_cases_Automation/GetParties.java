package RE_cases_Automation;
import static io.restassured.RestAssured.given;

import org.hamcrest.core.Is;
import org.testng.annotations.Test;



	public class GetParties {
		String url = "https://dev.api.nonprod.areawealth.com.au/parties";

		@Test
		public void Validate_Statuscode() {
			given().param("customerId", "1678").when().get(url).then().statusCode(200).log().all();
		}
	
	}

