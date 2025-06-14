package com.uade.usersapi.core.model.activity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Badge {

    @Id
    private String id;
    private String name;
    private String description;
    private String imageUrl;
}
