package github.CRUDOperations;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class DeleteRepoUserTest extends BaseClass {
	
	@Test
	public void deleteRepoUserTest()
	{
		given()
			.auth()
				.oauth(DEFAULT_URI, DEFAULT_SESSION_ID_VALUE, DEFAULT_PATH, DEFAULT_BODY_ROOT_PATH)
				
		;
	}

}
