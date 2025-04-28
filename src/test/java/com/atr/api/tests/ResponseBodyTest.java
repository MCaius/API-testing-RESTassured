package com.atr.api.tests;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import java.util.List;
import static io.restassured.RestAssured.get;
import static org.testng.Assert.assertEquals;

public class ResponseBodyTest extends TestBase {

    @Test
    public void verifyResponseBodyContains10Users() {
        // Send GET to /users
        Response response = get("/users");

        // Extract the JSON array as a List<Object>
        List<Object> users = response.jsonPath().getList("$");

        // Assert there are exactly 10 elements
        assertEquals(users.size(), 10, "Expected 10 users in the response body");
    }
}
