package com.atr.api.tests;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.get;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HeaderTest extends TestBase {

    @Test
    public void verifyContentTypeHeaderExistsAndValue() {
        // Send GET to /users
        Response response = get("/users");

        // Verify the response has a Content-Type header
        assertTrue(response.getHeaders().hasHeaderWithName("Content-Type"),
                "Response should contain a Content-Type header");

        // Verify it’s exactly "application/json; charset=utf-8"
        assertEquals(response.getHeader("Content-Type"),
                "application/json; charset=utf-8",
                "Content-Type value should match expected");
    }
}
