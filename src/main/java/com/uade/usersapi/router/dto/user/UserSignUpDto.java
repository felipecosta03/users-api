package com.uade.usersapi.router.dto.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class UserSignUpDto {

  private String id;
  private String name;
  private String lastname;
  private String email;
  private String password;
  private String username;
}
