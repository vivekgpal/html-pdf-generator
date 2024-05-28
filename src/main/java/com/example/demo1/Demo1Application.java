package com.example.demo1;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {
	private static final Logger logger = LoggerFactory.getLogger(CSVController.class);
	@Autowired
	private CSVService csvService;
	public static void main(String[] args) {

		logger.info("this is main class....");
		SpringApplication.run(Demo1Application.class, args);
		logger.info("main class ended....");

	}
	@PostConstruct
	public void init(){
		csvService.generatePdfAtStartup();
	}

}
