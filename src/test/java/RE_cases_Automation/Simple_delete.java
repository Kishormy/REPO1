package RE_cases_Automation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Simple_delete {

	@Test
	public void Delete_Beneficiary() {
		given().contentType("application/json").param("customerBeneficiaryId", 1012).
		when().delete("https://ebenrolliq-qa-api.empoweredbenefits.com/api/Beneficiary/RemoveCustomerBeneficiary")
				.then().statusCode(200).log().all();

	}

}
