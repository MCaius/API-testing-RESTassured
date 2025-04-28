package com.atr.api.tests;

import com.atr.api.services.UserService;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DeleteUserTest extends TestBase {

    @Test
    public void deleteUserReturns200AndEmptyBody() {
        // Use DELETE (deleteUser) from UserService
        Response response = UserService.deleteUser(1);

        assertEquals(response.getStatusCode(), 200, "Expected HTTP status code is 200");

        // Assert JSON is empty
        JsonPath jsonPath = new JsonPath(response.getBody().asString());
        assertEquals(jsonPath.getMap("$").size(), 0, "Expected empty JSON object");
    }
}
