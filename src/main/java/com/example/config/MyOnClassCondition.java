package com.example.config;/**
 * MyOnClassCondition.java
 * Class 설명을 작성하세요.
 *
 * @author danusys
 * @since 2023.04.18
 */

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.ClassUtils;

import java.util.Map;

/**
 * MyOnClassCondition.java
 * Class 설명을 작성하세요.
 *
 * @author danusys
 * @since 2023.04.18
 */
public class MyOnClassCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> attrs = metadata.getAnnotationAttributes(ConditionalMyOnClass.class.getName());
        String value = (String) attrs.get("value");
        return ClassUtils.isPresent(value, context.getClassLoader());
    }
}
