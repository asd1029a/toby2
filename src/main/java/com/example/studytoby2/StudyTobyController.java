package com.example.studytoby2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * StudyTobyController.java
 * Class 설명을 작성하세요.
 *
 * @author danusys
 * @since 2023.04.14
 */
public class StudyTobyController {

    public String hello(String name) {
        SimpleHelloService simpleHelloService = new SimpleHelloService();

        return simpleHelloService.sayHello(Objects.requireNonNull(name));
    }
}
