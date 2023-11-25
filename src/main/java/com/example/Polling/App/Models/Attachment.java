package com.example.Polling.App.Models;

import jakarta.persistence.*;

@Entity
public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "topic_id", nullable = false)
    private DiscussionTopic topic;

    @Lob
    @Column
    private byte[] file;
    private String fileName;
    private String fileType;

}
