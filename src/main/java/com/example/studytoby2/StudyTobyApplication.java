package com.example.studytoby2;

import com.example.config.MySpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.PostConstruct;

@MySpringBootApplication
public class StudyTobyApplication {

	private final JdbcTemplate jdbcTemplate;

	public StudyTobyApplication(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@PostConstruct
	void init() {
		jdbcTemplate.execute("create table if not exists hello(name varchar(50) primary key, count int)");
	}

	public static void main(String[] args) {
		SpringApplication.run(StudyTobyApplication.class, args);

	}
}
