package com.pk.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * TopicController
 *
 * @author PradheepKumarA
 * @date 2019-02-28
 */
@RestController
public class TopicController {

    @Autowired
    TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllList();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopicById(@PathVariable String id) {
        return topicService.getTopicById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void createTopic(@PathVariable Topic topic) {
        topicService.createTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@PathVariable Topic topic, @PathVariable String id) {
        topicService.updateTopic(topic, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }

}
