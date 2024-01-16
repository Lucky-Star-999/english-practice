package com.example.englishpractice.repository;

import com.example.englishpractice.model.WordClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordClassRepository extends JpaRepository<WordClass, Long> {

}
