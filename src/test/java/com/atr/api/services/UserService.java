package com.atr.api.services;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import com.atr.api.models.User;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.delete;

/*
* Provides reusable methods to perform API actions related to Users (GET, POST, PUT, DELETE).
* This helps keep the test clean by separating the request logic from the test logic.
*/

public class UserService {

    private static final String USERS_ENDPOINT = "/users";

    // Create a user (POST)
    public static Response createUser(User user) {
        return given()
                .contentType(ContentType.JSON)
                .body(user)
                .when()
                .post(USERS_ENDPOINT)
                .then()
                .extract()
                .response();
    }

    // Get all users (GET)
    public static Response getAllUsers() {
        return given()
                .when()
                .get(USERS_ENDPOINT)
                .then()
                .extract()
                .response();
    }

    // Get a user by ID (GET)
    public static Response getUserById(int userId) {
        return given()
                .when()
                .get(USERS_ENDPOINT + "/" + userId)
                .then()
                .extract()
                .response();
    }

    // Update a user (PUT)
    public static Response updateUser(int userId, User user) {
        return given()
                .contentType(ContentType.JSON)
                .body(user)
                .when()
                .put(USERS_ENDPOINT + "/" + userId)
                .then()
                .extract()
                .response();
    }

    // Delete a user (DELETE)
    public static Response deleteUser(int userId) {
        return delete(USERS_ENDPOINT + "/" + userId)
                .then()
                .extract()
                .response();
    }
}
