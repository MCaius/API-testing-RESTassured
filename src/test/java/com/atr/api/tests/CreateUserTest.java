package com.atr.api.tests;

import com.atr.api.services.UserService;
import io.restassured.response.Response;
import com.atr.api.models.User;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CreateUserTest extends TestBase {

    @Test
    public void createUserReturns201AndEchoesPayload() {
        User user = new User(
                "Test User",
                "testuser",
                "testuser@example.com"
        );

        // Use POST (createUser) from UserService
        Response response = UserService.createUser(user);

        // Deserialize the response body into a User object
        User createdUser = response.as(User.class);

        assertEquals(response.getStatusCode(), 201, "Expected HTTP status code is 201");
        assertEquals(createdUser.getName(), user.getName());
        assertEquals(createdUser.getUsername(), user.getUsername());
        assertEquals(createdUser.getEmail(), user.getEmail());
        assertEquals(createdUser.getId(), 11);
    }
}
