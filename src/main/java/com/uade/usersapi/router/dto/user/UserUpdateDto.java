package com.uade.usersapi.router.dto.user;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class UserUpdateDto {

  private String id;
  private String username;
  private String name;
  private String lastname;
  private String description;
  private AddressDto address;
  private LocalDateTime dateCreated;
}
