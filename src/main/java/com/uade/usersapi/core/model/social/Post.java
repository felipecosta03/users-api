package com.uade.usersapi.core.model.social;

import com.uade.usersapi.core.model.user.User;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Post {

  private String id;
  private String body;
  private String image;
  private User user;
  private List<Comment> comments;
  private LocalDateTime dateCreated;
}
