package com.example.englishpractice.request;

import lombok.Data;

@Data
public class WordRequest {
    private String key;
    private WordBodyRequest value;
}
