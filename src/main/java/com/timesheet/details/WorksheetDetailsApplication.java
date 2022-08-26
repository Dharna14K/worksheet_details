package com.timesheet.details;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class WorksheetDetailsApplication {
	//private static final Logger logger = LoggerFactory.getLogger(WorksheetDetailsApplication.class);


	public static void main(String[] args) {

		/*logger.info("this is a info message");
		logger.warn("this is a warn message");
		logger.error("this is a error message");*/
		SpringApplication.run(WorksheetDetailsApplication.class, args);
	}

}
