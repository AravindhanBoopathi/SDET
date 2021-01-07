package tryOuts;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ChangeRequest {

	@Test
	public void getRequest(){
		RestAssured.baseURI="https://dev96572.service-now.com/api/now/table/change_request";
        RestAssured.authentication = RestAssured.preemptive().basic("admin","Tuna@123");
        Response response = RestAssured
        		.given()
        		.queryParams("sys_created_on", "2020-11-29 13:40:45")
        		.accept(ContentType.XML).get();
        //XmlPath xresponse = response.xmlPath();
        response.prettyPrint();
	}
	
}
