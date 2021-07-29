package RE_cases_Automation;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.testng.annotations.Test;

public class Get_Data_From_ExcelSheet {
	Excel_DB ex= new Excel_DB();
		
	@Test
	public void View_Beneficiary() throws IOException {
		String url = ex.Get_Data(1,0);
		String kcid = ex.Get_Data(1, 1);
		String vcid = ex.Get_Data(1, 2);
		
		System.out.print(vcid+"\n");
		given().param(kcid, 1873).when().get(url).
		then().statusCode(200).log().all();
	}
}
