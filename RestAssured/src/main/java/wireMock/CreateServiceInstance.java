package wireMock;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class CreateServiceInstance {

	@BeforeTest
	public void mockCreateInstance(){
		configureFor("localhost", 8080);
		stubFor(post("api/now/serivce/instance")
				.withRequestBody(equalToJson("{\"name\" : \"Aravind\"}"))
				.willReturn(aResponse().withBody("{\"result\" : \"success\"}").withStatus(201))
				);
	}
	
	@Test
	public void getRequest(){
		RestAssured.baseURI="http://localhost:8080/api/now/service/instance";
        RestAssured.authentication = RestAssured.preemptive().basic("admin","Tuna@123");
        Response response = RestAssured
        		.given()
        		
        		.body("{\"name\" : \"Aravind\"}").post();
        
        response.prettyPrint();
	}
	
	
}
