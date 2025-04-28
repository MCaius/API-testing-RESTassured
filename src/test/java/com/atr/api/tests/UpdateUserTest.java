package com.atr.api.tests;

import com.atr.api.services.UserService;
import io.restassured.response.Response;
import com.atr.api.models.User;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class UpdateUserTest extends TestBase {

    @Test
    public void updateUserReturns200AndUpdatedFields() {
        User updatedUser = new User(
                1,
                "Leanne Graham Updated",
                "BretUpdated",
                "leanne.updated@example.com"
        );

        // Use PUT (updateUser) from UserService
        Response response = UserService.updateUser(1, updatedUser);

        // Deserialize the response body into a User object
        User responseUser = response.as(User.class);

        assertEquals(response.getStatusCode(), 200, "Expected HTTP status code is 200");
        assertEquals(responseUser.getId(), updatedUser.getId());
        assertEquals(responseUser.getName(), updatedUser.getName());
        assertEquals(responseUser.getUsername(), updatedUser.getUsername());
        assertEquals(responseUser.getEmail(), updatedUser.getEmail());
    }
}

