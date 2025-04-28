package com.atr.api.tests;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.get;
import static org.testng.Assert.assertEquals;

public class StatusCodeTest extends TestBase {

    @Test
    public void verifyStatusCodeIs200() {
        // Send GET to /users (baseURI comes from TestBase)
        Response response = get("/users");

        // Assert that HTTP status code is 200
        assertEquals(response.getStatusCode(), 200, "Expected HTTP status code is 200");
    }
}
