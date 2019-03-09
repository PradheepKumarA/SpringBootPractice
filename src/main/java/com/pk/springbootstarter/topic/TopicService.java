package com.pk.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * TopicService
 *
 * @author PradheepKumarA
 * @date 2019-03-09
 */
@Service
public class TopicService {

    @Autowired
    TopicRepository topicRepository;

    public List<Topic> getAllList() {
        List<Topic> list = new ArrayList<Topic>();
        topicRepository.findAll().forEach(topic -> list.add(topic));
        return list;
    }

    public Topic getTopicById(String id) {
        return topicRepository.findById(id).get();
    }

    public void createTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, String id) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}
