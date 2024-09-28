package com.example.todo_api.service.sample;

import com.example.todo_api.repository.sample.SampleRecord;
import com.example.todo_api.repository.sample.SampleReposityory;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.javassist.tools.rmi.Sample;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SampleService {

    private final SampleReposityory reposityory;

    public SampleEntity find(){
        var record = reposityory.select();
        return new SampleEntity(record.getContent());
    }
}
