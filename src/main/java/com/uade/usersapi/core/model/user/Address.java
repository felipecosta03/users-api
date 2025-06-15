package com.uade.usersapi.core.model.user;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Embeddable
public class Address {

  private String state;
  private String country;
  private Double longitude;
  private Double latitude;
}
