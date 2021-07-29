package RE_cases;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.TestNG;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class UpdatingESignature {

	@Test
	public void UpdateEsig() {

		// Map<String, Object> values = new HashMap<String, Object>();
		// JSONObject values = new JSONObject();
		//
		// values.put("sessionId", "1148");
		// values.put("customerElectronicSignature", "Kenneth");
		// values.put("customerElectronicSignatureTS",
		// "2020-11-04T05:15:16.462Z");
		String eSig = "{"+"\"sessionId\": 1148,\"customerElectronicSignature\": \"Kenneth\",\r\n\"customerElectronicSignatureTS\": \"2020-11-04T05:15:16.462Z\"\r\n"
				+ "}";

		given().contentType("application/json").
		body("{"+"\"sessionId\": 1148,\"customerElectronicSignature\": \"Kenneth\",\r\n\"customerElectronicSignatureTS\": \"2020-11-04T05:15:16.462Z\"\r\n"
				+ "}").
		// body(values).
				when().post("https://ebenrolliq-qa-api.empoweredbenefits.com/api/Customer/AddElectronicSignature")
				.then().statusCode(200).log().all();

		// "sessionId": 1148,
		// "customerElectronicSignature": "Kenneth",
		// "customerElectronicSignatureTS": "2020-11-04T05:15:16.462Z",
	}
}
