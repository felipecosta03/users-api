package com.uade.usersapi.core.model.book;

import java.util.List;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
public class Book {

  @Id
  private String id;
  private String isbn;
  private String title;

  @Column(length = 1000)
  private String overview;

  @Column(length = 2000)
  private String synopsis;

  private Integer pages;
  private String edition;
  private String publisher;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "author_id")
  private Author author;

  private String image;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(
      name = "book_categories",
      joinColumns = @JoinColumn(name = "book_id"),
      inverseJoinColumns = @JoinColumn(name = "category_id")
  )
  private List<BookCategory> categories;
}
