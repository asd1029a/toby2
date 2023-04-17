package com.example.studytoby2;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
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
@RestController
public class HelloController {

    private final HelloService helloService;
//    private final ApplicationContext applicationContext;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
//        this.applicationContext = applicationContext;
    }

    @GetMapping("/hello")
    public String hello(String name) {
        if (name == null || name.trim().length() == 0) throw new IllegalArgumentException();
        return helloService.sayHello(name);
    }

}
