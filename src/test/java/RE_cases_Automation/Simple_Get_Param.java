package RE_cases_Automation;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class Simple_Get_Param {
	String url = "https://ebenrolliq-qa-api.empoweredbenefits.com/api/Beneficiary/GetCustomerBeneficiaries";
	
	@Test
	public void View_Beneficiary() {
		

		given().param("CustomerId", 1873).when().get(url).
		then().statusCode(200).log().all();
	}

	}
