package com.atr.api.tests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public abstract class TestBase {

    @BeforeClass
    public void setup() {
        // Set the base URI for all requests
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }
}
