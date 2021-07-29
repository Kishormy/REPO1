package RE_cases;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class GetCustomerOrderInfo {
	@Test(priority = 0)
	public void getcustomerorderinfo(){
			
		given().
		param("customerId", "1525").
		when().
		get("https://ebenrolliq-qa-api.empoweredbenefits.com/api/Customer/GetCustomerOrderHistory").
		then().statusCode(200).log().all();
			}
	
	@Test(priority = 1)
	public void getcustomerorderinfor(){
		given().
		param("customerId", "1678").
		when().
		get("https://ebenrolliq-qa-api.empoweredbenefits.com/api/Customer/ViewCustomerInfo").
		then().statusCode(200).log().all();
	}
	
}
