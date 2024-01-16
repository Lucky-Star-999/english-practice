package com.example.englishpractice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
@Entity
public class Word {
    @Id
    private String id;

    private String word;
    private String pronunciation;
    private String audioUrl;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "word_class_id", referencedColumnName = "id")
    private WordClass wordClass;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "word_topic",
            joinColumns = @JoinColumn(name = "word_id"),
            inverseJoinColumns = @JoinColumn(name = "topic_id"))
    private Set<Topic> topicList;
}
