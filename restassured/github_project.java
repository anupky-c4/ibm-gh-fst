package RESTAssured;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import java.util.HashMap;
import java.util.Map;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class github_project {
	RequestSpecification requestSpec;
	String sshKey="ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIMdmO+yzE+hAqfuVtqWNqadAo0t8sb64p8cm0UYf0v4t";
	int keyId;
	
	@BeforeClass
	public void setup() {
		requestSpec = new RequestSpecBuilder().setContentType("application/json")
				.addHeader("Authorization", "token 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")
				.setBaseUri("https://api.github.com").build();
	}
    @Test(priority = 1)
    public void addSSHKey() {

        String requestBody = "{\n" +"\"title\":\"TestAPIKey\",\n" +"\"key\":\"" + sshKey + "\"\n" +"}";
        Response response = given().spec(requestSpec).body(requestBody).when().post("/user/keys");
        response.prettyPrint();
        keyId = response.jsonPath().getInt("id");
        System.out.println("Generated Key ID: " + keyId);
        response.then().statusCode(201).body("title", equalTo("TestAPIKey"));
    }

    @Test(priority = 2, dependsOnMethods = "addSSHKey")
    public void getSSHKey() {
        Response response =given().spec(requestSpec).pathParam("keyId", keyId).when().get("/user/keys/{keyId}");
        System.out.println(response.asPrettyString());
        response.then().statusCode(200).body("id", equalTo(keyId)).body("title", equalTo("TestAPIKey"));
    }

    @Test(priority = 3, dependsOnMethods = "getSSHKey")
    public void deleteSSHKey() {
        Response response =given().spec(requestSpec).pathParam("keyId", keyId).when().delete("/user/keys/{keyId}");
        System.out.println("Deleted Key ID: " + keyId);
        response.then().statusCode(204);
    }
}