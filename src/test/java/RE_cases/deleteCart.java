package RE_cases;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class deleteCart {
	
	@Test
	public void deletecartitem(){
		
		given().
		param("productSessionId", 1533).
		when().
		delete("https://ebenrolliq-qa-api.empoweredbenefits.com/api/Customer/RemoveCartItem").
		then().statusCode(200).log().all();
		
	
	}

}
