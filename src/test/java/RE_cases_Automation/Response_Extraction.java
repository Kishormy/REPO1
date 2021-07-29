package RE_cases_Automation;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.hamcrest.core.Is;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Response_Extraction {
	String url;

	@BeforeClass()
	public void SetUpUrl() {
		url = "https://ebenrolliq-qa-api.empoweredbenefits.com/api/Customer/GetCustomerPaymentTransactions";
	}

	@Test(priority = 0)
	public void Get_Customertransaction_Details() {
		given().param("customerId", "1678").when().get(url).then().log().all();

		ArrayList<Integer> customerTransactionId = given().param("customerId", "1678").when().get(url).then().extract()
				.path("customerTransactionId");

		for (Integer t : customerTransactionId) {

			System.out.println("customer TransactionId is " + customerTransactionId);
		}

		ArrayList<String> paymentName = given().param("customerId", "1678").when().get(url).then().extract()
				.path("paymentName");

		for (String t : paymentName) {

			System.out.println("payment Name is " + paymentName);
		}

		ArrayList<Float> transactionAmount = given().param("customerId", "1678").when().get(url).then().extract()
				.path("transactionAmount");

		for (Float t : transactionAmount) {

			System.out.println("transaction Amount is " + transactionAmount);
		}

		ArrayList<String> createdOn = given().param("customerId", "1678").when().get(url).then().extract()
				.path("createdOn");

		for (String t : createdOn) {

			System.out.println("created On " + createdOn + "\n");
		}

	}

}
