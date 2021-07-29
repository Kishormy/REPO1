package RE_cases;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class justGet {

	@Test(priority = 0)
	public void makeSureThatGoogleIsUp() {
		given().when().get("http://www.google.com").then().statusCode(200).log().body();
	}

	@Test(priority=1)
	public void demo99() {
		given().when()
				.get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1")
				.then().log().all();
	}


}