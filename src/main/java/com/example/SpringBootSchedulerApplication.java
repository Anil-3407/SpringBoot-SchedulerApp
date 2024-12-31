package com.example;

import com.example.servcie.TaskService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootSchedulerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootSchedulerApplication.class, args);
		TaskService bean = context.getBean(TaskService.class);
		//bean.cleanTemp();
		bean.cronTask();

	}

}
