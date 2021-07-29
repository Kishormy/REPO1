package RE_cases_Automation;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Simple_Beneficiary_Crud {
	String AddBenurl = "https://ebenrolliq-qa-api.empoweredbenefits.com/api/Dependent/AddBeneficiaryDependent";
	String UpdateBenurl = "https://ebenrolliq-qa-api.empoweredbenefits.com/api/Beneficiary/UpdateBeneficiary";
	String ViewBenurl = "https://ebenrolliq-qa-api.empoweredbenefits.com/api/Beneficiary/GetCustomerBeneficiaries";
	String DeleteBenurl = "https://ebenrolliq-qa-api.empoweredbenefits.com/api/Beneficiary/RemoveCustomerBeneficiary";
	int benId = 1008;
	int CurrentBenID = benId + 1;

	@Test(priority = 1)
	public void Add_Beneficiary() {
		given().contentType("application/json")
				.body("[" + "{" + "\"customerId\": 1873," + "\"firstName\": \"John\"," + "\"lastName\": \"Smith\","
						+ "\"relationship\": \"Friend\"," + "\"isBeneficiary\": true " + "}" + "]")
				.when().post(AddBenurl).then().statusCode(200).log().all();

	}

	@Test(priority = 2)
	public void Update_Beneficiary() {
		given().contentType("application/json")
				.body("{" + "\"customerId\": 1873," + "\"firstName\": \"John\"," + "\"lastName\": \"Smith\","
						+ "\"relationship\": \"Friend\"," + "\"customerBeneficiaryID\": 1010 " + "}")
				.when().post(UpdateBenurl).then().statusCode(200).log().all();
		System.out.println(CurrentBenID);
	}

	@Test(priority = 3)

	public void View_Beneficiary() {
		given().param("CustomerId", 1873).when().get(ViewBenurl).then().statusCode(200).log().all();
	}

	@Test(priority = 4)
	public void Delete_Beneficiary() {
		given().contentType("application/json").param("customerBeneficiaryId", CurrentBenID).when().delete(DeleteBenurl)
				.then().statusCode(200).log().all();
	}

}
