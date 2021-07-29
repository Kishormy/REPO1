package RE_cases;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class paramGet {	
	@Test
	public static void GetCustomerDetail(){
			 
		   given().queryParam("CUSTOMER_ID","68195")
		           .queryParam("PASSWORD","1234!")
		           .queryParam("Account_No","1")
		           .when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log()
		           .body();
		}
}
