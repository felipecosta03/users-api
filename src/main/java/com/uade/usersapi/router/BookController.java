package com.uade.usersapi.router;

import com.uade.usersapi.router.dto.book.BookDto;
import com.uade.usersapi.router.infraestructure.db.entity.BookEntity;
import java.util.function.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

  @GetMapping("/books")
  public ResponseEntity<Page<BookDto>> getBooks(@QuerydslPredicate(root = BookEntity.class) Predicate<BookEntity> predicate) {

    return null;
  }

}
