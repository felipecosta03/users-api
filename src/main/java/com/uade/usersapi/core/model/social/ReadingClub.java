package com.uade.usersapi.core.model.social;

import com.uade.usersapi.core.model.book.Book;
import com.uade.usersapi.core.model.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "reading_clubs")
public class ReadingClub {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    @Column(length = 1000)
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "community_id")
    private Community community;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "moderator_id")
    private User moderator;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "reading_club_members", joinColumns = @JoinColumn(name = "reading_club_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> members;

    private LocalDateTime dateCreated;
    private LocalDateTime lastUpdated;
}
