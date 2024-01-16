package com.example.englishpractice.request;

import lombok.Data;

import java.util.List;

/**
 * let value = {
 *         key: '',
 *         word: '',
 *         wordClass: '',
 *         pronunciation: '',
 *         audioUrl: '',
 *         topicList: List<TopicRequest>
 *     }
 */
@Data
public class WordBodyRequest {
    private String key;
    private String word;
    private String wordClass;
    private String pronunciation;
    private String audioUrl;
    private List<TopicRequest> topicList;
}
