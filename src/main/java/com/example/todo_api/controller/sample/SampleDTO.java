package com.example.todo_api.controller.sample;

import lombok.Value;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Value
public class SampleDTO {

    private String content;
    private LocalDateTime timestamp;
}
