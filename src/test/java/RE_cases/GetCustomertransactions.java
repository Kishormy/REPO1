package RE_cases;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;

import org.hamcrest.core.Is;

public class GetCustomertransactions {
	String url = "https://ebenrolliq-qa-api.empoweredbenefits.com/api/Customer/GetCustomerPaymentTransactions";
	public static ValidatableResponse response;
	public static String jsonAsString;

	@Test(priority = 0)
	public void GetCustomertransaction() {
		response = given().param("customerId", "1678").when().get(url).then().statusCode(200).assertThat()
				.body("customerTransactionId[0]", Is.is(539)).log().all();
		
		ArrayList< Integer > customerTransactionId = given().param("customerId", "1678").when().get(url).then().extract()
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
