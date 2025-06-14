package com.uade.usersapi.core.model.user;

import com.uade.usersapi.core.model.activity.UserActivity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class User {

    @Id
    private String id;
    private String username;
    private String name;
    private String lastname;
    private String description;
    private String image;
    private Address address;
    private UserActivity activity;
    private List<UserBook> books;
    private List<UserRate> rates;
    private List<User> followers;
    private List<User> following;
    private LocalDateTime dateCreated;
}
