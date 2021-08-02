package com.example.springbootddd.infrastructure.repository.sample;

import com.example.springbootddd.domain.repository.sample.SampleRepository;

@Repository
public class SampleRepositoryImpl implements SampleRepository {

    @Override
    public String getData() {
        return "string";
    }
}
