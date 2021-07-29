package RE_cases;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Post_GetProductPricing {

	@Test
	public void GetProductPricing() {

		given().contentType("application/json")
				.body("{" + "\"productKey\": null," + "\"productId\": 3," + "\"stateAbbr\": \"AR\"," + "\"birthDate\": \"1992-07-23\","
						+ "\"usesTobacco\": false " + "}")
				
//				.body("{" + "\"customerId\": 1787," + "\"firstName\": \"John\"," + "\"lastName\": \"Smith\","
//						+ "\"relationship\": \"Friend\"," + "\"isBeneficiary\": true " + "}")
				.when().post("https://ebenrolliq-qa-api.empoweredbenefits.com/api/Generic/GetProductPricing").then()
				.statusCode(200).log().all();

	}
}
