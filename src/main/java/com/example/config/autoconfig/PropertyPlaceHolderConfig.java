package com.example.config.autoconfig;

import com.example.config.MyAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * PropertyPlaceHolderConfig.java
 * Class 설명을 작성하세요.
 *
 * @author danusys
 * @since 2023.04.18
 */
@MyAutoConfiguration
public class PropertyPlaceHolderConfig {

    @Bean
    PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
