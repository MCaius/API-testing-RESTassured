package com.atr.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*
* Represents a User entity with basic information like id, name, username, and email.
* This model is used to easily send and receive User data in API requests and responses.
*/

//Ignore fields we don't need to use from the JSON
@JsonIgnoreProperties(ignoreUnknown = true)

public class User {

    private int id;
    private String name;
    private String username;
    private String email;

    // Constructors
    public User() {} //default

    // Use for POST requests
    public User(String name, String username, String email) {
       setName(name);
       setUsername(username);
       setEmail(email);
    }

    // Use for PUT requests
    public User(int id, String name, String username, String email) {
        setId(id);
        setName(name);
        setUsername(username);
        setEmail(email);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
