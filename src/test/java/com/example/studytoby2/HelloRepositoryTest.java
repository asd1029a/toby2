package com.example.studytoby2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * HelloRepositoryTest.java
 * Class 설명을 작성하세요.
 *
 * @author danusys
 * @since 2023.04.19
 */
@HellobootTest
public class HelloRepositoryTest {

    @Autowired HelloRepository helloRepository;

    @Test
    void findHelloFailed() {
        Assertions.assertThat(helloRepository.findHello("kim")).isNull();
    }

    @Test
    void increaseCount() {
        Assertions.assertThat(helloRepository.countOf("kim")).isEqualTo(0);
        helloRepository.increaseCount("kim");
        Assertions.assertThat(helloRepository.countOf("kim")).isEqualTo(1);
        helloRepository.increaseCount("kim");
        Assertions.assertThat(helloRepository.countOf("kim")).isEqualTo(2);
    }
}
