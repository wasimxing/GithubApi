package github.CRUDOperations;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import genericLibraries.IEndPointsAndPaths;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class GetReposForAuthUser extends BaseClass{
	
	@Test
	public void getReposForAuthUser()
	{
		Response response =given()
							.auth()
								.oauth2(property.fetchParameter("token"))
				
		.when()
			.get(IEndPointsAndPaths.getRepoForAuthUser);
		
		response.then()
					.log().all()
					
					.assertThat()
						.statusCode(200)
						.contentType(ContentType.JSON);
	
			
	
	}

}
