package RE_cases_Automation;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class CustomerCompleteDetails {

	@Test (priority = 1)
	public void View_Customer_Info(){
	
		given().
		param("customerId", "1678").
		when().
		get("https://ebenrolliq-qa-api.empoweredbenefits.com/api/Customer/ViewCustomerInfo").
		then().statusCode(200).log().all();
		
	}
	@Test(priority = 2)
	public void View_Payment_Methods(){
	
		given().
		param("customerId", "1678").
		when().
		get("https://ebenrolliq-qa-api.empoweredbenefits.com/api/Customer/GetCustomerPaymentMethod").
		then().statusCode(200).log().all();
		
	}
	@Test(priority = 3)
	public void Get_CustomerOrder_History(){
	
		given().
		param("customerId", "1678").
		when().
		get("https://ebenrolliq-qa-api.empoweredbenefits.com/api/Customer/GetCustomerOrderHistory").
		then().statusCode(200).log().all();
		
	}
	@Test(priority = 4)
	public static void GetCustomertransaction(){
		given().
		param("customerId", "1678").
		when().
		get("https://ebenrolliq-qa-api.empoweredbenefits.com/api/Customer/GetCustomerPaymentTransactions").
		then().statusCode(200).log().all();
		
	}
	
}
