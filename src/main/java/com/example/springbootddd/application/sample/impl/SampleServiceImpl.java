package com.example.springbootddd.application.sample.impl;

import com.example.springbootddd.application.sample.SampleService;
import com.example.springbootddd.domain.repository.sample.SampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SampleServiceImpl implements SampleService {

    private final SampleRepository sampleRepository;

    @Override
    public String getData() {
        return sampleRepository.getData();
    }
}
