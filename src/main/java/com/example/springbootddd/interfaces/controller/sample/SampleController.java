package com.example.springbootddd.interfaces.controller.sample;

import com.example.springbootddd.application.sample.SampleService;
import com.example.springbootddd.interfaces.request.sample.SampleGetRequest;
import com.example.springbootddd.interfaces.response.sample.SampleGetResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1")
@RequiredArgsConstructor
public class SampleController {

    private final SampleService sampleService;

    @GetMapping("/sample")
    SampleGetResponse getData(@ModelAttribute("request") SampleGetRequest request) {

        String str = sampleService.getData();

        // responseの形式へマッピング処理

        SampleGetResponse response = new SampleGetResponse();
        return response;
    }

}
