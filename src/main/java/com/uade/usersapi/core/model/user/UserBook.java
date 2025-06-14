package com.uade.usersapi.core.model.user;

import com.uade.usersapi.core.model.book.Book;
import com.uade.usersapi.core.model.constant.BookStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserBook {

    private User user;

    private Book book;
    private BookStatus status;

    private boolean isFavorite;

    private boolean isAvailableForExchange;
}
