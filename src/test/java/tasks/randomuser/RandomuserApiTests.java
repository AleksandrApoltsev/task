package tasks.randomuser;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class RandomuserApiTests {
    @Test
    void listUsers() {
        given()
                .log().uri()
                .queryParam("gender","female")
                .queryParam("results","2")
                .when()
                .get("https://randomuser.me/api/")
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .body("info.results", is(2));
    }
}
