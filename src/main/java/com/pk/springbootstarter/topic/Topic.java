package com.pk.springbootstarter.topic;

/**
 * Topic
 *
 * @author PradheepKumarA
 * @date 2019-02-28
 */
public class Topic {
    private String id;
    private String topicName;
    private String topicContent;

    public Topic(String id, String topicName, String topicContent) {
        this.id = id;
        this.topicName = topicName;
        this.topicContent = topicContent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicContent() {
        return topicContent;
    }

    public void setTopicContent(String topicContent) {
        this.topicContent = topicContent;
    }
}
