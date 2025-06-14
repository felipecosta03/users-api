package com.uade.usersapi.core.model.user;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class UserRate {

    private String id;
    private User raterUser;
    private User ratedUser;
    private String comment;
    private Integer rate;
    private LocalDateTime dateCreated;
}

