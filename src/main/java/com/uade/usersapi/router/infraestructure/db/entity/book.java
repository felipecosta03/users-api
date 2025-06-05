package com.uade.usersapi.router.infraestructure.db.entity;

import com.uade.usersapi.model.constant.BookStatus;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Book {

  private String id;
  private String isbn;
  private String title;
  private String overview;
  private String synopsis;
  private Integer pages;
  private String edition;
  private String publisher;
  private String author;
  private String image;
  private Integer rate;
  private BookStatus status;
  private boolean isFavorite;
  private List<String> categories;
}
