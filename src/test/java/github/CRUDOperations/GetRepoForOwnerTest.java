package github.CRUDOperations;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.IEndPointsAndPaths;
import io.restassured.response.Response;
public class GetRepoForOwnerTest extends BaseClass {
	
	@Test
	public void getReposForOwnerTest()
	{
		Response response =given()
			.pathParam("owner", property.fetchParameter("owner"))
			.pathParam("repo", property.fetchParameter("repo"))
		
		.when()
			.get(IEndPointsAndPaths.getRepoForOwner);
		
		response.then()
			.log().all()
			.assertThat()
			.statusCode(200);
		
		String name =response.jsonPath().get("name");
		String ownerName = response.jsonPath().get("owner.login");
		Assert.assertEquals(name, property.fetchParameter("repo"));
		Assert.assertEquals(ownerName, property.fetchParameter("owner"));
			
			//.contentType(ContentType.JSON);
		
	}

}
