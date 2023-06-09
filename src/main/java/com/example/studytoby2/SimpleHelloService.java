package com.example.studytoby2;

import org.springframework.stereotype.Service;

/**
 * SimpleHelloService.java
 * Class 설명을 작성하세요.
 *
 * @author danusys
 * @since 2023.04.14
 */
@Service
public class SimpleHelloService implements HelloService {

    private final HelloRepository helloRepository;

    public SimpleHelloService(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    public String sayHello(String name) {
        this.helloRepository.increaseCount(name);
        return "Hello " + name;
    }

    @Override
    public int countOf(String name) {
        return helloRepository.countOf(name);
    }
}
