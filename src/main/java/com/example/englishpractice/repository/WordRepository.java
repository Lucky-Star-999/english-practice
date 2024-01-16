package com.example.englishpractice.repository;

import com.example.englishpractice.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Topic, String> {

}
