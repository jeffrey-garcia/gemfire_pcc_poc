package com.example.demogemfireclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.gemfire.function.config.EnableGemfireFunctions;

@Slf4j
@EnableGemfireFunctions
@ImportResource("spring-gemfire-cache-server-context.xml")
@SpringBootApplication
public class DemoGemfireServerApplication {

	static final boolean DEFAULT_AUTO_STARTUP = true;

	public static void main(String[] args) {
		SpringApplication.run(DemoGemfireServerApplication.class, args);
	}

}
