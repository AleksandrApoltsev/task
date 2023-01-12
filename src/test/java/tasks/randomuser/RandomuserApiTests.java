package tasks.randomuser;

import org.junit.jupiter.api.Test;
import tasks.model.ResultsModel;

import static io.restassured.RestAssured.given;

public class RandomuserApiTests {
    @Test
    void listUsers() throws Exception {

        ResultsModel response = given()
                .log().uri()
                .queryParam("gender", "female")
                .queryParam("inc", "gender")
                .when()
                .get("https://randomuser.me/api/")
                .then()
                .log().body()
                .statusCode(200)
                .extract()
                .as(ResultsModel.class);

    }
}
