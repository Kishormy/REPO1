package RE_cases;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapper;

public class Dependents {

	@Test
	public void AddDependent()  {
		
		
		HashMap<String, String> Dep = new HashMap<>();
		Dep.put("customerId", "1861");
		Dep.put("firstName", "Clark");
		Dep.put("middleInitial", "K");
		Dep.put("lastName", "Luise");
		Dep.put("relationship", "Friend");
		Dep.put("phone", "4587562222");
		Dep.put("phoneTypeId", "2");
		Dep.put("birthDate", "2011-09-03");
		Dep.put("ssn", "MjIyLTIyLTMzMzM=");
		Dep.put("dependentTypeId", "2");
		Dep.put("beneficiaryTypeId", "1");
		Dep.put("genderId", "1");
		Dep.put("isDependent", "true");
		Dep.put("isBeneficiary", "false");
		Dep.put("isFullTimeStudent", "false");

		given().contentType("application/json").
		// header("Content-Type",
		// "application/json").contentType(ContentType.JSON).accept(ContentType.JSON).
		// config(RestAssured.config().encoderConfig(EncoderConfig.encoderConfig().encodeContentTypeAs("application/json",
		// ContentType.TEXT))).
//				body("{" + "\"customerId\": 1861," + "\"firstName\": \"John\"," + " \"lastName\": \"Cena\" ,"
//						+ " \"relationship\": \"Friend\"," + "\"birthDate\": \"2011-09-03\","
//						+ "\"dependentTypeId\": 2 " + "\"genderId\": 1 " + "\"isDependent\": true " + "}")
		body(Dep).
		when().
		post("https://ebenrolliq-qa-api.empoweredbenefits.com/api/Dependent/AddBeneficiaryDependent").
		then().statusCode(200).log().all();

	}
	
	
	
}
