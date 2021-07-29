package RE_cases_Automation;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;

public class Automation_Beneficiary_Crud {
	String AddBenurl = "https://ebenrolliq-qa-api.empoweredbenefits.com/api/Dependent/AddBeneficiaryDependent";
	String UpdateBenurl = "https://ebenrolliq-qa-api.empoweredbenefits.com/api/Beneficiary/UpdateBeneficiary";
	String ViewBenurl = "https://ebenrolliq-qa-api.empoweredbenefits.com/api/Beneficiary/GetCustomerBeneficiaries";
	String DeleteBenurl = "https://ebenrolliq-qa-api.empoweredbenefits.com/api/Beneficiary/RemoveCustomerBeneficiary";

	@Test(priority = 1)
	public ArrayList<Integer> Add_Beneficiary() {
		given().contentType("application/json")
				.body("[" + "{" + "\"customerId\": 1873," + "\"firstName\": \"John\"," + "\"lastName\": \"Smith\","
						+ "\"relationship\": \"Friend\"," + "\"isBeneficiary\": true " + "}" + "]")
				.when().post(AddBenurl).then().statusCode(200).log().all();

		ArrayList<Integer> CustomerBeneficiaryId = given().param("customerId", "1873").when().get(AddBenurl).then().extract()
				.path("CustomerBeneficiaryId");

		return CustomerBeneficiaryId;
	}

	@Test(priority = 2)
	public void Update_Beneficiary() {
		ArrayList<Integer> CustomerBeneficiaryId = Add_Beneficiary();
		given().contentType("application/json")
				.body("{" + "\"customerId\": 1873," + "\"firstName\": \"John\"," + "\"lastName\": \"Smith\","
						+ "\"relationship\": \"Friend\"," + "\"customerBeneficiaryID\": CustomerBeneficiaryId " + "}")
				.when().post(UpdateBenurl).then().statusCode(200).log().all();
	}

	@Test(priority = 3)

	public void View_Beneficiary() {
		given().param("CustomerId", 1873).when().get(ViewBenurl).then().statusCode(200).log().all();
	}

	@Test(priority = 4)
	public void Delete_Beneficiary() {
		given().contentType("application/json").param("customerBeneficiaryId", "CustomerBeneficiaryId").when()
				.delete(DeleteBenurl).then().statusCode(200).log().all();
	}

}
