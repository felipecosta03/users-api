package com.uade.usersapi.core.model.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Table(name = "user_rates")
public class UserRate {

    @Id
    private String id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rater_user_id")
    private User raterUser;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rated_user_id")
    private User ratedUser;

    private String comment;
    private Integer rate;
    private LocalDateTime dateCreated;
}
