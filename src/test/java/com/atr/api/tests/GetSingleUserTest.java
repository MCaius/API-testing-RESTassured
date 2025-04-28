package com.atr.api.tests;

import com.atr.api.services.UserService;
import io.restassured.response.Response;
import com.atr.api.models.User;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class GetSingleUserTest extends TestBase {

    @Test
    public void getUserByIdReturnsCorrectUser() {
        // Use GET (getUserById) from UserService
        Response response = UserService.getUserById(1);

        // Deserialize the response body into a User object
        User user = response.as(User.class);

        assertEquals(response.getStatusCode(), 200, "Expected HTTP status code is 200");
        assertEquals(user.getId(), 1);
        assertEquals(user.getName(), "Leanne Graham");
    }
}
