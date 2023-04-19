package com.example.config.autoconfig;

import org.springframework.stereotype.Component;

/**
 * ServerProperty.java
 * Class 설명을 작성하세요.
 *
 * @author danusys
 * @since 2023.04.18
 */

@MyConfigurationProperties(prefix = "server")
public class ServerProperties {

    String contextPath;

    int port;

    public String getContextPath() {
        return contextPath;
    }

    public int getPort() {
        return port;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
