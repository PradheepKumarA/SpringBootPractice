package com.pk.springbootstarter.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * TopicController
 *
 * @author PradheepKumarA
 * @date 2019-02-28
 */
@RestController
public class TopicController {
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("a", "aa", "aaaaa"),
                new Topic("b", "bb", "bbbbb"),
                new Topic("c", "cc", "ccccc")
        );
    }
}
