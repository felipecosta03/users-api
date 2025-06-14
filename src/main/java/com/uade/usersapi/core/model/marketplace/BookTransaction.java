package com.uade.usersapi.core.model.marketplace;

import com.uade.usersapi.core.model.book.Book;
import com.uade.usersapi.core.model.constant.BookTransactionType;
import com.uade.usersapi.core.model.user.User;
import com.uade.usersapi.core.model.user.UserRate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class BookTransaction {

    private String id;
    private BookTransactionType type;
    private User senderUser;
    private User receiverUser;
    private Integer totalAmount;
    private LocalDateTime dateCreated;
    private String status;
    private UserRate senderReputation;
    private UserRate receiverReputation;
    private List<Book> senderBooks;
    private List<Book> receiverBooks;
}
