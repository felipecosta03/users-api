package com.uade.usersapi.core.model.social;

import com.uade.usersapi.core.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter

public class Comment {

    private String body;
    private User user;
    private LocalDateTime dateCreated;

}
