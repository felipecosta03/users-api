package com.uade.usersapi.router.dto.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class AddressDto {

  private String state;
  private String country;
  private Double longitude;
  private Double latitude;
}
