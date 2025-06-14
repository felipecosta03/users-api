package com.uade.usersapi.core.model.social;

import com.uade.usersapi.core.model.user.User;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Community {

  private User admin;
  private List<User> members;
  private LocalDateTime dateCreated;
  private List<Post> posts;
  private List<User> likes;
}
