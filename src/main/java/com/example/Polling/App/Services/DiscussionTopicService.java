package com.example.Polling.App.Services;

import com.example.Polling.App.Exception.ResourceNotFoundException;
import com.example.Polling.App.Models.DiscussionTopic;
import com.example.Polling.App.Repository.DiscussionTopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiscussionTopicService {

    private final DiscussionTopicRepository topicRepository;

    @Autowired
    public DiscussionTopicService(DiscussionTopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }
    public DiscussionTopic createTopic(DiscussionTopic topic) {
        return topicRepository.save(topic);
    }

    public List<DiscussionTopic> getAllTopics() {
        return topicRepository.findAll();
    }

    public DiscussionTopic getTopicById(Long id) {
        Optional<DiscussionTopic> topic = topicRepository.findById(id);
        return topic.orElseThrow(() -> new ResourceNotFoundException("Ticket not found with id " + id));
    }


    public void deleteTopic(Long id) {
        DiscussionTopic topic = getTopicById(id);
        topicRepository.delete(topic);
    }







}
