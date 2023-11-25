package com.example.Polling.App.Models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Response {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long responseId;

    @ManyToOne
    @JoinColumn(name = "topic_id", nullable = false)
    private DiscussionTopic topic;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private int thumbsUp;

    private int thumbsDown;

    @Column(columnDefinition = "TEXT")
    private String comment;

    //@OneToMany(mappedBy = "Response", cascade = CascadeType.ALL)
    @OneToMany(cascade = CascadeType.ALL)
    private List<Attachment> attachments;

    private LocalDateTime responseDate;
}

