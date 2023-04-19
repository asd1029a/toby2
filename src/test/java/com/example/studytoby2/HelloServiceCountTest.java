package com.example.studytoby2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.stream.IntStream;

/**
 * HelloServiceCountTest.java
 * Class 설명을 작성하세요.
 *
 * @author danusys
 * @since 2023.04.19
 */
@HellobootTest
public class HelloServiceCountTest {
    @Autowired HelloService helloService;
    @Autowired
    HelloRepository helloRepository;

    @Test
    void sayHelloIncreaseCount() {
        IntStream.rangeClosed(1, 10).forEach(count -> {
            helloService.sayHello("kim");
            Assertions.assertThat(helloRepository.countOf("kim")).isEqualTo(count);
        });
    }
}
