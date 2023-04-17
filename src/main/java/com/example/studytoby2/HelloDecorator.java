package com.example.studytoby2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * HelloDecorator.java
 * Class 설명을 작성하세요.
 *
 * @author danusys
 * @since 2023.04.17
 */
@Service
@Primary
public class HelloDecorator implements HelloService {

    private final HelloService helloService;

    public HelloDecorator(HelloService helloService) {
        this.helloService = helloService;
    }
    @Override
    public String sayHello(String name) {
        return "*"+helloService.sayHello(name)+"*";
    }
}
