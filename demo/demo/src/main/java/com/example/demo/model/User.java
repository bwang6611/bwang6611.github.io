package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
public class User {
    @Id
    private String id;
    private String username;
    private String first_name;
    private String password;

    public User() {}

    public User(String id, String username, String first_name, String password) {
        super();
        this.id = id;
        this.username = username;
        this.first_name = first_name;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public String getFirstName() {
        return this.first_name;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
