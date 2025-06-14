package com.uade.usersapi.core.model.book;

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
  private Author author;
  private String image;
  private List<BookCategory> categories;
}
