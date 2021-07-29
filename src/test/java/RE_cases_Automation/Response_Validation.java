package RE_cases_Automation;

import static io.restassured.RestAssured.given;

import org.hamcrest.core.Is;
import org.testng.annotations.Test;

public class Response_Validation {
	String url = "https://ebenrolliq-qa-api.empoweredbenefits.com/api/Customer/GetCustomerPaymentTransactions";

	@Test
	public void Validate_Statuscode() {
		given().param("customerId", "1678").when().get(url).then().statusCode(200).log().all();
	}

	@Test(dependsOnMethods = "Validate_Statuscode")
	public void Validate_TransactionID() {
		given().param("customerId", "1678").when().get(url).then().assertThat()
				.body("customerTransactionId[0]", Is.is(539)).log().all();
	}

}
