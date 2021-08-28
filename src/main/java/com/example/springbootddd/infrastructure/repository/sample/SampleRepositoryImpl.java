package com.example.springbootddd.infrastructure.repository.sample;

import com.example.springbootddd.domain.repository.sample.SampleRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SampleRepositoryImpl implements SampleRepository {

    // daoを呼び出す
    
    @Override
    public String getData() {
        
        // DBやAPIからデータを取得、登録処理を記載
        
        return "string";
    }
}
