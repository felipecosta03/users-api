package com.uade.usersapi.core.model.marketplace;

import com.uade.usersapi.core.model.book.Book;
import com.uade.usersapi.core.model.constant.BookTransactionType;
import com.uade.usersapi.core.model.user.User;
import com.uade.usersapi.core.model.user.UserRate;

import jakarta.persistence.*;
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
@Entity
public class BookTransaction {

    @Id
    private String id;

    @Enumerated(EnumType.STRING)
    private BookTransactionType type;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sender_user_id")
    private User senderUser;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "receiver_user_id")
    private User receiverUser;

    private Integer totalAmount;
    private LocalDateTime dateCreated;
    private String status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sender_reputation_id")
    private UserRate senderReputation;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "receiver_reputation_id")
    private UserRate receiverReputation;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "transaction_sender_books",
        joinColumns = @JoinColumn(name = "transaction_id"),
        inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private List<Book> senderBooks;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "transaction_receiver_books",
        joinColumns = @JoinColumn(name = "transaction_id"),
        inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private List<Book> receiverBooks;
}
