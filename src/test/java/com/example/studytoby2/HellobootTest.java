package com.example.studytoby2;/**
 * HellobootTest.java
 * Class 설명을 작성하세요.
 *
 * @author danusys
 * @since 2023.04.19
 */

import net.bytebuddy.build.RepeatedAnnotationPlugin;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * HellobootTest.java
 * Class 설명을 작성하세요.
 *
 * @author danusys
 * @since 2023.04.19
 */
@Retention(RetentionPolicy.RUNTIME)
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = StudyTobyApplication.class)
@TestPropertySource("classpath:/application.properties")
@Transactional
public @interface HellobootTest {
}
