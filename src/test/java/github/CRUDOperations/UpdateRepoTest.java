package github.CRUDOperations;

import org.testng.annotations.Test;

import genericLibraries.IEndPointsAndPaths;
import io.restassured.http.ContentType;
import pojoClass.RepositoryLibrary;

import static io.restassured.RestAssured.*;
public class UpdateRepoTest extends BaseClass {
	
	@Test
	
	public void updateRepoTest()
	{
		RepositoryLibrary obj = new RepositoryLibrary();
		obj.setDescription("Just for Fun");
		obj.setRepoStatus(true);
		
		
		given()
			.body(obj)
			.contentType(ContentType.JSON)
			.pathParam("owner", property.fetchParameter("owner"))
			.pathParam("repo", property.fetchParameter("repo"))
		
		.when()
			.patch(IEndPointsAndPaths.patchRepo)
		
		.then()
			.log()
			.all()
			.assertThat().statusCode(200)
			.contentType(ContentType.JSON);
		
			
	}

}
