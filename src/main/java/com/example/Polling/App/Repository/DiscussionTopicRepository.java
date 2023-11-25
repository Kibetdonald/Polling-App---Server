package com.example.Polling.App.Repository;

import com.example.Polling.App.Models.DiscussionTopic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscussionTopicRepository extends JpaRepository<DiscussionTopic, Long> {

}

