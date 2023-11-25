package com.example.Polling.App.Controller;

import com.example.Polling.App.Models.DiscussionTopic;
import com.example.Polling.App.Services.DiscussionTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth/topics")
public class DiscussionTopicController {

    private final DiscussionTopicService topicService;

    @Autowired
    public DiscussionTopicController(DiscussionTopicService topicService) {
        this.topicService = topicService;
    }

    @GetMapping
    public ResponseEntity<List<DiscussionTopic>> getAllTopics() {
        List<DiscussionTopic> topics = topicService.getAllTopics();
        return new ResponseEntity<>(topics, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public DiscussionTopic getTopicById(@PathVariable Long id) {
        return topicService.getTopicById(id);
    }

    @PostMapping("/create")
    public DiscussionTopic createTicket(@RequestBody DiscussionTopic topic) {
        DiscussionTopic createTopic = topicService.createTopic(topic);
        return createTopic;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTopic(@PathVariable Long id) {
        topicService.deleteTopic(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
