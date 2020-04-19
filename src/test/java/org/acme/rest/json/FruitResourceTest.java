package org.acme.rest.json;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class FruitResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/fruits/hello")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

    @Test
    public void testFailEndpoint() {
        given()
          .when().get("/fruits/fail")
          .then()
             .statusCode(500)
             .body(is("{\"msg\":\"testMsg\"}"));
    }

    @Test
    public void testNonExistingEndpoint() {
        given()
          .when().get("/fruits/nonexisting")
          .then()
             .statusCode(500)
             .body(is("{\"msg\":\"testMsg\"}"));
    }
}